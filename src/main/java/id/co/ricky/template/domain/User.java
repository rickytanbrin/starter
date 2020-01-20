package id.co.ricky.template.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="MASTER_USER")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @NotEmpty
    private String username;

    @NotEmpty
    private String password;


    // sample
    @ElementCollection(fetch = FetchType.EAGER)
    @Builder.Default
    private List<String> roles = new ArrayList<>();
}