CREATE DATABASE;

USE `db`;

/*Table structure for table `test` */

DROP TABLE IF EXISTS `test`;

CREATE TABLE `test` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(100) DEFAULT NULL COMMENT '标题',
  `content` varchar(500) DEFAULT NULL COMMENT '内容',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `test` */

insert  into `test`(`id`,`title`,`content`,`create_time`) values (1,'中华人民共和国','content1','2016-12-09 18:20:03'),(2,'中国共产党','content2','2016-12-09 18:20:05'),(3,'人民大会堂','content3','2016-12-09 18:20:08'),(4,'人民英雄纪念碑','content4','2016-12-12 17:47:36'),(5,'毛主席纪念堂','content5','2016-12-12 17:47:39');