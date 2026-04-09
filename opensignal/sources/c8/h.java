package c8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h MEMORY_CACHE = new h("MEMORY_CACHE", 0);
    public static final h MEMORY = new h("MEMORY", 1);
    public static final h DISK = new h("DISK", 2);
    public static final h NETWORK = new h("NETWORK", 3);

    private static final /* synthetic */ h[] $values() {
        return new h[]{MEMORY_CACHE, MEMORY, DISK, NETWORK};
    }

    static {
        h[] hVarArr$values = $values();
        $VALUES = hVarArr$values;
        $ENTRIES = a.a.j(hVarArr$values);
    }

    private h(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
