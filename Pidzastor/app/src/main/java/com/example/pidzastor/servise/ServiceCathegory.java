package com.example.pidzastor.servise;

import com.example.pidzastor.IDao.DaoCathegorie;
import com.example.pidzastor.beans.Repas;
import com.example.pidzastor.beans.cathegorie;

import java.util.ArrayList;
import java.util.List;

public class ServiceCathegory implements DaoCathegorie {
    private  List <cathegorie> cath;

    public ServiceCathegory() {
        cath=new ArrayList<cathegorie>();
    }

    @Override
    public Boolean create(cathegorie o) {
        return cath.add(o) ;
    }

    @Override
    public Boolean update(cathegorie o) {
        return null;
    }

    @Override
    public Boolean delete(cathegorie o) {
        return cath.remove(o);
    }

    @Override
    public List<cathegorie> findAll() {
        return cath;
    }

    @Override
    public cathegorie findById(int id) {
        for ( cathegorie c : cath){
            if (c.getId()==id){
                return c;
            }
        }
        return null;
    }
}
