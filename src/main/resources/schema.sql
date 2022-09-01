DROP TABLE IF EXISTS persona;

CREATE TABLE persona (
    dni varchar(30) PRIMARY KEY,
    nombre VARCHAR(55),
    apellido VARCHAR(66),
    experiencia_laboral VARCHAR(658),
    tecnologias VARCHAR(135),
    estudios VARCHAR(66),
    provincia VARCHAR(50),
    edad int(11),
    imagen VARCHAR(250)
    );