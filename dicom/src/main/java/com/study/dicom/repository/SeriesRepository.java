package com.study.dicom.repository;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.dicom.domain.Series;

public interface SeriesRepository extends JpaRepository<Series, BigDecimal> {
    List<Series> findByStudyKey(BigDecimal studyKey);
}
