package co.team.spring.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.team.spring.board.service.AdminNoticeBoardVO;
import co.team.spring.board.service.impl.AdminNoticeBoardMapper;

@Controller
public class BoardController {
	
	//전체조회
	@Autowired AdminNoticeBoardMapper boardMapper;
	@RequestMapping("/getAdminNoticeBoardList")
	public String getAdminNoticeBoardList(Model model) {
		model.addAttribute("list", boardMapper.getAdminNoticeBoardList());
		return "board/getAdminNoticeBoardList";
	}
	//단건조회
	@RequestMapping("/adminNoticeBoard")
	public String getAdminNoticeBoard(Model model, AdminNoticeBoardVO vo) {
		model.addAttribute("board", boardMapper.getAdminNoticeBoard(vo));
		return "baord/getAdminNoticeBoard";
	}
}
