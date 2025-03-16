package com.sp.main.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sp.main.entities.User;
import com.sp.main.services.UserService;



@Controller
public class OrderController {

    @Autowired
    private UserService userService;

    @PostMapping("/confirmOrder")
    public String confirmOrder(
            @RequestParam String customerName,
            @RequestParam String address,
            @RequestParam String email,
            @RequestParam String phoneNumber,
            @RequestParam String item,
            @RequestParam int quantity,
            @RequestParam double totalPrice,
            Model model) {

        User user = new User();
        user.setName(customerName);
        user.setAddress(address);
        user.setEmail(email);
        user.setPhonenum(phoneNumber);
        user.setItem(item);
        user.setQuantity(quantity);
        user.setTotalPrice(totalPrice);

        userService.Saveorders(user);

//        redirectAttributes.addFlashAttribute("successMessage", "Order placed successfully!");
       model.addAttribute("user", user);
        
        return "bill";
    }
}
