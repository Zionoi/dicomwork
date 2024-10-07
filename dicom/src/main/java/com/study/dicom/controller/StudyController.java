package com.study.dicom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.dicom.service.StudyService;

import java.util.List; // 리스트를 사용하기 위해 필요
//import com.study.dicom.Study; // Study 엔티티 클래스 경로 (패키지명은 실제 프로젝트에 맞게 수정)
//import com.study.dicom.Series; // Series 엔티티 클래스 경로
//import com.study.dicom.Image; // Image 엔티티 클래스 경로

@Controller
@RequestMapping("/studies")
public class StudyController {

    @Autowired
    private StudyService studyService;

    @GetMapping
    public String listStudies(Model model) {
        List<Study> studies = studyService.getAllStudies();
        model.addAttribute("studies", studies);
        return "studies";  // 타임리프 템플릿 이름
    }

    @GetMapping("/{studyKey}/series")
    public String listSeries(@PathVariable("studyKey") Long studyKey, Model model) {
        List<Series> seriesList = studyService.getSeriesByStudyKey(studyKey);
        model.addAttribute("series", seriesList);
        return "series";  // 타임리프 템플릿 이름
    }

    @GetMapping("/{studyKey}/series/{seriesKey}/images")
    public String listImages(@PathVariable("studyKey") Long studyKey, @PathVariable("seriesKey") Long seriesKey, Model model) {
        List<Image> images = studyService.getImagesBySeriesKey(studyKey, seriesKey);
        model.addAttribute("images", images);
        return "images";  // 타임리프 템플릿 이름
    }
}
