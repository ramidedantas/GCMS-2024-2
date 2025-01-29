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
    return "Hello, Ramide!!!"; 
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
<<<<<<< HEAD
  
  @RequestMapping("/Wadje") 
  public @ResponseBody String greetingWadje() { 
    return "Hello, Wadje!"; 
  }
  	
  @RequestMapping("/hotfix") 
  public @ResponseBody String greetingHotifix() { 
    return "Hello, Wadje! (hotfix)"; 
  }
  
  @RequestMapping("/Wadje_branch") 
  public @ResponseBody String greetingWadjeBranchatualizada() { 
    return "Hello, Wadje! (branch)"; 
  }
  	
=======

  @RequestMapping("/hotfix") 
  public @ResponseBody String greetingHotfix() { 
    return "Pratica 4 - José!!!"; 
  }

  @RequestMapping("/jose_branch") 
  public @ResponseBody String greetingJoseBranch() { 
    return "Hello, José! (branch)"; 
  }

  @RequestMapping("/wadje") 
  public @ResponseBody String greetingwadje() { 
    return "Hello, Wadje!"; 
  }
}  