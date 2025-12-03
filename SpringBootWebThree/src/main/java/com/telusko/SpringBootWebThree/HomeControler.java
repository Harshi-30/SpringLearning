package com.telusko.SpringBootWebThree;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControler {
    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }
    @RequestMapping("add")
    public String add(int num1 ,int num2, HttpSession session){
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
        int sum = num1 + num2;

        session.setAttribute("Result",sum);
        return "result.jsp";
    }
}
