package srpingAPP.demo;

import java.sql.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName="build")
@NoArgsConstructor
public class StudentRequest {
	@NotBlank
	@NotNull(message = "Name is mandatory")
	private String name;
	@NotBlank
	@NotNull(message = "Group is mandatory")
	private String group;
	private Integer age;
	private Date b_day;
	private String uid;
}
