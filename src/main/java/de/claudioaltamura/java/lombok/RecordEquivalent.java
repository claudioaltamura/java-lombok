package de.claudioaltamura.java.lombok;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@Getter
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class RecordEquivalent {
    private final UUID id;
}
