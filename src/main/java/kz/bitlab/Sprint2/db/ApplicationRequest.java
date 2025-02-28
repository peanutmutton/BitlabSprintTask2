package kz.bitlab.Sprint2.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationRequest {
    Long id;

private String userName;

    private String courseName;

    private String commentary;

    private String phone;

    private boolean handled;

}
