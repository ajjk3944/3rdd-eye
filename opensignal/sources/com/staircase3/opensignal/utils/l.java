package com.staircase3.opensignal.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l OUT_OF_SERVICE = new l("OUT_OF_SERVICE", 0);
    public static final l EMERGENCY_CALLS_ONLY = new l("EMERGENCY_CALLS_ONLY", 1);
    public static final l CELL_RADIO_OFF = new l("CELL_RADIO_OFF", 2);
    public static final l UNKNOWN = new l("UNKNOWN", 3);
    public static final l TWO_G = new l("TWO_G", 4);
    public static final l THREE_G = new l("THREE_G", 5);
    public static final l FOUR_G = new l("FOUR_G", 6);
    public static final l FIVE_G = new l("FIVE_G", 7);
    public static final l THREE_POINT5_G = new l("THREE_POINT5_G", 8);
    public static final l IWLAN = new l("IWLAN", 9);

    private static final /* synthetic */ l[] $values() {
        return new l[]{OUT_OF_SERVICE, EMERGENCY_CALLS_ONLY, CELL_RADIO_OFF, UNKNOWN, TWO_G, THREE_G, FOUR_G, FIVE_G, THREE_POINT5_G, IWLAN};
    }

    static {
        l[] lVarArr$values = $values();
        $VALUES = lVarArr$values;
        $ENTRIES = a.a.j(lVarArr$values);
    }

    private l(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
