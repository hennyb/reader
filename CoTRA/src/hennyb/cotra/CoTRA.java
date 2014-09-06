package hennyb.cotra;

import hennyb.cotra.sql.SqlConnection;
import hennyb.cotra.io.CoTReaderExcel;
import hennyb.cotra.io.csv.CoTCSVParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

/**
 * 
 * Main class for the CoTRA project
 * 
 * @author maxmeffert
 *
 */
public class CoTRA {

	private static String TEST_CSV_FILE = "./data/Com95_13.csv";

	public static void main(String[] args) throws FileNotFoundException,
			IOException {

		SqlConnection sqlC = null;

		try {
			sqlC = new SqlConnection();
			sqlC.readDataBase();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		CoTReaderExcel excel = new CoTReaderExcel();
		excel.setWorkbookFromFile("data/Com04_13.xls");

		int i = 0;
		for (Row row : excel.getSheet()) {

			// System.out.println(excel.getInsertIntoFromRow(row));
			if (i++ != 0) {
				System.out.println(excel.getInsertIntoFromRow(row));
				try {
					sqlC.insertIntoSQL(excel.getInsertIntoFromRow(row));
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(1);
				}
			}

		}

		// File file = new File("data/sqlTypes.txt");
		// ArrayList<String> lines = (ArrayList<String>)
		// FileUtils.readLines(file,
		// "UTF-8");

		// ArrayList<String> lines = new ArrayList<>();
		//
		// int i = 0;
		// for (Cell cell : excel.getSheet().getRow(4)) {
		//
		// // gets the cell with the names in it
		// Cell nameCell = excel.getSheet().getRow(0).getCell(i);
		//
		// StringBuilder sb = new StringBuilder();
		// sb.append("`" + nameCell.getStringCellValue() + "` ");
		//
		// switch (cell.getCellType()) {
		// case Cell.CELL_TYPE_STRING:
		// sb.append(" VARCHAR (100) DEFAULT NULL ,");
		// break;
		// case Cell.CELL_TYPE_NUMERIC:
		// sb.append(" double DEFAULT NULL,");
		// break;
		// default:
		// System.err.println("keins von beiden");
		// break;
		// }
		// lines.add(sb.toString());
		//
		// i++;
		// }
		//
		// for (String line : lines) {
		// System.out.println(line);
		// }

		//
		// int i = 0;
		// for (Row row : excel.getSheet()) {
		// System.out.println();
		// if (i++ < 5) {
		// for (Cell cell : row) {
		//
		// switch (cell.getCellType()) {
		// case Cell.CELL_TYPE_STRING:
		// System.out.print(cell.getStringCellValue() + " ");
		// break;
		// case Cell.CELL_TYPE_NUMERIC:
		// System.out.print(cell.getNumericCellValue() + " ");
		// break;
		// }
		//
		// }
		// } else
		// break;
		// }

		// AllReports aReports = new AllReports();
		//
		// for (CoTReport report : CoTCSVParser.DEFAULT.parse(new FileReader(
		// TEST_CSV_FILE))) {
		//
		// ExchangeUnit eu = new ExchangeUnit(
		// report.getMarketAndExchangeNames());
		//
		// if (aReports.getExchangeUnits().contains(eu)) {
		// int index = aReports.getExchangeUnits().indexOf(eu);
		// eu = aReports.getExchangeUnits().get(index);
		// eu.getReports().add(report);
		//
		// } else {
		// eu.getReports().add(report);
		// aReports.getExchangeUnits().add(eu);
		// }
		//
		// }
		// System.out.println(aReports.getExchangeUnits().size());
		//
		// for (int i = 0; i < aReports.getExchangeUnits().size(); i++) {
		//
		// ExchangeUnit e = aReports.getExchangeUnits().get(i);
		// System.out.println(i + " " + e.getReports().size());
		// System.out.println(e.getName() + " :");
		//
		// for (CoTReport report : e.getReports()) {
		// System.out.print(report.getAsOfDateInFormYYYYMMDD() + " ");
		// }
		//
		// System.out.println();
		//
		// }

		// Object[][] xs = new Object[3][3];
		//
		// Object[] x = {1,2};
		// xs[0] = x;
		//
		// System.out.println(xs[0][2]);

	}
}
