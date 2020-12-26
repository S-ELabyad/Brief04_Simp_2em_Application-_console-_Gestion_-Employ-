-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : sam. 26 déc. 2020 à 01:31
-- Version du serveur :  10.4.11-MariaDB
-- Version de PHP : 7.2.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `gestionpersonnel`
--

-- --------------------------------------------------------

--
-- Structure de la table `manutentionaire`
--

CREATE TABLE `manutentionaire` (
  `IDMent` int(20) NOT NULL,
  `ManutentionaireNom` varchar(100) NOT NULL,
  `ManutentionairePrenom` varchar(100) NOT NULL,
  `ManutentionaireAge` int(100) NOT NULL,
  `SalaireMent` double NOT NULL,
  `Date_Ent` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `manutentionaire`
--

INSERT INTO `manutentionaire` (`IDMent`, `ManutentionaireNom`, `ManutentionairePrenom`, `ManutentionaireAge`, `SalaireMent`, `Date_Ent`) VALUES
(1, '', 'ELABYAD', 15, 1000, 1),
(2, 'YOUCOD', 'OCP', 1, 100000, 2);

-- --------------------------------------------------------

--
-- Structure de la table `manutentionairerisq`
--

CREATE TABLE `manutentionairerisq` (
  `iDRisqe` int(20) NOT NULL,
  `ManutentionaireNomrisque` varchar(100) NOT NULL,
  `ManutentionairePrenomrisque` varchar(100) NOT NULL,
  `ManutentionaireAgerisque` int(100) NOT NULL,
  `SalaireMentrisque` double NOT NULL,
  `Date_Entrisque` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `manutentionairerisq`
--

INSERT INTO `manutentionairerisq` (`iDRisqe`, `ManutentionaireNomrisque`, `ManutentionairePrenomrisque`, `ManutentionaireAgerisque`, `SalaireMentrisque`, `Date_Entrisque`) VALUES
(2, 'RG', 'DRG', 3, 50200, 34);

-- --------------------------------------------------------

--
-- Structure de la table `producteur`
--

CREATE TABLE `producteur` (
  `IDProd` int(100) NOT NULL,
  `ProducteurNom` varchar(100) NOT NULL,
  `ProducteurPrenom` varchar(100) NOT NULL,
  `ProducteurAge` int(20) NOT NULL,
  `SalaireProd` double NOT NULL,
  `Date_Entree` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `producteur`
--

INSERT INTO `producteur` (`IDProd`, `ProducteurNom`, `ProducteurPrenom`, `ProducteurAge`, `SalaireProd`, `Date_Entree`) VALUES
(1, '', 'ELABYAD', 20, 15000, 23),
(2, 'ayoub', 'ABROUK', 31, 6000, 2),
(3, 'saloua', 'zero', 21, 5200, 21),
(4, 'SALOUA', 'ELABYAD', 22, 5200, 21),
(5, 'FH', 'DFJG', 54, 5200, 54);

-- --------------------------------------------------------

--
-- Structure de la table `producteurrisq`
--

CREATE TABLE `producteurrisq` (
  `iDRisq` int(20) NOT NULL,
  `ProducteurNomrisque` varchar(100) NOT NULL,
  `ProducteurPrenomrisque` varchar(100) NOT NULL,
  `ProducteurAgerisque` int(100) NOT NULL,
  `SalaireProdrisque` double NOT NULL,
  `Date_Entreerisque` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `producteurrisq`
--

INSERT INTO `producteurrisq` (`iDRisq`, `ProducteurNomrisque`, `ProducteurPrenomrisque`, `ProducteurAgerisque`, `SalaireProdrisque`, `Date_Entreerisque`) VALUES
(1, 'SALOUA', 'ELABYAD', 22, 5200, 21);

-- --------------------------------------------------------

--
-- Structure de la table `representeur`
--

CREATE TABLE `representeur` (
  `IDrep` int(100) NOT NULL,
  `RepresenteurNom` varchar(250) NOT NULL,
  `RepresenteurPrenom` varchar(250) NOT NULL,
  `RepresenteurAge` int(100) NOT NULL,
  `SalaireRep` double NOT NULL,
  `Date_Entr` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `representeur`
--

INSERT INTO `representeur` (`IDrep`, `RepresenteurNom`, `RepresenteurPrenom`, `RepresenteurAge`, `SalaireRep`, `Date_Entr`) VALUES
(1, 'ESR', 'DRTG', 45, 0, 454);

-- --------------------------------------------------------

--
-- Structure de la table `vendeur`
--

CREATE TABLE `vendeur` (
  `ID` int(200) NOT NULL,
  `Nom` varchar(100) NOT NULL,
  `Prenom` varchar(250) NOT NULL,
  `Age` int(100) NOT NULL,
  `SalaireVente` double NOT NULL,
  `Date_Entre` int(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `vendeur`
--

INSERT INTO `vendeur` (`ID`, `Nom`, `Prenom`, `Age`, `SalaireVente`, `Date_Entre`) VALUES
(7, 'TYHG', 'HG', 67, 1700, 98);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `manutentionaire`
--
ALTER TABLE `manutentionaire`
  ADD PRIMARY KEY (`IDMent`);

--
-- Index pour la table `manutentionairerisq`
--
ALTER TABLE `manutentionairerisq`
  ADD PRIMARY KEY (`iDRisqe`);

--
-- Index pour la table `producteur`
--
ALTER TABLE `producteur`
  ADD PRIMARY KEY (`IDProd`);

--
-- Index pour la table `producteurrisq`
--
ALTER TABLE `producteurrisq`
  ADD PRIMARY KEY (`iDRisq`);

--
-- Index pour la table `representeur`
--
ALTER TABLE `representeur`
  ADD PRIMARY KEY (`IDrep`);

--
-- Index pour la table `vendeur`
--
ALTER TABLE `vendeur`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `manutentionaire`
--
ALTER TABLE `manutentionaire`
  MODIFY `IDMent` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `manutentionairerisq`
--
ALTER TABLE `manutentionairerisq`
  MODIFY `iDRisqe` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `producteur`
--
ALTER TABLE `producteur`
  MODIFY `IDProd` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `producteurrisq`
--
ALTER TABLE `producteurrisq`
  MODIFY `iDRisq` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `representeur`
--
ALTER TABLE `representeur`
  MODIFY `IDrep` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `vendeur`
--
ALTER TABLE `vendeur`
  MODIFY `ID` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
