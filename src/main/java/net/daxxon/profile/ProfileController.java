package net.daxxon.profile;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {

  @RequestMapping("/")
  public String home(Model model) {
    return "home";
  }

}
