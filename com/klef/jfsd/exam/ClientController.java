package com.klef.jfsd.exam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClientController {

    // 1. Display a personalized greeting
    @RequestMapping("/greet")
    public String greet(@RequestParam("username") String username, Model model) {
        model.addAttribute("message", "Hello, " + username + "!");
        return "greet";
    }

    // 2. Render the "about" JSP
    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    // 3. Display age and country
    @RequestMapping("/demo1")
    public String demo1(@RequestParam("age") int age, @RequestParam("country") String country, Model model) {
        model.addAttribute("age", age);
        model.addAttribute("country", country);
        return "demo1";
    }

    // 4. Perform subtraction and division
    @RequestMapping("/demo2/{val1}/{val2}")
    public String demo2(@PathVariable int val1, @PathVariable int val2, Model model) {
        model.addAttribute("subtraction", val1 - val2);
        model.addAttribute("division", val1 / val2);
        return "demo2";
    }

    // 5. Display Product Form
    @RequestMapping("/productform")
    public String productForm() {
        return "productform";
    }

    // 6. Multiply two numbers
    @RequestMapping("/multiplyNumbers")
    public String multiplyNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("result", num1 * num2);
        return "multiplyNumbers";
    }

    // 7. Reverse two strings
    @RequestMapping("/reverse")
    public String reverse(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        model.addAttribute("reversedStr1", new StringBuilder(str1).reverse().toString());
        model.addAttribute("reversedStr2", new StringBuilder(str2).reverse().toString());
        return "reverse";
    }

    // 8. Subtract and Add two numbers
    @RequestMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("addition", num1 + num2);
        model.addAttribute("subtraction", num1 - num2);
        return "calculate";
    }
}
