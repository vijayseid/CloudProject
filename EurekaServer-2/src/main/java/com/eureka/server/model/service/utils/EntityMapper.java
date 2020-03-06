package com.eureka.server.model.service.utils;

import java.util.List;

public interface EntityMapper<E, D> {

	E toEntity(D Dto);

	D toDto(E entity);

	List<E> toEntity(List<D> Dto);

	List<D> toDto(List<E> entity);
}
