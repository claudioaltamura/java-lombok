package de.claudioaltamura.java.lombok;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Getter
@Builder(builderMethodName = "internalBuilder")
public class Weapon {

    @NonNull
    private String name;
    private String description;
    private int damage;

    public static WeaponBuilder builder(String name) {
        return internalBuilder().name(name);
    }

}
