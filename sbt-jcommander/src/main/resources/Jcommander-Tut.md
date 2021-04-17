# Jcommander 练习教程

## 参考资料

[jcommnader+springboot+自定义starter](https://github.com/rupert-madden-abbott/jcommander-spring-boot-starter)

## 重要知识点

```textmate
1.maven打包
    需要考虑编译、打包(分开、正常整包/SpringBoot整包、是不是需要跳过测试代码、资源、源码)

2.测试代码扫描覆盖范围
    @Slf4j
    //@SpringBootTest
    @SpringBootApplication(scanBasePackages = {"com.sbt.jcommander.comp"})
    @RunWith(SpringRunner.class)
    public class MainTest {
        @Test
        public void test() {
            log.error("测试代码是够被打印");
        }
    }

3.logbak需要从新设计
    
```