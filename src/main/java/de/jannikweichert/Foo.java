package de.jannikweichert;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Jannik on 21.01.16.
 */
public class Foo {

    private Set<String> elements = new HashSet<String>();

    public Set<String> getElements() {
        return elements;
    }

    public void setElements(Set<String> elements) {
        this.elements.addAll(elements);
    }
}
