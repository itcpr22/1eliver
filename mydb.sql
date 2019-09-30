-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.1.26-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win32
-- HeidiSQL Version:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for eliverdb
CREATE DATABASE IF NOT EXISTS `eliverdb` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `eliverdb`;

-- Dumping structure for table eliverdb.log_in
CREATE TABLE IF NOT EXISTS `log_in` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fname` text NOT NULL,
  `lname` text NOT NULL,
  `username` text NOT NULL,
  `pass` text NOT NULL,
  `compass` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Dumping data for table eliverdb.log_in: ~1 rows (approximately)
/*!40000 ALTER TABLE `log_in` DISABLE KEYS */;
INSERT INTO `log_in` (`id`, `fname`, `lname`, `username`, `pass`, `compass`) VALUES
	(1, 'a', 'b', 'c', '8277e0910d750195b448797616e091ad', '0');
/*!40000 ALTER TABLE `log_in` ENABLE KEYS */;

-- Dumping structure for table eliverdb.tblprod
CREATE TABLE IF NOT EXISTS `tblprod` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` text NOT NULL,
  `quantity` int(11) NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- Dumping data for table eliverdb.tblprod: ~2 rows (approximately)
/*!40000 ALTER TABLE `tblprod` DISABLE KEYS */;
INSERT INTO `tblprod` (`id`, `product_name`, `quantity`, `price`) VALUES
	(2, 'a', 1, 2),
	(4, 'ab', 10, 2);
/*!40000 ALTER TABLE `tblprod` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
