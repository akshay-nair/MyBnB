-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: mybnb
-- ------------------------------------------------------
-- Server version	5.7.13-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `availability`
--

DROP TABLE IF EXISTS `availability`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `availability` (
  `availabilityID` int(11) NOT NULL AUTO_INCREMENT,
  `listingID` int(11) NOT NULL,
  `starts_on` date NOT NULL,
  `ends_on` date NOT NULL,
  `rent_type` enum('Full Location','Private Room','Shared Room') NOT NULL,
  `daily_price` double NOT NULL,
  `guests` smallint(5) unsigned NOT NULL,
  `is_available` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`availabilityID`),
  KEY `listingID` (`listingID`),
  KEY `is_available` (`is_available`),
  KEY `starts_on` (`starts_on`,`ends_on`),
  KEY `rent_type` (`rent_type`,`daily_price`),
  CONSTRAINT `availability_ibfk_1` FOREIGN KEY (`listingID`) REFERENCES `listings` (`listingID`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=13000096 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `availability`
--

LOCK TABLES `availability` WRITE;
/*!40000 ALTER TABLE `availability` DISABLE KEYS */;
INSERT INTO `availability` VALUES (13000001,6976,'2016-06-21','2016-07-18','Shared Room',65,1,1),(13000002,2570965,'2016-06-30','2016-07-23','Shared Room',69,2,1),(13000003,488959,'2016-06-05','2016-07-18','Full Location',80,4,1),(13000005,3420384,'2016-06-05','2016-07-25','Private Room',150,4,1),(13000006,4916307,'2016-06-03','2016-07-02','Full Location',138,6,1),(13000007,152630,'2016-06-12','2016-07-22','Shared Room',110,3,1),(13000010,12232129,'2016-06-28','2016-07-21','Private Room',30,1,1),(13000011,4025194,'2016-06-26','2016-07-24','Full Location',75,2,1),(13000015,382929,'2016-06-10','2016-07-22','Private Room',40,2,1),(13000016,6390287,'2016-06-22','2016-07-11','Shared Room',76,1,1),(13000018,3075044,'2016-06-01','2016-07-13','Private Room',75,2,1),(13000019,533084,'2016-06-29','2016-07-11','Private Room',50,2,1),(13000020,543823,'2016-06-12','2016-07-30','Shared Room',105,4,1),(13000021,4085362,'2016-06-09','2016-07-01','Full Location',75,1,1),(13000023,3522508,'2016-06-10','2016-07-17','Full Location',69,3,1),(13000024,4823922,'2016-06-21','2016-07-01','Shared Room',75,2,1),(13000025,753348,'2016-06-01','2016-07-20','Shared Room',60,6,1),(13000026,753446,'2016-06-24','2016-07-27','Private Room',58,2,1),(13000027,781153,'2016-06-05','2016-07-05','Full Location',125,4,1),(13000028,879929,'2016-06-12','2016-07-02','Full Location',90,2,1),(13000029,5915025,'2016-06-18','2016-07-31','Full Location',150,2,1),(13000030,951782,'2016-06-30','2016-07-28','Private Room',69,1,1),(13000031,6887004,'2016-06-09','2016-07-21','Private Room',48,2,1),(13000032,3422597,'2016-06-04','2016-07-24','Private Room',220,4,1),(13000033,1281306,'2016-06-17','2016-07-21','Shared Room',226,6,1),(13000034,3200293,'2016-06-28','2016-07-20','Private Room',146,4,1),(13000035,8535966,'2016-06-30','2016-07-06','Full Location',150,2,1),(13000036,4922204,'2016-06-26','2016-07-08','Shared Room',200,9,1),(13000037,1301845,'2016-06-11','2016-07-24','Full Location',105,2,1),(13000038,3858401,'2016-06-12','2016-07-08','Private Room',69,3,1),(13000039,5550435,'2016-06-19','2016-07-16','Shared Room',78,2,1),(13000040,1349965,'2016-06-28','2016-07-04','Shared Room',109,4,1),(13000041,3534949,'2016-06-21','2016-07-19','Private Room',80,2,1),(13000042,1494726,'2016-06-15','2016-07-15','Private Room',89,2,1),(13000043,1564714,'2016-06-22','2016-07-11','Full Location',50,3,1),(13000044,1591827,'2016-06-25','2016-07-19','Shared Room',60,2,1),(13000047,8030967,'2016-06-02','2016-07-07','Shared Room',64,4,1),(13000048,8650746,'2016-06-27','2016-07-17','Private Room',150,6,1),(13000051,5434353,'2016-07-22','2016-08-12','Full Location',145,2,1),(13000052,1936861,'2016-07-16','2016-08-31','Full Location',50,1,1),(13000053,4775413,'2016-07-19','2016-08-18','Private Room',350,4,1),(13000054,2326265,'2016-07-24','2016-08-31','Private Room',160,6,1),(13000055,2326272,'2016-07-18','2016-08-22','Private Room',146,4,1),(13000056,6922238,'2016-07-02','2016-08-22','Private Room',110,5,1),(13000057,2583074,'2016-07-25','2016-08-09','Private Room',40,1,1),(13000058,3575220,'2016-07-22','2016-08-16','Shared Room',50,1,1),(13000059,6932491,'2016-07-01','2016-08-06','Full Location',99,2,1),(13000060,2672380,'2016-07-14','2016-08-15','Private Room',226,4,1),(13000061,3929127,'2016-07-22','2016-08-25','Private Room',125,4,1),(13000064,6933545,'2016-07-15','2016-08-04','Full Location',68,2,1),(13000065,3038516,'2016-07-05','2016-08-12','Full Location',98,2,1),(13000066,8321518,'2016-07-15','2016-08-08','Shared Room',80,3,1),(13000067,4934960,'2016-07-31','2016-08-16','Private Room',60,2,1),(13000068,4614098,'2016-07-17','2016-08-19','Full Location',34,2,1),(13000070,4710792,'2016-07-20','2016-08-15','Full Location',80,1,1),(13000077,6502061,'2016-07-07','2016-08-04','Private Room',48,2,1),(13000078,5354033,'2016-07-07','2016-08-26','Private Room',40,1,1),(13000079,5659689,'2016-07-30','2016-08-20','Private Room',300,5,1),(13000080,5709491,'2016-07-17','2016-08-26','Shared Room',89,2,1),(13000081,5922059,'2016-07-13','2016-08-14','Shared Room',38,2,1),(13000084,6628476,'2016-06-22','2016-07-11','Full Location',38,1,1),(13000085,8539865,'2016-07-07','2016-08-04','Shared Room',35,2,1),(13000086,7252607,'2016-07-26','2016-08-22','Shared Room',49,2,1),(13000087,6897283,'2016-07-29','2016-08-01','Shared Room',180,5,1),(13000088,7390061,'2016-07-14','2016-08-09','Shared Room',40,1,1),(13000089,7111604,'2016-07-05','2016-08-30','Shared Room',60,2,1),(13000090,7227968,'2016-07-26','2016-08-18','Private Room',65,2,1),(13000091,7362173,'2016-07-07','2016-08-26','Shared Room',575,5,1),(13000092,7417108,'2016-07-30','2016-08-30','Full Location',117,3,1),(13000093,8473851,'2016-06-09','2016-07-21','Private Room',50,2,1),(13000094,8783019,'2016-07-24','2016-08-11','Private Room',49,1,1),(13000095,11639279,'2016-07-02','2016-08-22','Private Room',284,8,1);
/*!40000 ALTER TABLE `availability` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-07-24 23:17:24
