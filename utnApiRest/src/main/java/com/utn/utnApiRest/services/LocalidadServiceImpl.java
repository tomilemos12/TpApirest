package com.utn.utnApiRest.services;

import com.utn.utnApiRest.entities.Localidad;
import com.utn.utnApiRest.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public abstract class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
