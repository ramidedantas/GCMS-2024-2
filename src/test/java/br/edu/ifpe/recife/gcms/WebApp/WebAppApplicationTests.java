package br.edu.ifpe.recife.gcms.WebApp; 
 
import org.junit.jupiter.api.Test; 
import org.springframework.boot.test.context.SpringBootTest; 
 
import static org.hamcrest.Matchers.containsString; 
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get; 
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status; 
 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc; 
import org.springframework.test.web.servlet.MockMvc; 
 
@SpringBootTest 
@AutoConfigureMockMvc 
class WebAppApplicationTests { 
 
  @Autowired 
  private MockMvc mockMvc; 
 
  @Test 
  public void shouldReturnDefaultMessage() throws Exception { 
    this.mockMvc.perform(get("/")) 
        .andDo(print()).andExpect(status().isOk()) 
        .andExpect(content() 
          .string(containsString("Hello, World!"))); 
  }
  
  @Test 
  public void shouldReturnRamide() throws Exception { 
    this.mockMvc.perform(get("/ramide")) 
        .andDo(print()).andExpect(status().isOk()) 
        .andExpect(content() 
          .string(containsString("Hello, Ramide!"))); 
  } 
  
  @Test 
  public void shouldReturnRafael() throws Exception { 
    this.mockMvc.perform(get("/Rafael")) 
    .andDo(print()).andExpect(status().isOk()) 
    .andExpect(content() 
    .string(containsString("Hello, Rafael!"))); 
  } 
  
  @Test 
  public void shouldReturnJose() throws Exception { 
    this.mockMvc.perform(get("/jose")) 
        .andDo(print()).andExpect(status().isOk()) 
        .andExpect(content() 
          .string(containsString("Hello, José!!"))); 
  } 
  
  @Test 
  public void shouldReturnHotfix() throws Exception { 
    this.mockMvc.perform(get("/jose_hotfix")) 
        .andDo(print()).andExpect(status().isOk()) 
        .andExpect(content() 
          .string(containsString("Pratica 4 - José!!!"))); 
  } 
  
  @Test 
  public void shouldReturnJoseBranch() throws Exception { 
    this.mockMvc.perform(get("/jose_branch")) 
        .andDo(print()).andExpect(status().isOk()) 
        .andExpect(content() 
          .string(containsString("Hello, José! (branch)"))); 
  } 
  
  @Test 
  public void shouldReturnJoseFork() throws Exception { 
    this.mockMvc.perform(get("/jose_fork")) 
        .andDo(print()).andExpect(status().isOk()) 
        .andExpect(content() 
          .string(containsString("José Fork!"))); 
  } 
  
  @Test 
  public void shouldReturnCarolina() throws Exception { 
    this.mockMvc.perform(get("/carolina")) 
        .andDo(print()).andExpect(status().isOk()) 
        .andExpect(content() 
          .string(containsString("Hello, Carolina!!"))); 
  } 

  @Test 
  public void shouldReturnCarolinaHotfix() throws Exception { 
    this.mockMvc.perform(get("/carolina_hotfix")) 
        .andDo(print()).andExpect(status().isOk()) 
        .andExpect(content() 
          .string(containsString("Pratica 4 - Carolina!!"))); 
  } 
 
  @Test 
  public void shouldReturnCarolinaBranch() throws Exception { 
    this.mockMvc.perform(get("/carolina_branch")) 
        .andDo(print()).andExpect(status().isOk()) 
        .andExpect(content() 
          .string(containsString("Hello, Branch!!"))); 
  }
  
  @Test 
  public void shouldReturnCarolinaFork() throws Exception { 
    this.mockMvc.perform(get("/carolina_fork")) 
        .andDo(print()).andExpect(status().isOk()) 
        .andExpect(content() 
          .string(containsString("Hello, Fork!!"))); 
  }
  

  @Test 
  public void shouldReturnCarla() throws Exception { 
    this.mockMvc.perform(get("/carla")) 
        .andDo(print()).andExpect(status().isOk()) 
        .andExpect(content() 
          .string(containsString("Hello, Carla!"))); 
  } 
  @Test 
  public void shouldReturnCarlaFork() throws Exception { 
    this.mockMvc.perform(get("/carla_fork")) 
        .andDo(print()).andExpect(status().isOk()) 
        .andExpect(content() 
          .string(containsString("Hello, Carla!"))); 
  } 
  @Test 
  public void shouldReturnCarlaHotfix() throws Exception { 
    this.mockMvc.perform(get("/carla_hotfix")) 
        .andDo(print()).andExpect(status().isOk()) 
        .andExpect(content() 
          .string(containsString("Carla, hotfix, pratica 04!"))); 
  } 

  @Test 
  public void shouldReturnLucas() throws Exception { 
    this.mockMvc.perform(get("/lucas")) 
        .andDo(print()).andExpect(status().isOk()) 
        .andExpect(content() 
          .string(containsString("Hello, Lucas!"))); 
  } 
}  