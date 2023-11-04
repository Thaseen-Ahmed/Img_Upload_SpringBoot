package com.example.Service;

import com.example.model.Image;
import com.example.repo.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageSeviceImpl implements ImageService{

    @Autowired
    private ImageRepository imgrepo;

    @Override
    public Image create(Image image){
        return imgrepo.save(image);
    }

    @Override
    public List<Image> viewAll(){

        return (List<Image>) imgrepo.findAll();
    }

    @Override
    public Image viewById(long id){
        return imgrepo.findById(id).get();
    }

    }
