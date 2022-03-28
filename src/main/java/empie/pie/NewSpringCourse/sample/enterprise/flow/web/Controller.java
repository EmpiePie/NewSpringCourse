package empie.pie.NewSpringCourse.sample.enterprise.flow.web;

import empie.pie.NewSpringCourse.sample.enterprise.flow.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Send response in the right format to the user
@RestController
public class Controller {

    @Autowired
    private BusinessService businessService;

    //"/sum" => 100. Set url.
    @GetMapping("/sum")
    public long displaySum(){
        return businessService.calculateSum();
    }
}

