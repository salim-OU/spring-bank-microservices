-- -- schema.sql
-- CREATE TABLE IF NOT EXISTS customer (
--     customer_id INT AUTO_INCREMENT PRIMARY KEY,
--     name VARCHAR(100) NOT NULL,
--     email VARCHAR(100) NOT NULL,
--     mobile_number VARCHAR(20) NOT NULL,
--     create_dt DATE DEFAULT CURRENT_DATE
--     );
--
-- CREATE TABLE IF NOT EXISTS accounts (
--     customer_id INT NOT NULL,
--     account_number BIGINT PRIMARY KEY,
--     account_type VARCHAR(100) NOT NULL,
--     branch_address VARCHAR(200) NOT NULL,
--     create_dt DATE DEFAULT CURRENT_DATE,
--     FOREIGN KEY (customer_id) REFERENCES customer(customer_id)
--     );
-- Création de la table Customer
CREATE TABLE IF NOT EXISTS Customer (
    customer_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    mobile_number VARCHAR(15) NOT NULL,
    create_dt DATE NOT NULL
    );

-- Création de la table Accounts
CREATE TABLE IF NOT EXISTS Accounts (
    account_number BIGINT PRIMARY KEY,
    customer_id INT NOT NULL,
    account_type VARCHAR(50) NOT NULL,
    branch_address VARCHAR(200) NOT NULL,
    create_dt DATE NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES Customer(customer_id)
    );