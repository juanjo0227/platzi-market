package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ClienteCrudRepository;
import com.platzi.market.persistence.entity.Cliente;


public class ClienteRepository {
    private ClienteCrudRepository clienteCrudRepository;

    public List<Cliente> getAll() {
        return (List<Cliente>) clienteCrudRepository.findAll();
    }

    public List<Cliente> getByCedula(String id) {
        return clienteCrudRepository.findByIdOrderByApellidosAsc(id);
    }

    public Optional<List<Cliente>> getSinCelularOEmail() {
        return clienteCrudRepository.findByCelularEqualsOrCorreoElectronicoEquals(null, null);
    }
}
