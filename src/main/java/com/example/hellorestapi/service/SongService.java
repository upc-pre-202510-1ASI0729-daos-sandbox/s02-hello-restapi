package com.example.hellorestapi.service;

import com.example.hellorestapi.model.Song;
import com.example.hellorestapi.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongService {
    private final SongRepository songRepository;

    @Autowired
    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }

    public Optional<Song> getSongById(Long id) {
        return songRepository.findById(id);
    }

    public Song createSong(Song song) {
        return songRepository.save(song);
    }

    public void deleteSong(Long id) {
        if (songRepository.existsById(id)) {
            songRepository.deleteById(id);
        } else {
            throw new RuntimeException("Song not found with id: " + id);
        }
    }
}
