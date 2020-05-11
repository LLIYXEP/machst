package scurtu.machst.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import scurtu.machst.domain.Task;

@Repository
public interface TaskRepo extends JpaRepository<Task, Long> {
}
