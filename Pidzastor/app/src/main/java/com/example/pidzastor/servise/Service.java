package com.example.pidzastor.servise;

import com.example.pidzastor.IDao.Idao;
import com.example.pidzastor.beans.Repas;

import java.util.ArrayList;
import java.util.List;

public class Service implements Idao<Repas> {
    private  List <Repas> repas;

    public Service() {
        this.repas = new ArrayList<Repas>();
    }

    @Override
    public Boolean create(Repas o) {
        return repas.add(o);
    }

    @Override
    public Boolean update(Repas o) {
        return null;
    }

    @Override
    public Boolean delete(Repas o) {
        return repas.remove(o);
    }

    @Override
    public List<Repas> findAll() {
        return repas;
    }

    @Override
    public Repas findById(int id) {
        for ( Repas r : repas ){
            if ( id==r.getId()){
                return r;
            }
        }
        return  null;
    }
}
