package w9;

import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KVariance.kt */
/* loaded from: classes3.dex */
public final class l {
    private static final /* synthetic */ InterfaceC4463a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l INVARIANT = new l("INVARIANT", 0);
    public static final l IN = new l("IN", 1);
    public static final l OUT = new l("OUT", 2);

    private static final /* synthetic */ l[] $values() {
        return new l[]{INVARIANT, IN, OUT};
    }

    static {
        l[] lVarArr$values = $values();
        $VALUES = lVarArr$values;
        $ENTRIES = com.google.gson.internal.c.l(lVarArr$values);
    }

    private l(String str, int i) {
    }

    public static InterfaceC4463a<l> getEntries() {
        return $ENTRIES;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
