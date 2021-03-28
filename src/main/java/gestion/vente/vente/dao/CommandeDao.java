package gestion.vente.vente.dao;

import gestion.vente.vente.bean.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.List;

    @Repository
    public interface CommandeDao extends JpaRepository<Commande, Long> {
        Commande findByCode(String code);
        Commande deleteByCode(String code);
        public  List<Commande> findByCodeLikeAndTotalGreaterThan(double total, String code);

    }

