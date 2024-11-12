package com.dev.frases.service;

import com.dev.frases.dto.FraseDTO;
import com.dev.frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class FraseService {
    Random random = new Random();

    @Autowired
    private FraseRepository repository;

    public FraseDTO frase (){
        var numeroDeFrases = repository.idAletorio();
        Integer idEscogido = 1 + random.nextInt(Math.toIntExact(numeroDeFrases));

        var fraseMostrada = repository.findById(Long.valueOf(idEscogido));
        if (fraseMostrada.isPresent()){
            return new FraseDTO(fraseMostrada.get().getPoster(),
                    fraseMostrada.get().getTitulo(), fraseMostrada.get().getFrase(),
                    fraseMostrada.get().getPersonaje());
        }
        return null;
    }
}
