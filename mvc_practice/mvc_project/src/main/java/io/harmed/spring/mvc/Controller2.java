package io.harmed.spring.mvc;

/*alternative version of controller; using forms (input/select etc)*/

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    public String askEmployeeDetails(Model model){

        Employee emp = new Employee();
        emp.setName("Kseniia");
        emp.setSurname("Lebedeva");
        emp.setSalary(99999);
        model.addAttribute("employee", emp);

        return "ask-emp-details-view";
    }


    /*using of annotation @RequestParam for saving in model*/
    @RequestMapping("showDetails")
    public String showEmpDetails(@ModelAttribute("employee") Employee employee) {

        return "show-emp-details-view";
    }
}
