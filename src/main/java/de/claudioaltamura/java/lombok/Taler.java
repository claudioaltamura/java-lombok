package de.claudioaltamura.java.lombok;

import lombok.ToString;
import lombok.Value;

@Value(staticConstructor="of")
@ToString(includeFieldNames=false)
public class Taler {

    int num;

}
