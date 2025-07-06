package ar.edu.unnoba.pdyc.tp6.service;

import ar.edu.unnoba.pdyc.tp6.DTO.SongDTO;
import java.util.List;

public interface SongService {
    List<SongDTO> getAllSongs();
    SongDTO getSongById(Long id) throws Exception;
}
