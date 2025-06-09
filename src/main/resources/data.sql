CREATE TABLE customers (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
);

INSERT INTO customers (name, email) VALUES ('John Doe', 'john.doe@example.com');
INSERT INTO customers (name, email) VALUES ('Jane Smith', 'jane.smith@example.com');