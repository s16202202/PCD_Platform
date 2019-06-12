package qaq.pcd;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	 
	@GetMapping("/")
	public String test() {
		return "login";
	}

	@GetMapping("/login")
	public String login(Model model) {
     
		
		return "administrator_page";
	}

	@GetMapping("/manage_code")
	public String Manage_code(Model model) {
       
		return "manage_code";
	}
	@GetMapping("/modify")
	public String Modify(Model model) {
       
		return "modify";
		
	}
	@GetMapping("/manage_project")
	public String Manage_project(Model model) {
       
		return "manage_project";
	}
	@GetMapping("/manage_team")
	public String Manage_team(Model model) {
       
		return "manage_team";
	}
	@GetMapping("/update_coder")
	public String Update_coder(Model model) {
       
		return "update_coder";
	}
	@GetMapping("/luanch_document")
	public String Luanch_Document(Model model) {
       
		return "luanch_document";
	}
	@GetMapping("/manage_meeting")
	public String Manage_meeting(Model model) {
       
		return "manage_meeting";
	}
	@GetMapping("/maintain_code")
	public String Maintain_code(Model model) {
       
		return "maintain_code";
	}

	@GetMapping("/search_info")
	public String Search_info(Model model) {
       
		return "search_info";
	}

	@GetMapping("/modify_info")
	public String Modify_info(Model model) {
       
		return "modify_info";
	}

	@GetMapping("/add_info")
	public String Add_info(Model model) {
       
		return "add_info";
	}

	@GetMapping("delete_info")
	public String Delete_info(Model model) {
       
		return "delete_info";
	}
	

}