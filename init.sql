--
-- Name: leaguedb; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE leaguedb;

CREATE TABLE clubs(
   id INT PRIMARY KEY      NOT NULL,
   club_name           CHAR(50) NOT NULL,
   stadium_name           CHAR(50) NOT NULL
);

INSERT INTO clubs(id, club_name, stadium_name)VALUES (1, 'Arsenal', 'Emirates Stadium');
INSERT INTO clubs(id, club_name, stadium_name)VALUES (2, 'Chelsea', 'Stamford Bridge');
INSERT INTO clubs(id, club_name, stadium_name)VALUES (3, 'Liverpool', 'Anfield');
INSERT INTO clubs(id, club_name, stadium_name)VALUES (4, 'Reading', 'Madjeski Stadium');
INSERT INTO clubs(id, club_name, stadium_name)VALUES (5, 'Tottenham Hotspurs', 'White Hart Lane');