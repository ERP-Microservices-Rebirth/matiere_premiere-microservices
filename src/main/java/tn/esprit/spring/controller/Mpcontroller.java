package tn.esprit.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Mp;
import tn.esprit.spring.service.MpService;



@RestController
public class Mpcontroller {

	@Autowired
	MpService MpService;
	
	@GetMapping("/retrieve-all-mps")
	@ResponseBody
	public List<Mp> retriveAllmps() {
	List<Mp> list = MpService.retriveAllmps();
	return list;
	}
	@PostMapping("/add-mp")
	@ResponseBody
	public Mp addMp(@RequestBody Mp m) {

	Mp Mp = MpService.addMp(m);

	return Mp;
	}
	@DeleteMapping("/delete-mp/{id}")
	@ResponseBody
	public void deleteMp(@PathVariable("id") Long id) {
	MpService.deleteMp(id);
	}
	
	@PutMapping("/modify-mp")
	@ResponseBody
	public Mp updateMp(@RequestBody Mp m) {
	return MpService.updateMp(m);
	}
	
	@GetMapping("/retrieve-mp/{id}")
	@ResponseBody
	public Optional<Mp> getMp(@PathVariable("id") Long id) {
	 return MpService.retrieveMp(id);
	}
	
}

