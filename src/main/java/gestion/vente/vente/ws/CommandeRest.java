package gestion.vente.vente.ws;

import gestion.vente.vente.bean.Commande;
import gestion.vente.vente.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("gestion des ventes/Commande")
public class CommandeRest {
    @GetMapping("/Code/{code}/Total/{total}")
    public List<Commande> findByCodeLikeAndTotalGreaterThan(@PathVariable String code, @PathVariable double total) {
        return commandeService.findByCodeLikeAndTotalGreaterThan(total, code);
    }

    @GetMapping("/Code/{code}")
    public Commande findByCode(String code) {
        return commandeService.findByCode(code);
    }

    @Transactional
    public Commande deleteByCode(String code) {
        return commandeService.deleteByCode(code);
    }

    @GetMapping("/")
    public List<Commande> findAll() {
        return commandeService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Commande commande) {
        return commandeService.save(commande);
    }


    @Autowired
    private CommandeService commandeService;
}
