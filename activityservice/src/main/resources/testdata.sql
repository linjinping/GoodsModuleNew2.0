-- MySQL dump 10.13  Distrib 8.0.22, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: oomall
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `coupon`
--

LOCK TABLES `coupon` WRITE;
/*!40000 ALTER TABLE `coupon` DISABLE KEYS */;
/*!40000 ALTER TABLE `coupon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `coupon_activity`
--

LOCK TABLES `coupon_activity` WRITE;
/*!40000 ALTER TABLE `coupon_activity` DISABLE KEYS */;
INSERT INTO `coupon_activity` VALUES(1,"年终大促","2020-12-02 17:36:52","2020-12-05 17:36:52","2020-12-02 17:36:52","2",1,0,0,"pic","买一送一".1,1,"1","1",1);
/*!40000 ALTER TABLE `coupon_activity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `coupon_spu`
--

LOCK TABLES `coupon_sku` WRITE;
/*!40000 ALTER TABLE `coupon_sku` DISABLE KEYS */;
/*!40000 ALTER TABLE `coupon_sku` ENABLE KEYS */;
UNLOCK TABLES;

LOCK TABLES `flash_sale` WRITE;
/*!40000 ALTER TABLE `flash_sale` DISABLE KEYS */;
/*!40000 ALTER TABLE `flash_sale` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `flash_sale_item`
--

LOCK TABLES `flash_sale_item` WRITE;
/*!40000 ALTER TABLE `flash_sale_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `flash_sale_item` ENABLE KEYS */;
UNLOCK TABLES;
LOCK TABLES `groupon_activity` WRITE;
/*!40000 ALTER TABLE `groupon_activity` DISABLE KEYS */;
/*!40000 ALTER TABLE `groupon_activity` ENABLE KEYS */;
UNLOCK TABLES;
LOCK TABLES `presale_activity` WRITE;
/*!40000 ALTER TABLE `presale_activity` DISABLE KEYS */;
/*!40000 ALTER TABLE `presale_activity` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-18  9:02:27
