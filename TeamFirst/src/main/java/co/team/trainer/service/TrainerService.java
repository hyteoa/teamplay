package co.team.trainer.service;

import java.util.List;

public interface TrainerService {
	public List<TrainerVO> getTrainer(TrainerVO vo);
	
	public int trainerInsert(TrainerVO vo);
	
	public int trainerDelete(TrainerVO vo);
	
}
