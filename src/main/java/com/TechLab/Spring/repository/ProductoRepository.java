package com.TechLab.Spring.repository;

import com.TechLab.Spring.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
