package com.tourism.backend.service;

import com.tourism.backend.entity.Guide;
import com.tourism.backend.repository.GuideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuideService {

    @Autowired
    private GuideRepository guideRepository;

    public List<Guide> getAllGuides() {
        return guideRepository.findAll();
    }

    public Guide saveGuide(Guide guide) {
        return guideRepository.save(guide);
    }

    public Guide getGuideById(Integer id) {
        return guideRepository.findById(id).orElse(null);
    }

    public void deleteGuide(Integer id) {
        guideRepository.deleteById(id);
    }
}
