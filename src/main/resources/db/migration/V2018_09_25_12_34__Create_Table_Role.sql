CREATE TABLE `t_role` (
`id`               INT AUTO_INCREMENT PRIMARY KEY,
`code`             VARCHAR(255) NOT NULL UNIQUE key,
`name`             VARCHAR(255) NOT NULL UNIQUE key
);