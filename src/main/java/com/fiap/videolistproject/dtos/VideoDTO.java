package com.fiap.videolistproject.dtos;

import com.fiap.videolistproject.entities.Video;
import jakarta.validation.constraints.NotBlank;

import java.time.Instant;

public class VideoDTO {

    private Long id;
    @NotBlank(message = "Title is required")
    private String title;
    private String description;
    @NotBlank(message = "Url is required")
    private String url;
    private Instant releaseDate;

    public  VideoDTO(){
    }

    public VideoDTO(Long id, String title, String description, String url, Instant releaseDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.url = url;
        this.releaseDate = releaseDate;
    }

    public VideoDTO(Video video) {
        this.id = video.getId();
        this.title = video.getTitle();
        this.description = video.getDescription();
        this.url = video.getUrl();
        this.releaseDate = video.getReleaseDate();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Instant getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Instant releaseDate) {
        this.releaseDate = releaseDate;
    }
}
