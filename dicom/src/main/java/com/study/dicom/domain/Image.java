package com.study.dicom.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "IMAGETAB")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IMAGEKEY")
    private Long imageKey;

    @Column(name = "STUDYKEY")
    private Long studyKey;

    @Column(name = "SERIESKEY")
    private Long seriesKey;

    @Column(name = "SOPINSTANCEUID", nullable = false)
    private String sopInstanceUid;

    @Column(name = "FNAME")
    private String fileName;

    @Column(name = "PATH")
    private String path;

    @Column(name = "SERIESNUMBER")
    private int seriesNumber;

    @Column(name = "WINDOW")
    private int window;

    @Column(name = "LEV")
    private int level;

    // 필요한 getter와 setter 메서드들

    // 기본 생성자
    public Image() {}
}
