import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.ModelData;

public interface View {

    public void refresh(ModelData modelData);

    public void setController(Controller controller);
}
