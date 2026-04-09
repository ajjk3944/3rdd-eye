package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;

/* loaded from: classes3.dex */
public enum SemanticLabel {
    UNLABELED(0),
    SKY(1),
    BUILDING(2),
    TREE(3),
    ROAD(4),
    SIDEWALK(5),
    TERRAIN(6),
    STRUCTURE(7),
    OBJECT(8),
    VEHICLE(9),
    PERSON(10),
    WATER(11);

    final int nativeCode;

    SemanticLabel(int i10) {
        this.nativeCode = i10;
    }

    static SemanticLabel forNumber(int i10) {
        for (SemanticLabel semanticLabel : values()) {
            if (semanticLabel.nativeCode == i10) {
                return semanticLabel;
            }
        }
        throw new FatalException(F.b((byte) 49, i10, "Unexpected value for native SemanticLabel, value="));
    }
}
