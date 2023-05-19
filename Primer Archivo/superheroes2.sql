DROP DATABASE IF EXISTS superheroes;
CREATE DATABASE superheroes CHARACTER SET utf8mb4;
USE superheroes;

CREATE TABLE creador (
id_creador INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
  nombre VARCHAR(20) NOT NULL
);
Insert into creador (id_creador,nombre) values (1,"Marvel");
Insert into creador (id_creador,nombre) values (2,"DC Comics");
Insert into creador (id_creador,nombre) values (3,"El Pelado");
CREATE TABLE personajes (
  id_personaje INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre_real VARCHAR(20) NOT NULL,
  personaje VARCHAR(20) NOT NULL,
  inteligencia INT(10) NOT NULL,
  fuerza VARCHAR(10) NOT NULL,
  velocidad INT(11) NOT NULL,
  poder INT(11) NOT NULL,
  aparicion INT(11) NOT NULL,
  ocupacion VARCHAR(30) NULL,
  id_creador INT UNSIGNED NOT NULL,
  FOREIGN KEY (id_creador) REFERENCES creador(id_creador)
  );
  insert into personajes (id_personaje,nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador) values (1,"Fernando","Chiquito",300,"Fisura",5,70,2021,"perro de Egg",3);
 insert into personajes (id_personaje,nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador) values (2,"Clark Kent","Super Man",165,"Infinita",120,182,1948,"Reportero",2);
 insert into personajes (id_personaje,nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador) values (3,"Barry Allen","Flash",160,10000,300,168,1956,"Cientifico Forence",2);
update personajes set aparicion=1938 where id_personaje = 2;
delete from personajes where id_personaje=3;
