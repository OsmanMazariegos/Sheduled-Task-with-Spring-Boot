package com.Task.Scheduler.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import javax.persistence.EntityManager;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Task.Scheduler.model.*;


public interface PagoRepository extends JpaRepository<Pago, Long> {
    
    public List<Pago> findAllById(String id);

}
