package w9;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class l {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l Default = new l("Default", 0);
    public static final l Alert = new l("Alert", 1);

    private static final /* synthetic */ l[] $values() {
        return new l[]{Default, Alert};
    }

    static {
        l[] lVarArr$values = $values();
        $VALUES = lVarArr$values;
        $ENTRIES = AbstractC5827b.a(lVarArr$values);
    }

    private l(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
