DROP DATABASE IF EXISTS order_service;
CREATE DATABASE order_service;
USE order_service;
DROP TABLE IF EXISTS order_item CASCADE;
CREATE TABLE order_item (
    order_id BIGINT AUTO_INCREMENT,
    member_id VARCHAR(255),
    PRIMARY KEY (order_id)
);