package test.id.artifact.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.id.artifact.Models.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {
    void registrar(String nombre);
}
