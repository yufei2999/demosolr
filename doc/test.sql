CREATE DATABASE;

USE `db`;

DROP TABLE IF EXISTS `test`;

CREATE TABLE `test` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `content` varchar(500) DEFAULT NULL COMMENT '内容',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

insert  into `test`(`id`,`content`,`create_time`) values (1,'content1','2016-12-09 18:20:03'),(2,'content2','2016-12-09 18:20:05'),(3,'content3','2016-12-09 18:20:08'),(4,'content4','2016-12-12 17:47:36'),(5,'content5','2016-12-12 17:47:39');
