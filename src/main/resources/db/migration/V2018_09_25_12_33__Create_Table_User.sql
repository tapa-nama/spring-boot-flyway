CREATE TABLE `t_user` (
`id`               INT AUTO_INCREMENT PRIMARY KEY,
`name`             VARCHAR(255) NOT NULL UNIQUE key,
`telephone_number` VARCHAR(255) NOT NULL UNIQUE key,
`password`         VARCHAR(255) NOT NULL
);