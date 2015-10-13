-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.0.21-MariaDB - MariaDB Server
-- OS do Servidor:               Linux
-- HeidiSQL Versão:              9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Copiando estrutura do banco de dados para genius_java
CREATE DATABASE IF NOT EXISTS `genius_java` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `genius_java`;


-- Copiando estrutura para tabela genius_java.scores
CREATE TABLE IF NOT EXISTS `scores` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `id_usuario` int(10) unsigned NOT NULL,
  `score` bigint(20) unsigned NOT NULL DEFAULT '0',
  `modo_de_jogo` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `score` (`score`),
  KEY `id_usuario` (`id_usuario`),
  KEY `modo_de_jogo` (`modo_de_jogo`),
  CONSTRAINT `FK_scores_usuarios` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.


-- Copiando estrutura para tabela genius_java.usuarios
CREATE TABLE IF NOT EXISTS `usuarios` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `nome` (`nome`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
