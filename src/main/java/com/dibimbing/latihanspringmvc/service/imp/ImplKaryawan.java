package com.dibimbing.latihanspringmvc.service.imp;

import com.dibimbing.latihanspringmvc.model.Karyawan;
import com.dibimbing.latihanspringmvc.service.KaryawanService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImplKaryawan implements KaryawanService {
    static List<Karyawan> listMhs = new ArrayList<>();
    @Override
    public Karyawan save(Karyawan obj) {
        obj.setId(1L);
        listMhs.add(obj);
        return obj;
    }

    @Override
    public Karyawan update(Karyawan obj) {
        for(Karyawan data : listMhs){
            if(obj.getId() == data.getId()){
                Karyawan update = new Karyawan();
                update.setNama(data.getNama());
                update.setId(data.getId());
                update.setUmur(data.getUmur());
                update.setJenis_kelamin(data.getJenis_kelamin());
                listMhs.remove(data);
                listMhs.add(update);
                return update;
            }
        }
        return null;
    }

    @Override
    public List<Karyawan> deleted(Long id) {
        for(Karyawan data : listMhs){
            if(id == data.getId()){
                Karyawan update = new Karyawan();
                update.setNama(data.getNama());
                update.setId(data.getId());
                update.setUmur(data.getUmur());
                update.setJenis_kelamin(data.getJenis_kelamin());
                listMhs.remove(data);

                return listMhs;
            }
        }
        return null;
    }

    @Override
    public List<Karyawan> dataMhs() {
        return null;
    }

    @Override
    public List<Karyawan> dataMhs(int row,int page) {
        return listMhs;
    }

    @Override
    public Karyawan findById(long obj) {
        for(Karyawan data : listMhs){
            if(obj == data.getId()){
                return data;
            }
        }
        return null;
    }
}
