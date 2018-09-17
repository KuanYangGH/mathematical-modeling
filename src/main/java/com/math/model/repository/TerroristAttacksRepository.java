package com.math.model.repository;

import com.math.model.domain.TerroristAttack;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TerroristAttacksRepository extends JpaRepository<TerroristAttack,Long>{

}
