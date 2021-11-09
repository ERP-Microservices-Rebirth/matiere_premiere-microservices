package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Mp;
import tn.esprit.spring.repository.MpRepository;

@Service
public class MpServiceImpl implements MpService {
	@Autowired
	MpRepository MpRepository;
	private static final Logger l= LogManager.getLogger(MpServiceImpl.class);
	@Override
	public List<Mp> retriveAllmps() {
		 List<Mp> mps =(List<Mp>) MpRepository.findAll();
		  
		  for(Mp mp :mps)
		  {	l.info("Mp +++ :"+mp);	  }
		  return mps;
	}

	@Override
	public Mp addMp(Mp m) {
		return MpRepository.save(m);
	}

	@Override
	public void deleteMp(Long id) {
		MpRepository.deleteById(id); 
	}

	@Override
	public Mp updateMp(Mp m) {
		MpRepository.save(m); 
		return m;
	}

	@Override
	public Optional<Mp> retrieveMp(Long id) {
		return MpRepository.findById(id);

	}

}



