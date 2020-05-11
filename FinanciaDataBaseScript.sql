 -- Base de datos: `javaweb_financia` -
 
 CREATE USER 'financiaUser'@'localhost' IDENTIFIED BY 'financia123';
 
 GRANT ALL PRIVILEGES ON * . * TO 'financiaUser'@'localhost';
 FLUSH PRIVILEGES;
 
 
 CREATE  DATABASE IF NOT EXISTS javaweb_financia;
 
 USE javaweb_financia;
 
 
 SELECT * FROM socios WHERE monto_maximo>4200000;
 
 -- Estructura de tabla para la tabla `socios` -
 
 CREATE TABLE `socios` ( 
 `id` int(10) NOT NULL, 
 `nombre` varchar(30) COLLATE utf8_spanish2_ci NOT NULL, 
 `tasa` double NOT NULL, 
 `monto_maximo` int(20) NOT NULL 
 ) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
 
 
 -- Volcado de datos para la tabla `socios` -
 INSERT INTO `socios` (`id`, `nombre`, `tasa`, `monto_maximo`) VALUES
 (1, 'Juan', 1.5, 5000000),
 (2, 'Andrés', 2.0, 7500000), 
 (3, 'María', 1.2, 3000000);
 

 -- Índices para tablas volcadas 
 -- Indices de la tabla `socios`
 ALTER TABLE `socios` 
 ADD PRIMARY KEY (`id`);
