CREATE TABLE `t_privilege` (
`id`               INT AUTO_INCREMENT PRIMARY KEY,
`code`             VARCHAR(255) NOT NULL UNIQUE key,
`name`             VARCHAR(255) NOT NULL UNIQUE key
);