CREATE TABLE clubs
(
  id integer NOT NULL ,
 club_name varchar(100) DEFAULT NULL,
 stadium_name varchar(100) DEFAULT NULL,
 PRIMARY KEY (id)
);

INSERT INTO clubs(id, club_name, stadium_name)VALUES (1, 'Arsenal', 'Emirates Stadium');
INSERT INTO clubs(id, club_name, stadium_name)VALUES (2, 'Chelsea', 'Stamford Bridge');
INSERT INTO clubs(id, club_name, stadium_name)VALUES (3, 'Liverpool', 'Anfield');
INSERT INTO clubs(id, club_name, stadium_name)VALUES (4, 'Reading', 'Madjeski Stadium');
INSERT INTO clubs(id, club_name, stadium_name)VALUES (5, 'Tottenham Hotspurs', 'White Hart Lane');
INSERT INTO clubs(id, club_name, stadium_name)VALUES (6, 'Aston Villa', 'Villa Park');