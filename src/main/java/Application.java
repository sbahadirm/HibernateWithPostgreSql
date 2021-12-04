import base.entityservice.FirstEntityEntityService;
import entity.FirstEntity;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        FirstEntityEntityService service = new FirstEntityEntityService();
        List<FirstEntity> firstEntityList = service.findAll();

        for (FirstEntity firstEntity : firstEntityList) {
            System.out.println(firstEntity);
        }

    }
}
