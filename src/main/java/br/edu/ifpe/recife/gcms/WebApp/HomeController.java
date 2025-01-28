package br.edu.ifpe.recife.gcms.WebApp; 
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 
 
@Controller 
public class HomeController { 
 
  @RequestMapping("/") 
  public @ResponseBody String greeting() { 
    return "Hello, World!!"; 
  }
  
  @RequestMapping("/ramide") 
  public @ResponseBody String greetingRamide() { 
    return "Hello, Ramide!"; 
  }
  
  @RequestMapping("/ramide_branch") 
  public @ResponseBody String greetingRamideBranch() { 
    return "Hello, Ramide! (branch)"; 
  }
  
  @RequestMapping("/Rafael") 
  public @ResponseBody String greetingRafael() { 
    return "Hello, Rafael!"; 
  } 
  
  @RequestMapping("/jose") 
  public @ResponseBody String greetingJose() { 
    return "Hello, José!!"; 
  } 

  @RequestMapping("/rafael_branch") 
  public @ResponseBody String greetingRafaelBranch() { 
    return "Hello, Rafael! (branch)"; 
  }

  @RequestMapping("/hotfix") 
  public @ResponseBody String greetingHotfix() { 
    return "Pratica 4 - José!!!"; 
  }
}  