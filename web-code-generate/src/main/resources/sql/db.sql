SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for code_config
-- ----------------------------
DROP TABLE IF EXISTS `code_config`;
CREATE TABLE `code_config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `main_path` varchar(100) DEFAULT NULL COMMENT '路径',
  `package_name` varchar(100) DEFAULT NULL COMMENT '包名',
  `module_name` varchar(100) DEFAULT NULL COMMENT '模块名',
  `author` varchar(100) DEFAULT NULL COMMENT '作者',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱地址',
  `table_prefix` varchar(50) DEFAULT NULL COMMENT '表名前缀',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='代码自动生成配置';

-- ----------------------------
-- Records of code_config
-- ----------------------------
BEGIN;
INSERT INTO `code_config` VALUES (1, 'com', 'io.renren.modules', 'generator', 'shizhen', 'shizhen@wulingd.com', 't_');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
