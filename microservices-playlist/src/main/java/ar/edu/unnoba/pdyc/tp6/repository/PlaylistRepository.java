package ar.edu.unnoba.pdyc.tp6.repository;

import ar.edu.unnoba.pdyc.tp6.model.Playlist;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Long>{
    List<Playlist> findAll();
    java.util.Optional<Playlist> findById(Long id);
}
