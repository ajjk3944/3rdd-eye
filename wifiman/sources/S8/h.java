package S8;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class h {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ACCESS_POINT = new h("ACCESS_POINT", 0);
    public static final h STATION = new h("STATION", 1);
    public static final h REPEATER = new h("REPEATER", 2);

    private static final /* synthetic */ h[] $values() {
        return new h[]{ACCESS_POINT, STATION, REPEATER};
    }

    static {
        h[] hVarArr$values = $values();
        $VALUES = hVarArr$values;
        $ENTRIES = AbstractC5827b.a(hVarArr$values);
    }

    private h(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
