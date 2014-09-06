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

	public static void main(String[] args) throws FileNotFoundException,
			IOException {

		SqlConnection sqlC = null;

		try {
			sqlC = new SqlConnection();
			// sqlC.readDataBase();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		CoTReaderExcel excel = new CoTReaderExcel();
		excel.setWorkbookFromFile("data/Com04_13.xls");

		//Imports All reports from Excel-File to SQL-Database
		if (!excel.insertAllRowsToSQL(sqlC)) {
			System.exit(1);
		}

	}
}
