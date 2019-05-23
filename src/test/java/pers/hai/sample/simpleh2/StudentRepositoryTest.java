package pers.hai.sample.simpleh2;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pers.hai.sample.simpleh2.bean.Student;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-23 18:30
 * Last Modify: 2019-05-23
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository userRepository;

    @Test
    public void saveTest() {
        Student student = new Student();
        student.setName("Alice");
        student.setSex(0);
        student.setAge(6);
        Student result = userRepository.save(student);
        System.out.println(result.toString());
        Assert.assertNotNull(student.getId());
    }
}