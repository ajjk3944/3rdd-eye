package com.github.mikephil.charting.charts;

/* loaded from: classes.dex */
public enum ScatterChart$ScatterShape {
    SQUARE("SQUARE"),
    CIRCLE("CIRCLE"),
    TRIANGLE("TRIANGLE"),
    CROSS("CROSS"),
    X("X"),
    CHEVRON_UP("CHEVRON_UP"),
    CHEVRON_DOWN("CHEVRON_DOWN");

    private final String shapeIdentifier;

    ScatterChart$ScatterShape(String str) {
        this.shapeIdentifier = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.shapeIdentifier;
    }
}
