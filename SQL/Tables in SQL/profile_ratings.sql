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
-- Table structure for table `profile_ratings`
--

DROP TABLE IF EXISTS `profile_ratings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profile_ratings` (
  `userID` int(11) NOT NULL,
  `raterID` int(11) NOT NULL,
  `rating` smallint(5) unsigned NOT NULL,
  `rated_on` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`userID`,`raterID`),
  KEY `raterID` (`raterID`),
  CONSTRAINT `profile_ratings_ibfk_1` FOREIGN KEY (`userID`) REFERENCES `users` (`sin_id`) ON DELETE CASCADE,
  CONSTRAINT `profile_ratings_ibfk_2` FOREIGN KEY (`raterID`) REFERENCES `users` (`sin_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profile_ratings`
--

LOCK TABLES `profile_ratings` WRITE;
/*!40000 ALTER TABLE `profile_ratings` DISABLE KEYS */;
INSERT INTO `profile_ratings` VALUES (23904087,6542094,1,'2016-07-25 03:11:54'),(23904087,7134807,3,'2016-07-25 03:11:54'),(23904087,11883405,3,'2016-07-25 03:11:54'),(23904087,13281477,1,'2016-07-25 03:11:54'),(23904087,24558497,4,'2016-07-25 03:11:54'),(23904087,29603052,3,'2016-07-25 03:11:54'),(24345657,7078248,3,'2016-07-25 03:11:54'),(24345657,7324823,1,'2016-07-25 03:11:54'),(24345657,10635352,5,'2016-07-25 03:11:54'),(24345657,15472709,1,'2016-07-25 03:11:54'),(24345657,29335268,1,'2016-07-25 03:11:54'),(33212966,110792,5,'2016-07-25 03:11:54'),(34552909,431385,2,'2016-07-25 03:11:54'),(34552909,1890533,4,'2016-07-25 03:11:54'),(34552909,5162168,5,'2016-07-25 03:11:54'),(36141263,702188,1,'2016-07-25 03:11:54'),(36141263,2001148,4,'2016-07-25 03:11:54'),(36141263,5164882,3,'2016-07-25 03:11:54'),(36141263,11883405,2,'2016-07-25 03:11:54'),(37193227,734359,3,'2016-07-25 03:11:54'),(37193227,5340640,3,'2016-07-25 03:11:54'),(37193227,7506913,1,'2016-07-25 03:11:54'),(37193227,12571995,4,'2016-07-25 03:11:54'),(37193227,21704315,4,'2016-07-25 03:11:54'),(37253135,2572247,5,'2016-07-25 03:11:54'),(37253135,5422969,4,'2016-07-25 03:11:54'),(37253135,8323794,2,'2016-07-25 03:11:54'),(37253135,13226301,1,'2016-07-25 03:11:54'),(37253135,22760672,1,'2016-07-25 03:11:54'),(37844039,2619674,2,'2016-07-25 03:11:54'),(37844039,6336753,1,'2016-07-25 03:11:54'),(37844039,8491165,3,'2016-07-25 03:11:54'),(37844039,13226301,5,'2016-07-25 03:11:54'),(37844039,23904087,5,'2016-07-25 03:11:54'),(38573316,2673521,5,'2016-07-25 03:11:54'),(38573316,6404004,3,'2016-07-25 03:11:54'),(38855266,1480518,5,'2016-07-25 03:11:54'),(46037158,3649315,3,'2016-07-25 03:11:54'),(52992470,3945222,3,'2016-07-25 03:11:54');
/*!40000 ALTER TABLE `profile_ratings` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-07-24 23:19:36
