package com.study.dicom.service;

import java.awt.Image;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus.Series;
import org.springframework.stereotype.Service;

@Service
public class StudyService {

    @Autowired
    private StudyRepository studyRepository;

    public List<Study> getAllStudies() {
        return studyRepository.findAll();
    }

    public List<Series> getSeriesByStudyKey(Long studyKey) {
        return studyRepository.findSeriesByStudyKey(studyKey);
    }

    public List<Image> getImagesBySeriesKey(Long studyKey, Long seriesKey) {
        return studyRepository.findImagesBySeriesKey(studyKey, seriesKey);
    }
}
