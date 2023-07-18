package cat.itacademy.barcelonactiva.cognoms.nom.s05.t02.n01.S05T02N01DebonVillagrasaMiquel.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Summary PLayer + AVG(Games) DTO Information")
public class PlayerGameDTO {
    @Schema(defaultValue = "1", description = "Player ID")
    private Integer id;

    @Schema(defaultValue = "Name", description = "Player Name")
    private String name;

    @Schema(defaultValue = "0", description = "Average mark/success")
    private double averageMark;
}
