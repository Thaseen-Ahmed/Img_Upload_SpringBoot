package com.example.Service;

import com.example.model.Image;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface ImageService {
    public Image create(Image image);
    public List<Image> viewAll();
    public Image viewById(long id);


}
