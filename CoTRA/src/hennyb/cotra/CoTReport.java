package hennyb.cotra;

import hennyb.cotra.csv.CoTCSVHeader;

import java.util.Map;

/**
 * Simple CoT report data transfer object
 * 
 * @author maxmeffert
 *
 */
public class CoTReport {

	private String MarketAndExchangeNames;
	private double AsOfDateInFormYYMMDD;
	private String AsOfDateInFormYYYYMMDD;
	private double CFTCContractMarketCode;
	private String CFTCMarketCodeInInitials;
	private double CFTCRegionCode;
	private double CFTCCommodityCode;
	private double OpenInterestAll;
	private double NoncommercialPositionsLongAll;
	private double NoncommercialPositionsShortAll;
	private double NoncommercialPositionsSpreadingAll;
	private double CommercialPositionsLongAll;
	private double CommercialPositionsShortAll;
	private double TotalReportablePositionsLongAll;
	private double TotalReportablePositionsShortAll;
	private double NonreportablePositionsLongAll;
	private double NonreportablePositionsShortAll;
	private double OpenInterestOld;
	private double NoncommercialPositionsLongOld;
	private double NoncommercialPositionsShortOld;
	private double NoncommercialPositionsSpreadingOld;
	private double CommercialPositionsLongOld;
	private double CommercialPositionsShortOld;
	private double TotalReportablePositionsLongOld;
	private double TotalReportablePositionsShortOld;
	private double NonreportablePositionsLongOld;
	private double NonreportablePositionsShortOld;
	private double OpenInterestOther;
	private double NoncommercialPositionsLongOther;
	private double NoncommercialPositionsShortOther;
	private double NoncommercialPositionsSpreadingOther;
	private double CommercialPositionsLongOther;
	private double CommercialPositionsShortOther;
	private double TotalReportablePositionsLongOther;
	private double TotalReportablePositionsShortOther;
	private double NonreportablePositionsLongOther;
	private double NonreportablePositionsShortOther;
	private double ChangeInOpenInterestAll;
	private double ChangeInNoncommercialLongAll;
	private double ChangeInNoncommercialShortAll;
	private double ChangeInNoncommercialSpreadingAll;
	private double ChangeInCommercialLongAll;
	private double ChangeInCommercialShortAll;
	private double ChangeInTotalReportableLongAll;
	private double ChangeInTotalReportableShortAll;
	private double ChangeInNonreportableLongAll;
	private double ChangeInNonreportableShortAll;
	private double PercentageOfOpenInterestOIAll;
	private double PercentageOfOINoncommercialLongAll;
	private double PercentageOfOINoncommercialShortAll;
	private double PercentageOfOINoncommercialSpreadingAll;
	private double PercentageOfOICommercialLongAll;
	private double PercentageOfOICommercialShortAll;
	private double PercentageOfOITotalReportableLongAll;
	private double PercentageOfOITotalReportableShortAll;
	private double PercentageOfOINonreportableLongAll;
	private double PercentageOfOINonreportableShortAll;
	private double PercentageOfOpenInterestOIOld;
	private double PercentageOfOINoncommercialLongOld;
	private double PercentageOfOINoncommercialShortOld;
	private double PercentageOfOINoncommercialSpreadingOld;
	private double PercentageOfOICommercialLongOld;
	private double PercentageOfOICommercialShortOld;
	private double PercentageOfOITotalReportableLongOld;
	private double PercentageOfOITotalReportableShortOld;
	private double PercentageOfOINonreportableLongOld;
	private double PercentageOfOINonreportableShortOld;
	private double PercentageOfOpenInterestOIOther;
	private double PercentageOfOINoncommercialLongOther;
	private double PercentageOfOINoncommercialShortOther;
	private double PercentageOfOINoncommercialSpreadingOther;
	private double PercentageOfOICommercialLongOther;
	private double PercentageOfOICommercialShortOther;
	private double PercentageOfOITotalReportableLongOther;
	private double PercentageOfOITotalReportableShortOther;
	private double PercentageOfOINonreportableLongOther;
	private double PercentageOfOINonreportableShortOther;
	private double TradersTotalAll;
	private double TradersNoncommercialLongAll;
	private double TradersNoncommercialShortAll;
	private double TradersNoncommercialSpreadingAll;
	private double TradersCommercialLongAll;
	private double TradersCommercialShortAll;
	private double TradersTotalReportableLongAll;
	private double TradersTotalReportableShortAll;
	private double TradersTotalOld;
	private double TradersNoncommercialLongOld;
	private double TradersNoncommercialShortOld;
	private double TradersNoncommercialSpreadingOld;
	private double TradersCommercialLongOld;
	private double TradersCommercialShortOld;
	private double TradersTotalReportableLongOld;
	private double TradersTotalReportableShortOld;
	private double TradersTotalOther;
	private double TradersNoncommercialLongOther;
	private double TradersNoncommercialShortOther;
	private double TradersNoncommercialSpreadingOther;
	private double TradersCommercialLongOther;
	private double TradersCommercialShortOther;
	private double TradersTotalReportableLongOther;
	private double TradersTotalReportableShortOther;
	private double ConcentrationGrossLT4TDRLongAll;
	private double ConcentrationGrossLT4TDRShortAll;
	private double ConcentrationGrossLT8TDRLongAll;
	private double ConcentrationGrossLT8TDRShortAll;
	private double ConcentrationNetLT4TDRLongAll;
	private double ConcentrationNetLT4TDRShortAll;
	private double ConcentrationNetLT8TDRLongAll;
	private double ConcentrationNetLT8TDRShortAll;
	private double ConcentrationGrossLT4TDRLongOld;
	private double ConcentrationGrossLT4TDRShortOld;
	private double ConcentrationGrossLT8TDRLongOld;
	private double ConcentrationGrossLT8TDRShortOld;
	private double ConcentrationNetLT4TDRLongOld;
	private double ConcentrationNetLT4TDRShortOld;
	private double ConcentrationNetLT8TDRLongOld;
	private double ConcentrationNetLT8TDRShortOld;
	private double ConcentrationGrossLT4TDRLongOther;
	private double ConcentrationGrossLT4TDRShortOther;
	private double ConcentrationGrossLT8TDRLongOther;
	private double ConcentrationGrossLT8TDRShortOther;
	private double ConcentrationNetLT4TDRLongOther;
	private double ConcentrationNetLT4TDRShortOther;
	private double ConcentrationNetLT8TDRLongOther;
	private double ConcentrationNetLT8TDRShortOther;
	private String ContractUnits;
	private String CFTCContractMarketCodeQuotes;
	private String CFTCMarketCodeInInitialsQuotes;
	private String CFTCCommodityCodeQuotes;

	private double parseDouble (String s) {
		
		try {
			
			return Double.parseDouble(s);
			
		}
		catch (Exception e) {
			
			return 0;
			
		}
		
	}
	
	public void fromCSVHeaderMap (Map<CoTCSVHeader,String> map) {
		
		this.setMarketAndExchangeNames(map.get(CoTCSVHeader.MarketAndExchangeNames));
		this.setAsOfDateInFormYYMMDD(this.parseDouble(map.get(CoTCSVHeader.AsOfDateInFormYYMMDD)));
		this.setAsOfDateInFormYYYYMMDD(map.get(CoTCSVHeader.AsOfDateInFormYYYYMMDD));
		this.setCFTCContractMarketCode(this.parseDouble(map.get(CoTCSVHeader.CFTCContractMarketCode)));
		this.setCFTCMarketCodeInInitials(map.get(CoTCSVHeader.CFTCMarketCodeInInitials));
		this.setCFTCRegionCode(this.parseDouble(map.get(CoTCSVHeader.CFTCRegionCode)));
		this.setCFTCCommodityCode(this.parseDouble(map.get(CoTCSVHeader.CFTCCommodityCode)));
		this.setOpenInterestAll(this.parseDouble(map.get(CoTCSVHeader.OpenInterestAll)));
		this.setNoncommercialPositionsLongAll(this.parseDouble(map.get(CoTCSVHeader.NoncommercialPositionsLongAll)));
		this.setNoncommercialPositionsShortAll(this.parseDouble(map.get(CoTCSVHeader.NoncommercialPositionsShortAll)));
		this.setNoncommercialPositionsSpreadingAll(this.parseDouble(map.get(CoTCSVHeader.NoncommercialPositionsSpreadingAll)));
		this.setCommercialPositionsLongAll(this.parseDouble(map.get(CoTCSVHeader.CommercialPositionsLongAll)));
		this.setCommercialPositionsShortAll(this.parseDouble(map.get(CoTCSVHeader.CommercialPositionsShortAll)));
		this.setTotalReportablePositionsLongAll(this.parseDouble(map.get(CoTCSVHeader.TotalReportablePositionsLongAll)));
		this.setTotalReportablePositionsShortAll(this.parseDouble(map.get(CoTCSVHeader.TotalReportablePositionsShortAll)));
		this.setNonreportablePositionsLongAll(this.parseDouble(map.get(CoTCSVHeader.NonreportablePositionsLongAll)));
		this.setNonreportablePositionsShortAll(this.parseDouble(map.get(CoTCSVHeader.NonreportablePositionsShortAll)));
		this.setOpenInterestOld(this.parseDouble(map.get(CoTCSVHeader.OpenInterestOld)));
		this.setNoncommercialPositionsLongOld(this.parseDouble(map.get(CoTCSVHeader.NoncommercialPositionsLongOld)));
		this.setNoncommercialPositionsShortOld(this.parseDouble(map.get(CoTCSVHeader.NoncommercialPositionsShortOld)));
		this.setNoncommercialPositionsSpreadingOld(this.parseDouble(map.get(CoTCSVHeader.NoncommercialPositionsSpreadingOld)));
		this.setCommercialPositionsLongOld(this.parseDouble(map.get(CoTCSVHeader.CommercialPositionsLongOld)));
		this.setCommercialPositionsShortOld(this.parseDouble(map.get(CoTCSVHeader.CommercialPositionsShortOld)));
		this.setTotalReportablePositionsLongOld(this.parseDouble(map.get(CoTCSVHeader.TotalReportablePositionsLongOld)));
		this.setTotalReportablePositionsShortOld(this.parseDouble(map.get(CoTCSVHeader.TotalReportablePositionsShortOld)));
		this.setNonreportablePositionsLongOld(this.parseDouble(map.get(CoTCSVHeader.NonreportablePositionsLongOld)));
		this.setNonreportablePositionsShortOld(this.parseDouble(map.get(CoTCSVHeader.NonreportablePositionsShortOld)));
		this.setOpenInterestOther(this.parseDouble(map.get(CoTCSVHeader.OpenInterestOther)));
		this.setNoncommercialPositionsLongOther(this.parseDouble(map.get(CoTCSVHeader.NoncommercialPositionsLongOther)));
		this.setNoncommercialPositionsShortOther(this.parseDouble(map.get(CoTCSVHeader.NoncommercialPositionsShortOther)));
		this.setNoncommercialPositionsSpreadingOther(this.parseDouble(map.get(CoTCSVHeader.NoncommercialPositionsSpreadingOther)));
		this.setCommercialPositionsLongOther(this.parseDouble(map.get(CoTCSVHeader.CommercialPositionsLongOther)));
		this.setCommercialPositionsShortOther(this.parseDouble(map.get(CoTCSVHeader.CommercialPositionsShortOther)));
		this.setTotalReportablePositionsLongOther(this.parseDouble(map.get(CoTCSVHeader.TotalReportablePositionsLongOther)));
		this.setTotalReportablePositionsShortOther(this.parseDouble(map.get(CoTCSVHeader.TotalReportablePositionsShortOther)));
		this.setNonreportablePositionsLongOther(this.parseDouble(map.get(CoTCSVHeader.NonreportablePositionsLongOther)));
		this.setNonreportablePositionsShortOther(this.parseDouble(map.get(CoTCSVHeader.NonreportablePositionsShortOther)));
		this.setChangeInOpenInterestAll(this.parseDouble(map.get(CoTCSVHeader.ChangeInOpenInterestAll)));
		this.setChangeInNoncommercialLongAll(this.parseDouble(map.get(CoTCSVHeader.ChangeInNoncommercialLongAll)));
		this.setChangeInNoncommercialShortAll(this.parseDouble(map.get(CoTCSVHeader.ChangeInNoncommercialShortAll)));
		this.setChangeInNoncommercialSpreadingAll(this.parseDouble(map.get(CoTCSVHeader.ChangeInNoncommercialSpreadingAll)));
		this.setChangeInCommercialLongAll(this.parseDouble(map.get(CoTCSVHeader.ChangeInCommercialLongAll)));
		this.setChangeInCommercialShortAll(this.parseDouble(map.get(CoTCSVHeader.ChangeInCommercialShortAll)));
		this.setChangeInTotalReportableLongAll(this.parseDouble(map.get(CoTCSVHeader.ChangeInTotalReportableLongAll)));
		this.setChangeInTotalReportableShortAll(this.parseDouble(map.get(CoTCSVHeader.ChangeInTotalReportableShortAll)));
		this.setChangeInNonreportableLongAll(this.parseDouble(map.get(CoTCSVHeader.ChangeInNonreportableLongAll)));
		this.setChangeInNonreportableShortAll(this.parseDouble(map.get(CoTCSVHeader.ChangeInNonreportableShortAll)));
		this.setPercentageOfOpenInterestOIAll(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOpenInterestOIAll)));
		this.setPercentageOfOINoncommercialLongAll(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINoncommercialLongAll)));
		this.setPercentageOfOINoncommercialShortAll(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINoncommercialShortAll)));
		this.setPercentageOfOINoncommercialSpreadingAll(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINoncommercialSpreadingAll)));
		this.setPercentageOfOICommercialLongAll(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOICommercialLongAll)));
		this.setPercentageOfOICommercialShortAll(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOICommercialShortAll)));
		this.setPercentageOfOITotalReportableLongAll(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOITotalReportableLongAll)));
		this.setPercentageOfOITotalReportableShortAll(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOITotalReportableShortAll)));
		this.setPercentageOfOINonreportableLongAll(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINonreportableLongAll)));
		this.setPercentageOfOINonreportableShortAll(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINonreportableShortAll)));
		this.setPercentageOfOpenInterestOIOld(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOpenInterestOIOld)));
		this.setPercentageOfOINoncommercialLongOld(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINoncommercialLongOld)));
		this.setPercentageOfOINoncommercialShortOld(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINoncommercialShortOld)));
		this.setPercentageOfOINoncommercialSpreadingOld(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINoncommercialSpreadingOld)));
		this.setPercentageOfOICommercialLongOld(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOICommercialLongOld)));
		this.setPercentageOfOICommercialShortOld(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOICommercialShortOld)));
		this.setPercentageOfOITotalReportableLongOld(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOITotalReportableLongOld)));
		this.setPercentageOfOITotalReportableShortOld(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOITotalReportableShortOld)));
		this.setPercentageOfOINonreportableLongOld(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINonreportableLongOld)));
		this.setPercentageOfOINonreportableShortOld(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINonreportableShortOld)));
		this.setPercentageOfOpenInterestOIOther(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOpenInterestOIOther)));
		this.setPercentageOfOINoncommercialLongOther(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINoncommercialLongOther)));
		this.setPercentageOfOINoncommercialShortOther(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINoncommercialShortOther)));
		this.setPercentageOfOINoncommercialSpreadingOther(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINoncommercialSpreadingOther)));
		this.setPercentageOfOICommercialLongOther(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOICommercialLongOther)));
		this.setPercentageOfOICommercialShortOther(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOICommercialShortOther)));
		this.setPercentageOfOITotalReportableLongOther(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOITotalReportableLongOther)));
		this.setPercentageOfOITotalReportableShortOther(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOITotalReportableShortOther)));
		this.setPercentageOfOINonreportableLongOther(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINonreportableLongOther)));
		this.setPercentageOfOINonreportableShortOther(this.parseDouble(map.get(CoTCSVHeader.PercentageOfOINonreportableShortOther)));
		this.setTradersTotalAll(this.parseDouble(map.get(CoTCSVHeader.TradersTotalAll)));
		this.setTradersNoncommercialLongAll(this.parseDouble(map.get(CoTCSVHeader.TradersNoncommercialLongAll)));
		this.setTradersNoncommercialShortAll(this.parseDouble(map.get(CoTCSVHeader.TradersNoncommercialShortAll)));
		this.setTradersNoncommercialSpreadingAll(this.parseDouble(map.get(CoTCSVHeader.TradersNoncommercialSpreadingAll)));
		this.setTradersCommercialLongAll(this.parseDouble(map.get(CoTCSVHeader.TradersCommercialLongAll)));
		this.setTradersCommercialShortAll(this.parseDouble(map.get(CoTCSVHeader.TradersCommercialShortAll)));
		this.setTradersTotalReportableLongAll(this.parseDouble(map.get(CoTCSVHeader.TradersTotalReportableLongAll)));
		this.setTradersTotalReportableShortAll(this.parseDouble(map.get(CoTCSVHeader.TradersTotalReportableShortAll)));
		this.setTradersTotalOld(this.parseDouble(map.get(CoTCSVHeader.TradersTotalOld)));
		this.setTradersNoncommercialLongOld(this.parseDouble(map.get(CoTCSVHeader.TradersNoncommercialLongOld)));
		this.setTradersNoncommercialShortOld(this.parseDouble(map.get(CoTCSVHeader.TradersNoncommercialShortOld)));
		this.setTradersNoncommercialSpreadingOld(this.parseDouble(map.get(CoTCSVHeader.TradersNoncommercialSpreadingOld)));
		this.setTradersCommercialLongOld(this.parseDouble(map.get(CoTCSVHeader.TradersCommercialLongOld)));
		this.setTradersCommercialShortOld(this.parseDouble(map.get(CoTCSVHeader.TradersCommercialShortOld)));
		this.setTradersTotalReportableLongOld(this.parseDouble(map.get(CoTCSVHeader.TradersTotalReportableLongOld)));
		this.setTradersTotalReportableShortOld(this.parseDouble(map.get(CoTCSVHeader.TradersTotalReportableShortOld)));
		this.setTradersTotalOther(this.parseDouble(map.get(CoTCSVHeader.TradersTotalOther)));
		this.setTradersNoncommercialLongOther(this.parseDouble(map.get(CoTCSVHeader.TradersNoncommercialLongOther)));
		this.setTradersNoncommercialShortOther(this.parseDouble(map.get(CoTCSVHeader.TradersNoncommercialShortOther)));
		this.setTradersNoncommercialSpreadingOther(this.parseDouble(map.get(CoTCSVHeader.TradersNoncommercialSpreadingOther)));
		this.setTradersCommercialLongOther(this.parseDouble(map.get(CoTCSVHeader.TradersCommercialLongOther)));
		this.setTradersCommercialShortOther(this.parseDouble(map.get(CoTCSVHeader.TradersCommercialShortOther)));
		this.setTradersTotalReportableLongOther(this.parseDouble(map.get(CoTCSVHeader.TradersTotalReportableLongOther)));
		this.setTradersTotalReportableShortOther(this.parseDouble(map.get(CoTCSVHeader.TradersTotalReportableShortOther)));
		this.setConcentrationGrossLT4TDRLongAll(this.parseDouble(map.get(CoTCSVHeader.ConcentrationGrossLT4TDRLongAll)));
		this.setConcentrationGrossLT4TDRShortAll(this.parseDouble(map.get(CoTCSVHeader.ConcentrationGrossLT4TDRShortAll)));
		this.setConcentrationGrossLT8TDRLongAll(this.parseDouble(map.get(CoTCSVHeader.ConcentrationGrossLT8TDRLongAll)));
		this.setConcentrationGrossLT8TDRShortAll(this.parseDouble(map.get(CoTCSVHeader.ConcentrationGrossLT8TDRShortAll)));
		this.setConcentrationNetLT4TDRLongAll(this.parseDouble(map.get(CoTCSVHeader.ConcentrationNetLT4TDRLongAll)));
		this.setConcentrationNetLT4TDRShortAll(this.parseDouble(map.get(CoTCSVHeader.ConcentrationNetLT4TDRShortAll)));
		this.setConcentrationNetLT8TDRLongAll(this.parseDouble(map.get(CoTCSVHeader.ConcentrationNetLT8TDRLongAll)));
		this.setConcentrationNetLT8TDRShortAll(this.parseDouble(map.get(CoTCSVHeader.ConcentrationNetLT8TDRShortAll)));
		this.setConcentrationGrossLT4TDRLongOld(this.parseDouble(map.get(CoTCSVHeader.ConcentrationGrossLT4TDRLongOld)));
		this.setConcentrationGrossLT4TDRShortOld(this.parseDouble(map.get(CoTCSVHeader.ConcentrationGrossLT4TDRShortOld)));
		this.setConcentrationGrossLT8TDRLongOld(this.parseDouble(map.get(CoTCSVHeader.ConcentrationGrossLT8TDRLongOld)));
		this.setConcentrationGrossLT8TDRShortOld(this.parseDouble(map.get(CoTCSVHeader.ConcentrationGrossLT8TDRShortOld)));
		this.setConcentrationNetLT4TDRLongOld(this.parseDouble(map.get(CoTCSVHeader.ConcentrationNetLT4TDRLongOld)));
		this.setConcentrationNetLT4TDRShortOld(this.parseDouble(map.get(CoTCSVHeader.ConcentrationNetLT4TDRShortOld)));
		this.setConcentrationNetLT8TDRLongOld(this.parseDouble(map.get(CoTCSVHeader.ConcentrationNetLT8TDRLongOld)));
		this.setConcentrationNetLT8TDRShortOld(this.parseDouble(map.get(CoTCSVHeader.ConcentrationNetLT8TDRShortOld)));
		this.setConcentrationGrossLT4TDRLongOther(this.parseDouble(map.get(CoTCSVHeader.ConcentrationGrossLT4TDRLongOther)));
		this.setConcentrationGrossLT4TDRShortOther(this.parseDouble(map.get(CoTCSVHeader.ConcentrationGrossLT4TDRShortOther)));
		this.setConcentrationGrossLT8TDRLongOther(this.parseDouble(map.get(CoTCSVHeader.ConcentrationGrossLT8TDRLongOther)));
		this.setConcentrationGrossLT8TDRShortOther(this.parseDouble(map.get(CoTCSVHeader.ConcentrationGrossLT8TDRShortOther)));
		this.setConcentrationNetLT4TDRLongOther(this.parseDouble(map.get(CoTCSVHeader.ConcentrationNetLT4TDRLongOther)));
		this.setConcentrationNetLT4TDRShortOther(this.parseDouble(map.get(CoTCSVHeader.ConcentrationNetLT4TDRShortOther)));
		this.setConcentrationNetLT8TDRLongOther(this.parseDouble(map.get(CoTCSVHeader.ConcentrationNetLT8TDRLongOther)));
		this.setConcentrationNetLT8TDRShortOther(this.parseDouble(map.get(CoTCSVHeader.ConcentrationNetLT8TDRShortOther)));
		this.setContractUnits(map.get(CoTCSVHeader.ContractUnits));
		this.setCFTCContractMarketCodeQuotes(map.get(CoTCSVHeader.CFTCContractMarketCodeQuotes));
		this.setCFTCMarketCodeInInitialsQuotes(map.get(CoTCSVHeader.CFTCMarketCodeInInitialsQuotes));
		this.setCFTCCommodityCodeQuotes(map.get(CoTCSVHeader.CFTCCommodityCodeQuotes));

		
	}


	public String getMarketAndExchangeNames() {
		return MarketAndExchangeNames;
	}


	public void setMarketAndExchangeNames(String marketAndExchangeNames) {
		MarketAndExchangeNames = marketAndExchangeNames;
	}


	public double getAsOfDateInFormYYMMDD() {
		return AsOfDateInFormYYMMDD;
	}


	public void setAsOfDateInFormYYMMDD(double asOfDateInFormYYMMDD) {
		AsOfDateInFormYYMMDD = asOfDateInFormYYMMDD;
	}


	public String getAsOfDateInFormYYYYMMDD() {
		return AsOfDateInFormYYYYMMDD;
	}


	public void setAsOfDateInFormYYYYMMDD(String asOfDateInFormYYYYMMDD) {
		AsOfDateInFormYYYYMMDD = asOfDateInFormYYYYMMDD;
	}


	public double getCFTCContractMarketCode() {
		return CFTCContractMarketCode;
	}


	public void setCFTCContractMarketCode(double cFTCContractMarketCode) {
		CFTCContractMarketCode = cFTCContractMarketCode;
	}


	public String getCFTCMarketCodeInInitials() {
		return CFTCMarketCodeInInitials;
	}


	public void setCFTCMarketCodeInInitials(String cFTCMarketCodeInInitials) {
		CFTCMarketCodeInInitials = cFTCMarketCodeInInitials;
	}


	public double getCFTCRegionCode() {
		return CFTCRegionCode;
	}


	public void setCFTCRegionCode(double cFTCRegionCode) {
		CFTCRegionCode = cFTCRegionCode;
	}


	public double getCFTCCommodityCode() {
		return CFTCCommodityCode;
	}


	public void setCFTCCommodityCode(double cFTCCommodityCode) {
		CFTCCommodityCode = cFTCCommodityCode;
	}


	public double getOpenInterestAll() {
		return OpenInterestAll;
	}


	public void setOpenInterestAll(double openInterestAll) {
		OpenInterestAll = openInterestAll;
	}


	public double getNoncommercialPositionsLongAll() {
		return NoncommercialPositionsLongAll;
	}


	public void setNoncommercialPositionsLongAll(
			double noncommercialPositionsLongAll) {
		NoncommercialPositionsLongAll = noncommercialPositionsLongAll;
	}


	public double getNoncommercialPositionsShortAll() {
		return NoncommercialPositionsShortAll;
	}


	public void setNoncommercialPositionsShortAll(
			double noncommercialPositionsShortAll) {
		NoncommercialPositionsShortAll = noncommercialPositionsShortAll;
	}


	public double getNoncommercialPositionsSpreadingAll() {
		return NoncommercialPositionsSpreadingAll;
	}


	public void setNoncommercialPositionsSpreadingAll(
			double noncommercialPositionsSpreadingAll) {
		NoncommercialPositionsSpreadingAll = noncommercialPositionsSpreadingAll;
	}


	public double getCommercialPositionsLongAll() {
		return CommercialPositionsLongAll;
	}


	public void setCommercialPositionsLongAll(double commercialPositionsLongAll) {
		CommercialPositionsLongAll = commercialPositionsLongAll;
	}


	public double getCommercialPositionsShortAll() {
		return CommercialPositionsShortAll;
	}


	public void setCommercialPositionsShortAll(double commercialPositionsShortAll) {
		CommercialPositionsShortAll = commercialPositionsShortAll;
	}


	public double getTotalReportablePositionsLongAll() {
		return TotalReportablePositionsLongAll;
	}


	public void setTotalReportablePositionsLongAll(
			double totalReportablePositionsLongAll) {
		TotalReportablePositionsLongAll = totalReportablePositionsLongAll;
	}


	public double getTotalReportablePositionsShortAll() {
		return TotalReportablePositionsShortAll;
	}


	public void setTotalReportablePositionsShortAll(
			double totalReportablePositionsShortAll) {
		TotalReportablePositionsShortAll = totalReportablePositionsShortAll;
	}


	public double getNonreportablePositionsLongAll() {
		return NonreportablePositionsLongAll;
	}


	public void setNonreportablePositionsLongAll(
			double nonreportablePositionsLongAll) {
		NonreportablePositionsLongAll = nonreportablePositionsLongAll;
	}


	public double getNonreportablePositionsShortAll() {
		return NonreportablePositionsShortAll;
	}


	public void setNonreportablePositionsShortAll(
			double nonreportablePositionsShortAll) {
		NonreportablePositionsShortAll = nonreportablePositionsShortAll;
	}


	public double getOpenInterestOld() {
		return OpenInterestOld;
	}


	public void setOpenInterestOld(double openInterestOld) {
		OpenInterestOld = openInterestOld;
	}


	public double getNoncommercialPositionsLongOld() {
		return NoncommercialPositionsLongOld;
	}


	public void setNoncommercialPositionsLongOld(
			double noncommercialPositionsLongOld) {
		NoncommercialPositionsLongOld = noncommercialPositionsLongOld;
	}


	public double getNoncommercialPositionsShortOld() {
		return NoncommercialPositionsShortOld;
	}


	public void setNoncommercialPositionsShortOld(
			double noncommercialPositionsShortOld) {
		NoncommercialPositionsShortOld = noncommercialPositionsShortOld;
	}


	public double getNoncommercialPositionsSpreadingOld() {
		return NoncommercialPositionsSpreadingOld;
	}


	public void setNoncommercialPositionsSpreadingOld(
			double noncommercialPositionsSpreadingOld) {
		NoncommercialPositionsSpreadingOld = noncommercialPositionsSpreadingOld;
	}


	public double getCommercialPositionsLongOld() {
		return CommercialPositionsLongOld;
	}


	public void setCommercialPositionsLongOld(double commercialPositionsLongOld) {
		CommercialPositionsLongOld = commercialPositionsLongOld;
	}


	public double getCommercialPositionsShortOld() {
		return CommercialPositionsShortOld;
	}


	public void setCommercialPositionsShortOld(double commercialPositionsShortOld) {
		CommercialPositionsShortOld = commercialPositionsShortOld;
	}


	public double getTotalReportablePositionsLongOld() {
		return TotalReportablePositionsLongOld;
	}


	public void setTotalReportablePositionsLongOld(
			double totalReportablePositionsLongOld) {
		TotalReportablePositionsLongOld = totalReportablePositionsLongOld;
	}


	public double getTotalReportablePositionsShortOld() {
		return TotalReportablePositionsShortOld;
	}


	public void setTotalReportablePositionsShortOld(
			double totalReportablePositionsShortOld) {
		TotalReportablePositionsShortOld = totalReportablePositionsShortOld;
	}


	public double getNonreportablePositionsLongOld() {
		return NonreportablePositionsLongOld;
	}


	public void setNonreportablePositionsLongOld(
			double nonreportablePositionsLongOld) {
		NonreportablePositionsLongOld = nonreportablePositionsLongOld;
	}


	public double getNonreportablePositionsShortOld() {
		return NonreportablePositionsShortOld;
	}


	public void setNonreportablePositionsShortOld(
			double nonreportablePositionsShortOld) {
		NonreportablePositionsShortOld = nonreportablePositionsShortOld;
	}


	public double getOpenInterestOther() {
		return OpenInterestOther;
	}


	public void setOpenInterestOther(double openInterestOther) {
		OpenInterestOther = openInterestOther;
	}


	public double getNoncommercialPositionsLongOther() {
		return NoncommercialPositionsLongOther;
	}


	public void setNoncommercialPositionsLongOther(
			double noncommercialPositionsLongOther) {
		NoncommercialPositionsLongOther = noncommercialPositionsLongOther;
	}


	public double getNoncommercialPositionsShortOther() {
		return NoncommercialPositionsShortOther;
	}


	public void setNoncommercialPositionsShortOther(
			double noncommercialPositionsShortOther) {
		NoncommercialPositionsShortOther = noncommercialPositionsShortOther;
	}


	public double getNoncommercialPositionsSpreadingOther() {
		return NoncommercialPositionsSpreadingOther;
	}


	public void setNoncommercialPositionsSpreadingOther(
			double noncommercialPositionsSpreadingOther) {
		NoncommercialPositionsSpreadingOther = noncommercialPositionsSpreadingOther;
	}


	public double getCommercialPositionsLongOther() {
		return CommercialPositionsLongOther;
	}


	public void setCommercialPositionsLongOther(double commercialPositionsLongOther) {
		CommercialPositionsLongOther = commercialPositionsLongOther;
	}


	public double getCommercialPositionsShortOther() {
		return CommercialPositionsShortOther;
	}


	public void setCommercialPositionsShortOther(
			double commercialPositionsShortOther) {
		CommercialPositionsShortOther = commercialPositionsShortOther;
	}


	public double getTotalReportablePositionsLongOther() {
		return TotalReportablePositionsLongOther;
	}


	public void setTotalReportablePositionsLongOther(
			double totalReportablePositionsLongOther) {
		TotalReportablePositionsLongOther = totalReportablePositionsLongOther;
	}


	public double getTotalReportablePositionsShortOther() {
		return TotalReportablePositionsShortOther;
	}


	public void setTotalReportablePositionsShortOther(
			double totalReportablePositionsShortOther) {
		TotalReportablePositionsShortOther = totalReportablePositionsShortOther;
	}


	public double getNonreportablePositionsLongOther() {
		return NonreportablePositionsLongOther;
	}


	public void setNonreportablePositionsLongOther(
			double nonreportablePositionsLongOther) {
		NonreportablePositionsLongOther = nonreportablePositionsLongOther;
	}


	public double getNonreportablePositionsShortOther() {
		return NonreportablePositionsShortOther;
	}


	public void setNonreportablePositionsShortOther(
			double nonreportablePositionsShortOther) {
		NonreportablePositionsShortOther = nonreportablePositionsShortOther;
	}


	public double getChangeInOpenInterestAll() {
		return ChangeInOpenInterestAll;
	}


	public void setChangeInOpenInterestAll(double changeInOpenInterestAll) {
		ChangeInOpenInterestAll = changeInOpenInterestAll;
	}


	public double getChangeInNoncommercialLongAll() {
		return ChangeInNoncommercialLongAll;
	}


	public void setChangeInNoncommercialLongAll(double changeInNoncommercialLongAll) {
		ChangeInNoncommercialLongAll = changeInNoncommercialLongAll;
	}


	public double getChangeInNoncommercialShortAll() {
		return ChangeInNoncommercialShortAll;
	}


	public void setChangeInNoncommercialShortAll(
			double changeInNoncommercialShortAll) {
		ChangeInNoncommercialShortAll = changeInNoncommercialShortAll;
	}


	public double getChangeInNoncommercialSpreadingAll() {
		return ChangeInNoncommercialSpreadingAll;
	}


	public void setChangeInNoncommercialSpreadingAll(
			double changeInNoncommercialSpreadingAll) {
		ChangeInNoncommercialSpreadingAll = changeInNoncommercialSpreadingAll;
	}


	public double getChangeInCommercialLongAll() {
		return ChangeInCommercialLongAll;
	}


	public void setChangeInCommercialLongAll(double changeInCommercialLongAll) {
		ChangeInCommercialLongAll = changeInCommercialLongAll;
	}


	public double getChangeInCommercialShortAll() {
		return ChangeInCommercialShortAll;
	}


	public void setChangeInCommercialShortAll(double changeInCommercialShortAll) {
		ChangeInCommercialShortAll = changeInCommercialShortAll;
	}


	public double getChangeInTotalReportableLongAll() {
		return ChangeInTotalReportableLongAll;
	}


	public void setChangeInTotalReportableLongAll(
			double changeInTotalReportableLongAll) {
		ChangeInTotalReportableLongAll = changeInTotalReportableLongAll;
	}


	public double getChangeInTotalReportableShortAll() {
		return ChangeInTotalReportableShortAll;
	}


	public void setChangeInTotalReportableShortAll(
			double changeInTotalReportableShortAll) {
		ChangeInTotalReportableShortAll = changeInTotalReportableShortAll;
	}


	public double getChangeInNonreportableLongAll() {
		return ChangeInNonreportableLongAll;
	}


	public void setChangeInNonreportableLongAll(double changeInNonreportableLongAll) {
		ChangeInNonreportableLongAll = changeInNonreportableLongAll;
	}


	public double getChangeInNonreportableShortAll() {
		return ChangeInNonreportableShortAll;
	}


	public void setChangeInNonreportableShortAll(
			double changeInNonreportableShortAll) {
		ChangeInNonreportableShortAll = changeInNonreportableShortAll;
	}


	public double getPercentageOfOpenInterestOIAll() {
		return PercentageOfOpenInterestOIAll;
	}


	public void setPercentageOfOpenInterestOIAll(
			double percentageOfOpenInterestOIAll) {
		PercentageOfOpenInterestOIAll = percentageOfOpenInterestOIAll;
	}


	public double getPercentageOfOINoncommercialLongAll() {
		return PercentageOfOINoncommercialLongAll;
	}


	public void setPercentageOfOINoncommercialLongAll(
			double percentageOfOINoncommercialLongAll) {
		PercentageOfOINoncommercialLongAll = percentageOfOINoncommercialLongAll;
	}


	public double getPercentageOfOINoncommercialShortAll() {
		return PercentageOfOINoncommercialShortAll;
	}


	public void setPercentageOfOINoncommercialShortAll(
			double percentageOfOINoncommercialShortAll) {
		PercentageOfOINoncommercialShortAll = percentageOfOINoncommercialShortAll;
	}


	public double getPercentageOfOINoncommercialSpreadingAll() {
		return PercentageOfOINoncommercialSpreadingAll;
	}


	public void setPercentageOfOINoncommercialSpreadingAll(
			double percentageOfOINoncommercialSpreadingAll) {
		PercentageOfOINoncommercialSpreadingAll = percentageOfOINoncommercialSpreadingAll;
	}


	public double getPercentageOfOICommercialLongAll() {
		return PercentageOfOICommercialLongAll;
	}


	public void setPercentageOfOICommercialLongAll(
			double percentageOfOICommercialLongAll) {
		PercentageOfOICommercialLongAll = percentageOfOICommercialLongAll;
	}


	public double getPercentageOfOICommercialShortAll() {
		return PercentageOfOICommercialShortAll;
	}


	public void setPercentageOfOICommercialShortAll(
			double percentageOfOICommercialShortAll) {
		PercentageOfOICommercialShortAll = percentageOfOICommercialShortAll;
	}


	public double getPercentageOfOITotalReportableLongAll() {
		return PercentageOfOITotalReportableLongAll;
	}


	public void setPercentageOfOITotalReportableLongAll(
			double percentageOfOITotalReportableLongAll) {
		PercentageOfOITotalReportableLongAll = percentageOfOITotalReportableLongAll;
	}


	public double getPercentageOfOITotalReportableShortAll() {
		return PercentageOfOITotalReportableShortAll;
	}


	public void setPercentageOfOITotalReportableShortAll(
			double percentageOfOITotalReportableShortAll) {
		PercentageOfOITotalReportableShortAll = percentageOfOITotalReportableShortAll;
	}


	public double getPercentageOfOINonreportableLongAll() {
		return PercentageOfOINonreportableLongAll;
	}


	public void setPercentageOfOINonreportableLongAll(
			double percentageOfOINonreportableLongAll) {
		PercentageOfOINonreportableLongAll = percentageOfOINonreportableLongAll;
	}


	public double getPercentageOfOINonreportableShortAll() {
		return PercentageOfOINonreportableShortAll;
	}


	public void setPercentageOfOINonreportableShortAll(
			double percentageOfOINonreportableShortAll) {
		PercentageOfOINonreportableShortAll = percentageOfOINonreportableShortAll;
	}


	public double getPercentageOfOpenInterestOIOld() {
		return PercentageOfOpenInterestOIOld;
	}


	public void setPercentageOfOpenInterestOIOld(
			double percentageOfOpenInterestOIOld) {
		PercentageOfOpenInterestOIOld = percentageOfOpenInterestOIOld;
	}


	public double getPercentageOfOINoncommercialLongOld() {
		return PercentageOfOINoncommercialLongOld;
	}


	public void setPercentageOfOINoncommercialLongOld(
			double percentageOfOINoncommercialLongOld) {
		PercentageOfOINoncommercialLongOld = percentageOfOINoncommercialLongOld;
	}


	public double getPercentageOfOINoncommercialShortOld() {
		return PercentageOfOINoncommercialShortOld;
	}


	public void setPercentageOfOINoncommercialShortOld(
			double percentageOfOINoncommercialShortOld) {
		PercentageOfOINoncommercialShortOld = percentageOfOINoncommercialShortOld;
	}


	public double getPercentageOfOINoncommercialSpreadingOld() {
		return PercentageOfOINoncommercialSpreadingOld;
	}


	public void setPercentageOfOINoncommercialSpreadingOld(
			double percentageOfOINoncommercialSpreadingOld) {
		PercentageOfOINoncommercialSpreadingOld = percentageOfOINoncommercialSpreadingOld;
	}


	public double getPercentageOfOICommercialLongOld() {
		return PercentageOfOICommercialLongOld;
	}


	public void setPercentageOfOICommercialLongOld(
			double percentageOfOICommercialLongOld) {
		PercentageOfOICommercialLongOld = percentageOfOICommercialLongOld;
	}


	public double getPercentageOfOICommercialShortOld() {
		return PercentageOfOICommercialShortOld;
	}


	public void setPercentageOfOICommercialShortOld(
			double percentageOfOICommercialShortOld) {
		PercentageOfOICommercialShortOld = percentageOfOICommercialShortOld;
	}


	public double getPercentageOfOITotalReportableLongOld() {
		return PercentageOfOITotalReportableLongOld;
	}


	public void setPercentageOfOITotalReportableLongOld(
			double percentageOfOITotalReportableLongOld) {
		PercentageOfOITotalReportableLongOld = percentageOfOITotalReportableLongOld;
	}


	public double getPercentageOfOITotalReportableShortOld() {
		return PercentageOfOITotalReportableShortOld;
	}


	public void setPercentageOfOITotalReportableShortOld(
			double percentageOfOITotalReportableShortOld) {
		PercentageOfOITotalReportableShortOld = percentageOfOITotalReportableShortOld;
	}


	public double getPercentageOfOINonreportableLongOld() {
		return PercentageOfOINonreportableLongOld;
	}


	public void setPercentageOfOINonreportableLongOld(
			double percentageOfOINonreportableLongOld) {
		PercentageOfOINonreportableLongOld = percentageOfOINonreportableLongOld;
	}


	public double getPercentageOfOINonreportableShortOld() {
		return PercentageOfOINonreportableShortOld;
	}


	public void setPercentageOfOINonreportableShortOld(
			double percentageOfOINonreportableShortOld) {
		PercentageOfOINonreportableShortOld = percentageOfOINonreportableShortOld;
	}


	public double getPercentageOfOpenInterestOIOther() {
		return PercentageOfOpenInterestOIOther;
	}


	public void setPercentageOfOpenInterestOIOther(
			double percentageOfOpenInterestOIOther) {
		PercentageOfOpenInterestOIOther = percentageOfOpenInterestOIOther;
	}


	public double getPercentageOfOINoncommercialLongOther() {
		return PercentageOfOINoncommercialLongOther;
	}


	public void setPercentageOfOINoncommercialLongOther(
			double percentageOfOINoncommercialLongOther) {
		PercentageOfOINoncommercialLongOther = percentageOfOINoncommercialLongOther;
	}


	public double getPercentageOfOINoncommercialShortOther() {
		return PercentageOfOINoncommercialShortOther;
	}


	public void setPercentageOfOINoncommercialShortOther(
			double percentageOfOINoncommercialShortOther) {
		PercentageOfOINoncommercialShortOther = percentageOfOINoncommercialShortOther;
	}


	public double getPercentageOfOINoncommercialSpreadingOther() {
		return PercentageOfOINoncommercialSpreadingOther;
	}


	public void setPercentageOfOINoncommercialSpreadingOther(
			double percentageOfOINoncommercialSpreadingOther) {
		PercentageOfOINoncommercialSpreadingOther = percentageOfOINoncommercialSpreadingOther;
	}


	public double getPercentageOfOICommercialLongOther() {
		return PercentageOfOICommercialLongOther;
	}


	public void setPercentageOfOICommercialLongOther(
			double percentageOfOICommercialLongOther) {
		PercentageOfOICommercialLongOther = percentageOfOICommercialLongOther;
	}


	public double getPercentageOfOICommercialShortOther() {
		return PercentageOfOICommercialShortOther;
	}


	public void setPercentageOfOICommercialShortOther(
			double percentageOfOICommercialShortOther) {
		PercentageOfOICommercialShortOther = percentageOfOICommercialShortOther;
	}


	public double getPercentageOfOITotalReportableLongOther() {
		return PercentageOfOITotalReportableLongOther;
	}


	public void setPercentageOfOITotalReportableLongOther(
			double percentageOfOITotalReportableLongOther) {
		PercentageOfOITotalReportableLongOther = percentageOfOITotalReportableLongOther;
	}


	public double getPercentageOfOITotalReportableShortOther() {
		return PercentageOfOITotalReportableShortOther;
	}


	public void setPercentageOfOITotalReportableShortOther(
			double percentageOfOITotalReportableShortOther) {
		PercentageOfOITotalReportableShortOther = percentageOfOITotalReportableShortOther;
	}


	public double getPercentageOfOINonreportableLongOther() {
		return PercentageOfOINonreportableLongOther;
	}


	public void setPercentageOfOINonreportableLongOther(
			double percentageOfOINonreportableLongOther) {
		PercentageOfOINonreportableLongOther = percentageOfOINonreportableLongOther;
	}


	public double getPercentageOfOINonreportableShortOther() {
		return PercentageOfOINonreportableShortOther;
	}


	public void setPercentageOfOINonreportableShortOther(
			double percentageOfOINonreportableShortOther) {
		PercentageOfOINonreportableShortOther = percentageOfOINonreportableShortOther;
	}


	public double getTradersTotalAll() {
		return TradersTotalAll;
	}


	public void setTradersTotalAll(double tradersTotalAll) {
		TradersTotalAll = tradersTotalAll;
	}


	public double getTradersNoncommercialLongAll() {
		return TradersNoncommercialLongAll;
	}


	public void setTradersNoncommercialLongAll(double tradersNoncommercialLongAll) {
		TradersNoncommercialLongAll = tradersNoncommercialLongAll;
	}


	public double getTradersNoncommercialShortAll() {
		return TradersNoncommercialShortAll;
	}


	public void setTradersNoncommercialShortAll(double tradersNoncommercialShortAll) {
		TradersNoncommercialShortAll = tradersNoncommercialShortAll;
	}


	public double getTradersNoncommercialSpreadingAll() {
		return TradersNoncommercialSpreadingAll;
	}


	public void setTradersNoncommercialSpreadingAll(
			double tradersNoncommercialSpreadingAll) {
		TradersNoncommercialSpreadingAll = tradersNoncommercialSpreadingAll;
	}


	public double getTradersCommercialLongAll() {
		return TradersCommercialLongAll;
	}


	public void setTradersCommercialLongAll(double tradersCommercialLongAll) {
		TradersCommercialLongAll = tradersCommercialLongAll;
	}


	public double getTradersCommercialShortAll() {
		return TradersCommercialShortAll;
	}


	public void setTradersCommercialShortAll(double tradersCommercialShortAll) {
		TradersCommercialShortAll = tradersCommercialShortAll;
	}


	public double getTradersTotalReportableLongAll() {
		return TradersTotalReportableLongAll;
	}


	public void setTradersTotalReportableLongAll(
			double tradersTotalReportableLongAll) {
		TradersTotalReportableLongAll = tradersTotalReportableLongAll;
	}


	public double getTradersTotalReportableShortAll() {
		return TradersTotalReportableShortAll;
	}


	public void setTradersTotalReportableShortAll(
			double tradersTotalReportableShortAll) {
		TradersTotalReportableShortAll = tradersTotalReportableShortAll;
	}


	public double getTradersTotalOld() {
		return TradersTotalOld;
	}


	public void setTradersTotalOld(double tradersTotalOld) {
		TradersTotalOld = tradersTotalOld;
	}


	public double getTradersNoncommercialLongOld() {
		return TradersNoncommercialLongOld;
	}


	public void setTradersNoncommercialLongOld(double tradersNoncommercialLongOld) {
		TradersNoncommercialLongOld = tradersNoncommercialLongOld;
	}


	public double getTradersNoncommercialShortOld() {
		return TradersNoncommercialShortOld;
	}


	public void setTradersNoncommercialShortOld(double tradersNoncommercialShortOld) {
		TradersNoncommercialShortOld = tradersNoncommercialShortOld;
	}


	public double getTradersNoncommercialSpreadingOld() {
		return TradersNoncommercialSpreadingOld;
	}


	public void setTradersNoncommercialSpreadingOld(
			double tradersNoncommercialSpreadingOld) {
		TradersNoncommercialSpreadingOld = tradersNoncommercialSpreadingOld;
	}


	public double getTradersCommercialLongOld() {
		return TradersCommercialLongOld;
	}


	public void setTradersCommercialLongOld(double tradersCommercialLongOld) {
		TradersCommercialLongOld = tradersCommercialLongOld;
	}


	public double getTradersCommercialShortOld() {
		return TradersCommercialShortOld;
	}


	public void setTradersCommercialShortOld(double tradersCommercialShortOld) {
		TradersCommercialShortOld = tradersCommercialShortOld;
	}


	public double getTradersTotalReportableLongOld() {
		return TradersTotalReportableLongOld;
	}


	public void setTradersTotalReportableLongOld(
			double tradersTotalReportableLongOld) {
		TradersTotalReportableLongOld = tradersTotalReportableLongOld;
	}


	public double getTradersTotalReportableShortOld() {
		return TradersTotalReportableShortOld;
	}


	public void setTradersTotalReportableShortOld(
			double tradersTotalReportableShortOld) {
		TradersTotalReportableShortOld = tradersTotalReportableShortOld;
	}


	public double getTradersTotalOther() {
		return TradersTotalOther;
	}


	public void setTradersTotalOther(double tradersTotalOther) {
		TradersTotalOther = tradersTotalOther;
	}


	public double getTradersNoncommercialLongOther() {
		return TradersNoncommercialLongOther;
	}


	public void setTradersNoncommercialLongOther(
			double tradersNoncommercialLongOther) {
		TradersNoncommercialLongOther = tradersNoncommercialLongOther;
	}


	public double getTradersNoncommercialShortOther() {
		return TradersNoncommercialShortOther;
	}


	public void setTradersNoncommercialShortOther(
			double tradersNoncommercialShortOther) {
		TradersNoncommercialShortOther = tradersNoncommercialShortOther;
	}


	public double getTradersNoncommercialSpreadingOther() {
		return TradersNoncommercialSpreadingOther;
	}


	public void setTradersNoncommercialSpreadingOther(
			double tradersNoncommercialSpreadingOther) {
		TradersNoncommercialSpreadingOther = tradersNoncommercialSpreadingOther;
	}


	public double getTradersCommercialLongOther() {
		return TradersCommercialLongOther;
	}


	public void setTradersCommercialLongOther(double tradersCommercialLongOther) {
		TradersCommercialLongOther = tradersCommercialLongOther;
	}


	public double getTradersCommercialShortOther() {
		return TradersCommercialShortOther;
	}


	public void setTradersCommercialShortOther(double tradersCommercialShortOther) {
		TradersCommercialShortOther = tradersCommercialShortOther;
	}


	public double getTradersTotalReportableLongOther() {
		return TradersTotalReportableLongOther;
	}


	public void setTradersTotalReportableLongOther(
			double tradersTotalReportableLongOther) {
		TradersTotalReportableLongOther = tradersTotalReportableLongOther;
	}


	public double getTradersTotalReportableShortOther() {
		return TradersTotalReportableShortOther;
	}


	public void setTradersTotalReportableShortOther(
			double tradersTotalReportableShortOther) {
		TradersTotalReportableShortOther = tradersTotalReportableShortOther;
	}


	public double getConcentrationGrossLT4TDRLongAll() {
		return ConcentrationGrossLT4TDRLongAll;
	}


	public void setConcentrationGrossLT4TDRLongAll(
			double concentrationGrossLT4TDRLongAll) {
		ConcentrationGrossLT4TDRLongAll = concentrationGrossLT4TDRLongAll;
	}


	public double getConcentrationGrossLT4TDRShortAll() {
		return ConcentrationGrossLT4TDRShortAll;
	}


	public void setConcentrationGrossLT4TDRShortAll(
			double concentrationGrossLT4TDRShortAll) {
		ConcentrationGrossLT4TDRShortAll = concentrationGrossLT4TDRShortAll;
	}


	public double getConcentrationGrossLT8TDRLongAll() {
		return ConcentrationGrossLT8TDRLongAll;
	}


	public void setConcentrationGrossLT8TDRLongAll(
			double concentrationGrossLT8TDRLongAll) {
		ConcentrationGrossLT8TDRLongAll = concentrationGrossLT8TDRLongAll;
	}


	public double getConcentrationGrossLT8TDRShortAll() {
		return ConcentrationGrossLT8TDRShortAll;
	}


	public void setConcentrationGrossLT8TDRShortAll(
			double concentrationGrossLT8TDRShortAll) {
		ConcentrationGrossLT8TDRShortAll = concentrationGrossLT8TDRShortAll;
	}


	public double getConcentrationNetLT4TDRLongAll() {
		return ConcentrationNetLT4TDRLongAll;
	}


	public void setConcentrationNetLT4TDRLongAll(
			double concentrationNetLT4TDRLongAll) {
		ConcentrationNetLT4TDRLongAll = concentrationNetLT4TDRLongAll;
	}


	public double getConcentrationNetLT4TDRShortAll() {
		return ConcentrationNetLT4TDRShortAll;
	}


	public void setConcentrationNetLT4TDRShortAll(
			double concentrationNetLT4TDRShortAll) {
		ConcentrationNetLT4TDRShortAll = concentrationNetLT4TDRShortAll;
	}


	public double getConcentrationNetLT8TDRLongAll() {
		return ConcentrationNetLT8TDRLongAll;
	}


	public void setConcentrationNetLT8TDRLongAll(
			double concentrationNetLT8TDRLongAll) {
		ConcentrationNetLT8TDRLongAll = concentrationNetLT8TDRLongAll;
	}


	public double getConcentrationNetLT8TDRShortAll() {
		return ConcentrationNetLT8TDRShortAll;
	}


	public void setConcentrationNetLT8TDRShortAll(
			double concentrationNetLT8TDRShortAll) {
		ConcentrationNetLT8TDRShortAll = concentrationNetLT8TDRShortAll;
	}


	public double getConcentrationGrossLT4TDRLongOld() {
		return ConcentrationGrossLT4TDRLongOld;
	}


	public void setConcentrationGrossLT4TDRLongOld(
			double concentrationGrossLT4TDRLongOld) {
		ConcentrationGrossLT4TDRLongOld = concentrationGrossLT4TDRLongOld;
	}


	public double getConcentrationGrossLT4TDRShortOld() {
		return ConcentrationGrossLT4TDRShortOld;
	}


	public void setConcentrationGrossLT4TDRShortOld(
			double concentrationGrossLT4TDRShortOld) {
		ConcentrationGrossLT4TDRShortOld = concentrationGrossLT4TDRShortOld;
	}


	public double getConcentrationGrossLT8TDRLongOld() {
		return ConcentrationGrossLT8TDRLongOld;
	}


	public void setConcentrationGrossLT8TDRLongOld(
			double concentrationGrossLT8TDRLongOld) {
		ConcentrationGrossLT8TDRLongOld = concentrationGrossLT8TDRLongOld;
	}


	public double getConcentrationGrossLT8TDRShortOld() {
		return ConcentrationGrossLT8TDRShortOld;
	}


	public void setConcentrationGrossLT8TDRShortOld(
			double concentrationGrossLT8TDRShortOld) {
		ConcentrationGrossLT8TDRShortOld = concentrationGrossLT8TDRShortOld;
	}


	public double getConcentrationNetLT4TDRLongOld() {
		return ConcentrationNetLT4TDRLongOld;
	}


	public void setConcentrationNetLT4TDRLongOld(
			double concentrationNetLT4TDRLongOld) {
		ConcentrationNetLT4TDRLongOld = concentrationNetLT4TDRLongOld;
	}


	public double getConcentrationNetLT4TDRShortOld() {
		return ConcentrationNetLT4TDRShortOld;
	}


	public void setConcentrationNetLT4TDRShortOld(
			double concentrationNetLT4TDRShortOld) {
		ConcentrationNetLT4TDRShortOld = concentrationNetLT4TDRShortOld;
	}


	public double getConcentrationNetLT8TDRLongOld() {
		return ConcentrationNetLT8TDRLongOld;
	}


	public void setConcentrationNetLT8TDRLongOld(
			double concentrationNetLT8TDRLongOld) {
		ConcentrationNetLT8TDRLongOld = concentrationNetLT8TDRLongOld;
	}


	public double getConcentrationNetLT8TDRShortOld() {
		return ConcentrationNetLT8TDRShortOld;
	}


	public void setConcentrationNetLT8TDRShortOld(
			double concentrationNetLT8TDRShortOld) {
		ConcentrationNetLT8TDRShortOld = concentrationNetLT8TDRShortOld;
	}


	public double getConcentrationGrossLT4TDRLongOther() {
		return ConcentrationGrossLT4TDRLongOther;
	}


	public void setConcentrationGrossLT4TDRLongOther(
			double concentrationGrossLT4TDRLongOther) {
		ConcentrationGrossLT4TDRLongOther = concentrationGrossLT4TDRLongOther;
	}


	public double getConcentrationGrossLT4TDRShortOther() {
		return ConcentrationGrossLT4TDRShortOther;
	}


	public void setConcentrationGrossLT4TDRShortOther(
			double concentrationGrossLT4TDRShortOther) {
		ConcentrationGrossLT4TDRShortOther = concentrationGrossLT4TDRShortOther;
	}


	public double getConcentrationGrossLT8TDRLongOther() {
		return ConcentrationGrossLT8TDRLongOther;
	}


	public void setConcentrationGrossLT8TDRLongOther(
			double concentrationGrossLT8TDRLongOther) {
		ConcentrationGrossLT8TDRLongOther = concentrationGrossLT8TDRLongOther;
	}


	public double getConcentrationGrossLT8TDRShortOther() {
		return ConcentrationGrossLT8TDRShortOther;
	}


	public void setConcentrationGrossLT8TDRShortOther(
			double concentrationGrossLT8TDRShortOther) {
		ConcentrationGrossLT8TDRShortOther = concentrationGrossLT8TDRShortOther;
	}


	public double getConcentrationNetLT4TDRLongOther() {
		return ConcentrationNetLT4TDRLongOther;
	}


	public void setConcentrationNetLT4TDRLongOther(
			double concentrationNetLT4TDRLongOther) {
		ConcentrationNetLT4TDRLongOther = concentrationNetLT4TDRLongOther;
	}


	public double getConcentrationNetLT4TDRShortOther() {
		return ConcentrationNetLT4TDRShortOther;
	}


	public void setConcentrationNetLT4TDRShortOther(
			double concentrationNetLT4TDRShortOther) {
		ConcentrationNetLT4TDRShortOther = concentrationNetLT4TDRShortOther;
	}


	public double getConcentrationNetLT8TDRLongOther() {
		return ConcentrationNetLT8TDRLongOther;
	}


	public void setConcentrationNetLT8TDRLongOther(
			double concentrationNetLT8TDRLongOther) {
		ConcentrationNetLT8TDRLongOther = concentrationNetLT8TDRLongOther;
	}


	public double getConcentrationNetLT8TDRShortOther() {
		return ConcentrationNetLT8TDRShortOther;
	}


	public void setConcentrationNetLT8TDRShortOther(
			double concentrationNetLT8TDRShortOther) {
		ConcentrationNetLT8TDRShortOther = concentrationNetLT8TDRShortOther;
	}


	public String getContractUnits() {
		return ContractUnits;
	}


	public void setContractUnits(String contractUnits) {
		ContractUnits = contractUnits;
	}


	public String getCFTCContractMarketCodeQuotes() {
		return CFTCContractMarketCodeQuotes;
	}


	public void setCFTCContractMarketCodeQuotes(String cFTCContractMarketCodeQuotes) {
		CFTCContractMarketCodeQuotes = cFTCContractMarketCodeQuotes;
	}


	public String getCFTCMarketCodeInInitialsQuotes() {
		return CFTCMarketCodeInInitialsQuotes;
	}


	public void setCFTCMarketCodeInInitialsQuotes(
			String cFTCMarketCodeInInitialsQuotes) {
		CFTCMarketCodeInInitialsQuotes = cFTCMarketCodeInInitialsQuotes;
	}


	public String getCFTCCommodityCodeQuotes() {
		return CFTCCommodityCodeQuotes;
	}


	public void setCFTCCommodityCodeQuotes(String cFTCCommodityCodeQuotes) {
		CFTCCommodityCodeQuotes = cFTCCommodityCodeQuotes;
	}
	
}
