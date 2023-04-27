DROP TABLE IF EXISTS clientes;
DROP TABLE IF EXISTS dentistas;
DROP TABLE IF EXISTS citas;

CREATE TABLE clientes (
  id INT PRIMARY KEY AUTO_INCREMENT,
  dni VARCHAR(9) NOT NULL,
  nombre VARCHAR(255) NOT NULL,
  apellido VARCHAR(255) NOT NULL
);

CREATE TABLE dentistas (
  id INT PRIMARY KEY AUTO_INCREMENT,
  dni VARCHAR(9) NOT NULL,
  nombre VARCHAR(255) NOT NULL,
  apellido VARCHAR(255) NOT NULL
);

CREATE TABLE citas (
  id INT PRIMARY KEY AUTO_INCREMENT,
  fecha_hora DATETIME NOT NULL,
  cliente INT NOT NULL,
  dentista INT NOT NULL,
  FOREIGN KEY (cliente) REFERENCES clientes(id) ON UPDATE CASCADE ON DELETE CASCADE,
  FOREIGN KEY (dentista) REFERENCES dentistas(id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO clientes (dni, nombre, apellido) VALUES ('12345678A', 'Juan', 'García');
INSERT INTO clientes (dni, nombre, apellido) VALUES ('87654321B', 'Ana', 'López');
INSERT INTO clientes (dni, nombre, apellido) VALUES ('11111111C', 'Pedro', 'Gómez');
INSERT INTO clientes (dni, nombre, apellido) VALUES ('22222222D', 'María', 'Sánchez');
INSERT INTO clientes (dni, nombre, apellido) VALUES ('33333333E', 'David', 'Pérez');

INSERT INTO dentistas (dni, nombre, apellido) VALUES ('44444444F', 'Laura', 'Fernández');
INSERT INTO dentistas (dni, nombre, apellido) VALUES ('55555555G', 'Carlos', 'Ruiz');
INSERT INTO dentistas (dni, nombre, apellido) VALUES ('66666666H', 'Elena', 'Márquez');
INSERT INTO dentistas (dni, nombre, apellido) VALUES ('77777777I', 'Antonio', 'Gutiérrez');
INSERT INTO dentistas (dni, nombre, apellido) VALUES ('88888888J', 'Isabel', 'Rodríguez');

INSERT INTO citas (fecha_hora, cliente, dentista) VALUES ('2023-05-01 10:00:00', 1, 1);
INSERT INTO citas (fecha_hora, cliente, dentista) VALUES ('2023-05-03 15:30:00', 2, 3);
INSERT INTO citas (fecha_hora, cliente, dentista) VALUES ('2023-05-05 12:00:00', 3, 2);
INSERT INTO citas (fecha_hora, cliente, dentista) VALUES ('2023-05-06 17:00:00', 4, 4);
INSERT INTO citas (fecha_hora, cliente, dentista) VALUES ('2023-05-07 09:30:00', 5, 5);