/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here.
package com.example.song;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.song.SongService;
import com.example.song.Song;

@RestController

public class SongController{

SongService songServ=new SongService();

@GetMapping("/songs")

public ArrayList<Song> getSongs(){
    return songServ.getSongs();
}

@GetMapping("/songs/{songId}")

public Song getSong(@PathVariable("songId") int songId){
    return songServ.getSong(songId);
}

@PostMapping("/songs")

public Song addSong(@RequestBody Song song){
    return songServ.addSong(song);
}

@PutMapping("/songs/{songId}")

public Song updateSong(@PathVariable("songId") int songId,@RequestBody Song song){
    return songServ.updateSong(songId,song);
}

@DeleteMapping("songs/{songId}")

public Song deleteSong(@PathVariable("songId") int songId){
    return songServ.deleteSong(songId);
}
}