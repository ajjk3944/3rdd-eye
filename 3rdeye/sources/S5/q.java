package S5;

import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IconGravity.kt */
/* loaded from: classes2.dex */
public final class q {
    private static final /* synthetic */ InterfaceC4463a $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q START = new q("START", 0);
    public static final q END = new q("END", 1);
    public static final q TOP = new q("TOP", 2);
    public static final q BOTTOM = new q("BOTTOM", 3);

    private static final /* synthetic */ q[] $values() {
        return new q[]{START, END, TOP, BOTTOM};
    }

    static {
        q[] qVarArr$values = $values();
        $VALUES = qVarArr$values;
        $ENTRIES = com.google.gson.internal.c.l(qVarArr$values);
    }

    private q(String str, int i) {
    }

    public static InterfaceC4463a<q> getEntries() {
        return $ENTRIES;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
