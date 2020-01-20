package id.co.ricky.template.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author Ricky (ricky.tirta@cimbniaga.co.id)
 * @created 1/20/2020 2:04 PM
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ObjectRequest implements Serializable {

    @NotNull
    @Size(min = 10, max = 14, message= "Telephone number is not valid")
    private String phoneNumber;
    private String userName;
    private String language;

}