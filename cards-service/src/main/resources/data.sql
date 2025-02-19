-- Insertion des données Customer
INSERT INTO Customer (name, email, mobile_number, create_dt)
VALUES
    ('John Doe', 'john.doe@email.com', '1234567890', CURRENT_DATE),
    ('Jane Smith', 'jane.smith@email.com', '2345678901', CURRENT_DATE),
    ('Bob Wilson', 'bob.wilson@email.com', '3456789012', CURRENT_DATE),
    ('Sarah Brown', 'sarah.brown@email.com', '4567890123', CURRENT_DATE),
    ('Mike Johnson', 'mike.john@email.com', '5678901234', CURRENT_DATE);

-- Insertion des données Cards
INSERT INTO Cards (customer_id, card_number, card_type, total_limit, amount_used, available_amount, create_dt)
VALUES
    (1, '4565-XXXX-XXXX-1234', 'CREDIT', 10000, 2000, 8000, CURRENT_DATE),
    (1, '3455-XXXX-XXXX-5678', 'DEBIT', 7500, 1500, 6000, CURRENT_DATE),
    (2, '6789-XXXX-XXXX-9012', 'CREDIT', 15000, 5000, 10000, CURRENT_DATE),
    (2, '9012-XXXX-XXXX-3456', 'DEBIT', 8000, 3000, 5000, CURRENT_DATE),
    (3, '5678-XXXX-XXXX-7890', 'CREDIT', 12000, 4000, 8000, CURRENT_DATE),
    (3, '4321-XXXX-XXXX-8765', 'DEBIT', 9000, 2000, 7000, CURRENT_DATE),
    (4, '8765-XXXX-XXXX-4321', 'CREDIT', 20000, 5000, 15000, CURRENT_DATE),
    (4, '2345-XXXX-XXXX-6789', 'DEBIT', 10000, 3000, 7000, CURRENT_DATE),
    (5, '1234-XXXX-XXXX-5678', 'CREDIT', 25000, 10000, 15000, CURRENT_DATE),
    (5, '7890-XXXX-XXXX-1234', 'DEBIT', 12000, 4000, 8000, CURRENT_DATE);