package Uc;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    private final String[] keys;
    public static final d TYPE = new d("TYPE", 0, "serviceType");
    public static final d ID = new d("ID", 1, "serviceId");

    private static final /* synthetic */ d[] $values() {
        return new d[]{TYPE, ID};
    }

    static {
        d[] dVarArr$values = $values();
        $VALUES = dVarArr$values;
        $ENTRIES = AbstractC5827b.a(dVarArr$values);
    }

    private d(String str, int i10, String... strArr) {
        this.keys = strArr;
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final String[] getKeys() {
        return this.keys;
    }
}
