package S5;

import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ArrowPositionRules.kt */
/* loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ InterfaceC4463a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ALIGN_BALLOON = new c("ALIGN_BALLOON", 0);
    public static final c ALIGN_ANCHOR = new c("ALIGN_ANCHOR", 1);

    private static final /* synthetic */ c[] $values() {
        return new c[]{ALIGN_BALLOON, ALIGN_ANCHOR};
    }

    static {
        c[] cVarArr$values = $values();
        $VALUES = cVarArr$values;
        $ENTRIES = com.google.gson.internal.c.l(cVarArr$values);
    }

    private c(String str, int i) {
    }

    public static InterfaceC4463a<c> getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
