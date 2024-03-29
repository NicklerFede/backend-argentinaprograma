package com.portfolio.backend.repository;
/**
 *
 * @author Nickler Federico
 */
import com.portfolio.backend.model.Educacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface EducacionRepository extends JpaRepository<Educacion, Long> {
    @Query(value= "SELECT * FROM educacion where id_educacion=?1", nativeQuery = true)
     Educacion getEducacionById(Long id);

    @Query(value= "SELECT * FROM educacion", nativeQuery = true)
    List<Educacion> getEducaciones();
    
    @Query(value= "SELECT * FROM educacion where institucion like %?1%", nativeQuery = true)
    List<Educacion> getEducacionByInstitucion(String educacion);
}

