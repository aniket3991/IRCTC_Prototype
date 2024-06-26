package anudip.project.irctc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import anudip.project.irctc.entity.Train;

/**
 * Author: Aniket Mishra
 */
@Repository
public interface TrainRepository extends JpaRepository<Train, Integer>{
	Optional<Train> findByTrainNo(int trainNo);
	Train getTrainByTrainNo(int trainNo);
	
}
