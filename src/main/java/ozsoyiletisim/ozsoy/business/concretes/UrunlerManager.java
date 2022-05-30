package ozsoyiletisim.ozsoy.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ozsoyiletisim.ozsoy.business.abstracts.UrunlerService;
import ozsoyiletisim.ozsoy.core.utilities;
import ozsoyiletisim.ozsoy.dataAccess.abstracts.UrunlerDao;
import ozsoyiletisim.ozsoy.entities.concretes.Urunler;



@Service
public class UrunlerManager implements UrunlerService {
	
    private	UrunlerDao urunlerDao;

	@Autowired
	public UrunlerManager(UrunlerDao urunlerDao) {
		super();
		this.urunlerDao = urunlerDao;
	}

	@Override
	public List<Urunler> getAll() {
		return this.urunlerDao.findAll();
	}

	@Override
	public Result add(Urunler urunler) {
		this.urunlerDao.save(urunler);
		return new SuccessResult("Ürün eklendi.");
	}

	
	
	

}
