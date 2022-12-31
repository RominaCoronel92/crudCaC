-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3308
-- Tiempo de generación: 31-12-2022 a las 02:12:45
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `clubbd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categorias`
--

CREATE TABLE `categorias` (
  `idCategoria` int(10) NOT NULL,
  `entrenador` varchar(45) COLLATE utf8mb4_bin NOT NULL,
  `año` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Volcado de datos para la tabla `categorias`
--

INSERT INTO `categorias` (`idCategoria`, `entrenador`, `año`) VALUES
(1, 'Marcelo Ibarra', 2007),
(2, 'Jorge Gorosito', 2008),
(3, 'Cristian Zamora', 2009),
(4, 'Cesar Falcioni', 2010),
(5, 'Lucas Puccineri', 2011),
(6, 'Diego Simeone', 2012),
(7, 'Miguel Angel Russo', 2013);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jugadores`
--

CREATE TABLE `jugadores` (
  `idJugadores` int(10) NOT NULL,
  `nombre` varchar(30) COLLATE utf8mb4_bin NOT NULL,
  `apellido` varchar(30) COLLATE utf8mb4_bin NOT NULL,
  `dni` int(8) NOT NULL,
  `domicilio` varchar(30) COLLATE utf8mb4_bin NOT NULL,
  `telefono` int(11) NOT NULL,
  `IdCategoria` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Volcado de datos para la tabla `jugadores`
--

INSERT INTO `jugadores` (`idJugadores`, `nombre`, `apellido`, `dni`, `domicilio`, `telefono`, `IdCategoria`) VALUES
(1, 'Juan', 'Sorin', 50345567, 'Juan de Garay 1234', 15432234, 2),
(2, 'Gabriel', 'Martinez', 52343457, 'Yatasto 1034', 15343244, 2),
(3, 'Daniel', 'Paz', 53567543, 'Jose de Vega 564', 15678688, 4),
(4, 'Joaquin', 'Gomez', 51345432, 'Alcorta 3815', 15987764, 3),
(5, 'Fabricio', 'Fernandez', 49234234, 'Honduras 1867', 15765678, 5),
(6, 'Gael', 'Montenegro', 54321234, 'Pavon 1234', 15123451, 1),
(7, 'Pablo', 'Chavez', 51654345, 'Avenida Paz 2233', 15209543, 3),
(8, 'Emanuel', 'Ruiz', 53456678, 'Funes 999', 15980890, 3),
(12, 'Facundo', 'sfsf', 3242423, 'gdfgdf 43', 15432666, 2),
(13, 'Claudio', 'Gimenez', 1234890, 'Garay 1234', 15436789, 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categorias`
--
ALTER TABLE `categorias`
  ADD PRIMARY KEY (`idCategoria`);

--
-- Indices de la tabla `jugadores`
--
ALTER TABLE `jugadores`
  ADD PRIMARY KEY (`idJugadores`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD KEY `FK_JUGADORES` (`IdCategoria`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categorias`
--
ALTER TABLE `categorias`
  MODIFY `idCategoria` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `jugadores`
--
ALTER TABLE `jugadores`
  MODIFY `idJugadores` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `jugadores`
--
ALTER TABLE `jugadores`
  ADD CONSTRAINT `FK_JUGADORES` FOREIGN KEY (`IdCategoria`) REFERENCES `categorias` (`idCategoria`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
