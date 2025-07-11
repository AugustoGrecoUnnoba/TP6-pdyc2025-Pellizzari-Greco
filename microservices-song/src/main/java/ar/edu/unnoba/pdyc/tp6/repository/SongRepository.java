package ar.edu.unnoba.pdyc.tp6.repository;

import ar.edu.unnoba.pdyc.tp6.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
    Optional<Song> findById(Long id);
}
