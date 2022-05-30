package ozsoyiletisim.ozsoy.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="urunler")
public class Urunler {
	
	@Id
	@Column(name="urun_id")
	private int urunİd;
	
	@Column(name="urun_adi")
	private String urunAdi;
	
	

}
