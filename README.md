# springboot-redis-mybatis
###redis实现mybatis的二级缓存
#### springboot 2.0.1.RELEASE
###关键点：

1.自己实现的二级缓存，必须要有一个带id的构造函数，否则会报错。
2.我们使用Spring封装的redisTemplate来操作Redis。
  网上所有介绍redis做二级缓存的文章都是直接用jedis库，
  但是个人认为这样不够Spring Style，而且，redisTemplate封装了底层的实现，
  未来如果我们不用jedis了，我们可以直接更换底层的库，而不用修改上层的代码。
  更方便的是，使用redisTemplate，我们不用关心redis连接的释放问题，
  否则新手很容易忘记释放连接而导致应用卡死。
3.需要注意的是，这里不能通过autowire的方式引用redisTemplate，
  因为RedisCache并不是Spring容器里的bean。
  所以我们需要手动地去调用容器的getBean方法来拿到这个bean，
  具体的实现方式请参考Github中的代码。
4.我们采用的redis序列化方式是默认的jdk序列化。
  所以数据库的查询对象（比如Product类）需要实现Serializable接口。