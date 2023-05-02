package Explorers;

import Planets.Mars;
import Planets.Planet;
import Planets.Mercury;
import Planets.Saturn;
import Planets.Jupiter;
import Planets.Uranus;

public interface Explorer {

    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Jupiter jupiter);

    void visit(Uranus uranus);

    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}