package com.math.model;

import com.math.model.dao.DataDao;
import com.math.model.domain.TerroristAttack;
import com.math.model.repository.TerroristAttacksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
/*public class ModelApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModelApplication.class, args);
	}
}*/

public class ModelApplication implements CommandLineRunner{


	@Autowired
	DataDao dataDao;

	@Autowired
	TerroristAttacksRepository terroristAttacksRepository;

	@Override
	public void run(String... args) {
		/*List<TerroristAttack> terroristAttacks = dataDao.convertData();
		terroristAttacksRepository.saveAll(terroristAttacks);*/

		dataDao.ReadFiltered();

	}

	public static void main(String[] args) {
		SpringApplication.run(ModelApplication.class, args);
	}
}




