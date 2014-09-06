package hennyb.cotra.io;

import hennyb.cotra.sql.SqlConnection;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CoTReaderExcel {

	private Workbook wb;

	public CoTReaderExcel() {
		wb = new HSSFWorkbook();
	}

	public void setWorkbookFromFile(String path) {
		try {
			this.wb = WorkbookFactory.create(new File(path));

		} catch (InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Workbook getWb() {
		return wb;
	}

	public void setWb(Workbook wb) {
		this.wb = wb;
	}

	public Sheet getSheet() {
		return this.wb.getSheetAt(0);
	}

	public String getInsertIntoFromRow(Row row) {

		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO cotreports VALUES (");

		for (int i = 0; i < row.getLastCellNum(); i++) {

			Cell cell = row.getCell(i);

			if (cell == null) {
				sb.append(0);
			} else {

				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					String cellStringContent = cell.getStringCellValue();
					sb.append("\"");
					sb.append(cellStringContent.equals("") ? " "
							: cellStringContent);
					sb.append("\"");

					break;
				case Cell.CELL_TYPE_NUMERIC:
					double cellDoubleContent = cell.getNumericCellValue();
					sb.append(cellDoubleContent);
					break;
				default:
					System.err.println("invalid excel-file");
					System.exit(1);
					break;
				}
			}
			boolean lastCell = row.getLastCellNum() - 1 == i;
			if (!lastCell) {
				sb.append(" , ");
			}

		}

		sb.append(")");
		return (sb.toString());
	}

	public boolean insertAllRowsToSQL(SqlConnection sqlC) {

		for (int i = 1; i < this.getSheet().getLastRowNum(); i++) {

			Row row = this.getSheet().getRow(i);
			try {
				sqlC.insertIntoSQL(this.getInsertIntoFromRow(row));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}

		}
		return true;
	}

	public List<String> createTableCommands() {

		ArrayList<String> lines = new ArrayList<>();

		int i = 0;
		for (Cell cell : this.getSheet().getRow(4)) {

			// gets the cell with the names in it
			Cell nameCell = this.getSheet().getRow(0).getCell(i);

			StringBuilder sb = new StringBuilder();
			sb.append("`" + nameCell.getStringCellValue() + "` ");

			switch (cell.getCellType()) {
			case Cell.CELL_TYPE_STRING:
				sb.append(" VARCHAR (100) DEFAULT NULL ,");
				break;
			case Cell.CELL_TYPE_NUMERIC:
				sb.append(" double DEFAULT NULL,");
				break;
			default:
				System.err.println("keins von beiden");
				break;
			}
			lines.add(sb.toString());

			i++;
		}

		for (String line : lines) {
			System.out.println(line);
		}

		return lines;

	}

}
