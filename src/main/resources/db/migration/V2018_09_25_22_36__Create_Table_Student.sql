CREATE TABLE `t_student` (
`id`               INT AUTO_INCREMENT PRIMARY KEY,
`name`             VARCHAR(255) NOT NULL UNIQUE key,
`age`              INT,
`height`           DOUBLE(4,1)
);