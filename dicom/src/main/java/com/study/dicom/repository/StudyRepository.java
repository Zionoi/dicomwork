package com.study.dicom.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.dicom.domain.Study;

@Repository
public interface StudyRepository extends JpaRepository<Study, Long> {
    // 기본적인 CRUD 메서드들은 자동으로 제공됨
}
