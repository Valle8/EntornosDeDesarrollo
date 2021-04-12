SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS Cursan;
DROP TABLE IF EXISTS Hacen;
DROP TABLE IF EXISTS Realizan;
DROP TABLE IF EXISTS Alumnos;
DROP TABLE IF EXISTS Elaboran;
DROP TABLE IF EXISTS Profesores;
DROP TABLE IF EXISTS Asignaturas;
DROP TABLE IF EXISTS Examenes;
DROP TABLE IF EXISTS Practicas;




/* Create Tables */

CREATE TABLE Alumnos
(
	Num_alu int NOT NULL,
	Nombre varchar(30),
	Grupo varchar(5),
	PRIMARY KEY (Num_alu)
);


CREATE TABLE Asignaturas
(
	Num_asi int NOT NULL,
	Nombre varchar(30),
	PRIMARY KEY (Num_asi)
);


CREATE TABLE Cursan
(
	Num_alu int NOT NULL,
	Num_asi int NOT NULL,
	Trimestre int
);


CREATE TABLE Elaboran
(
	Cod_practica int NOT NULL,
	Num_prof int NOT NULL,
	Fecha date
);


CREATE TABLE Examenes
(
	Num_exa int NOT NULL,
	Npreguntas int,
	Fecha date,
	PRIMARY KEY (Num_exa)
);


CREATE TABLE Hacen
(
	Num_alu int NOT NULL,
	Num_exa int NOT NULL,
	Nota int
);


CREATE TABLE Practicas
(
	Cod_practica int NOT NULL,
	Titulo varchar(20),
	Nivel int,
	PRIMARY KEY (Cod_practica)
);


CREATE TABLE Profesores
(
	Num_prof int NOT NULL,
	Nombre varchar(30),
	Num_asi int NOT NULL,
	PRIMARY KEY (Num_prof)
);


CREATE TABLE Realizan
(
	Num_alu int NOT NULL,
	Cod_practica int NOT NULL,
	Nota int,
	Fecha date
);



/* Create Foreign Keys */

ALTER TABLE Cursan
	ADD FOREIGN KEY (Num_alu)
	REFERENCES Alumnos (Num_alu)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Hacen
	ADD FOREIGN KEY (Num_alu)
	REFERENCES Alumnos (Num_alu)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Realizan
	ADD FOREIGN KEY (Num_alu)
	REFERENCES Alumnos (Num_alu)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Cursan
	ADD FOREIGN KEY (Num_asi)
	REFERENCES Asignaturas (Num_asi)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Profesores
	ADD CONSTRAINT Imparten FOREIGN KEY (Num_asi)
	REFERENCES Asignaturas (Num_asi)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Hacen
	ADD FOREIGN KEY (Num_exa)
	REFERENCES Examenes (Num_exa)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Elaboran
	ADD FOREIGN KEY (Cod_practica)
	REFERENCES Practicas (Cod_practica)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Realizan
	ADD FOREIGN KEY (Cod_practica)
	REFERENCES Practicas (Cod_practica)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Elaboran
	ADD FOREIGN KEY (Num_prof)
	REFERENCES Profesores (Num_prof)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



