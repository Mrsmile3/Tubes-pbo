-- phpMyAdmin SQL Dump
-- version 4.4.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 15 Mei 2020 pada 19.50
-- Versi Server: 5.6.25
-- PHP Version: 5.6.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gamestore`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `game`
--

CREATE TABLE IF NOT EXISTS `game` (
  `id_game` varchar(10) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `Genre1` varchar(15) NOT NULL,
  `Genre2` varchar(15) NOT NULL,
  `Genre3` varchar(15) NOT NULL,
  `Stok` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `game`
--

INSERT INTO `game` (`id_game`, `nama`, `Genre1`, `Genre2`, `Genre3`, `Stok`) VALUES
('GM990601', 'Jugment', 'Action', 'RPG', 'Adventure', 10),
('GM990602', 'God Of WAr', 'RPG', 'Action', '', 25),
('GM990603', 'Marvel Ultimate ', 'Action ', 'Adventure', '', 30),
('GM990604', 'Dead Effectn 2', 'SurvivalHorror', 'FPS', 'RPG', 25),
('GM990605', 'Alliance', 'Action', 'Adventure', '', 30),
('GM990606', 'Manguni Squad', 'Shooter', 'Manguni Squad', 'Adventure', 20),
('GM990607', 'Hollow Knight', 'Action', 'Adventure', '', 25),
('GM990608', 'The Sim 4', 'Simulation', 'LIfe Simulation', '', 20),
('GM990609', 'Moonlighter', 'RPG', 'Action', 'Adventure', 10),
('GM990610', 'Fifa Shoccer', 'Sport', 'Simulation', '', 24),
('GM990611', 'Dota 2', 'Moba', 'Srategi', 'RPG', 14),
('GM990612', 'Mobile Legend', 'Moba', 'RPG', 'Strategi', 13),
('GM990613', 'Iron Leangue', 'Moba', 'Strategi', '', 12),
('GM990614', 'Need For Speed', 'Racing', 'Sport', '', 18),
('GM990615', 'Asphal 8', 'Racing', 'Simulation', '', 15),
('GM990616', 'the Legend Of Zelda', 'Action', 'Adventure', 'RPG', 35),
('GM990617', 'Free Fire', 'Battle Royale', 'Action', 'Adventure', 30),
('GM990618', 'chrono trigger', 'RPG', 'Strategi', 'Adventure', 34),
('GM990619', 'Dead Tigger 2', 'FPS', 'Survival Horror', 'RPG', 20),
('GM990620', 'Hitman', 'Shooter', 'Action', '', 25);

-- --------------------------------------------------------

--
-- Struktur dari tabel `order_game`
--

CREATE TABLE IF NOT EXISTS `order_game` (
  `id_order` varchar(40) NOT NULL,
  `id_kustomer` varchar(10) NOT NULL,
  `tgl_order` varchar(20) NOT NULL,
  `id_game` varchar(15) NOT NULL,
  `nama_game` varchar(20) NOT NULL,
  `status` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `order_game`
--

INSERT INTO `order_game` (`id_order`, `id_kustomer`, `tgl_order`, `id_game`, `nama_game`, `status`) VALUES
('2020415004990603', 'USR004', '2020 - 4 - 15', 'GM990603', 'Marvel Ultimate ', 'Lunas');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id_user` varchar(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `tingkat_kelas` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id_user`, `username`, `password`, `nama`, `alamat`, `tingkat_kelas`) VALUES
('USR001', 'Bambang_23', 'Pass98#', 'Bambang Cahyono', 'Jl mertama putra 2', 'admin'),
('USR002', 'Udin_65', 'Pass12#', 'Uding Saepudin', 'Jl rajawali 4 no 12', 'admin'),
('USR003', 'Suga_648', 'Pass980#', 'Sugawan Moerdono', 'JL senopati no 44', 'user'),
('USR004', 'Amir_09', 'Pass432#', 'Amirudin Setiawan', 'Jl sultan hasim no 1', 'user'),
('USR005', 'Zygii_50', 'Pass348#', 'Zaenuddin Darmawan', 'JL Elang Timur 67', 'user');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `game`
--
ALTER TABLE `game`
  ADD PRIMARY KEY (`id_game`);

--
-- Indexes for table `order_game`
--
ALTER TABLE `order_game`
  ADD PRIMARY KEY (`id_order`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
