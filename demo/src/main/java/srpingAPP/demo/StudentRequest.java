package srpingAPP.demo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName="build")
@NoArgsConstructor
public class StudentRequest {
	private String name;
	private String group;
	private Integer age;
	private Date b_day;
	private String uid;
}
