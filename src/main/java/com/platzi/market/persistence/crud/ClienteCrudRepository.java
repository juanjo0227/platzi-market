package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Cliente;
import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClienteCrudRepository extends CrudRepository<Cliente, String> {

    List<Cliente> findByIdOrderByApellidosAsc(String id);
    Optional<List<Cliente>> findByCelularEqualsOrCorreoElectronicoEquals(Long celular, String correoElectronico);
}
