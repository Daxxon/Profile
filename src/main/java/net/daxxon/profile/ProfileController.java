package net.daxxon.profile;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {

  @RequestMapping("/")
  public String home(Model model) {
    model.addAttribute("link", "https://www.amazon.com/gp/offer-listing/B073NF9DQY/ref=as_li_tl?ie=UTF8&camp=1789&creative=9325&creativeASIN=B073NF9DQY&linkCode=am2&tag=daxxon-20&linkId=ffcb04be5cfcad8ed044dba5c5f3579d");
    model.addAttribute("imgSrc", "https://ws-na.amazon-adsystem.com/widgets/q?_encoding=UTF8&MarketPlace=US&ASIN=B073NF9DQY&ServiceVersion=20070822&ID=AsinImage&WS=1&Format=_SL160_&tag=daxxon-20");
    model.addAttribute( "imgSrc2", "//ir-na.amazon-adsystem.com/e/ir?t=daxxon-20&l=am2&o=1&a=B073NF9DQY");
    return "home";
  }

}
