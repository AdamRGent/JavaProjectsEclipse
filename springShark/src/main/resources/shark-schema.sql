DROP TABLE IF EXISTS `shark` CASCADE;
create table `shark` (`id` BIGINT PRIMARY KEY AUTO_INCREMENT , 
`age` integer check (age>=1 AND age<=90), `gender` varchar(255), 
`name` varchar(255) not null)
