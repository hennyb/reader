-- Adminer 4.0.3 MySQL dump

SET NAMES utf8;
SET foreign_key_checks = 0;
SET time_zone = '+02:00';
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

DROP TABLE IF EXISTS `cotreports`;
CREATE TABLE `cotreports` (
  `MarketAndExchangeNames` double DEFAULT NULL,
  `AsOfDateInFormYYMMDD` double DEFAULT NULL,
  `AsOfDateInFormYYYYMMDD` double DEFAULT NULL,
  `CFTCContractMarketCode` double DEFAULT NULL,
  `CFTCMarketCodeInInitials` double DEFAULT NULL,
  `CFTCRegionCode` double DEFAULT NULL,
  `CFTCCommodityCode` double DEFAULT NULL,
  `OpenInterestAll` double DEFAULT NULL,
  `NoncommercialPositionsLongAll` double DEFAULT NULL,
  `NoncommercialPositionsShortAll` double DEFAULT NULL,
  `NoncommercialPositionsSpreadingAll` double DEFAULT NULL,
  `CommercialPositionsLongAll` double DEFAULT NULL,
  `CommercialPositionsShortAll` double DEFAULT NULL,
  `TotalReportablePositionsLongAll` double DEFAULT NULL,
  `TotalReportablePositionsShortAll` double DEFAULT NULL,
  `NonreportablePositionsLongAll` double DEFAULT NULL,
  `NonreportablePositionsShortAll` double DEFAULT NULL,
  `OpenInterestOld` double DEFAULT NULL,
  `NoncommercialPositionsLongOld` double DEFAULT NULL,
  `NoncommercialPositionsShortOld` double DEFAULT NULL,
  `NoncommercialPositionsSpreadingOld` double DEFAULT NULL,
  `CommercialPositionsLongOld` double DEFAULT NULL,
  `CommercialPositionsShortOld` double DEFAULT NULL,
  `TotalReportablePositionsLongOld` double DEFAULT NULL,
  `TotalReportablePositionsShortOld` double DEFAULT NULL,
  `NonreportablePositionsLongOld` double DEFAULT NULL,
  `NonreportablePositionsShortOld` double DEFAULT NULL,
  `OpenInterestOther` double DEFAULT NULL,
  `NoncommercialPositionsLongOther` double DEFAULT NULL,
  `NoncommercialPositionsShortOther` double DEFAULT NULL,
  `NoncommercialPositionsSpreadingOther` double DEFAULT NULL,
  `CommercialPositionsLongOther` double DEFAULT NULL,
  `CommercialPositionsShortOther` double DEFAULT NULL,
  `TotalReportablePositionsLongOther` double DEFAULT NULL,
  `TotalReportablePositionsShortOther` double DEFAULT NULL,
  `NonreportablePositionsLongOther` double DEFAULT NULL,
  `NonreportablePositionsShortOther` double DEFAULT NULL,
  `ChangeInOpenInterestAll` double DEFAULT NULL,
  `ChangeInNoncommercialLongAll` double DEFAULT NULL,
  `ChangeInNoncommercialShortAll` double DEFAULT NULL,
  `ChangeInNoncommercialSpreadingAll` double DEFAULT NULL,
  `ChangeInCommercialLongAll` double DEFAULT NULL,
  `ChangeInCommercialShortAll` double DEFAULT NULL,
  `ChangeInTotalReportableLongAll` double DEFAULT NULL,
  `ChangeInTotalReportableShortAll` double DEFAULT NULL,
  `ChangeInNonreportableLongAll` double DEFAULT NULL,
  `ChangeInNonreportableShortAll` double DEFAULT NULL,
  `PercentageOfOpenInterestOIAll` double DEFAULT NULL,
  `PercentageOfOINoncommercialLongAll` double DEFAULT NULL,
  `PercentageOfOINoncommercialShortAll` double DEFAULT NULL,
  `PercentageOfOINoncommercialSpreadingAll` double DEFAULT NULL,
  `PercentageOfOICommercialLongAll` double DEFAULT NULL,
  `PercentageOfOICommercialShortAll` double DEFAULT NULL,
  `PercentageOfOITotalReportableLongAll` double DEFAULT NULL,
  `PercentageOfOITotalReportableShortAll` double DEFAULT NULL,
  `PercentageOfOINonreportableLongAll` double DEFAULT NULL,
  `PercentageOfOINonreportableShortAll` double DEFAULT NULL,
  `PercentageOfOpenInterestOIOld` double DEFAULT NULL,
  `PercentageOfOINoncommercialLongOld` double DEFAULT NULL,
  `PercentageOfOINoncommercialShortOld` double DEFAULT NULL,
  `PercentageOfOINoncommercialSpreadingOld` double DEFAULT NULL,
  `PercentageOfOICommercialLongOld` double DEFAULT NULL,
  `PercentageOfOICommercialShortOld` double DEFAULT NULL,
  `PercentageOfOITotalReportableLongOld` double DEFAULT NULL,
  `PercentageOfOITotalReportableShortOld` double DEFAULT NULL,
  `PercentageOfOINonreportableLongOld` double DEFAULT NULL,
  `PercentageOfOINonreportableShortOld` double DEFAULT NULL,
  `PercentageOfOpenInterestOIOther` double DEFAULT NULL,
  `PercentageOfOINoncommercialLongOther` double DEFAULT NULL,
  `PercentageOfOINoncommercialShortOther` double DEFAULT NULL,
  `PercentageOfOINoncommercialSpreadingOther` double DEFAULT NULL,
  `PercentageOfOICommercialLongOther` double DEFAULT NULL,
  `PercentageOfOICommercialShortOther` double DEFAULT NULL,
  `PercentageOfOITotalReportableLongOther` double DEFAULT NULL,
  `PercentageOfOITotalReportableShortOther` double DEFAULT NULL,
  `PercentageOfOINonreportableLongOther` double DEFAULT NULL,
  `PercentageOfOINonreportableShortOther` double DEFAULT NULL,
  `TradersTotalAll` double DEFAULT NULL,
  `TradersNoncommercialLongAll` double DEFAULT NULL,
  `TradersNoncommercialShortAll` double DEFAULT NULL,
  `TradersNoncommercialSpreadingAll` double DEFAULT NULL,
  `TradersCommercialLongAll` double DEFAULT NULL,
  `TradersCommercialShortAll` double DEFAULT NULL,
  `TradersTotalReportableLongAll` double DEFAULT NULL,
  `TradersTotalReportableShortAll` double DEFAULT NULL,
  `TradersTotalOld` double DEFAULT NULL,
  `TradersNoncommercialLongOld` double DEFAULT NULL,
  `TradersNoncommercialShortOld` double DEFAULT NULL,
  `TradersNoncommercialSpreadingOld` double DEFAULT NULL,
  `TradersCommercialLongOld` double DEFAULT NULL,
  `TradersCommercialShortOld` double DEFAULT NULL,
  `TradersTotalReportableLongOld` double DEFAULT NULL,
  `TradersTotalReportableShortOld` double DEFAULT NULL,
  `TradersTotalOther` double DEFAULT NULL,
  `TradersNoncommercialLongOther` double DEFAULT NULL,
  `TradersNoncommercialShortOther` double DEFAULT NULL,
  `TradersNoncommercialSpreadingOther` double DEFAULT NULL,
  `TradersCommercialLongOther` double DEFAULT NULL,
  `TradersCommercialShortOther` double DEFAULT NULL,
  `TradersTotalReportableLongOther` double DEFAULT NULL,
  `TradersTotalReportableShortOther` double DEFAULT NULL,
  `ConcentrationGrossLT4TDRLongAll` double DEFAULT NULL,
  `ConcentrationGrossLT4TDRShortAll` double DEFAULT NULL,
  `ConcentrationGrossLT8TDRLongAll` double DEFAULT NULL,
  `ConcentrationGrossLT8TDRShortAll` double DEFAULT NULL,
  `ConcentrationNetLT4TDRLongAll` double DEFAULT NULL,
  `ConcentrationNetLT4TDRShortAll` double DEFAULT NULL,
  `ConcentrationNetLT8TDRLongAll` double DEFAULT NULL,
  `ConcentrationNetLT8TDRShortAll` double DEFAULT NULL,
  `ConcentrationGrossLT4TDRLongOld` double DEFAULT NULL,
  `ConcentrationGrossLT4TDRShortOld` double DEFAULT NULL,
  `ConcentrationGrossLT8TDRLongOld` double DEFAULT NULL,
  `ConcentrationGrossLT8TDRShortOld` double DEFAULT NULL,
  `ConcentrationNetLT4TDRLongOld` double DEFAULT NULL,
  `ConcentrationNetLT4TDRShortOld` double DEFAULT NULL,
  `ConcentrationNetLT8TDRLongOld` double DEFAULT NULL,
  `ConcentrationNetLT8TDRShortOld` double DEFAULT NULL,
  `ConcentrationGrossLT4TDRLongOther` double DEFAULT NULL,
  `ConcentrationGrossLT4TDRShortOther` double DEFAULT NULL,
  `ConcentrationGrossLT8TDRLongOther` double DEFAULT NULL,
  `ConcentrationGrossLT8TDRShortOther` double DEFAULT NULL,
  `ConcentrationNetLT4TDRLongOther` double DEFAULT NULL,
  `ConcentrationNetLT4TDRShortOther` double DEFAULT NULL,
  `ConcentrationNetLT8TDRLongOther` double DEFAULT NULL,
  `ConcentrationNetLT8TDRShortOther` double DEFAULT NULL,
  `ContractUnits` double DEFAULT NULL,
  `CFTCContractMarketCodeQuotes` double DEFAULT NULL,
  `CFTCMarketCodeInInitialsQuotes` double DEFAULT NULL,
  `CFTCCommodityCodeQuotes` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


-- 2014-09-02 16:41:28