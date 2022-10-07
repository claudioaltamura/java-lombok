package de.claudioaltamura.java.lombok;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class City {
    private String name;
    private String code;
}
