package ar.edu.unnoba.pdyc.tp6.service;

import ar.edu.unnoba.pdyc.tp6.DTO.SongDTO;
import ar.edu.unnoba.pdyc.tp6.model.Song;
import ar.edu.unnoba.pdyc.tp6.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SongServiceImp implements SongService {

    @Autowired
    private SongRepository songRepository;

    @Override
    public List<SongDTO> getAllSongs() {
        List<Song> songs = songRepository.findAll();
        return songs.stream()
                .map(song -> new SongDTO(song.getId(), song.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public SongDTO getSongById(Long id) throws Exception {
        Optional<Song> optionalSong = songRepository.findById(id);
        if (optionalSong.isPresent()) {
            Song song = optionalSong.get();
            return new SongDTO(song.getId(), song.getName());
        } else {
            throw new Exception("No se encontró la canción con ID: " + id);
        }
    }
}