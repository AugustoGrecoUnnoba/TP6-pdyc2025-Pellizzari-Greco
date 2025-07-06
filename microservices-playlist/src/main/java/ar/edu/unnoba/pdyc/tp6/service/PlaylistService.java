package ar.edu.unnoba.pdyc.tp6.service;

import ar.edu.unnoba.pdyc.tp6.DTO.PlaylistDTO;
import java.util.List;

public interface PlaylistService {
    List<PlaylistDTO> getAllPlaylists();
    PlaylistDTO getPlaylistById(Long id) throws Exception;
}