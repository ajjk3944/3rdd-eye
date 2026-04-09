package zt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h0 {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ h0[] $VALUES;
    public static final h0 START = new h0("START", 0);
    public static final h0 STOP = new h0("STOP", 1);
    public static final h0 STOP_AND_RESET_REPLAY_CACHE = new h0("STOP_AND_RESET_REPLAY_CACHE", 2);

    private static final /* synthetic */ h0[] $values() {
        return new h0[]{START, STOP, STOP_AND_RESET_REPLAY_CACHE};
    }

    static {
        h0[] h0VarArr$values = $values();
        $VALUES = h0VarArr$values;
        $ENTRIES = a.a.j(h0VarArr$values);
    }

    private h0(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }
}
