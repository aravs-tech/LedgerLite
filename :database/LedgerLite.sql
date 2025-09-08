-- MySQL dump 10.13  Distrib 8.0.41, for macos15 (arm64)
--
-- Host: 127.0.0.1    Database: inventory_management
-- ------------------------------------------------------
-- Server version	8.0.41

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `firstName` int NOT NULL,
  `lastName` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `purchaseAmt` int NOT NULL,
  `joinDate` datetime NOT NULL,
  `lastDate` datetime NOT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `Description` varchar(45) NOT NULL,
  `Stock` int NOT NULL,
  `Price` double NOT NULL,
  `id` varchar(45) NOT NULL,
  `type` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES ('Bananas',120,0.29,'P-103','miscellaneous'),('Milk (1L)',200,1.29,'P-130','dairy'),('Green Tea (20 bags)',150,3.49,'P-137','beverages'),('Black Pepper (50g)',60,1.99,'P-236','spices'),('Apples',150,0.99,'P-245','miscellaneous'),('Tomato Sauce (500ml)',60,2.99,'P-256','miscellaneous'),('Rice (1kg)',120,2.59,'P-285','miscellaneous'),('Beef (1kg)',70,9.99,'P-308','miscellaneous'),('Whole Wheat Bread',100,1.79,'P-379','miscellaneous'),('Potatoes (5kg)',80,3.99,'P-384','miscellaneous'),('Flour (1kg)',80,2.29,'P-418','miscellaneous'),('Bread (loaf)',180,1.49,'P-441','miscellaneous'),('Carrots',100,0.79,'P-509','miscellaneous'),('Orange Juice (1L)',100,2.99,'P-532','beverages'),('Organic Lettuce',50,2.5,'P-562','miscellaneous'),('Sugar (1kg)',90,1.79,'P-602','miscellaneous'),('Chicken Breast (1kg)',60,7.99,'P-654','miscellaneous'),('Coffee (250g)',120,4.99,'P-758','beverages'),('Pasta (500g)',110,1.49,'P-790','miscellaneous'),('Eggs (12 pack)',150,2.99,'P-822','dairy'),('Cinnamon Powder (100g)',40,3.49,'P-845','spices'),('Tomatoes (per kg)',90,1.49,'P-912','miscellaneous'),('Olive Oil (500ml)',50,4.99,'P-923','miscellaneous'),('Cheddar Cheese (500g)',40,3.99,'P-987','dairy');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL,
  `firstName` varchar(45) NOT NULL,
  `lastName` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `type` varchar(45) NOT NULL,
  `suspended` tinyint(1) NOT NULL,
  `temppassword` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'John','Doe','johndoe@example.com','hashed_password_1','user',0,'12345'),(2,'Jane','Smith','janesmith@example.com','hashed_password_2','admin',1,'67890'),(3,'Bob','Johnson','bobjohnson@example.com','hashed_password_3','user',0,'54321'),(4,'Alice','Williams','alicewilliams@example.com','hashed_password_4','user',1,'98765');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-02-14 14:16:28
