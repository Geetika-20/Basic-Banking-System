/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 8.0.26 : Database - sparks
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`sparks` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `sparks`;

/*Table structure for table `customers` */

DROP TABLE IF EXISTS `customers`;

CREATE TABLE `customers` (
  `Name` varchar(30) DEFAULT NULL,
  `Email_ID` varchar(50) DEFAULT NULL,
  `Current_Balance` decimal(10,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `customers` */

insert  into `customers`(`Name`,`Email_ID`,`Current_Balance`) values 
('durva','durva3@gmail.com',9500),
('Geetika','geetika@gmail.com',14340),
('user1','user1@gmail.com',10500),
('user2','user2@gmail.com',8000),
('demo','demo@gmail.com',50200),
('demouser','demouser@gmail.com',89730);

/*Table structure for table `transactions` */

DROP TABLE IF EXISTS `transactions`;

CREATE TABLE `transactions` (
  `Sender's Acc.` varchar(50) DEFAULT NULL,
  `Receiver's Acc.` varchar(50) DEFAULT NULL,
  `Amount` int DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `Time` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `transactions` */

insert  into `transactions`(`Sender's Acc.`,`Receiver's Acc.`,`Amount`,`Date`,`Time`) values 
('geetika@gmail.com','durva3@gmail.com',5000,'2021-09-20','20:50:23'),
('durva3@gmail.com','user1@gmail.com',500,'2021-09-20','20:51:49'),
('geetika@gmail.com','user2@gmail.com',1000,'2021-09-20','20:53:01'),
('geetika@gmail.com','demo@gmail.com',200,'2021-09-20','22:39:20'),
('demouser@gmail.com','geetika@gmail.com',270,'2021-09-21','12:46:08');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
