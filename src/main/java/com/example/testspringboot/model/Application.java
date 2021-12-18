package com.example.testspringboot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.concurrent.TimeUnit;

@Entity
@Table(name = "applications")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Application {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "master_id")
    private Integer masterId;

    @Column(name = "job_type")
    private String jobType;

    @Column(name = "job_volume")
    private Double jobVolume;

    @Column(name = "price")
    private Double price;

    @Column(name = "status")
    private String status;

    @Column(name = "score")
    private Integer score;

    @Column(name = "client_id")
    private Integer clientId;


    public Integer getId() {
        return id;
    }

    public Integer getMasterId() {
        return masterId;
    }

    public String getJobType() {
        return jobType;
    }

    public Double getJobVolume() {
        return jobVolume;
    }

    public Double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public Integer getScore() {
        return score;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMasterId(Integer masterId) {
        this.masterId = masterId;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public void setJobVolume(Double jobVolume) {
        this.jobVolume = jobVolume;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }


}
