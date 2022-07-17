-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_fovipol
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_fovipol
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_fovipol` DEFAULT CHARACTER SET utf8 ;
USE `db_fovipol` ;

-- -----------------------------------------------------
-- Table `db_fovipol`.`Clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_fovipol`.`Clientes` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `CIP` VARCHAR(8) NOT NULL,
  `DNI` VARCHAR(8) NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Apellido` VARCHAR(45) NOT NULL,
  `Grado` VARCHAR(45) NOT NULL,
  `Estado_C` VARCHAR(45) NOT NULL,
  `DNI_C` VARCHAR(45) NULL,
  PRIMARY KEY (`idCliente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_fovipol`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_fovipol`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `Username` VARCHAR(45) NOT NULL,
  `Password` VARCHAR(45) NOT NULL,
  `Tipo` INT NOT NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_fovipol`.`Documentacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_fovipol`.`Documentacion` (
  `idDocumentacion` INT NOT NULL AUTO_INCREMENT,
  `CodDocumentacion` VARCHAR(8) NOT NULL,
  `UbicacionDoc` VARCHAR(200) NOT NULL,
  `Clientes_idCliente` INT NOT NULL,
  PRIMARY KEY (`idDocumentacion`, `Clientes_idCliente`),
  CONSTRAINT `fk_Documentacion_Clientes1`
    FOREIGN KEY (`Clientes_idCliente`)
    REFERENCES `db_fovipol`.`Clientes` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_fovipol`.`Credito`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_fovipol`.`Credito` (
  `idCredito` INT NOT NULL AUTO_INCREMENT,
  `Usuario_idUsuario` INT NOT NULL,
  PRIMARY KEY (`idCredito`, `Usuario_idUsuario`),
  CONSTRAINT `fk_Credito_Usuario1`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `db_fovipol`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_fovipol`.`DetalleCrediticio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_fovipol`.`DetalleCrediticio` (
  `Credito_idCredito` INT NOT NULL,
  `Documentacion_idDocumentacion` INT NOT NULL,
  `Credito_idCredito1` INT NOT NULL,
  PRIMARY KEY (`Credito_idCredito`, `Documentacion_idDocumentacion`, `Credito_idCredito1`),
  CONSTRAINT `fk_DetalleCrediticio_Documentacion1`
    FOREIGN KEY (`Documentacion_idDocumentacion`)
    REFERENCES `db_fovipol`.`Documentacion` (`idDocumentacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_DetalleCrediticio_Credito1`
    FOREIGN KEY (`Credito_idCredito1`)
    REFERENCES `db_fovipol`.`Credito` (`idCredito`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
