package com.tunisfood.models;

import java.util.ArrayList;
import java.util.List;

public class Panier {
    private List<Plat> plats = new ArrayList<>();

    public void ajouterPlat(Plat plat) {
        plats.add(plat);
    }

    public List<Plat> getPlats() {
        return plats;
    }
}