package Oh;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c INFLEXIBLE = new c("INFLEXIBLE", 0);
    public static final c FLEXIBLE_UPPER_BOUND = new c("FLEXIBLE_UPPER_BOUND", 1);
    public static final c FLEXIBLE_LOWER_BOUND = new c("FLEXIBLE_LOWER_BOUND", 2);

    private static final /* synthetic */ c[] $values() {
        return new c[]{INFLEXIBLE, FLEXIBLE_UPPER_BOUND, FLEXIBLE_LOWER_BOUND};
    }

    static {
        c[] cVarArr$values = $values();
        $VALUES = cVarArr$values;
        $ENTRIES = AbstractC5827b.a(cVarArr$values);
    }

    private c(String str, int i10) {
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
