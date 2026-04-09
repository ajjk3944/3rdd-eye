package com.staircase3.opensignal.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m UNKNOWN = new m("UNKNOWN", 0);
    public static final m EVDO = new m("EVDO", 1);
    public static final m GSM = new m("GSM", 2);
    public static final m CDMA = new m("CDMA", 3);
    public static final m WCDMA = new m("WCDMA", 4);
    public static final m LTE = new m("LTE", 5);
    public static final m FIVE_G = new m("FIVE_G", 6);

    private static final /* synthetic */ m[] $values() {
        return new m[]{UNKNOWN, EVDO, GSM, CDMA, WCDMA, LTE, FIVE_G};
    }

    static {
        m[] mVarArr$values = $values();
        $VALUES = mVarArr$values;
        $ENTRIES = a.a.j(mVarArr$values);
    }

    private m(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
