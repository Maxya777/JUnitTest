import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testGetStudentMethods() {
        Student student = new Student("Pasha", "21", "1");

        assertEquals("Pasha", student.getName());
        assertEquals("21", student.getGroup());
        assertEquals("1", student.getStudentId());
    }

    @Test
    void testEqualsStudentMethod() {
        Student student1 = new Student("Filipp", "21", "1");
        Student student2 = new Student("Maxim", "223", "1");

        Assertions.assertNotNull(student1);
        Assertions.assertNotNull(student2);
        assertEquals(student1, student2);
    }

    @Test
    void testHashCodeStudentMethod() {
        Student student1 = new Student("Pasha", "21", "1");
        Student student2 = new Student("Maxim", "23", "1");

        Assertions.assertTrue(student1.equals(student2) && student2.equals(student1));
        assertEquals(student1.hashCode(), student2.hashCode());
    }
}