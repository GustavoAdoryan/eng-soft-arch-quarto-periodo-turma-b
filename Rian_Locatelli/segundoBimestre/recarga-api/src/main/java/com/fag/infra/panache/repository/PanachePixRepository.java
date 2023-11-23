package com.fag.infra.panache.repository;

import com.fag.domain.entities.PixBO;
import com.fag.domain.repositories.IPixDataBaseRepository;
import com.fag.infra.panache.mappers.PanachePixMapper;
import com.fag.infra.panache.model.PanacheCode;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PanachePixRepository implements IPixDataBaseRepository {

    @Override
    public PixBO persist(PixBO bo) {
        PanacheCode entity = PanachePixMapper.toEntity(bo);

        entity.persistAndFlush();

        return PanachePixMapper.toDomain(entity);
    }

}