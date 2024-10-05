package com.example.pidzastor.IDao;

import java.util.List;

public interface Idao <T>  {
   public  Boolean create( T o);
   public  Boolean update(T o);
   public Boolean delete(T o);
   public List<T> findAll();
   public T findById(int id);

}
