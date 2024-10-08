package com.study.dicom.domain;


import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "PATIENTTAB")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PID")
    private String pid;

    @Column(name = "PNAME", nullable = false)
    private String patientName;

    @Column(name = "PATKEY")
    private String patKey;

    @Column(name = "PSEX")
    private String pSex;

    @Column(name = "PBIRTHDATE")
    private String pBirthDate;

    // 필요한 getter와 setter 메서드들

    // 기본 생성자
    public Patient() {}
}
