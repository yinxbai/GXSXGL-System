package com.yxb.gxsx.utils;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.mariadb.jdbc.MariaDbBlob;


/**
 * @author YinXuBai
 * @date 2022-02-12 10:55.
 */
public class MysqlGeneratorUtil {

    public static void main(String[] args) {
        AutoGenerator autoGenerator = new AutoGenerator();

        //全局配置
        GlobalConfig gc = new GlobalConfig();
        String oPath = System.getProperty("user.dir");  //得到当前项目的路径
        gc.setOutputDir(oPath + "/src/main/java");      //生成文件输出根目录
        gc.setOpen(false);                              //生成完成后不弹出文件框
        gc.setFileOverride(true);                       //文件覆盖
        gc.setActiveRecord(false);                      //不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);                       // XML 二级缓存
        gc.setBaseResultMap(true);                      // XML ResultMap
        gc.setBaseColumnList(false);                    // XML columnList
        gc.setAuthor("YinXuBai");                        // 作者

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setControllerName("%sController");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        autoGenerator.setGlobalConfig(gc);

        //2、数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
//        dsc.setDbType(DbType.valueOf("mariadb"));   //设置数据库类型，mariadb
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("org.mariadb.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setUrl("jdbc:mariadb://127.0.0.1:3306/gxsx?characterEncoding=utf-8&useSSL=false&useTimezone=true&serverTimezone=GMT");  //指定数据库
        autoGenerator.setDataSource(dsc);


        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);      // 表名生成策略
        strategy.setInclude("check", "company", "dept", "job",
                "leave", "msg", "student", "teacher", "user", "user");     // 需要生成的表
        strategy.setSuperServiceClass(null);
        strategy.setEntityLombokModel(true);
        strategy.setSuperServiceImplClass(null);
        strategy.setSuperMapperClass(null);
        autoGenerator.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.yxb.gxsx");
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setMapper("mapper");
        pc.setEntity("entity");
        pc.setXml("xml");
        autoGenerator.setPackageInfo(pc);

        //5、执行
        autoGenerator.execute();
    }
}
