package com.dibimbing.latihanspringmvc.service;

import com.dibimbing.latihanspringmvc.model.Karyawan;

import java.util.List;

public interface KaryawanService {
    public Karyawan save(Karyawan obj);
    public Karyawan update(Karyawan obj);
    public List<Karyawan> deleted(Long id);
    public List<Karyawan> dataMhs();

    List<Karyawan> dataMhs(int row, int page);

    Karyawan findById(long obj);
}
