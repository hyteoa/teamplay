package co.team.spring.board.service.impl;

import java.util.List;

import co.team.spring.board.service.AdminNoticeBoardVO;

public interface AdminNoticeBoardMapper {
	
	public List<AdminNoticeBoardVO> getAdminNoticeBoardList();
	public AdminNoticeBoardVO getAdminNoticeBoard(AdminNoticeBoardVO vo);
	
	
}
