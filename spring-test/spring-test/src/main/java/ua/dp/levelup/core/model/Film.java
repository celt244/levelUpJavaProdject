package ua.dp.levelup.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Alexandr Shegeda on 23.06.17.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Film {

  private Long filmId;
  private String name;
  private String description;
  private double duration;

}
