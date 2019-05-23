package pers.hai.sample.simpleh2;

import org.springframework.data.jpa.repository.JpaRepository;
import pers.hai.sample.simpleh2.bean.Student;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-23 18:29
 * Last Modify: 2019-05-23
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
}
