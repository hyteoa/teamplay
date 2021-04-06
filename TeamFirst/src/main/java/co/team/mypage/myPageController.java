package co.team.mypage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.team.reservation.service.ReservationService;

@Controller
public class myPageController {

	@Autowired
	ReservationService service;
	
	@RequestMapping("/mypageMain")
	public String myPageMain(MypageVO vo){
		return "mypage/mypageMain";
	}
	
	@RequestMapping("/myMebers")
	public String myMebers(MypageVO vo){
		return "mypage/myMebers";
	}
	
	@RequestMapping("/memberList")
	public String memberList(MypageVO vo){
		return "mypage/memberList";
	}
	
	@RequestMapping("/addMembers")
	public String addMembers(MypageVO vo){
		return "mypage/addMembers";
	}
	
	@RequestMapping("/refundMembers")
	public String refundMembers(MypageVO vo){
		return "mypage/refundMembers";
	}
	
	
	
}
