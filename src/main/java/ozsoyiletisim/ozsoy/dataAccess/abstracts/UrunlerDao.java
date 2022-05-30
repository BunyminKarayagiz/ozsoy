package ozsoyiletisim.ozsoy.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import ozsoyiletisim.ozsoy.entities.concretes.Urunler;

public interface UrunlerDao extends JpaRepository<Urunler, Integer> {
	
	
	
}
