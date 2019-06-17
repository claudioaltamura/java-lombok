package de.claudioaltamura.java.lombok;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter 
@Setter
@EqualsAndHashCode
@ToString
public class SuperHero {

  private String name;

  private String city;

}
