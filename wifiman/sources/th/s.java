package th;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class s {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s INVARIANT = new s("INVARIANT", 0);
    public static final s IN = new s("IN", 1);
    public static final s OUT = new s("OUT", 2);

    private static final /* synthetic */ s[] $values() {
        return new s[]{INVARIANT, IN, OUT};
    }

    static {
        s[] sVarArr$values = $values();
        $VALUES = sVarArr$values;
        $ENTRIES = AbstractC5827b.a(sVarArr$values);
    }

    private s(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
