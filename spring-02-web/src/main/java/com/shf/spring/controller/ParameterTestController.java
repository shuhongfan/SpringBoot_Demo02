package com.shf.spring.controller;

import com.shf.spring.bean.Person;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ParameterTestController {
    @PostMapping("/saveuser")
    public Person saveuser(Person person){

        return person;
    }

    @PostMapping("/save")
    public Map postMethod(@RequestBody String content){
        HashMap<String, Object> map = new HashMap<>();
        map.put("content",content);
        return map;
    }

    @GetMapping("/car/{id}/owner/{username}")
    public Map<String, Object> getcargetControl(
            @PathVariable("id") Integer id,
            @PathVariable("username") String name,
            @PathVariable Map<String, Object> pv,
            @RequestHeader("User-Agent") String userAgent,
            @RequestHeader Map<String, String> headers,
            @RequestParam("age") Integer age,
            @RequestParam("inters") List<String> inters,
            @RequestParam Map<String, String> params,
            @CookieValue("Idea-17a00b0d") String Idea17a00b0d,
            @CookieValue("Idea-17a00b0d") Cookie cookie
            ){
        HashMap<String, Object> map = new HashMap<>();
        map.put("id",id);
        map.put("name",name);
        map.put("pv",pv);
        map.put("headers",headers);
        map.put("age",age);
        map.put("inters",inters);
        map.put("params",params);
        map.put("Idea-17a00b0d",Idea17a00b0d);
        System.out.println(cookie);
        map.put(cookie.getName(),cookie.getValue());
        return map;
    }
}
