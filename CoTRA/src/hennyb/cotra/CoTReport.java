package hennyb.cotra;

import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

public class CoTReport implements Comparable<CoTReport> {

	private String MarketAndExchangeNames = "";
	private Date date;
	private double AsOfDateInFormYYMMDD = 0;
	private String AsOfDateInFormYYYYMMDD = "";
	private double CFTCContractMarketCode = 0;
	private String CFTCMarketCodeInInitials = "";
	private double CFTCRegionCode = 0;
	private double CFTCCommodityCode = 0;
	private double OpenInterestAll = 0;
	private double NoncommercialPositionsLongAll = 0;
	private double NoncommercialPositionsShortAll = 0;
	private double NoncommercialPositionsSpreadingAll = 0;
	private double CommercialPositionsLongAll = 0;
	private double CommercialPositionsShortAll = 0;
	private double TotalReportablePositionsLongAll = 0;
	private double TotalReportablePositionsShortAll = 0;
	private double NonreportablePositionsLongAll = 0;
	private double NonreportablePositionsShortAll = 0;
	private double OpenInterestOld = 0;
	private double NoncommercialPositionsLongOld = 0;
	private double NoncommercialPositionsShortOld = 0;
	private double NoncommercialPositionsSpreadingOld = 0;
	private double CommercialPositionsLongOld = 0;
	private double CommercialPositionsShortOld = 0;
	private double TotalReportablePositionsLongOld = 0;
	private double TotalReportablePositionsShortOld = 0;
	private double NonreportablePositionsLongOld = 0;
	private double NonreportablePositionsShortOld = 0;
	private double OpenInterestOther = 0;
	private double NoncommercialPositionsLongOther = 0;
	private double NoncommercialPositionsShortOther = 0;
	private double NoncommercialPositionsSpreadingOther = 0;
	private double CommercialPositionsLongOther = 0;
	private double CommercialPositionsShortOther = 0;
	private double TotalReportablePositionsLongOther = 0;
	private double TotalReportablePositionsShortOther = 0;
	private double NonreportablePositionsLongOther = 0;
	private double NonreportablePositionsShortOther = 0;
	private double ChangeInOpenInterestAll = 0;
	private double ChangeInNoncommercialLongAll = 0;
	private double ChangeInNoncommercialShortAll = 0;
	private double ChangeInNoncommercialSpreadingAll = 0;
	private double ChangeInCommercialLongAll = 0;
	private double ChangeInCommercialShortAll = 0;
	private double ChangeInTotalReportableLongAll = 0;
	private double ChangeInTotalReportableShortAll = 0;
	private double ChangeInNonreportableLongAll = 0;
	private double ChangeInNonreportableShortAll = 0;
	private double PercentageOfOpenInterestOIAll = 0;
	private double PercentageOfOINoncommercialLongAll = 0;
	private double PercentageOfOINoncommercialShortAll = 0;
	private double PercentageOfOINoncommercialSpreadingAll = 0;
	private double PercentageOfOICommercialLongAll = 0;
	private double PercentageOfOICommercialShortAll = 0;
	private double PercentageOfOITotalReportableLongAll = 0;
	private double PercentageOfOITotalReportableShortAll = 0;
	private double PercentageOfOINonreportableLongAll = 0;
	private double PercentageOfOINonreportableShortAll = 0;
	private double PercentageOfOpenInterestOIOld = 0;
	private double PercentageOfOINoncommercialLongOld = 0;
	private double PercentageOfOINoncommercialShortOld = 0;
	private double PercentageOfOINoncommercialSpreadingOld = 0;
	private double PercentageOfOICommercialLongOld = 0;
	private double PercentageOfOICommercialShortOld = 0;
	private double PercentageOfOITotalReportableLongOld = 0;
	private double PercentageOfOITotalReportableShortOld = 0;
	private double PercentageOfOINonreportableLongOld = 0;
	private double PercentageOfOINonreportableShortOld = 0;
	private double PercentageOfOpenInterestOIOther = 0;
	private double PercentageOfOINoncommercialLongOther = 0;
	private double PercentageOfOINoncommercialShortOther = 0;
	private double PercentageOfOINoncommercialSpreadingOther = 0;
	private double PercentageOfOICommercialLongOther = 0;
	private double PercentageOfOICommercialShortOther = 0;
	private double PercentageOfOITotalReportableLongOther = 0;
	private double PercentageOfOITotalReportableShortOther = 0;
	private double PercentageOfOINonreportableLongOther = 0;
	private double PercentageOfOINonreportableShortOther = 0;
	private double TradersTotalAll = 0;
	private double TradersNoncommercialLongAll = 0;
	private double TradersNoncommercialShortAll = 0;
	private double TradersNoncommercialSpreadingAll = 0;
	private double TradersCommercialLongAll = 0;
	private double TradersCommercialShortAll = 0;
	private double TradersTotalReportableLongAll = 0;
	private double TradersTotalReportableShortAll = 0;
	private double TradersTotalOld = 0;
	private double TradersNoncommercialLongOld = 0;
	private double TradersNoncommercialShortOld = 0;
	private double TradersNoncommercialSpreadingOld = 0;
	private double TradersCommercialLongOld = 0;
	private double TradersCommercialShortOld = 0;
	private double TradersTotalReportableLongOld = 0;
	private double TradersTotalReportableShortOld = 0;
	private double TradersTotalOther = 0;
	private double TradersNoncommercialLongOther = 0;
	private double TradersNoncommercialShortOther = 0;
	private double TradersNoncommercialSpreadingOther = 0;
	private double TradersCommercialLongOther = 0;
	private double TradersCommercialShortOther = 0;
	private double TradersTotalReportableLongOther = 0;
	private double TradersTotalReportableShortOther = 0;
	private double ConcentrationGrossLT4TDRLongAll = 0;
	private double ConcentrationGrossLT4TDRShortAll = 0;
	private double ConcentrationGrossLT8TDRLongAll = 0;
	private double ConcentrationGrossLT8TDRShortAll = 0;
	private double ConcentrationNetLT4TDRLongAll = 0;
	private double ConcentrationNetLT4TDRShortAll = 0;
	private double ConcentrationNetLT8TDRLongAll = 0;
	private double ConcentrationNetLT8TDRShortAll = 0;
	private double ConcentrationGrossLT4TDRLongOld = 0;
	private double ConcentrationGrossLT4TDRShortOld = 0;
	private double ConcentrationGrossLT8TDRLongOld = 0;
	private double ConcentrationGrossLT8TDRShortOld = 0;
	private double ConcentrationNetLT4TDRLongOld = 0;
	private double ConcentrationNetLT4TDRShortOld = 0;
	private double ConcentrationNetLT8TDRLongOld = 0;
	private double ConcentrationNetLT8TDRShortOld = 0;
	private double ConcentrationGrossLT4TDRLongOther = 0;
	private double ConcentrationGrossLT4TDRShortOther = 0;
	private double ConcentrationGrossLT8TDRLongOther = 0;
	private double ConcentrationGrossLT8TDRShortOther = 0;
	private double ConcentrationNetLT4TDRLongOther = 0;
	private double ConcentrationNetLT4TDRShortOther = 0;
	private double ConcentrationNetLT8TDRLongOther = 0;
	private double ConcentrationNetLT8TDRShortOther = 0;
	private String ContractUnits = "";
	private String CFTCContractMarketCodeQuotes = "";
	private String CFTCMarketCodeInInitialsQuotes = "";
	private String CFTCCommodityCodeQuotes = "";
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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
		this.date = parseDate(asOfDateInFormYYYYMMDD);
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

	public void setCommercialPositionsShortAll(
			double commercialPositionsShortAll) {
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

	public void setCommercialPositionsShortOld(
			double commercialPositionsShortOld) {
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

	public void setCommercialPositionsLongOther(
			double commercialPositionsLongOther) {
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

	public void setChangeInNoncommercialLongAll(
			double changeInNoncommercialLongAll) {
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

	public void setChangeInNonreportableLongAll(
			double changeInNonreportableLongAll) {
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

	public void setTradersNoncommercialLongAll(
			double tradersNoncommercialLongAll) {
		TradersNoncommercialLongAll = tradersNoncommercialLongAll;
	}

	public double getTradersNoncommercialShortAll() {
		return TradersNoncommercialShortAll;
	}

	public void setTradersNoncommercialShortAll(
			double tradersNoncommercialShortAll) {
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

	public void setTradersNoncommercialLongOld(
			double tradersNoncommercialLongOld) {
		TradersNoncommercialLongOld = tradersNoncommercialLongOld;
	}

	public double getTradersNoncommercialShortOld() {
		return TradersNoncommercialShortOld;
	}

	public void setTradersNoncommercialShortOld(
			double tradersNoncommercialShortOld) {
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

	public void setTradersCommercialShortOther(
			double tradersCommercialShortOther) {
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

	public void setCFTCContractMarketCodeQuotes(
			String cFTCContractMarketCodeQuotes) {
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

	@Override
	public int compareTo(CoTReport o) {
		return this.date.compareTo(o.getDate());
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(AsOfDateInFormYYMMDD);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(OpenInterestAll);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CoTReport other = (CoTReport) obj;
		if (Double.doubleToLongBits(AsOfDateInFormYYMMDD) != Double
				.doubleToLongBits(other.AsOfDateInFormYYMMDD))
			return false;
		if (Double.doubleToLongBits(OpenInterestAll) != Double
				.doubleToLongBits(other.OpenInterestAll))
			return false;
		return true;
	}
	
	private static Date parseDate(String date) {
		try {
			return DateUtils.parseDateStrictly(date, "yyyy-mm-dd");
		} catch (ParseException e) {
			System.err.println("non parseable Date");
			return new Date(0);
		}
	}

}
