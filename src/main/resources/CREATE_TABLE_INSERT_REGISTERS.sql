CREATE TABLE convidados (rowid bigint auto_increment, nm_convidado VARCHAR(100), qnt_convidados int);

INSERT INTO convidados (nm_convidado, qnt_convidados) VALUES ('Fernando', 2), ('Ricardo', 4), ('Maria', 1), ('Carla', 0); 

--Table EVENTO
CREATE TABLE eventos (rowid bigint auto_increment, nm_evento VARCHAR(100), data_evento date, valor_ingresso float(2));

--INSERTS iniciais
INSERT INTO eventos (nm_evento, data_evento, valor_ingresso) VALUES
	('Rock in Rio', '2023-08-01', 99.99),
	('The Greatest Show', '2023-11-15', 124.90),
	('Street Suoar', '2024-01-07', 35.75);