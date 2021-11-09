package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.entity.Mp;

public interface MpService {
	 public List<Mp> retriveAllmps();
	 public Mp addMp(Mp m);
	 public void deleteMp(Long id);
	 public Mp updateMp(Mp m);
	 public Optional<Mp> retrieveMp(Long id);

}
