package Rh;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class h0 {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ h0[] $VALUES;
    public static final h0 FLEXIBLE_LOWER = new h0("FLEXIBLE_LOWER", 0);
    public static final h0 FLEXIBLE_UPPER = new h0("FLEXIBLE_UPPER", 1);
    public static final h0 INFLEXIBLE = new h0("INFLEXIBLE", 2);

    private static final /* synthetic */ h0[] $values() {
        return new h0[]{FLEXIBLE_LOWER, FLEXIBLE_UPPER, INFLEXIBLE};
    }

    static {
        h0[] h0VarArr$values = $values();
        $VALUES = h0VarArr$values;
        $ENTRIES = AbstractC5827b.a(h0VarArr$values);
    }

    private h0(String str, int i10) {
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }
}
