package co.team.trainer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.team.trainer.service.TrainerService;
import co.team.trainer.service.TrainerVO;

@Controller
public class TrainerController {

	@Autowired
	TrainerService service;
//	@ResponseBody
//	@GetMapping
	@RequestMapping("/getTrainer")
	public String getTrainer(TrainerVO vo, Model model){
		model.addAttribute("list", service.getTrainer(vo));
		return	"program/product/productWrite";
	}
	
	
	@GetMapping("/trainerWrite")
	public String TrainerWriteForm(TrainerVO vo, Model model){
		return	"program/product/productWrite";
	}
	
	@PostMapping("/trainerWrite")
	public String TrainerWrite(TrainerVO vo, Model model){
		service.trainerInsert(vo);
		return	"redirect:/productManagement";
	}
	
	
	
	@PostMapping("/trainerDelete")
	@ResponseBody
	public int trainerDelete(TrainerVO vo) {
		
		return service.trainerDelete(vo);
		
	}
	
	
	
}



//@RequestMapping("/productManagement")
//public String productManagement(MypageVO vo){
//	return "mypage/productManagement";
//}
