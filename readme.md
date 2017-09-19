# Generator使用方法
先执行 git clone http://git.mogo.com/daiderong/mogo-mybaits-gen.git,然后用idea打开项目，执行生成类文件的工具类就可以了。
1. 能够生成单表相关的Mapper.xml，Entity，Dao相关的方法
2. 必须连接mysql方能自动生成
3. 生成类为com.ibatis.tools.autogen.Gen.java
4. 数据库配置文件在resources/config/db.properties
5. 生成的类在：项目根目录的：gendir
6. 将生成的类，按需求copy入自己的项目
7. 生成工作结束
