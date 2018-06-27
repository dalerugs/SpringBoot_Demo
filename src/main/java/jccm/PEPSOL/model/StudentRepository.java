package jccm.PEPSOL.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Integer> {
    List<Student> findByCellLeaderContaining(String cellLeader);
    List<Student> findByNetworkLeaderContaining(String cellLeader);
}
