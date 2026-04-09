package S5;

import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ArrowOrientationRules.kt */
/* loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ InterfaceC4463a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ALIGN_ANCHOR = new b("ALIGN_ANCHOR", 0);
    public static final b ALIGN_FIXED = new b("ALIGN_FIXED", 1);

    private static final /* synthetic */ b[] $values() {
        return new b[]{ALIGN_ANCHOR, ALIGN_FIXED};
    }

    static {
        b[] bVarArr$values = $values();
        $VALUES = bVarArr$values;
        $ENTRIES = com.google.gson.internal.c.l(bVarArr$values);
    }

    private b(String str, int i) {
    }

    public static InterfaceC4463a<b> getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
