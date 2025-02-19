

-- Insertion des données customers
INSERT INTO customer (name, email, mobile_number, create_dt)
VALUES
    ('John Doe', 'john.doe@email.com', '1234567890', CURRENT_DATE()),
    ('Jane Smith', 'jane.smith@email.com', '2345678901', CURRENT_DATE()),
    ('Michael Johnson', 'michael.j@email.com', '3456789012', CURRENT_DATE()),
    ('Sarah Williams', 'sarah.w@email.com', '4567890123', CURRENT_DATE()),
    ('Robert Brown', 'robert.b@email.com', '5678901234', CURRENT_DATE());

-- Insertion des données accounts
INSERT INTO accounts (account_number, customer_id, account_type, branch_address, create_dt)
VALUES
    (1861234001, 1, 'Savings', '123 Main Street, New York', CURRENT_DATE()),
    (1861234003, 2, 'Savings', '456 Park Avenue, Boston', CURRENT_DATE()),
    (1861234005, 3, 'Savings', '789 Oak Road, San Francisco', CURRENT_DATE()),
    (1861234007, 4, 'Loan', '321 Pine Street, Chicago', CURRENT_DATE()),
    (1861234009, 5, 'Current', '654 Maple Ave, Miami', CURRENT_DATE());

