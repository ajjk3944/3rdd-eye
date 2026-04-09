package ri;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class s {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    private final String presentation;
    public static final s IN = new s("IN", 0, "in");
    public static final s OUT = new s("OUT", 1, "out");
    public static final s INV = new s("INV", 2, "");

    private static final /* synthetic */ s[] $values() {
        return new s[]{IN, OUT, INV};
    }

    static {
        s[] sVarArr$values = $values();
        $VALUES = sVarArr$values;
        $ENTRIES = AbstractC5827b.a(sVarArr$values);
    }

    private s(String str, int i10, String str2) {
        this.presentation = str2;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.presentation;
    }
}
