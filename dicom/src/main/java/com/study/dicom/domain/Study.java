package com.study.dicom.domain;

import javax.persistence.*;

@Entity
@Table(name = "STUDYTAB")
public class Study {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STUDYKEY")
    private Long studyKey;

    @Column(name = "STUDYINSUID", nullable = false)
    private String studyInsUid;

    @Column(name = "PATKEY")
    private String patKey;

    @Column(name = "ACCESSNUM")
    private String accessNum;

    @Column(name = "STUDYDATE")
    private String studyDate;

    @Column(name = "STUDYTIME")
    private String studyTime;

    @Column(name = "STUDYID")
    private String studyId;

    @Column(name = "EXAMCODE")
    private String examCode;

    @Column(name = "STUDYDESC")
    private String studyDesc;

    @Column(name = "MODALITY")
    private String modality;

    @Column(name = "BODYPART")
    private String bodyPart;

    @Column(name = "PID")
    private String pid;

    @Column(name = "PNAME")
    private String pName;

    @Column(name = "PSEX")
    private String pSex;

    @Column(name = "PBIRTHDATETIME")
    private String pBirthDateTime;

    @Column(name = "PATAGE")
    private String patAge;

    @Column(name = "EXAMSTATUS")
    private int examStatus;

    @Column(name = "REPORTSTATUS")
    private int reportStatus;

    @Column(name = "SERIESCNT")
    private int seriesCnt;

    @Column(name = "IMAGECNT")
    private int imageCnt;

    // 필요한 getter와 setter 메서드들

    // 기본 생성자
    public Study() {}
}

