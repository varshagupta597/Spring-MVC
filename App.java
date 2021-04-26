package jdbcProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jdbc.entities.Student;
import com.springjdbc.dao.StudentDao;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("jdbcProject/dbconfig.xml");
        StudentDao studentDao = context.getBean("studentDao1",StudentDao.class);
       
         Student student = new Student();
     
          int p = studentDao.del(student);
          System.out.println("data deleted successfully" +p);
    }
}
