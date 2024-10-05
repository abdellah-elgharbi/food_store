package com.example.pidzastor.IDao;

import com.example.pidzastor.beans.cathegorie;

import java.util.List;

public interface DaoCathegorie {
    public  Boolean create( cathegorie o);
    public  Boolean update( cathegorie o);
    public Boolean delete(cathegorie o);
    public List<cathegorie> findAll();
    public cathegorie findById(int id);
}
