package com.tourism.backend.controller;

import com.tourism.backend.entity.Guide;
import com.tourism.backend.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/guides")
public class GuideController {

    @Autowired
    private GuideService guideService;

    @GetMapping
    public List<Guide> getAllGuides() {
        return guideService.getAllGuides();
    }

    @PostMapping
    public Guide createGuide(@RequestBody Guide guide) {
        return guideService.saveGuide(guide);
    }

    @GetMapping("/{id}")
    public Guide getGuideById(@PathVariable Integer id) {
        return guideService.getGuideById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteGuide(@PathVariable Integer id) {
        guideService.deleteGuide(id);
    }
}
