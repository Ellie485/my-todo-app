-- таблица за оферти


CREATE TABLE IF NOT EXISTS offer (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    car_id BIGINT NOT NULL,
    customer_name VARCHAR(100) NOT NULL,
    rental_days INT NOT NULL,
    total_price DOUBLE NOT NULL,
    FOREIGN KEY (car_id) REFERENCES car(id)
);
