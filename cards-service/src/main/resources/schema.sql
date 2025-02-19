-- Création de la table Customer
CREATE TABLE IF NOT EXISTS Customer (
    customer_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    mobile_number VARCHAR(15) NOT NULL,
    create_dt DATE NOT NULL
    );


-- Création de la table Cards
CREATE TABLE IF NOT EXISTS Cards (
     card_id INT PRIMARY KEY AUTO_INCREMENT,
     customer_id INT NOT NULL,
     card_number VARCHAR(100) NOT NULL,
    card_type VARCHAR(50) NOT NULL,
    total_limit INT NOT NULL,
    amount_used INT NOT NULL,
    available_amount INT NOT NULL,
    create_dt DATE NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES Customer(customer_id)
    );