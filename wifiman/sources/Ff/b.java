package Ff;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
final class b {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b VISIBLE = new b("VISIBLE", 0);
    public static final b SPACER = new b("SPACER", 1);
    public static final b HIDDEN = new b("HIDDEN", 2);

    private static final /* synthetic */ b[] $values() {
        return new b[]{VISIBLE, SPACER, HIDDEN};
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
