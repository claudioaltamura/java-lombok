package de.claudioaltamura.java.lombok;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Weapon {

    private final int id;
    private final String name;

}