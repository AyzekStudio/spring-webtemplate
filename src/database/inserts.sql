
INSERT INTO user (`username`,`passwd`,`first_name`,`last_name`,`phone`,`email`)
VALUES ('jmora','$2a$04$jJqiyz2XUVfU6mpYIcvPeeMnyjAx5PSL4TyXLUvS6mzljlzE6BOqW','Jose ','Mora',NULL,'dasda');
INSERT INTO user (`username`,`passwd`,`first_name`,`last_name`,`phone`,`email`)
VALUES ('otto','$2a$04$jJqiyz2XUVfU6mpYIcvPeeMnyjAx5PSL4TyXLUvS6mzljlzE6BOqW','Pablo','Vargas',NULL,'w1esad');

INSERT INTO user_roles (username, role)
VALUES ('jmora', 'ROLE_USER');
INSERT INTO user_roles (username, role)
VALUES ('jmora', 'ROLE_ADMIN');
INSERT INTO user_roles (username, role)
VALUES ('otto', 'ROLE_USER');