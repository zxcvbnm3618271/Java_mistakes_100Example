package solve.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class applyController {

  @RequestMapping()
  public ModelAndView hello(Model model, HttpServletRequest request){
    return new ModelAndView("index");
  }
}
