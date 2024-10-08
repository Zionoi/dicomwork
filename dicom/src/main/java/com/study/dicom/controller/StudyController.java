package com.study.dicom.controller;

import java.math.BigDecimal;
import java.util.List; // 리스트를 사용하기 위해 필요
//import com.study.dicom.Study; // Study 엔티티 클래스 경로 (패키지명은 실제 프로젝트에 맞게 수정)
//import com.study.dicom.Series; // Series 엔티티 클래스 경로
//import com.study.dicom.Image; // Image 엔티티 클래스 경로

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.study.dicom.domain.Series;
import com.study.dicom.domain.Study;
import com.study.dicom.service.StudyService;

@RestController
public class StudyController {

    @Autowired
    private StudyService studyService;

    // Study 목록을 타임리프 뷰로 전달
    @GetMapping("/studies")
    public String listStudies(Model model) {
        List<Study> studies = studyService.getAllStudies();
        model.addAttribute("studies", studies); // 'studies'라는 이름으로 데이터를 전달
        return "studies";  // studies.html 템플릿을 렌더링
    }

    // 특정 Study에 속한 Series 목록을 전달
    @GetMapping("/studies/{studyKey}/series")
    public String listSeries(@PathVariable("studyKey") BigDecimal studyKey, Model model) {
        List<Series> seriesList = studyService.getSeriesByStudyKey(studyKey);
        model.addAttribute("series", seriesList);
        return "series";
    }
}