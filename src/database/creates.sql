CREATE DATABASE `ayzek_webtemplate`;

USE ayzek_webtemplate;

DROP TABLE USER;
CREATE TABLE `user` (
  `username` VARCHAR(25) NOT NULL,
  `passwd` VARCHAR(60) NOT NULL,
  `first_name` VARCHAR(25) NOT NULL,
  `last_name` VARCHAR(25) NOT NULL,
  `phone` VARCHAR(15) DEFAULT NULL,
  `email` VARCHAR(45) NOT NULL,
  `enabled` BOOLEAN NOT NULL DEFAULT true,
  PRIMARY KEY (`username`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


DROP TABLE user_roles;
CREATE TABLE `user_roles` (
  `user_role_id` INT(11) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `role` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`user_role_id`),
  UNIQUE KEY `uni_username_role` (`role`,`username`),
  KEY `fk_username_idx` (`username`),
  CONSTRAINT `fk_username` FOREIGN KEY (`username`) REFERENCES `user` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE USER 'ayzekad'@'localhost' IDENTIFIED BY 'test';
GRANT ALL PRIVILEGES ON * . * TO 'ayzekad'@'localhost';
FLUSH PRIVILEGES;
