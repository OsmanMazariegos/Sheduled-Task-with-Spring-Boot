package com.Task.Scheduler.services;

import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.Task.Scheduler.repositories.*;
import com.Task.Scheduler.model.*;

@Service
public class PagoServices {

    
    @PersistenceContext
    private EntityManager entityManger;

    @Autowired
    PagoRepository pagoRepository;

    public List<Pago> getAllOnlyFalse() {
        List<Pago> pagos = entityManger.createQuery(
            "SELECT t from Pago t where t.procesado = false ", Pago.class).getResultList();
        if (pagos.size() > 0) {
            return pagos;
        } else {
            return new ArrayList<Pago>();
        }
    }

    
}
