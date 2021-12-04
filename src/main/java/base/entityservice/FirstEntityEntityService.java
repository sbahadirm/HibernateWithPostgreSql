package base.entityservice;

import dao.FirstEntityDao;
import entity.FirstEntity;

import java.util.List;

public class FirstEntityEntityService {

    private FirstEntityDao firstEntityDao;

    public FirstEntityEntityService(){
        firstEntityDao = new FirstEntityDao();
    }

    public List<FirstEntity> findAll(){
        return firstEntityDao.findAll();
    }
}
