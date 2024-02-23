create database practica;

use practica;

create table arbol(
id_Arbol int auto_increment primary key not null,
nombre varchar(50) not null,
imagen_Arbol varchar(1024) ,
tipo_Arbol varchar(100),
dureza_Madera int );

CREATE USER 'usuario_practica'@'localhost' IDENTIFIED BY 'la_Clave';

GRANT ALL PRIVILEGES ON practica.* TO 'usuario_practica'@'localhost';
flush privileges;

drop table arbol;
