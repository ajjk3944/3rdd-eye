package J9;

import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Select.kt */
/* loaded from: classes3.dex */
public final class e {
    private static final /* synthetic */ InterfaceC4463a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e SUCCESSFUL = new e("SUCCESSFUL", 0);
    public static final e REREGISTER = new e("REREGISTER", 1);
    public static final e CANCELLED = new e("CANCELLED", 2);
    public static final e ALREADY_SELECTED = new e("ALREADY_SELECTED", 3);

    private static final /* synthetic */ e[] $values() {
        return new e[]{SUCCESSFUL, REREGISTER, CANCELLED, ALREADY_SELECTED};
    }

    static {
        e[] eVarArr$values = $values();
        $VALUES = eVarArr$values;
        $ENTRIES = com.google.gson.internal.c.l(eVarArr$values);
    }

    private e(String str, int i) {
    }

    public static InterfaceC4463a<e> getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
