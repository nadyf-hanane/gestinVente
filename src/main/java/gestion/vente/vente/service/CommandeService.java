package gestion.vente.vente.service;

import gestion.vente.vente.bean.Commande;
import gestion.vente.vente.dao.CommandeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class CommandeService {
    public Commande findByCode(String code) {
        return commandeDao.findByCode(code);
    }

    public Commande deleteByCode(String code) {
        return commandeDao.deleteByCode(code);
    }

    public List<Commande> findByCodeLikeAndTotalGreaterThan(double total, String code) {
        return commandeDao.findByCodeLikeAndTotalGreaterThan(total, code);
    }

    public List<Commande> findAll() {
        return commandeDao.findAll();
    }

    public int save(Commande commande) {
        if (findByCode(commande.getCode()) != null) {
            return -1;
        } else {
            commandeDao.save(commande);
            return 1;
        }
    }


    @Autowired
    private CommandeDao commandeDao;


}
