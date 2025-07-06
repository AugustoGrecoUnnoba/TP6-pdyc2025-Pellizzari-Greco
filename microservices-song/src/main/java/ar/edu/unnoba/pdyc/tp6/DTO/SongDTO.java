package ar.edu.unnoba.pdyc.tp6.DTO;

public class SongDTO {

    private Long id;
    private String name;

    // Constructores
    public SongDTO() {
    }

    public SongDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}