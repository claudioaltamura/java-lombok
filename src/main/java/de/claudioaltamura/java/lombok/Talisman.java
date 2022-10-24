package de.claudioaltamura.java.lombok;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@Builder(access = AccessLevel.PACKAGE)
@FieldDefaults(makeFinal=true, level=AccessLevel.PRIVATE)
public class Talisman {

    @Builder.Default
    long created = System.currentTimeMillis();

    String name;
}
