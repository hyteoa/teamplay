package co.team.course.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.team.course.service.CourseRequestVO;
import co.team.course.service.CourseService;
import co.team.course.service.Course_Info_VO;
import co.team.course.service.Course_TuitionVO;
import co.team.course.service.impl.CourseMapper;
import co.team.trainer.service.TrainerService;
import co.team.trainer.service.TrainerVO;

@Controller
public class CourseController {

	@Autowired
	CourseService courseService;
	@Autowired
	TrainerService trService;
	@Autowired 
	CourseMapper courseMapper;
//	@ResponseBody
//	@GetMapping

	// 강습정보페이지
	@RequestMapping("/productManagement")
	public String getSearchCourse(Course_Info_VO vo, Model model) {
		model.addAttribute("list", courseService.getCourse(vo));

		return "program/product/productManagement";
	}

	// 강습등록폼
	@GetMapping("/productWrite")
	public String productWriteForm(Course_Info_VO vo, Model model, Course_TuitionVO vo1, TrainerVO vo2,
			CourseRequestVO req) {

		model.addAttribute("tuit", courseService.getCourse_Tuition(vo1));
		model.addAttribute("train", trService.getTrainer(vo2));
		return "program/product/productWrite";
	}

	// 강습등록
	@RequestMapping("/productWrite")
	public String productWrite( Course_Info_VO vo, Course_TuitionVO tvo){
		System.out.println(vo);
		System.out.println(tvo.getTulist().get(0).getTuition_title());
//		courseService.productInsert(vo);
//		courseService.productInserts(tvo.getTulist().get(0).getTuition_title());
		for

		return "redirect:/productManagement";
	}

}

//@RequestMapping("/productManagement")
//public String productManagement(MypageVO vo){
//	return "mypage/productManagement";
//}
