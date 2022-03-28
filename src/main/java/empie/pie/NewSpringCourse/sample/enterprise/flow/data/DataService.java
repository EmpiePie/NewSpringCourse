package empie.pie.NewSpringCourse.sample.enterprise.flow.data;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//Getting data
@Component
public
class DataService {
    public List<Integer> retrieveData() {
        return Arrays.asList(12, 34, 56, 78, 90);
    }
}
