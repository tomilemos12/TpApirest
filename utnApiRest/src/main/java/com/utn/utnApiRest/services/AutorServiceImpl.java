package com.utn.utnApiRest.services;

import com.utn.utnApiRest.entities.Autor;
import com.utn.utnApiRest.repositories.AutorRepository;
import com.utn.utnApiRest.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public abstract class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService {
    @Autowired
    private AutorRepository autorRepository;
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}