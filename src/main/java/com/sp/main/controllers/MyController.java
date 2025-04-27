//
//package com.sp.main.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.sp.main.entities.User;
//import com.sp.main.services.UserService;
//
//@Controller
//@RequestMapping("/order")
//public class MyController {
////	@GetMapping("/order")
////	 public String openOrderPage(Model model) {
////		
////		model.addAttribute("user", new User());
////		 return"order";
////	 }
//	
//	
////	@PostMapping("/confirmOrder")
////	public String ConfirmOrder() {
////		return "";
////	}
//	
//    @Autowired
//    private UserService userService;
//
//	@GetMapping
//	 public String openOrderPage() {
//
//		 return"order";
//	 }
//	}
//	
//
////
////
////	    @PostMapping//("confirmOrder")
////	    public String confirmOrder(
////	            @RequestParam String customerName,
////	            @RequestParam String address,
////	            @RequestParam String email,
////	            @RequestParam String phoneNumber,
////	            @RequestParam String item,
////	            @RequestParam int quantity,
////	            @RequestParam double totalPrice,
////	            Model model) {
////
////	        User user = new User();
////	        user.setName(customerName);
////	        user.setAddress(address);
////	        user.setEmail(email);
////	        user.setPhonenum(phoneNumber);
////	        user.setItem(item);
////	        user.setQuantity(quantity);
////	        user.setTotalPrice(totalPrice);
////
////	        userService.Saveorders(user);
////
//////	        redirectAttributes.addFlashAttribute("successMessage", "Order placed successfully!");
////	       model.addAttribute("user", user);
////	        
////	        return "bill";
////	    }
////
////}
//
//
////
////    // Handle order confirmation from form
////    @PostMapping("/confirm")
////    public String confirmOrder(
////            @RequestParam String customerName,
////            @RequestParam String address,
////            @RequestParam String email,
////            @RequestParam String phoneNumber,
////            @RequestParam String item,
////            @RequestParam int quantity,
////            @RequestParam double totalPrice,
////            Model model) {
////
////        User user = new User();
////        user.setName(customerName);
////        user.setAddress(address);
////        user.setEmail(email);
////        user.setPhonenum(phoneNumber);
////        user.setItem(item);
////        user.setQuantity(quantity);
////        user.setTotalPrice(totalPrice);
////
////        userService.Saveorders(user);
////
////        model.addAttribute("user", user);
////        return "bill"; // JSP: /WEB-INF/views/bill.jsp
////    }
////
////    // REST API endpoint for testing with Postman or Insomnia
////    @PostMapping("/api")
////    @ResponseBody
////    public String confirmOrderApi(
////            @RequestParam String customerName,
////            @RequestParam String address,
//
//
