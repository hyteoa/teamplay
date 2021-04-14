package co.team.course.service;

import java.util.List;

public interface CourseService {
	public List<Course_Info_VO> getCourse(Course_Info_VO vo);
	
	public List<Course_TuitionVO> getCourse_Tuition(Course_TuitionVO vo);
	
	public int productDelete(Course_Info_VO vo);

	public void productInsert(Course_Info_VO vo);

	public int productInserts(Course_TuitionVO tvo);
	
	
	
	
	
	
}
