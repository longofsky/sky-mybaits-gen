# Generator使用方法
先执行 git clone http://git.mogo.com/daiderong/mogo-mybaits-gen.git,然后用idea打开项目，执行生成类文件的工具类就可以了。
1. 能够生成单表相关的Mapper.xml，Entity，Dao相关的方法
2. 必须连接mysql方能自动生成
3. 生成类为com.ibatis.tools.autogen.Gen.java
4. 数据库配置文件在resources/config/db.properties
5. 生成的类在：项目根目录的：gendir
6. 将生成的类，按需求copy入自己的项目
7. 生成工作结束

# 按公司全名及目录结构生成 （2017年9月28日 By 梧桐）
		
1. db.properties 将java_package已改成dao_package 只需要定义到dao的包名即可

2.  resources/config 下增加4个模板类 分别是是对应的entity,Mapper，DAO,DAOImpl四个类，将一气呵成，直接按公司的命名称及结构目录生成，将直接生成4个类
    
 目录结构如下(service目录以上已忽略)

      |-service
        |-dao
          |-api
            |-AbcDAO.java
          |-entity
            |-AbcEntity.java      
          |-impl
            |-mapper
              |-AbcMapper.java
            |-AbcDAOImpl.java  

3. Mapper.xml 查询中主表加入别名 “tb1”（也没想到好的别名，抱歉）	  
	 
    

