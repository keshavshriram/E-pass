-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 27, 2024 at 05:18 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `epass_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `epass`
--

CREATE TABLE `epass` (
  `EPASS_ID` int(11) NOT NULL,
  `userid` int(11) NOT NULL,
  `FNAME` varchar(20) NOT NULL,
  `LNAME` varchar(20) NOT NULL,
  `EMAIL` varchar(50) NOT NULL,
  `PHONENO` varchar(10) NOT NULL,
  `TFROM` varchar(15) NOT NULL,
  `TTO` varchar(15) NOT NULL,
  `DOT` varchar(15) NOT NULL,
  `TRAVEL_STATUS` varchar(15) NOT NULL,
  `TRAVEL_REASON` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `epass`
--

INSERT INTO `epass` (`EPASS_ID`, `userid`, `FNAME`, `LNAME`, `EMAIL`, `PHONENO`, `TFROM`, `TTO`, `DOT`, `TRAVEL_STATUS`, `TRAVEL_REASON`) VALUES
(2, 4, 'Keshav', 'Shriram', 'keshav@gmail.com', '9665448430', 'karjat', 'pune', '13-05-2002', 'Accepted', 'Adventure'),
(3, 5, 'Pankaj', 'Jadhav', 'pankaj@gmail.com', '9665448430', 'karjat', 'pune', '13-05-2002', 'Accepted', 'Adventure'),
(4, 5, 'vinit', 'yadav', 'vinit@gmail.com', '1231231231', 'karjat', 'pune', '13-05-2002', 'Accepted', 'Adventure'),
(5, 0, 'Keshav', 'Shriram', 'keshav@gmail.com', '9665448430', 'karjat', 'pune', '13-05-2002', 'Accepted', 'Adventure');

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE `registration` (
  `userid` int(11) NOT NULL,
  `FNAME` varchar(20) NOT NULL,
  `LNAME` varchar(20) NOT NULL,
  `EMAIL` varchar(100) NOT NULL,
  `PHONENO` varchar(10) NOT NULL,
  `USERNAME` varchar(20) NOT NULL,
  `PASSWORD` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`userid`, `FNAME`, `LNAME`, `EMAIL`, `PHONENO`, `USERNAME`, `PASSWORD`) VALUES
(4, 'Keshav', 'Shriram', 'keshav@gmail.com', '9665448430', 'keshav', 'keshav@1234'),
(5, 'Pankaj', 'Jadhav', 'pankaj@gmail.com', '9665448430', 'pankaj', 'pankaj@1234'),
(6, 'Kunal', 'Thakare', 'kunal@gmail.com', '1234567890', 'kunal', 'kunal@1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `epass`
--
ALTER TABLE `epass`
  ADD PRIMARY KEY (`EPASS_ID`);

--
-- Indexes for table `registration`
--
ALTER TABLE `registration`
  ADD PRIMARY KEY (`userid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `epass`
--
ALTER TABLE `epass`
  MODIFY `EPASS_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `registration`
--
ALTER TABLE `registration`
  MODIFY `userid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
