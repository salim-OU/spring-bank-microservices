INSERT INTO loans (customer_id, start_dt, loan_type, total_loan, amount_paid, outstanding_amount, create_dt)
VALUES
(1, CURRENT_DATE-30, 'Home', 200000, 50000, 150000, CURRENT_DATE),
(1, CURRENT_DATE-90, 'Vehicle', 40000, 10000, 30000, CURRENT_DATE);