-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- 主机： 127.0.0.1
-- 生成日期： 2021-01-20 03:41:23
-- 服务器版本： 10.4.14-MariaDB
-- PHP 版本： 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 数据库： `test`
--

-- --------------------------------------------------------

--
-- 表的结构 `love`
--

CREATE TABLE `love` (
  `id` int(5) NOT NULL,
  `name` varchar(111) NOT NULL,
  `pwd` varchar(111) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- 转存表中的数据 `love`
--

INSERT INTO `love` (`id`, `name`, `pwd`) VALUES
(1, 'admin', '123456'),
(36, '', ''),
(37, '', ''),
(38, '', ''),
(39, '', ''),
(40, '', ''),
(41, '15207053787', '');

--
-- 转储表的索引
--

--
-- 表的索引 `love`
--
ALTER TABLE `love`
  ADD PRIMARY KEY (`id`);

--
-- 在导出的表使用AUTO_INCREMENT
--

--
-- 使用表AUTO_INCREMENT `love`
--
ALTER TABLE `love`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
