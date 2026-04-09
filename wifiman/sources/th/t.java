package th;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class t {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t PUBLIC = new t("PUBLIC", 0);
    public static final t PROTECTED = new t("PROTECTED", 1);
    public static final t INTERNAL = new t("INTERNAL", 2);
    public static final t PRIVATE = new t("PRIVATE", 3);

    private static final /* synthetic */ t[] $values() {
        return new t[]{PUBLIC, PROTECTED, INTERNAL, PRIVATE};
    }

    static {
        t[] tVarArr$values = $values();
        $VALUES = tVarArr$values;
        $ENTRIES = AbstractC5827b.a(tVarArr$values);
    }

    private t(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
