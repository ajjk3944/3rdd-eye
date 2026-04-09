package w9;

import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KVisibility.kt */
/* loaded from: classes3.dex */
public final class m {
    private static final /* synthetic */ InterfaceC4463a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m PUBLIC = new m("PUBLIC", 0);
    public static final m PROTECTED = new m("PROTECTED", 1);
    public static final m INTERNAL = new m("INTERNAL", 2);
    public static final m PRIVATE = new m("PRIVATE", 3);

    private static final /* synthetic */ m[] $values() {
        return new m[]{PUBLIC, PROTECTED, INTERNAL, PRIVATE};
    }

    static {
        m[] mVarArr$values = $values();
        $VALUES = mVarArr$values;
        $ENTRIES = com.google.gson.internal.c.l(mVarArr$values);
    }

    private m(String str, int i) {
    }

    public static InterfaceC4463a<m> getEntries() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
