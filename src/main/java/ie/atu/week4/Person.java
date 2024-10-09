package ie.atu.week4;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @NotBlank(message = "Name can't be blank")
    private String name;
    @NotBlank(message = "Title can't be blank")
    private String title;
    @NotNull(message = "Id can't be blank")
    private int empid;
    @Min(value = 1 ,message = "Age can't be 0")
    private int age;
    @Email(message = "Email isn't valid")
    private String email;
    @NotBlank(message = "Position can't be blank")
    private String position;
    @NotBlank(message = "Department can't be blank")
    private String department;

}
