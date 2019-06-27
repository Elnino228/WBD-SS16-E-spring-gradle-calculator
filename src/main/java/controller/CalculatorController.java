package controller;

import model.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public ModelAndView home(){
        ModelAndView modelAndView=new ModelAndView("index","calculator",new Calculator());
        return modelAndView;
    }

    @PostMapping("/calculate")
    public ModelAndView calculate(@ModelAttribute("calculator")Calculator calculator, @RequestParam("operator") String operator){
        double result;
        switch (operator){
            case "+":
                result=Double.parseDouble(calculator.getFirstOperand())+Double.parseDouble(calculator.getSecondOperand());
                calculator.setResult(Double.toString(result));
                break;
            case "-":
                result=Double.parseDouble(calculator.getFirstOperand())-Double.parseDouble(calculator.getSecondOperand());
                calculator.setResult(Double.toString(result));
                break;
            case "x":
                result=Double.parseDouble(calculator.getFirstOperand())*Double.parseDouble(calculator.getSecondOperand());
                calculator.setResult(Double.toString(result));
                break;
            case "/":
                if (Double.parseDouble(calculator.getSecondOperand())==0){
                    calculator.setResult("Can not divide by 0");
                } else{
                    result=Double.parseDouble(calculator.getFirstOperand())/Double.parseDouble(calculator.getSecondOperand());
                    calculator.setResult(Double.toString(result));
                }
                break;
        }
        ModelAndView modelAndView= new ModelAndView("index","calculator",calculator);
        return modelAndView;
    }
//    public String calculate(@RequestParam("firstOperand") String firstOperand,@RequestParam("secondOperand") String secondOperand,@RequestParam("operator") String operator, Model model){
//
//        Double result=0.0;
//        switch (operator){
//            case "Addition(+)":
//                result=Double.parseDouble(firstOperand)+Double.parseDouble(secondOperand);
//                break;
//            case "Subtraction(-)":
//                result=Double.parseDouble(firstOperand)-Double.parseDouble(secondOperand);
//                break;
//            case "Multiplication(x)":
//                result=Double.parseDouble(firstOperand)*Double.parseDouble(secondOperand);
//                break;
//            case "Division(/)":
//                result=Double.parseDouble(firstOperand)/Double.parseDouble(secondOperand);
//                break;
//        }
//        model.addAttribute("result",result);
//        return "index";
//    }
}
