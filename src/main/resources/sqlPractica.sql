create database practica;

use practica;

create table arbol(
id_Arbol int auto_increment primary key not null,
nombre varchar(50) not null,
imagenArbol varchar(1024) not null,
tipoArbol varchar(100) not null,
durezaMadera int not null);

CREATE USER 'usuario_practica'@'localhost' IDENTIFIED BY 'la_Clave';

GRANT ALL PRIVILEGES ON practica.* TO 'usuario_practica'@'localhost';
flush privileges;
