package ar.edu.unnoba.pdyc.tp6.service;

import ar.edu.unnoba.pdyc.tp6.DTO.PlaylistDTO;
import ar.edu.unnoba.pdyc.tp6.DTO.SongDTO;
import ar.edu.unnoba.pdyc.tp6.model.Playlist;
import ar.edu.unnoba.pdyc.tp6.model.PlaylistSong;
import ar.edu.unnoba.pdyc.tp6.repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PlaylistServiceImp implements PlaylistService {

    @Autowired
    private PlaylistRepository playlistRepository;

    @Override
    public List<PlaylistDTO> getAllPlaylists() {
        List<Playlist> playlists = playlistRepository.findAll();
        return playlists.stream()
                .map(playlist -> new PlaylistDTO(playlist.getId(), playlist.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public PlaylistDTO getPlaylistById(Long id) throws Exception {
        return null; // Falta implementar
    }

}
