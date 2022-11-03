package de.claudioaltamura.java.lombok;

import lombok.ToString;
import lombok.Value;

@ToString(includeFieldNames=false)
@Value(staticConstructor="of")
public class Taler {

    int num;

}
