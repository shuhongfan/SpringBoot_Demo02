package com.shf.boot.config;

import com.shf.boot.bean.Pet;
import com.shf.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 配置类=配置文件
public class MyConfig {
    //    给容器添加组件,以返回为名作为组件id,返回类型就是组件类型
    @Bean
    public User user01() {
        return new User("zhangsan", 28);
    }

    @Bean(value = "tom")
    public Pet tomcatPet() {
        return new Pet("tomcat",5.5);
    }
}
