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
    return "Hello, Ramide!!!!!"; 
  }
  
  @RequestMapping("/ramide_branch") 
  public @ResponseBody String greetingRamideBranch() { 
    return "Hello, Ramide! (branch)"; 
  }
  
  @RequestMapping("/Rafael") 
  public @ResponseBody String greetingRafael() { 
    return "Hello, Rafael!"; 
  } 
  
  @RequestMapping("/rafael_branch") 
  public @ResponseBody String greetingRafaelBranch() { 
    return "Hello, Rafael! (branch)"; 
  }
  
  @RequestMapping("/Wadje") 
  public @ResponseBody String greetingWadje() { 
    return "Hello, Wadje!"; 
  }
  	
  @RequestMapping("/wadje_hotfix") 
  public @ResponseBody String greetingHotifix() { 
    return "Hello, Wadje! (hotfix)"; 
  }
  
  @RequestMapping("/Wadje_branch") 
  public @ResponseBody String greetingWadjeBranchatualizada() { 
    return "Hello, Wadje! (branch)"; 
  }
  
  @RequestMapping("/Wadje_fork") 
  public @ResponseBody String greetingWadjeFork() { 
    return "Hello, Wadje! (Fork)"; 
  }

  @RequestMapping("/jose") 
  public @ResponseBody String greetingJose() { 
    return "Hello, José!!"; 
  } 
  
  @RequestMapping("/jose_hotfix") 
  public @ResponseBody String greetingHotfix() { 
    return "Pratica 4 - José!!!"; 
  }

  @RequestMapping("/jose_branch") 
  public @ResponseBody String greetingJoseBranch() { 
    return "Hello, José! (branch)"; 
  }

  @RequestMapping("/jose_fork") 
  public @ResponseBody String greetingJoseFork() { 
    return "José Fork!"; 
  }
  
  @RequestMapping("/carolina")
  public @ResponseBody String greetingCarolina() {
	return "Hello, Carolina!!";
  }
  
  @RequestMapping("/carolina_hotfix") 

  public @ResponseBody String greetingCarolinaHotfix() {

    return "Pratica 4 - Carolina!!"; 
  }
  

  @RequestMapping("/carolina_branch") 

  public @ResponseBody String greetingCarolinaBranch() {

    return "Hello, Branch!!"; 
  }
  
  @RequestMapping("/carolina_fork") 

  public @ResponseBody String greetingCarolinaFork() {

    return "Hello, Fork!!"; 
  }
  
  @RequestMapping("/carla")
  public @ResponseBody String greetingCarla() 
  { return "Hello, Carla Maria!";
  
  }
  
}  