package com.math.model;

import com.math.model.dao.DataDao;
import com.math.model.domain.TerroristAttack;
import com.math.model.repository.TerroristAttacksRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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


    private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	DataDao dataDao;

	@Autowired
	TerroristAttacksRepository terroristAttacksRepository;

	@Override
	public void run(String... args) {
		/*List<TerroristAttack> terroristAttacks = dataDao.convertData();
		terroristAttacksRepository.saveAll(terroristAttacks);*/

		dataDao.ReadFiltered2();

	}

	public static void main(String[] args) {
		SpringApplication.run(ModelApplication.class, args);
	}
}




