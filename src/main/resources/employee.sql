CREATE TABLE Employee (
                          id SERIAL PRIMARY KEY,
                          name VARCHAR(200) NOT NULL,
                          dept VARCHAR(50) NOT NULL,
                          designation VARCHAR(100) NOT NULL,
                          salary FLOAT NOT NULL,
                          dateofjoin DATE NOT NULL
);
