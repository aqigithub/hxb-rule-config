package com.hxb.test;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

/**
 * @author: 小红红
 * @create: 2022-09-08 20:56
 * @description: 代码自动生成器
 **/
public class MybatisPlusAutoCode {

    //    public static void main(String[] args) {
    @Test
    public void demo1() {
        //构建代码自动生成器对象
        AutoGenerator autoGenerator = new AutoGenerator();
        //配置自动生成策略

        // 1、全局配置：
        //https://baomidou.com/config/generator-config.html#%E5%85%A8%E5%B1%80%E7%AD%96%E7%95%A5-globalconfig-%E9%85%8D%E7%BD%AE
        GlobalConfig gc = new GlobalConfig();

        String projectPath = System.getProperty("user.dir");   //获取当前项目所在目录
        gc.setOutputDir(projectPath + "/src/main/java");         //自定义代码生成后的存放目录
        gc.setAuthor("赵长红");                            //设置项目作者
        gc.setDateType(DateType.ONLY_DATE);                //自定义日期类型
        gc.setOpen(false);                                     //代码生成后是否打开文件夹
        gc.setFileOverride(false);                             //是否覆盖
        gc.setServiceName("%sService");                        //去Service的I前缀
//        gc.setIdType(IdType.ID_WORKER);                        //自定义主键生成策略
        gc.setSwagger2(true);                                  //实体使用swagger2注解

        autoGenerator.setGlobalConfig(gc);                     //添加全局配置
        //2、设置数据源:
        // https://baomidou.com/config/generator-config.html#%E6%95%B0%E6%8D%AE%E6%BA%90-datasourceconfig-%E9%85%8D%E7%BD%AE
        DataSourceConfig dsc = new DataSourceConfig();
//		dsc.setUrl("jdbc:oracle:thin:@127.0.0.1:1521:orcl");
        dsc.setUrl("jdbc:mysql://39.103.155.89:3066/guizedb");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("sinodata");
        dsc.setDbType(DbType.MYSQL);                          //指定数据库类型

        autoGenerator.setDataSource(dsc);                     //添加数据源配置
        //3、包名配置:
        // https://baomidou.com/config/generator-config.html#%E5%8C%85%E5%90%8D%E9%85%8D%E7%BD%AE
        PackageConfig pc = new PackageConfig();
//        pc.setModuleName("rbac");                             //指定生成的模块名称
        pc.setParent("com.hxb.rulesConfig");                            //设置模块中的父目录名
        pc.setEntity("entity");                               //设置实体类目录名
        pc.setMapper("mapper");
        pc.setServiceImpl("");
        pc.setService("");                             //设置service目录名
        pc.setController("");                       //设置controller目录名

        autoGenerator.setPackageInfo(pc);
        //4、数据库表配置:
        // https://baomidou.com/config/generator-config.html#%E6%95%B0%E6%8D%AE%E5%BA%93%E8%A1%A8%E9%85%8D%E7%BD%AE
        StrategyConfig strategy = new StrategyConfig();
        // 设置要生成的实体类对应映射的表名
        String[] strings = new String[]{"RULE_AUTH"};
        strategy.setInclude(strings);
//        strategy.setTablePrefix("T_");                       //去除表名前缀
        //设置表名生成策略，下划线转驼峰
        strategy.setNaming(NamingStrategy.underline_to_camel);
        //设置列名生成策略，下划线转驼峰
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);                 //自动lombok；
//        strategy.setLogicDeleteFieldName("deleted");         //设置使用逻辑删除策略的属性名
        // 自动填充配置 TableFill
//        TableFill gmtCreate = new TableFill("gmt_create", FieldFill.INSERT);
//        TableFill gmtModified = new TableFill("gmt_modified", FieldFill.INSERT_UPDATE);
//        ArrayList<TableFill> tableFills = new ArrayList<>();
//        tableFills.add(gmtCreate);
//        tableFills.add(gmtModified);
//        strategy.setTableFillList(tableFills);
//        strategy.setVersionFieldName("version");             // 乐观锁
        strategy.setRestControllerStyle(true);               //生成 @RestController 控制器
//        strategy.setControllerMappingHyphenStyle(true);      //驼峰转连字符--->localhost:8080/hello_id_2
        autoGenerator.setStrategy(strategy);
        //执行自动生成
        autoGenerator.execute();
    }
}
