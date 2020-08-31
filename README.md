# springboot整合mybatis框架实现增删改查
## 用户表User
-------------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(30) DEFAULT NULL COMMENT '姓名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'Jone', '18', 'test1@baomidou.com');
INSERT INTO `user` VALUES ('2', 'Jack', '20', 'test2@baomidou.com');
INSERT INTO `user` VALUES ('3', 'Tom', '28', 'test3@baomidou.com');
INSERT INTO `user` VALUES ('4', 'Sandy', '21', 'test4@baomidou.com');
INSERT INTO `user` VALUES ('5', 'Billie', '24', 'test5@baomidou.com');
INSERT INTO `user` VALUES ('6', 'xiaohua', '45', '1174320669@qq.com');
INSERT INTO `user` VALUES ('7', 'zhangsi', '18', '156568989@163.com');
INSERT INTO `user` VALUES ('11', 'wanger02', '15', '4588666121@163.com');
INSERT INTO `user` VALUES ('12', 'wanger02', '15', '4588666121@163.com');s