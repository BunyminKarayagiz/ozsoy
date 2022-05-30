package ozsoyiletisim.ozsoy.business.abstracts;

import java.util.List;

import ozsoyiletisim.ozsoy.core.utilities.results.results.Result;
import ozsoyiletisim.ozsoy.entities.concretes.Urunler;

public interface UrunlerService {
	
	List<Urunler> getAll();
	Result add(Urunler urunler);

}
