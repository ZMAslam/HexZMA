package com.hexawareZA.JPA2.repository;

import com.hexawareZA.JPA2.entity.Mobile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class MobileRepository {
    @Autowired
    EntityManager mobileEm;

    public Mobile findById(long id) {
        return mobileEm.find(Mobile.class, id);
    }

    public Mobile saveMobile(Mobile mobile) {
        return mobileEm.merge(mobile);
    }

    public Mobile findByName(String name) {
        return mobileEm.find(Mobile.class, name);
    }

    public List<Mobile> getAllMobiles() {
        return mobileEm.createQuery("SELECT m from Mobile m").getResultList();
    }
}
