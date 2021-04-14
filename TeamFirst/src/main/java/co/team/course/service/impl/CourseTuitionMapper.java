package co.team.course.service.impl;

import java.util.List;

import co.team.course.service.Course_TuitionVO;

public interface CourseTuitionMapper {

	public List<Course_TuitionVO> getCourse_Tuition(Course_TuitionVO vo);
	
	public int productInserts(Course_TuitionVO tvo);
}
