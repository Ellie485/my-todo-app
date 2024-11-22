-- таблица за автомобили


CREATE TABLE IF NOT EXISTS car (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    model VARCHAR(50) NOT NULL,
    location VARCHAR(50) NOT NULL,
    price_per_day DOUBLE NOT NULL
);
