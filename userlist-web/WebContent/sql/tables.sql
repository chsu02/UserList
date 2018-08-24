CREATE TABLE `dev`.`Users` (
  `id` INT NOT NULL,
  `userid` VARCHAR(30) NULL,
  `firstname` VARCHAR(50) NULL,
  `lastname` VARCHAR(50) NULL,
  `email` VARCHAR(30) NULL,
  `contactNo` VARCHAR(30) NULL,
  `phoneno_home` VARCHAR(30) NULL,
  `phoneno_work` VARCHAR(30) NULL,
  `phoneno_cell` VARCHAR(30) NULL,
  `photo` BLOB NULL,
  PRIMARY KEY (`id`));

INSERT INTO `dev`.`users` (`id`, `userid`, `firstname`, `lastname`) VALUES ('1', 'alexhsu', 'Alex', 'Hsu');
INSERT INTO `dev`.`users` (`id`, `userid`, `firstname`, `lastname`) VALUES ('2', 'angelhsu', 'Angel', 'Hsu');
