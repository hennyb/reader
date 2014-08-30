package hennyb.cotra.io.csv;


import hennyb.cotra.CoTField;
import hennyb.cotra.CoTReport;
import hennyb.cotra.io.CoTParser;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

/**
 * 
 * Parser for CSV files containing CoT reports.
 * 
 * @author maxmeffert
 *
 */
public class CoTCSVParser implements CoTParser {

	private static final char DEFAULT_DELIMITER = ',';
	private static final boolean DEFAULT_WITHHEADER = true;
	private final static Map<CoTField,String> HEADERS = new HashMap<CoTField,String>();
	static {
		HEADERS.put(CoTField.MarketAndExchangeNames,"Market and Exchange Names");
		HEADERS.put(CoTField.AsOfDateInFormYYMMDD,"As of Date in Form YYMMDD");
		HEADERS.put(CoTField.AsOfDateInFormYYYYMMDD,"As of Date in Form YYYY-MM-DD");
		HEADERS.put(CoTField.CFTCContractMarketCode,"CFTC Contract Market Code");
		HEADERS.put(CoTField.CFTCMarketCodeInInitials,"CFTC Market Code in Initials");
		HEADERS.put(CoTField.CFTCRegionCode,"CFTC Region Code");
		HEADERS.put(CoTField.CFTCCommodityCode,"CFTC Commodity Code");
		HEADERS.put(CoTField.OpenInterestAll,"Open Interest (All)");
		HEADERS.put(CoTField.NoncommercialPositionsLongAll,"Noncommercial Positions-Long (All)");
		HEADERS.put(CoTField.NoncommercialPositionsShortAll,"Noncommercial Positions-Short (All)");
		HEADERS.put(CoTField.NoncommercialPositionsSpreadingAll,"Noncommercial Positions-Spreading (All)");
		HEADERS.put(CoTField.CommercialPositionsLongAll,"Commercial Positions-Long (All)");
		HEADERS.put(CoTField.CommercialPositionsShortAll,"Commercial Positions-Short (All)");
		HEADERS.put(CoTField.TotalReportablePositionsLongAll," Total Reportable Positions-Long (All)");
		HEADERS.put(CoTField.TotalReportablePositionsShortAll,"Total Reportable Positions-Short (All)");
		HEADERS.put(CoTField.NonreportablePositionsLongAll,"Nonreportable Positions-Long (All)");
		HEADERS.put(CoTField.NonreportablePositionsShortAll,"Nonreportable Positions-Short (All)");
		HEADERS.put(CoTField.OpenInterestOld,"Open Interest (Old)");
		HEADERS.put(CoTField.NoncommercialPositionsLongOld,"Noncommercial Positions-Long (Old)");
		HEADERS.put(CoTField.NoncommercialPositionsShortOld,"Noncommercial Positions-Short (Old)");
		HEADERS.put(CoTField.NoncommercialPositionsSpreadingOld,"Noncommercial Positions-Spreading (Old)");
		HEADERS.put(CoTField.CommercialPositionsLongOld,"Commercial Positions-Long (Old)");
		HEADERS.put(CoTField.CommercialPositionsShortOld,"Commercial Positions-Short (Old)");
		HEADERS.put(CoTField.TotalReportablePositionsLongOld,"Total Reportable Positions-Long (Old)");
		HEADERS.put(CoTField.TotalReportablePositionsShortOld,"Total Reportable Positions-Short (Old)");
		HEADERS.put(CoTField.NonreportablePositionsLongOld,"Nonreportable Positions-Long (Old)");
		HEADERS.put(CoTField.NonreportablePositionsShortOld,"Nonreportable Positions-Short (Old)");
		HEADERS.put(CoTField.OpenInterestOther,"Open Interest (Other)");
		HEADERS.put(CoTField.NoncommercialPositionsLongOther,"Noncommercial Positions-Long (Other)");
		HEADERS.put(CoTField.NoncommercialPositionsShortOther,"Noncommercial Positions-Short (Other)");
		HEADERS.put(CoTField.NoncommercialPositionsSpreadingOther,"Noncommercial Positions-Spreading (Other)");
		HEADERS.put(CoTField.CommercialPositionsLongOther,"Commercial Positions-Long (Other)");
		HEADERS.put(CoTField.CommercialPositionsShortOther,"Commercial Positions-Short (Other)");
		HEADERS.put(CoTField.TotalReportablePositionsLongOther,"Total Reportable Positions-Long (Other)");
		HEADERS.put(CoTField.TotalReportablePositionsShortOther,"Total Reportable Positions-Short (Other)");
		HEADERS.put(CoTField.NonreportablePositionsLongOther,"Nonreportable Positions-Long (Other)");
		HEADERS.put(CoTField.NonreportablePositionsShortOther,"Nonreportable Positions-Short (Other)");
		HEADERS.put(CoTField.ChangeInOpenInterestAll,"Change in Open Interest (All)");
		HEADERS.put(CoTField.ChangeInNoncommercialLongAll,"Change in Noncommercial-Long (All)");
		HEADERS.put(CoTField.ChangeInNoncommercialShortAll,"Change in Noncommercial-Short (All)");
		HEADERS.put(CoTField.ChangeInNoncommercialSpreadingAll,"Change in Noncommercial-Spreading (All)");
		HEADERS.put(CoTField.ChangeInCommercialLongAll,"Change in Commercial-Long (All)");
		HEADERS.put(CoTField.ChangeInCommercialShortAll,"Change in Commercial-Short (All)");
		HEADERS.put(CoTField.ChangeInTotalReportableLongAll,"Change in Total Reportable-Long (All)");
		HEADERS.put(CoTField.ChangeInTotalReportableShortAll,"Change in Total Reportable-Short (All)");
		HEADERS.put(CoTField.ChangeInNonreportableLongAll,"Change in Nonreportable-Long (All)");
		HEADERS.put(CoTField.ChangeInNonreportableShortAll,"Change in Nonreportable-Short (All)");
		HEADERS.put(CoTField.PercentageOfOpenInterestOIAll,"% of Open Interest (OI) (All)");
		HEADERS.put(CoTField.PercentageOfOINoncommercialLongAll,"% of OI-Noncommercial-Long (All)");
		HEADERS.put(CoTField.PercentageOfOINoncommercialShortAll,"% of OI-Noncommercial-Short (All)");
		HEADERS.put(CoTField.PercentageOfOINoncommercialSpreadingAll,"% of OI-Noncommercial-Spreading (All)");
		HEADERS.put(CoTField.PercentageOfOICommercialLongAll,"% of OI-Commercial-Long (All)");
		HEADERS.put(CoTField.PercentageOfOICommercialShortAll,"% of OI-Commercial-Short (All)");
		HEADERS.put(CoTField.PercentageOfOITotalReportableLongAll,"% of OI-Total Reportable-Long (All)");
		HEADERS.put(CoTField.PercentageOfOITotalReportableShortAll,"% of OI-Total Reportable-Short (All)");
		HEADERS.put(CoTField.PercentageOfOINonreportableLongAll,"% of OI-Nonreportable-Long (All)");
		HEADERS.put(CoTField.PercentageOfOINonreportableShortAll,"% of OI-Nonreportable-Short (All)");
		HEADERS.put(CoTField.PercentageOfOpenInterestOIOld,"% of Open Interest (OI)(Old)");
		HEADERS.put(CoTField.PercentageOfOINoncommercialLongOld,"% of OI-Noncommercial-Long (Old)");
		HEADERS.put(CoTField.PercentageOfOINoncommercialShortOld,"% of OI-Noncommercial-Short (Old)");
		HEADERS.put(CoTField.PercentageOfOINoncommercialSpreadingOld,"% of OI-Noncommercial-Spreading (Old)");
		HEADERS.put(CoTField.PercentageOfOICommercialLongOld,"% of OI-Commercial-Long (Old)");
		HEADERS.put(CoTField.PercentageOfOICommercialShortOld,"% of OI-Commercial-Short (Old)");
		HEADERS.put(CoTField.PercentageOfOITotalReportableLongOld,"% of OI-Total Reportable-Long (Old)");
		HEADERS.put(CoTField.PercentageOfOITotalReportableShortOld,"% of OI-Total Reportable-Short (Old)");
		HEADERS.put(CoTField.PercentageOfOINonreportableLongOld,"% of OI-Nonreportable-Long (Old)");
		HEADERS.put(CoTField.PercentageOfOINonreportableShortOld,"% of OI-Nonreportable-Short (Old)");
		HEADERS.put(CoTField.PercentageOfOpenInterestOIOther,"% of Open Interest (OI) (Other)");
		HEADERS.put(CoTField.PercentageOfOINoncommercialLongOther,"% of OI-Noncommercial-Long (Other)");
		HEADERS.put(CoTField.PercentageOfOINoncommercialShortOther,"% of OI-Noncommercial-Short (Other)");
		HEADERS.put(CoTField.PercentageOfOINoncommercialSpreadingOther,"% of OI-Noncommercial-Spreading (Other)");
		HEADERS.put(CoTField.PercentageOfOICommercialLongOther,"% of OI-Commercial-Long (Other)");
		HEADERS.put(CoTField.PercentageOfOICommercialShortOther,"% of OI-Commercial-Short (Other)");
		HEADERS.put(CoTField.PercentageOfOITotalReportableLongOther,"% of OI-Total Reportable-Long (Other)");
		HEADERS.put(CoTField.PercentageOfOITotalReportableShortOther,"% of OI-Total Reportable-Short (Other)");
		HEADERS.put(CoTField.PercentageOfOINonreportableLongOther,"% of OI-Nonreportable-Long (Other)");
		HEADERS.put(CoTField.PercentageOfOINonreportableShortOther,"% of OI-Nonreportable-Short (Other)");
		HEADERS.put(CoTField.TradersTotalAll,"Traders-Total (All)");
		HEADERS.put(CoTField.TradersNoncommercialLongAll,"Traders-Noncommercial-Long (All)");
		HEADERS.put(CoTField.TradersNoncommercialShortAll,"Traders-Noncommercial-Short (All)");
		HEADERS.put(CoTField.TradersNoncommercialSpreadingAll,"Traders-Noncommercial-Spreading (All)");
		HEADERS.put(CoTField.TradersCommercialLongAll,"Traders-Commercial-Long (All)");
		HEADERS.put(CoTField.TradersCommercialShortAll,"Traders-Commercial-Short (All)");
		HEADERS.put(CoTField.TradersTotalReportableLongAll,"Traders-Total Reportable-Long (All)");
		HEADERS.put(CoTField.TradersTotalReportableShortAll,"Traders-Total Reportable-Short (All)");
		HEADERS.put(CoTField.TradersTotalOld,"Traders-Total (Old)");
		HEADERS.put(CoTField.TradersNoncommercialLongOld,"Traders-Noncommercial-Long (Old)");
		HEADERS.put(CoTField.TradersNoncommercialShortOld,"Traders-Noncommercial-Short (Old)");
		HEADERS.put(CoTField.TradersNoncommercialSpreadingOld,"Traders-Noncommercial-Spreading (Old)");
		HEADERS.put(CoTField.TradersCommercialLongOld,"Traders-Commercial-Long (Old)");
		HEADERS.put(CoTField.TradersCommercialShortOld,"Traders-Commercial-Short (Old)");
		HEADERS.put(CoTField.TradersTotalReportableLongOld,"Traders-Total Reportable-Long (Old)");
		HEADERS.put(CoTField.TradersTotalReportableShortOld,"Traders-Total Reportable-Short (Old)");
		HEADERS.put(CoTField.TradersTotalOther,"Traders-Total (Other)");
		HEADERS.put(CoTField.TradersNoncommercialLongOther,"Traders-Noncommercial-Long (Other)");
		HEADERS.put(CoTField.TradersNoncommercialShortOther,"Traders-Noncommercial-Short (Other)");
		HEADERS.put(CoTField.TradersNoncommercialSpreadingOther,"Traders-Noncommercial-Spreading (Other)");
		HEADERS.put(CoTField.TradersCommercialLongOther,"Traders-Commercial-Long (Other)");
		HEADERS.put(CoTField.TradersCommercialShortOther,"Traders-Commercial-Short (Other)");
		HEADERS.put(CoTField.TradersTotalReportableLongOther,"Traders-Total Reportable-Long (Other)");
		HEADERS.put(CoTField.TradersTotalReportableShortOther,"Traders-Total Reportable-Short (Other)");
		HEADERS.put(CoTField.ConcentrationGrossLT4TDRLongAll,"Concentration-Gross LT = 4 TDR-Long (All)");
		HEADERS.put(CoTField.ConcentrationGrossLT4TDRShortAll,"Concentration-Gross LT =4 TDR-Short (All)");
		HEADERS.put(CoTField.ConcentrationGrossLT8TDRLongAll,"Concentration-Gross LT =8 TDR-Long (All)");
		HEADERS.put(CoTField.ConcentrationGrossLT8TDRShortAll,"Concentration-Gross LT =8 TDR-Short (All)");
		HEADERS.put(CoTField.ConcentrationNetLT4TDRLongAll,"Concentration-Net LT =4 TDR-Long (All)");
		HEADERS.put(CoTField.ConcentrationNetLT4TDRShortAll,"Concentration-Net LT =4 TDR-Short (All)");
		HEADERS.put(CoTField.ConcentrationNetLT8TDRLongAll,"Concentration-Net LT =8 TDR-Long (All)");
		HEADERS.put(CoTField.ConcentrationNetLT8TDRShortAll,"Concentration-Net LT =8 TDR-Short (All)");
		HEADERS.put(CoTField.ConcentrationGrossLT4TDRLongOld,"Concentration-Gross LT =4 TDR-Long (Old)");
		HEADERS.put(CoTField.ConcentrationGrossLT4TDRShortOld,"Concentration-Gross LT =4 TDR-Short (Old)");
		HEADERS.put(CoTField.ConcentrationGrossLT8TDRLongOld,"Concentration-Gross LT =8 TDR-Long (Old)");
		HEADERS.put(CoTField.ConcentrationGrossLT8TDRShortOld,"Concentration-Gross LT =8 TDR-Short (Old)");
		HEADERS.put(CoTField.ConcentrationNetLT4TDRLongOld,"Concentration-Net LT =4 TDR-Long (Old)");
		HEADERS.put(CoTField.ConcentrationNetLT4TDRShortOld,"Concentration-Net LT =4 TDR-Short (Old)");
		HEADERS.put(CoTField.ConcentrationNetLT8TDRLongOld,"Concentration-Net LT =8 TDR-Long (Old)");
		HEADERS.put(CoTField.ConcentrationNetLT8TDRShortOld,"Concentration-Net LT =8 TDR-Short (Old)");
		HEADERS.put(CoTField.ConcentrationGrossLT4TDRLongOther,"Concentration-Gross LT =4 TDR-Long (Other)");
		HEADERS.put(CoTField.ConcentrationGrossLT4TDRShortOther,"Concentration-Gross LT =4 TDR-Short(Other)");
		HEADERS.put(CoTField.ConcentrationGrossLT8TDRLongOther,"Concentration-Gross LT =8 TDR-Long (Other)");
		HEADERS.put(CoTField.ConcentrationGrossLT8TDRShortOther,"Concentration-Gross LT =8 TDR-Short(Other)");
		HEADERS.put(CoTField.ConcentrationNetLT4TDRLongOther,"Concentration-Net LT =4 TDR-Long (Other)");
		HEADERS.put(CoTField.ConcentrationNetLT4TDRShortOther,"Concentration-Net LT =4 TDR-Short (Other)");
		HEADERS.put(CoTField.ConcentrationNetLT8TDRLongOther,"Concentration-Net LT =8 TDR-Long (Other)");
		HEADERS.put(CoTField.ConcentrationNetLT8TDRShortOther,"Concentration-Net LT =8 TDR-Short (Other)");
		HEADERS.put(CoTField.ContractUnits,"Contract Units");
		HEADERS.put(CoTField.CFTCContractMarketCodeQuotes,"CFTC Contract Market Code (Quotes)");
		HEADERS.put(CoTField.CFTCMarketCodeInInitialsQuotes,"CFTC Market Code in Initials (Quotes)");
		HEADERS.put(CoTField.CFTCCommodityCodeQuotes,"CFTC Commodity Code (Quotes)");

	}
	
	public static final CoTCSVParser DEFAULT = new CoTCSVParser(DEFAULT_DELIMITER, DEFAULT_WITHHEADER);
	
	private CSVFormat format;
	
	public CoTCSVParser (char delimiter, boolean withHeader) {
		
		this.format = CSVFormat.RFC4180.withHeader().withDelimiter(delimiter);
		
	}

	@Override
	public List<CoTReport> parse(Reader reader) throws IOException {
		
		ArrayList<CoTReport> result = new ArrayList<CoTReport>();
		
		@SuppressWarnings("resource")
		CSVParser parser = new CSVParser(reader,this.format);
		
		for (CSVRecord record : parser) {
			
			Map<CoTCSVHeader,String> map = new HashMap<CoTCSVHeader,String>();
			for (CoTCSVHeader header : CoTCSVHeader.values()) {
				
				map.put(header, record.get(header));
				
			}
			
			result.add(this.fromCSVHeaderMap(map));
			
		}
		
		return result;
		
	}

	private double parseDouble (String s) {
		
		try {
		
			return Double.parseDouble(s);
		
		}
		catch (Exception e) {

			return 0;
			
		}
		
	}
	
	public CoTReport fromCSVHeaderMap (Map<CoTCSVHeader,String> map) {
		
		CoTReport cot = new CoTReport();
		
		cot.setMarketAndExchangeNames(map.get(CoTCSVHeader.MarketAndExchangeNames));
		cot.setAsOfDateInFormYYMMDD(this.parseDouble(map.get(CoTCSVHeader.AsOfDateInFormYYMMDD)));
		cot.setAsOfDateInFormYYYYMMDD(map.get(CoTCSVHeader.AsOfDateInFormYYYYMMDD));
		cot.setCFTCContractMarketCode(this.parseDouble(map.get(CoTCSVHeader.CFTCContractMarketCode)));
		cot.setCFTCMarketCodeInInitials(map.get(CoTCSVHeader.CFTCMarketCodeInInitials));
		cot.setCFTCRegionCode(this.parseDouble(map.get(CoTCSVHeader.CFTCRegionCode)));
		cot.setCFTCCommodityCode(this.parseDouble(map.get(CoTCSVHeader.CFTCCommodityCode)));
		cot.setOpenInterestAll(this.parseDouble(map.get(CoTCSVHeader.OpenInterestAll)));
		cot.setNoncommercialPositionsLongAll(this.parseDouble(map.get(CoTCSVHeader.NoncommercialPositionsLongAll)));
		cot.setNoncommercialPositionsShortAll(this.parseDouble(map.get(CoTCSVHeader.NoncommercialPositionsShortAll)));
		cot.setNoncommercialPositionsSpreadingAll(this.parseDouble(map.get(CoTCSVHeader.NoncommercialPositionsSpreadingAll)));
		cot.setCommercialPositionsLongAll(this.parseDouble(map.get(CoTCSVHeader.CommercialPositionsLongAll)));
		cot.setCommercialPositionsShortAll(this.parseDouble(map.get(CoTCSVHeader.CommercialPositionsShortAll)));
		cot.setTotalReportablePositionsLongAll(this.parseDouble(map.get(CoTCSVHeader.TotalReportablePositionsLongAll)));
		cot.setTotalReportablePositionsShortAll(this.parseDouble(map.get(CoTCSVHeader.TotalReportablePositionsShortAll)));
		cot.setNonreportablePositionsLongAll(this.parseDouble(map.get(CoTCSVHeader.NonreportablePositionsLongAll)));
		cot.setNonreportablePositionsShortAll(this.parseDouble(map.get(CoTCSVHeader.NonreportablePositionsShortAll)));
		cot.setOpenInterestOld(this.parseDouble(map.get(CoTCSVHeader.OpenInterestOld)));
		cot.setNoncommercialPositionsLongOld(this.parseDouble(map.get(CoTCSVHeader.NoncommercialPositionsLongOld)));
		cot.setNoncommercialPositionsShortOld(this.parseDouble(map.get(CoTCSVHeader.NoncommercialPositionsShortOld)));
		cot.setNoncommercialPositionsSpreadingOld(this.parseDouble(map.get(CoTCSVHeader.NoncommercialPositionsSpreadingOld)));
		cot.setCommercialPositionsLongOld(this.parseDouble(map.get(CoTCSVHeader.CommercialPositionsLongOld)));
		cot.setCommercialPositionsShortOld(this.parseDouble(map.get(CoTCSVHeader.CommercialPositionsShortOld)));
		cot.setTotalReportablePositionsLongOld(this.parseDouble(map.get(CoTCSVHeader.TotalReportablePositionsLongOld)));
		cot.setTotalReportablePositionsShortOld(this.parseDouble(map.get(CoTCSVHeader.TotalReportablePositionsShortOld)));
		cot.setNonreportablePositionsLongOld(this.parseDouble(map.get(CoTCSVHeader.NonreportablePositionsLongOld)));
		cot.setNonreportablePositionsShortOld(this.parseDouble(map.get(CoTCSVHeader.NonreportablePositionsShortOld)));
		cot.setOpenInterestOther(this.parseDouble(map.get(CoTCSVHeader.OpenInterestOther)));
		cot.setNoncommercialPositionsLongOther(this.parseDouble(map.get(CoTCSVHeader.NoncommercialPositionsLongOther)));
		cot.setNoncommercialPositionsShortOther(this.parseDouble(map.get(CoTCSVHeader.NoncommercialPositionsShortOther)));
		cot.setNoncommercialPositionsSpreadingOther(this.parseDouble(map.get(CoTCSVHeader.NoncommercialPositionsSpreadingOther)));
		cot.setCommercialPositionsLongOther(this.parseDouble(map.get(CoTCSVHeader.CommercialPositionsLongOther)));
		cot.setCommercialPositionsShortOther(this.parseDouble(map.get(CoTCSVHeader.CommercialPositionsShortOther)));
		cot.setTotalReportablePositionsLongOther(this.parseDouble(map.get(CoTCSVHeader.TotalReportablePositionsLongOther)));
		cot.setTotalReportablePositionsShortOther(this.parseDouble(map.get(CoTCSVHeader.TotalReportablePositionsShortOther)));
		cot.setNonreportablePositionsLongOther(this.parseDouble(map.get(CoTCSVHeader.NonreportablePositionsLongOther)));
		cot.setNonreportablePositionsShortOther(this.parseDouble(map.get(CoTCSVHeader.NonreportablePositionsShortOther)));
		cot.setChangeInOpenInterestAll(this.parseDouble(map.get(CoTCSVHeader.ChangeInOpenInterestAll)));
		cot.setChangeInNoncommercialLongAll(this.parseDouble(map.get(CoTCSVHeader.ChangeInNoncommercialLongAll)));
		cot.setChangeInNoncommercialShortAll(this.parseDouble(map.get(CoTCSVHeader.ChangeInNoncommercialShortAll)));
		cot.setChangeInNoncommercialSpreadingAll(this.parseDouble(map.get(CoTCSVHeader.ChangeInNoncommercialSpreadingAll)));
		cot.setChangeInCommercialLongAll(this.parseDouble(map.get(CoTCSVHeader.ChangeInCommercialLongAll)));
		cot.setChangeInCommercialShortAll(this.parseDouble(map.get(CoTCSVHeader.ChangeInCommercialShortAll)));
		cot.setChangeInTotalReportableLongAll(this.parseDouble(map.get(CoTCSVHeader.ChangeInTotalReportableLongAll)));
		cot.setChangeInTotalReportableShortAll(this.parseDouble(map.get(CoTCSVHeader.ChangeInTotalReportableShortAll)));
		cot.setChangeInNonreportableLongAll(this.parseDouble(map.get(CoTCSVHeader.ChangeInNonreportableLongAll)));
		cot.setChangeInNonreportableShortAll(this.parseDouble(map.get(CoTCSVHeader.ChangeInNonreportableShortAll)));
		cot.setPercentageOfOpenInterestOIAll(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOpenInterestOIAll)));
		cot.setPercentageOfOINoncommercialLongAll(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINoncommercialLongAll)));
		cot.setPercentageOfOINoncommercialShortAll(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINoncommercialShortAll)));
		cot.setPercentageOfOINoncommercialSpreadingAll(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINoncommercialSpreadingAll)));
		cot.setPercentageOfOICommercialLongAll(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOICommercialLongAll)));
		cot.setPercentageOfOICommercialShortAll(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOICommercialShortAll)));
		cot.setPercentageOfOITotalReportableLongAll(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOITotalReportableLongAll)));
		cot.setPercentageOfOITotalReportableShortAll(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOITotalReportableShortAll)));
		cot.setPercentageOfOINonreportableLongAll(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINonreportableLongAll)));
		cot.setPercentageOfOINonreportableShortAll(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINonreportableShortAll)));
		cot.setPercentageOfOpenInterestOIOld(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOpenInterestOIOld)));
		cot.setPercentageOfOINoncommercialLongOld(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINoncommercialLongOld)));
		cot.setPercentageOfOINoncommercialShortOld(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINoncommercialShortOld)));
		cot.setPercentageOfOINoncommercialSpreadingOld(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINoncommercialSpreadingOld)));
		cot.setPercentageOfOICommercialLongOld(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOICommercialLongOld)));
		cot.setPercentageOfOICommercialShortOld(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOICommercialShortOld)));
		cot.setPercentageOfOITotalReportableLongOld(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOITotalReportableLongOld)));
		cot.setPercentageOfOITotalReportableShortOld(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOITotalReportableShortOld)));
		cot.setPercentageOfOINonreportableLongOld(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINonreportableLongOld)));
		cot.setPercentageOfOINonreportableShortOld(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINonreportableShortOld)));
		cot.setPercentageOfOpenInterestOIOther(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOpenInterestOIOther)));
		cot.setPercentageOfOINoncommercialLongOther(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINoncommercialLongOther)));
		cot.setPercentageOfOINoncommercialShortOther(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINoncommercialShortOther)));
		cot.setPercentageOfOINoncommercialSpreadingOther(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINoncommercialSpreadingOther)));
		cot.setPercentageOfOICommercialLongOther(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOICommercialLongOther)));
		cot.setPercentageOfOICommercialShortOther(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOICommercialShortOther)));
		cot.setPercentageOfOITotalReportableLongOther(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOITotalReportableLongOther)));
		cot.setPercentageOfOITotalReportableShortOther(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOITotalReportableShortOther)));
		cot.setPercentageOfOINonreportableLongOther(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINonreportableLongOther)));
		cot.setPercentageOfOINonreportableShortOther(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINonreportableShortOther)));
		cot.setTradersTotalAll(this.parseDouble(map.get(CoTCSVHeader.TradersTotalAll)));
		cot.setTradersNoncommercialLongAll(this.parseDouble(map.get(CoTCSVHeader.TradersNoncommercialLongAll)));
		cot.setTradersNoncommercialShortAll(this.parseDouble(map.get(CoTCSVHeader.TradersNoncommercialShortAll)));
		cot.setTradersNoncommercialSpreadingAll(this.parseDouble(map.get(CoTCSVHeader.TradersNoncommercialSpreadingAll)));
		cot.setTradersCommercialLongAll(this.parseDouble(map.get(CoTCSVHeader.TradersCommercialLongAll)));
		cot.setTradersCommercialShortAll(this.parseDouble(map.get(CoTCSVHeader.TradersCommercialShortAll)));
		cot.setTradersTotalReportableLongAll(this.parseDouble(map.get(CoTCSVHeader.TradersTotalReportableLongAll)));
		cot.setTradersTotalReportableShortAll(this.parseDouble(map.get(CoTCSVHeader.TradersTotalReportableShortAll)));
		cot.setTradersTotalOld(this.parseDouble(map.get(CoTCSVHeader.TradersTotalOld)));
		cot.setTradersNoncommercialLongOld(this.parseDouble(map.get(CoTCSVHeader.TradersNoncommercialLongOld)));
		cot.setTradersNoncommercialShortOld(this.parseDouble(map.get(CoTCSVHeader.TradersNoncommercialShortOld)));
		cot.setTradersNoncommercialSpreadingOld(this.parseDouble(map.get(CoTCSVHeader.TradersNoncommercialSpreadingOld)));
		cot.setTradersCommercialLongOld(this.parseDouble(map.get(CoTCSVHeader.TradersCommercialLongOld)));
		cot.setTradersCommercialShortOld(this.parseDouble(map.get(CoTCSVHeader.TradersCommercialShortOld)));
		cot.setTradersTotalReportableLongOld(this.parseDouble(map.get(CoTCSVHeader.TradersTotalReportableLongOld)));
		cot.setTradersTotalReportableShortOld(this.parseDouble(map.get(CoTCSVHeader.TradersTotalReportableShortOld)));
		cot.setTradersTotalOther(this.parseDouble(map.get(CoTCSVHeader.TradersTotalOther)));
		cot.setTradersNoncommercialLongOther(this.parseDouble(map.get(CoTCSVHeader.TradersNoncommercialLongOther)));
		cot.setTradersNoncommercialShortOther(this.parseDouble(map.get(CoTCSVHeader.TradersNoncommercialShortOther)));
		cot.setTradersNoncommercialSpreadingOther(this.parseDouble(map.get(CoTCSVHeader.TradersNoncommercialSpreadingOther)));
		cot.setTradersCommercialLongOther(this.parseDouble(map.get(CoTCSVHeader.TradersCommercialLongOther)));
		cot.setTradersCommercialShortOther(this.parseDouble(map.get(CoTCSVHeader.TradersCommercialShortOther)));
		cot.setTradersTotalReportableLongOther(this.parseDouble(map.get(CoTCSVHeader.TradersTotalReportableLongOther)));
		cot.setTradersTotalReportableShortOther(this.parseDouble(map.get(CoTCSVHeader.TradersTotalReportableShortOther)));
		cot.setConcentrationGrossLT4TDRLongAll(this.parseDouble(map.get(CoTCSVHeader.ConcentrationGrossLT4TDRLongAll)));
		cot.setConcentrationGrossLT4TDRShortAll(this.parseDouble(map.get(CoTCSVHeader.ConcentrationGrossLT4TDRShortAll)));
		cot.setConcentrationGrossLT8TDRLongAll(this.parseDouble(map.get(CoTCSVHeader.ConcentrationGrossLT8TDRLongAll)));
		cot.setConcentrationGrossLT8TDRShortAll(this.parseDouble(map.get(CoTCSVHeader.ConcentrationGrossLT8TDRShortAll)));
		cot.setConcentrationNetLT4TDRLongAll(this.parseDouble(map.get(CoTCSVHeader.ConcentrationNetLT4TDRLongAll)));
		cot.setConcentrationNetLT4TDRShortAll(this.parseDouble(map.get(CoTCSVHeader.ConcentrationNetLT4TDRShortAll)));
		cot.setConcentrationNetLT8TDRLongAll(this.parseDouble(map.get(CoTCSVHeader.ConcentrationNetLT8TDRLongAll)));
		cot.setConcentrationNetLT8TDRShortAll(this.parseDouble(map.get(CoTCSVHeader.ConcentrationNetLT8TDRShortAll)));
		cot.setConcentrationGrossLT4TDRLongOld(this.parseDouble(map.get(CoTCSVHeader.ConcentrationGrossLT4TDRLongOld)));
		cot.setConcentrationGrossLT4TDRShortOld(this.parseDouble(map.get(CoTCSVHeader.ConcentrationGrossLT4TDRShortOld)));
		cot.setConcentrationGrossLT8TDRLongOld(this.parseDouble(map.get(CoTCSVHeader.ConcentrationGrossLT8TDRLongOld)));
		cot.setConcentrationGrossLT8TDRShortOld(this.parseDouble(map.get(CoTCSVHeader.ConcentrationGrossLT8TDRShortOld)));
		cot.setConcentrationNetLT4TDRLongOld(this.parseDouble(map.get(CoTCSVHeader.ConcentrationNetLT4TDRLongOld)));
		cot.setConcentrationNetLT4TDRShortOld(this.parseDouble(map.get(CoTCSVHeader.ConcentrationNetLT4TDRShortOld)));
		cot.setConcentrationNetLT8TDRLongOld(this.parseDouble(map.get(CoTCSVHeader.ConcentrationNetLT8TDRLongOld)));
		cot.setConcentrationNetLT8TDRShortOld(this.parseDouble(map.get(CoTCSVHeader.ConcentrationNetLT8TDRShortOld)));
		cot.setConcentrationGrossLT4TDRLongOther(this.parseDouble(map.get(CoTCSVHeader.ConcentrationGrossLT4TDRLongOther)));
		cot.setConcentrationGrossLT4TDRShortOther(this.parseDouble(map.get(CoTCSVHeader.ConcentrationGrossLT4TDRShortOther)));
		cot.setConcentrationGrossLT8TDRLongOther(this.parseDouble(map.get(CoTCSVHeader.ConcentrationGrossLT8TDRLongOther)));
		cot.setConcentrationGrossLT8TDRShortOther(this.parseDouble(map.get(CoTCSVHeader.ConcentrationGrossLT8TDRShortOther)));
		cot.setConcentrationNetLT4TDRLongOther(this.parseDouble(map.get(CoTCSVHeader.ConcentrationNetLT4TDRLongOther)));
		cot.setConcentrationNetLT4TDRShortOther(this.parseDouble(map.get(CoTCSVHeader.ConcentrationNetLT4TDRShortOther)));
		cot.setConcentrationNetLT8TDRLongOther(this.parseDouble(map.get(CoTCSVHeader.ConcentrationNetLT8TDRLongOther)));
		cot.setConcentrationNetLT8TDRShortOther(this.parseDouble(map.get(CoTCSVHeader.ConcentrationNetLT8TDRShortOther)));
		cot.setContractUnits(map.get(CoTCSVHeader.ContractUnits));
		cot.setCFTCContractMarketCodeQuotes(map.get(CoTCSVHeader.CFTCContractMarketCodeQuotes));
		cot.setCFTCMarketCodeInInitialsQuotes(map.get(CoTCSVHeader.CFTCMarketCodeInInitialsQuotes));
		cot.setCFTCCommodityCodeQuotes(map.get(CoTCSVHeader.CFTCCommodityCodeQuotes));
		
		return cot;
		
	}

}
