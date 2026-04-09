package nf;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d NOTHING = new d("NOTHING", 0);
    public static final d TEST = new d("TEST", 1);
    public static final d METERED_NETWORK_WARNING = new d("METERED_NETWORK_WARNING", 2);

    private static final /* synthetic */ d[] $values() {
        return new d[]{NOTHING, TEST, METERED_NETWORK_WARNING};
    }

    static {
        d[] dVarArr$values = $values();
        $VALUES = dVarArr$values;
        $ENTRIES = AbstractC5827b.a(dVarArr$values);
    }

    private d(String str, int i10) {
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
}
