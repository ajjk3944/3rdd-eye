package S5;

import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BalloonAlign.kt */
/* loaded from: classes2.dex */
public final class k {
    private static final /* synthetic */ InterfaceC4463a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k START = new k("START", 0);
    public static final k END = new k("END", 1);
    public static final k TOP = new k("TOP", 2);
    public static final k BOTTOM = new k("BOTTOM", 3);

    private static final /* synthetic */ k[] $values() {
        return new k[]{START, END, TOP, BOTTOM};
    }

    static {
        k[] kVarArr$values = $values();
        $VALUES = kVarArr$values;
        $ENTRIES = com.google.gson.internal.c.l(kVarArr$values);
    }

    private k(String str, int i) {
    }

    public static InterfaceC4463a<k> getEntries() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
