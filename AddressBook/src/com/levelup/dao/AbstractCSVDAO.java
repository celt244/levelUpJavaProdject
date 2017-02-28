package com.levelup.dao;

import com.levelup.dao.impl.FileDataProviderImpl;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 * Created by Arthur on 28.02.2017.
 */
public abstract class AbstractCSVDAO<T> extends AbstractFileDAO<T> {

    private final String HEADER_CSV;

    public AbstractCSVDAO(final FileDataProviderImpl fileDataProvider, String fileName, String hader_csv) {
        super(fileDataProvider, fileName);
        this.HEADER_CSV = hader_csv;
    }

    protected abstract T parseEntity(final String str);
    public abstract String viewEntity(T t);



    @Override
        public ArrayList<T> read() {
          ArrayList<T> list = new ArrayList<>();
          RandomAccessFile file = null;
          try {
              file = getDataFile();
              file.seek(0);

              String line;
              while ((line = file.readLine()) != null){
                  if (line.contains(HEADER_CSV)) continue;
                  list.add(parseEntity(line));
              }

          } catch (IOException e){

          }
        return list;
    }

    @Override
    public void create (T entity) {
        try {
            RandomAccessFile file = getDataFile();
            file.seek(file.length());

            file.write(viewEntity(entity).getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public T getOneById(final long id) {
        return null;
    }


    public int[] getStartAndEndOfStr(RandomAccessFile file, T t){
        return new int[0];
    }


}
