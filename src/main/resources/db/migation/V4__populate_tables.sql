-- Добавяне на примерни автомобили (таблица car)
INSERT INTO car (model, location, price_per_day) VALUES ('Toyota Corolla', 'София', 50.00);
INSERT INTO car (model, location, price_per_day) VALUES ('Volkswagen Golf', 'Пловдив', 55.00);
INSERT INTO car (model, location, price_per_day) VALUES ('Renault Clio', 'Варна', 45.00);
INSERT INTO car (model, location, price_per_day) VALUES ('BMW X5', 'Бургас', 120.00);
INSERT INTO car (model, location, price_per_day) VALUES ('Ford Fiesta', 'София', 40.00);

-- Добавяне на примерни оферти (таблица offer)
INSERT INTO offer (car_id, customer_name, rental_days, total_price) VALUES (1, 'Иван Иванов', 3, 150.00);
INSERT INTO offer (car_id, customer_name, rental_days, total_price) VALUES (2, 'Мария Петрова', 5, 275.00);
INSERT INTO offer (car_id, customer_name, rental_days, total_price) VALUES (3, 'Георги Георгиев', 2, 90.00);
INSERT INTO offer (car_id, customer_name, rental_days, total_price) VALUES (4, 'Петя Димитрова', 7, 840.00);
INSERT INTO offer (car_id, customer_name, rental_days, total_price) VALUES (5, 'Николай Тодоров', 4, 160.00);
