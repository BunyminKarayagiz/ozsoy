package ozsoyiletisim.ozsoy.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ozsoyiletisim.ozsoy.business.abstracts.UrunlerService;
import ozsoyiletisim.ozsoy.entities.concretes.Urunler;


@RestController
@RequestMapping("/api/urunler")
public class UrunlerController {

	private UrunlerService urunlerService;
	
	@Autowired
	public UrunlerController(UrunlerService urunlerService) {
		super();
		this.urunlerService = urunlerService;
	}
	
	@GetMapping("/getall")
	public List<Urunler> getAll() {
		return this.urunlerService.getAll(); 
	}
	
	
	
}
