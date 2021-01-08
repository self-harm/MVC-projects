package io.harmed.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
/*we can add @RequestMapping for the class. In order to open any method, we must write /employee/askDetails or /employee/*/
@RequestMapping("/employee")
public class myController {

    @RequestMapping("/")
    public String showFirstView(){
        return "firstView";
    }

    @RequestMapping("askDetails")
    public String askEmployeeDetails(){
        return "ask-emp-details-view";
    }

    /*@RequestMapping("showDetails")
    public String showEmpDetails(){
        return "show-emp-details-view";
    }*/


    /*using of HttpServletRequest for saving in model*/
    /* @RequestMapping("showDetails")
    public String showEmpDetails(HttpServletRequest request, Model model) {

        String empName = request.getParameter("employeeName"); //получаем параметр
        empName = "Mr/Mrs " + empName;
        model.addAttribute("nameAttribute", empName);

        model.addAttribute("description", " - udemy instructor");

        return "show-emp-details-view";
    }*/


    /*using of annotation @RequestParam for saving in model*/
    @RequestMapping("showDetails")
    public String showEmpDetails(@RequestParam("employeeName") String empName
            , Model model) {

   /*     String empName = request.getParameter("employeeName"); //получаем параметр*/
        empName = "Mr/Mrs " + empName;
        model.addAttribute("nameAttribute", empName);

        model.addAttribute("description", " - udemy instructor");

        return "show-emp-details-view";
    }
}
