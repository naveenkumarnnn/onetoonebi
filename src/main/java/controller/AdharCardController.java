package controller;

import one_one_bi_dto.Adhar;
import one_one_bi_dto.Person;
import one_to_one_bi_dao.AdharCardDao;
public class AdharCardController {
		public static void main(String[] args) {

			Person person = new Person();
			person.setId(1);
			person.setName("nagesh");
			person.setAge(30);
			person.setPhone(84647);
	
			Adhar adhar = new Adhar();
			adhar.setId(101);
			adhar.setName("abhi");
			adhar.setAdharNo("94737838");
	
			adhar.setPerson(person);
			person.setAdhar(adhar);

			AdharCardDao adharDAO = new AdharCardDao();
			adharDAO.save(person);
			
			
//			Adhar adhar1= adharDAO.getDetail(1);
//			System.out.println(adhar1);
		}


}
