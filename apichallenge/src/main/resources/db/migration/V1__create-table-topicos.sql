-- V1__create_table_topicos.sql
CREATE TABLE topicos (

    id BIGINT NOT NULL AUTO_INCREMENT,
    id_usuario VARCHAR(20) NOT NULL UNIQUE,
    mensaje VARCHAR(100) NOT NULL,
    nombre_curso VARCHAR(50) NOT NULL,
    titulo VARCHAR(50) NOT NULL,

    PRIMARY KEY (id)

);
