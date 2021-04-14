package co.team.trainer.service.impl;

import java.util.List;

import co.team.trainer.service.TrainerVO;

public interface TrainerMapper {

	public List<TrainerVO> getTrainer(TrainerVO vo);
	
	public int trainerInsert(TrainerVO vo);
	
	public int trainerDelete(TrainerVO vo);
}
