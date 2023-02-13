CREATE TABLE users (
    id IDENTITY PRIMARY KEY,
    name VARCHAR(200) UNIQUE,
    password VARCHAR(100),
    role enum('USER', 'ADMIN') NOT NULL
);