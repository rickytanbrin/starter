package id.co.ricky.template.domain;

import lombok.*;

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
@EqualsAndHashCode(callSuper=false)
public class ObjectResponse implements Serializable {

    private String responseStatus;
}
