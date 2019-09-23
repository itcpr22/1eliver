-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.1.36-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win32
-- HeidiSQL Version:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for log_in
CREATE DATABASE IF NOT EXISTS `log_in` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `log_in`;

-- Dumping structure for table log_in.tbllogin
CREATE TABLE IF NOT EXISTS `tbllogin` (
  `user_name` varchar(120) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table log_in.tbllogin: ~1 rows (approximately)
/*!40000 ALTER TABLE `tbllogin` DISABLE KEYS */;
INSERT INTO `tbllogin` (`user_name`, `password`) VALUES
	('ace_29', 'lalala');
/*!40000 ALTER TABLE `tbllogin` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
log_intbllogintbllogintblloginlog_intblreglog_intblregtblregtblregtblreglog_intblreg