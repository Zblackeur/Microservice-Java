package com.clientui.clientui.proxies;


import com.clientui.clientui.beans.CommandeBean;
import com.clientui.clientui.beans.ProductBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "microservice-commandes", url ="localhost:9002")
public interface MicroserviceCommandeProxy {

    @PostMapping(value = "/commandes")
    CommandeBean ajouterCommande(@RequestBody CommandeBean commande);

    @GetMapping(value = "/commandesActu")
    List<CommandeBean> listeDesCommandes();
}