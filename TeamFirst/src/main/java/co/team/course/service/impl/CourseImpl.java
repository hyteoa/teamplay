package co.team.course.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.team.course.service.CourseService;
import co.team.course.service.Course_Info_VO;
import co.team.course.service.Course_TuitionVO;

@Service
public class CourseImpl implements CourseService {

	@Autowired
	CourseMapper courseMapper;
	
	@Autowired
	CourseTuitionMapper courseTuitionMapper;
	
	
	@Override
	public List<Course_Info_VO> getCourse(Course_Info_VO vo) {
		return courseMapper.getCourse(vo);
	}

	@Override
	public int productDelete(Course_Info_VO vo) {

		return courseMapper.productDelete(vo);
	}

	@Override
	public List<Course_TuitionVO> getCourse_Tuition(Course_TuitionVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void productInsert(Course_Info_VO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int productInserts(Course_TuitionVO tvo) {
		// TODO Auto-generated method stub
		return 0;
	}


	// Course_TuitionVO List
	
/*
	@Override
	public void productInsert(Course_Info_VO vo, List<Course_TuitionVO> list) {
		
		courseMapper.productInsert(vo);
		System.out.println(vo);
		System.out.println(list);
		for (Course_TuitionVO tvo : list) {
			tvo.setCourse_no(vo.getCourse_no());
			courseMapper.productInsert(tvo);
		}
	}
	*/

	

}
