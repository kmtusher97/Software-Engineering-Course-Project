-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Mar 22, 2019 at 11:04 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `PerformanceTracker`
--

-- --------------------------------------------------------

--
-- Table structure for table `Admin`
--

CREATE TABLE `Admin` (
  `User_ID` int(11) NOT NULL,
  `Full_Name` varchar(200) NOT NULL,
  `Designation` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Admin`
--

INSERT INTO `Admin` (`User_ID`, `Full_Name`, `Designation`) VALUES
(1011, 'Md Rafsan Jani', 'Chairman');

-- --------------------------------------------------------

--
-- Table structure for table `Contestant_Handles`
--

CREATE TABLE `Contestant_Handles` (
  `UVa_ID` int(11) NOT NULL,
  `UVa_username` varchar(100) NOT NULL,
  `Codeforces_handle` varchar(100) NOT NULL,
  `Codechef_handle` varchar(100) NOT NULL,
  `LightOJ_ID` int(11) NOT NULL,
  `Vjudge_username` varchar(100) NOT NULL,
  `User_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Contestant_Info`
--

CREATE TABLE `Contestant_Info` (
  `Handle` varchar(200) NOT NULL,
  `Department` varchar(200) NOT NULL,
  `Session` varchar(20) NOT NULL,
  `Batch` int(5) NOT NULL,
  `Roll` int(11) NOT NULL,
  `Date_of_Birth` date NOT NULL,
  `Mobile_No` varchar(11) NOT NULL,
  `Tshirt_Size` varchar(11) NOT NULL,
  `Country` varchar(100) NOT NULL,
  `User_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Contestant_Notification`
--

CREATE TABLE `Contestant_Notification` (
  `Notification_ID` int(11) NOT NULL,
  `Description` int(11) NOT NULL,
  `User_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Current_Ratings`
--

CREATE TABLE `Current_Ratings` (
  `Codeforces` int(11) NOT NULL,
  `Codechef` int(11) NOT NULL,
  `Codechef_Long` int(11) NOT NULL,
  `Codechef_CookOFF` int(11) NOT NULL,
  `Codechef_LunchTime` int(11) NOT NULL,
  `User_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Last_Month_Attempted`
--

CREATE TABLE `Last_Month_Attempted` (
  `User_ID` int(11) NOT NULL,
  `UVa` int(11) NOT NULL,
  `Codeforces` int(11) NOT NULL,
  `Codechef` int(11) NOT NULL,
  `LightOJ` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Last_Month_Solve`
--

CREATE TABLE `Last_Month_Solve` (
  `UVa` int(11) NOT NULL,
  `Codeforces` int(11) NOT NULL,
  `Codechef` int(11) NOT NULL,
  `LightOJ` int(11) NOT NULL,
  `User_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Last_Month_Submissions`
--

CREATE TABLE `Last_Month_Submissions` (
  `UVa` int(11) NOT NULL,
  `Codeforces` int(11) NOT NULL,
  `Codechef` int(11) NOT NULL,
  `LightOJ` int(11) NOT NULL,
  `User_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Last_Week_Attempted`
--

CREATE TABLE `Last_Week_Attempted` (
  `UVa` int(11) NOT NULL,
  `Codeforces` int(11) NOT NULL,
  `Codechef` int(11) NOT NULL,
  `LightOJ` int(11) NOT NULL,
  `User_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Last_Week_Solved`
--

CREATE TABLE `Last_Week_Solved` (
  `UVa` int(11) NOT NULL,
  `Codeforces` int(11) NOT NULL,
  `Codechef` int(11) NOT NULL,
  `LightOJ` int(11) NOT NULL,
  `User_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Last_Week_Submissions`
--

CREATE TABLE `Last_Week_Submissions` (
  `UVa` int(11) NOT NULL,
  `Codeforces` int(11) NOT NULL,
  `Codechef` int(11) NOT NULL,
  `LightOJ` int(11) NOT NULL,
  `User_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Notification`
--

CREATE TABLE `Notification` (
  `Notification_ID` int(11) NOT NULL,
  `Description` int(11) NOT NULL,
  `Date` int(11) NOT NULL,
  `Time` int(11) NOT NULL,
  `Reciver` int(11) NOT NULL,
  `User_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Post`
--

CREATE TABLE `Post` (
  `Post_ID` int(11) NOT NULL,
  `Description` varchar(200) NOT NULL,
  `Time` int(11) NOT NULL,
  `Date` int(11) NOT NULL,
  `User_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Total_Attempted`
--

CREATE TABLE `Total_Attempted` (
  `UVa` int(11) NOT NULL,
  `Codeforces` int(11) NOT NULL,
  `CodeChef` int(11) NOT NULL,
  `LightOJ` int(11) NOT NULL,
  `User_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Total_Solve`
--

CREATE TABLE `Total_Solve` (
  `UVa` int(11) NOT NULL,
  `Codeforces` int(11) NOT NULL,
  `LightOJ` int(11) NOT NULL,
  `CodeChef` int(11) NOT NULL,
  `User_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Total_Submissions`
--

CREATE TABLE `Total_Submissions` (
  `UVa` int(11) NOT NULL,
  `CodeForces` int(11) NOT NULL,
  `Codechef` int(11) NOT NULL,
  `LightOJ` int(11) NOT NULL,
  `User_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Trainer`
--

CREATE TABLE `Trainer` (
  `User_ID` int(11) NOT NULL,
  `Institute` varchar(200) NOT NULL,
  `Address` varchar(300) NOT NULL,
  `Mobile_No1` varchar(11) NOT NULL,
  `Mobile_No2` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `User`
--

CREATE TABLE `User` (
  `User_ID` int(11) NOT NULL,
  `Email` varchar(200) NOT NULL,
  `Password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `User`
--

INSERT INTO `User` (`User_ID`, `Email`, `Password`) VALUES
(1011, 'rafsanteto@gmail.com', '123456'),
(1012, 'kmtusher97@gmail.com', '123456');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Admin`
--
ALTER TABLE `Admin`
  ADD PRIMARY KEY (`User_ID`);

--
-- Indexes for table `Contestant_Handles`
--
ALTER TABLE `Contestant_Handles`
  ADD PRIMARY KEY (`User_ID`);

--
-- Indexes for table `Contestant_Info`
--
ALTER TABLE `Contestant_Info`
  ADD PRIMARY KEY (`User_ID`),
  ADD UNIQUE KEY `Handle` (`Handle`);

--
-- Indexes for table `Contestant_Notification`
--
ALTER TABLE `Contestant_Notification`
  ADD PRIMARY KEY (`Notification_ID`),
  ADD KEY `Contestant_Notification_ibfk_1` (`User_ID`);

--
-- Indexes for table `Current_Ratings`
--
ALTER TABLE `Current_Ratings`
  ADD PRIMARY KEY (`User_ID`);

--
-- Indexes for table `Last_Month_Attempted`
--
ALTER TABLE `Last_Month_Attempted`
  ADD PRIMARY KEY (`User_ID`);

--
-- Indexes for table `Last_Month_Solve`
--
ALTER TABLE `Last_Month_Solve`
  ADD PRIMARY KEY (`User_ID`);

--
-- Indexes for table `Last_Month_Submissions`
--
ALTER TABLE `Last_Month_Submissions`
  ADD PRIMARY KEY (`User_ID`);

--
-- Indexes for table `Last_Week_Attempted`
--
ALTER TABLE `Last_Week_Attempted`
  ADD KEY `User_ID` (`User_ID`);

--
-- Indexes for table `Last_Week_Solved`
--
ALTER TABLE `Last_Week_Solved`
  ADD KEY `User_ID` (`User_ID`);

--
-- Indexes for table `Last_Week_Submissions`
--
ALTER TABLE `Last_Week_Submissions`
  ADD KEY `User_ID` (`User_ID`);

--
-- Indexes for table `Notification`
--
ALTER TABLE `Notification`
  ADD PRIMARY KEY (`Notification_ID`),
  ADD KEY `User_ID` (`User_ID`);

--
-- Indexes for table `Post`
--
ALTER TABLE `Post`
  ADD PRIMARY KEY (`Post_ID`),
  ADD KEY `User_ID` (`User_ID`);

--
-- Indexes for table `Total_Attempted`
--
ALTER TABLE `Total_Attempted`
  ADD PRIMARY KEY (`User_ID`);

--
-- Indexes for table `Total_Solve`
--
ALTER TABLE `Total_Solve`
  ADD PRIMARY KEY (`User_ID`);

--
-- Indexes for table `Total_Submissions`
--
ALTER TABLE `Total_Submissions`
  ADD PRIMARY KEY (`User_ID`);

--
-- Indexes for table `Trainer`
--
ALTER TABLE `Trainer`
  ADD PRIMARY KEY (`User_ID`);

--
-- Indexes for table `User`
--
ALTER TABLE `User`
  ADD PRIMARY KEY (`User_ID`),
  ADD UNIQUE KEY `Email` (`Email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Notification`
--
ALTER TABLE `Notification`
  MODIFY `Notification_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Post`
--
ALTER TABLE `Post`
  MODIFY `Post_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `User`
--
ALTER TABLE `User`
  MODIFY `User_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1013;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Admin`
--
ALTER TABLE `Admin`
  ADD CONSTRAINT `Admin_ibfk_1` FOREIGN KEY (`User_ID`) REFERENCES `User` (`User_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Contestant_Handles`
--
ALTER TABLE `Contestant_Handles`
  ADD CONSTRAINT `Contestant_Handles_ibfk_1` FOREIGN KEY (`User_ID`) REFERENCES `Contestant_Info` (`User_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Contestant_Info`
--
ALTER TABLE `Contestant_Info`
  ADD CONSTRAINT `Contestant_Info_ibfk_1` FOREIGN KEY (`User_ID`) REFERENCES `User` (`User_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Contestant_Notification`
--
ALTER TABLE `Contestant_Notification`
  ADD CONSTRAINT `Contestant_Notification_ibfk_1` FOREIGN KEY (`User_ID`) REFERENCES `Contestant_Info` (`User_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Current_Ratings`
--
ALTER TABLE `Current_Ratings`
  ADD CONSTRAINT `Current_Ratings_ibfk_1` FOREIGN KEY (`User_ID`) REFERENCES `Contestant_Info` (`User_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Last_Month_Attempted`
--
ALTER TABLE `Last_Month_Attempted`
  ADD CONSTRAINT `Last_Month_Attempted_ibfk_1` FOREIGN KEY (`User_ID`) REFERENCES `Contestant_Info` (`User_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Last_Month_Solve`
--
ALTER TABLE `Last_Month_Solve`
  ADD CONSTRAINT `Last_Month_Solve_ibfk_1` FOREIGN KEY (`User_ID`) REFERENCES `Contestant_Info` (`User_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Last_Month_Submissions`
--
ALTER TABLE `Last_Month_Submissions`
  ADD CONSTRAINT `Last_Month_Submissions_ibfk_1` FOREIGN KEY (`User_ID`) REFERENCES `Contestant_Info` (`User_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Last_Week_Attempted`
--
ALTER TABLE `Last_Week_Attempted`
  ADD CONSTRAINT `Last_Week_Attempted_ibfk_1` FOREIGN KEY (`User_ID`) REFERENCES `Contestant_Info` (`User_ID`);

--
-- Constraints for table `Last_Week_Solved`
--
ALTER TABLE `Last_Week_Solved`
  ADD CONSTRAINT `Last_Week_Solved_ibfk_1` FOREIGN KEY (`User_ID`) REFERENCES `Contestant_Info` (`User_ID`);

--
-- Constraints for table `Last_Week_Submissions`
--
ALTER TABLE `Last_Week_Submissions`
  ADD CONSTRAINT `Last_Week_Submissions_ibfk_1` FOREIGN KEY (`User_ID`) REFERENCES `Contestant_Info` (`User_ID`);

--
-- Constraints for table `Notification`
--
ALTER TABLE `Notification`
  ADD CONSTRAINT `Notification_ibfk_1` FOREIGN KEY (`User_ID`) REFERENCES `User` (`User_ID`);

--
-- Constraints for table `Post`
--
ALTER TABLE `Post`
  ADD CONSTRAINT `Post_ibfk_1` FOREIGN KEY (`User_ID`) REFERENCES `User` (`User_ID`);

--
-- Constraints for table `Total_Attempted`
--
ALTER TABLE `Total_Attempted`
  ADD CONSTRAINT `Total_Attempted_ibfk_1` FOREIGN KEY (`User_ID`) REFERENCES `Contestant_Info` (`User_ID`);

--
-- Constraints for table `Total_Solve`
--
ALTER TABLE `Total_Solve`
  ADD CONSTRAINT `Total_Solve_ibfk_1` FOREIGN KEY (`User_ID`) REFERENCES `Contestant_Info` (`User_ID`);

--
-- Constraints for table `Total_Submissions`
--
ALTER TABLE `Total_Submissions`
  ADD CONSTRAINT `Total_Submissions_ibfk_1` FOREIGN KEY (`User_ID`) REFERENCES `Contestant_Info` (`User_ID`);

--
-- Constraints for table `Trainer`
--
ALTER TABLE `Trainer`
  ADD CONSTRAINT `Trainer_ibfk_1` FOREIGN KEY (`User_ID`) REFERENCES `User` (`User_ID`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
