package com.app.repository;

import com.app.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol, Long> {
    // Puedes agregar métodos personalizados si lo necesitas.
}
