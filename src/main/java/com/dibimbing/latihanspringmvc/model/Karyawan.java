package com.dibimbing.latihanspringmvc.model;

import lombok.Data;

@Data
public class Karyawan {
    private Long id;
    private String nama;
    private int umur;
    private String jenis_kelamin;

    public void setId(long l) {
    }
}
