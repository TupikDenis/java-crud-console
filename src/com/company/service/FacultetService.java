package com.company.service;

import com.company.dto.Facultet;
import com.company.repo.FacultetRepo;

import java.util.ArrayList;

public class FacultetService implements CRUDService<Facultet> {
    private final FacultetRepo facultetRepo;

    public FacultetService(){
        this.facultetRepo = new FacultetRepo();
    }

    @Override
    public void create(Facultet facultet) {
        this.facultetRepo.create(facultet);
    }

    @Override
    public ArrayList<Facultet> findAll() {
        return this.facultetRepo.findAll();
    }

    @Override
    public Facultet findById(long id) {
        return this.facultetRepo.findById(id);
    }

    @Override
    public void update(Facultet facultet, long id) {
        this.facultetRepo.update(facultet, id);
    }

    @Override
    public void delete(long id) {
        this.facultetRepo.delete(id);
    }
}
