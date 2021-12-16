drop table users;
drop table employees;
drop table applications;

CREATE TABLE IF NOT EXISTS users
(
    id BIGSERIAL PRIMARY KEY,
    firstname VARCHAR(200) NOT NULL,
    lastname VARCHAR(200) NOT NULL,
    username VARCHAR(200) NOT NULL,
    password VARCHAR(200) NOT NULL
);

CREATE TABLE IF NOT EXISTS employees
(
    id    BIGSERIAL PRIMARY KEY,
    firstname  VARCHAR(200) NOT NULL,
    lastname VARCHAR(200) NOT NULL,
    patronymic VARCHAR(200) NOT NULL,
    skill VARCHAR (50) NOT NULL,
    phone_number VARCHAR (20) NOT NULL,
    score INTEGER NOT NULL
    );

CREATE TABLE IF NOT EXISTS applications
(
    id  BIGSERIAL PRIMARY KEY,
    master_id  BIGSERIAL NOT NULL,
    job_type VARCHAR (200) NOT NULL,
    job_volume DOUBLE PRECISION NOT NULL,
    price DOUBLE PRECISION NOT NULL,
    status VARCHAR NOT NULL,
    client_id BIGSERIAL NOT NULL
    );