package qaq.pcd.controller;


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
		return "templates_2/administrator_page";
	}

	@GetMapping("/manage_code")
	public String Manage_code(Model model) {
       
		return "templates_2/manage_code";
	}
	@GetMapping("/modify")
	public String Modify(Model model) {
       
		return "templates_2/modify";
		
	}
	@GetMapping("/manage_project")
	public String Manage_project(Model model) {
       
		return "manage_project";
	}
	@GetMapping("/manage_team")
	public String Manage_team(Model model) {
       
		return "templates_2/manage_team";
	}
	@GetMapping("/update_coder")
	public String Update_coder(Model model) {
       
		return "templates_2/update_coder";
	}
	@GetMapping("/luanch_document")
	public String Luanch_Document(Model model) {
       
		return "templates_2/luanch_document";
	}
	@GetMapping("/manage_meeting")
	public String Manage_meeting(Model model) {
       
		return "templates_2/manage_meeting";
	}
	@GetMapping("/maintain_code")
	public String Maintain_code(Model model) {
       
		return "templates_2/maintain_code";
	}

	@GetMapping("/search_info")
	public String Search_info(Model model) {
       
		return "templates_2/search_info";
	}

	@GetMapping("/modify_info")
	public String Modify_info(Model model) {
       
		return "templates_2/modify_info";
	}

	@GetMapping("/add_info")
	public String Add_info(Model model) {
       
		return "templates_2/add_info";
	}

	@GetMapping("delete_info")
	public String Delete_info(Model model) {
       
		return "templates_2/delete_info";
	}
	

}