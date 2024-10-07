package com.study.dicom.domain;

import javax.persistence.*;

@Entity
@Table(name = "SERIESTAB")
public class Series {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SERIESKEY")
    private Long seriesKey;

    @Column(name = "STUDYKEY")
    private Long studyKey;

    @Column(name = "SERIESINSUID", nullable = false)
    private String seriesInsUid;

    @Column(name = "SERIESNUM")
    private int seriesNum;

    @Column(name = "SERIESDESC")
    private String seriesDesc;

    @Column(name = "MODALITY")
    private String modality;

    @Column(name = "IMAGECNT")
    private int imageCnt;

    // 필요한 getter와 setter 메서드들

    // 기본 생성자
    public Series() {}
}
