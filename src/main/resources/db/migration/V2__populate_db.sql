-- Клієнти
INSERT INTO client (name) VALUES ('John Doe'), ('Jane Smith'), ('Alice Johnson'), ('Bob Brown'),
                                  ('Charlie White'), ('Daisy Black'), ('Ethan Blue'), ('Fiona Red'),
                                  ('George Green'), ('Helen Yellow');

-- Планети
INSERT INTO planet (id, name) VALUES ('MARS', 'Mars'), ('VEN', 'Venus'), ('EARTH', 'Earth'),
                                     ('JUP', 'Jupiter'), ('SAT', 'Saturn');

-- Квитки
INSERT INTO ticket (client_id, from_planet_id, to_planet_id)
VALUES
    (1, 'EARTH', 'MARS'), (2, 'MARS', 'VEN'), (3, 'VEN', 'JUP'),
    (4, 'JUP', 'SAT'), (5, 'SAT', 'EARTH'), (6, 'EARTH', 'VEN'),
    (7, 'VEN', 'SAT'), (8, 'SAT', 'JUP'), (9, 'JUP', 'EARTH'), (10, 'EARTH', 'MARS');
