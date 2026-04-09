package T7;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b LIGHT = new b("LIGHT", 0);
    public static final b DARK = new b("DARK", 1);
    public static final b SYSTEM = new b("SYSTEM", 2);

    private static final /* synthetic */ b[] $values() {
        return new b[]{LIGHT, DARK, SYSTEM};
    }

    static {
        b[] bVarArr$values = $values();
        $VALUES = bVarArr$values;
        $ENTRIES = AbstractC5827b.a(bVarArr$values);
    }

    private b(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
