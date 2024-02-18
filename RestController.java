import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email_address", nullable = false)
    private String emailId;
}

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping
    public String createEmployee(@RequestBody Employee employee) {
        // Logic to create an employee record
        return "Employee CREATED";
    }

    @GetMapping
    public String getEmployee() {
        // Logic to fetch an employee record
        return "Employee FETCHED";
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable long id) {
        // Logic to delete an employee record by ID
        return "Employee DELETED";
    }
}