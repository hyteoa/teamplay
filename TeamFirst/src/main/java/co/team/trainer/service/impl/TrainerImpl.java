package co.team.trainer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.team.trainer.service.TrainerService;
import co.team.trainer.service.TrainerVO;

@Service
public class TrainerImpl implements TrainerService {

	@Autowired TrainerMapper dao;
	
	@Override
	public List<TrainerVO> getTrainer(TrainerVO vo) {
		return dao.getTrainer(vo);
	}

	@Override
	public int trainerInsert(TrainerVO vo) {
		
		return dao.trainerInsert(vo);
	}

	@Override
	public int trainerDelete(TrainerVO vo) {
		// TODO Auto-generated method stub
		return dao.trainerDelete(vo);
	}

	
	
}
