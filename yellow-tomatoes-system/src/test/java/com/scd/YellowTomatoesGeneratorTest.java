package com.scd;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YellowTomatoesGeneratorTest {

    @Test
    public void test() {
        AutoGenerator mpg = new AutoGenerator();

        mpg.setTemplateEngine(new FreemarkerTemplateEngine());

        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("scd");   // 作者
        gc.setOpen(false);      //生成代码后是否打开文件夹
        gc.setServiceName("%sService");  // 设置Service接口生成名称,这样生成接口前面就不会有 I
        mpg.setGlobalConfig(gc);

        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/yshop?useUnicode=true&serverTimezone=GMT&useSSL=false&characterEncoding=utf8");
        dsc.setDriverName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
        dsc.setUsername("root");
        dsc.setPassword("542846492");
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("sys"); // 模块名称, 这里可以根据不同模块来写
        pc.setParent("com.scd.yellowtomatoessystem.modules"); // 父包名
        mpg.setPackageInfo(pc);



        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//        strategy.setSuperControllerClass("com.lcy.demo.sys.controller.BaseController");
//        strategy.setSuperEntityClass("com.lcy.demo.sys.entity.BaseEntity");
        strategy.setEntityLombokModel(true);
        strategy.setInclude("user");  // 如果要生成多个,这里可以传入String[]
        mpg.setStrategy(strategy);
        mpg.execute();

    }
}
