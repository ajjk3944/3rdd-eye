package jj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h0 {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ h0[] $VALUES;
    public static final g0 Companion;
    private final o0 triggerType;
    public static final h0 TWO_G_CONNECTED = new h0("TWO_G_CONNECTED", 0, o0.TWO_G_CONNECTED);
    public static final h0 TWO_G_DISCONNECTED = new h0("TWO_G_DISCONNECTED", 1, o0.TWO_G_DISCONNECTED);
    public static final h0 THREE_G_CONNECTED = new h0("THREE_G_CONNECTED", 2, o0.THREE_G_CONNECTED);
    public static final h0 THREE_G_DISCONNECTED = new h0("THREE_G_DISCONNECTED", 3, o0.THREE_G_DISCONNECTED);
    public static final h0 FOUR_G_CONNECTED = new h0("FOUR_G_CONNECTED", 4, o0.FOUR_G_CONNECTED);
    public static final h0 FOUR_G_DISCONNECTED = new h0("FOUR_G_DISCONNECTED", 5, o0.FOUR_G_DISCONNECTED);
    public static final h0 FIVE_G_CONNECTED = new h0("FIVE_G_CONNECTED", 6, o0.FIVE_G_CONNECTED);
    public static final h0 FIVE_G_DISCONNECTED = new h0("FIVE_G_DISCONNECTED", 7, o0.FIVE_G_DISCONNECTED);
    public static final h0 FIVE_G_AVAILABLE = new h0("FIVE_G_AVAILABLE", 8, o0.FIVE_G_AVAILABLE);
    public static final h0 FIVE_G_MMWAVE_ENABLED = new h0("FIVE_G_MMWAVE_ENABLED", 9, o0.FIVE_G_MMWAVE_ENABLED);
    public static final h0 FIVE_G_MMWAVE_DISABLED = new h0("FIVE_G_MMWAVE_DISABLED", 10, o0.FIVE_G_MMWAVE_DISABLED);
    public static final h0 FIVE_G_STANDALONE_CONNECTED = new h0("FIVE_G_STANDALONE_CONNECTED", 11, o0.FIVE_G_STANDALONE_CONNECTED);
    public static final h0 FIVE_G_STANDALONE_DISCONNECTED = new h0("FIVE_G_STANDALONE_DISCONNECTED", 12, o0.FIVE_G_STANDALONE_DISCONNECTED);

    private static final /* synthetic */ h0[] $values() {
        return new h0[]{TWO_G_CONNECTED, TWO_G_DISCONNECTED, THREE_G_CONNECTED, THREE_G_DISCONNECTED, FOUR_G_CONNECTED, FOUR_G_DISCONNECTED, FIVE_G_CONNECTED, FIVE_G_DISCONNECTED, FIVE_G_AVAILABLE, FIVE_G_MMWAVE_ENABLED, FIVE_G_MMWAVE_DISABLED, FIVE_G_STANDALONE_CONNECTED, FIVE_G_STANDALONE_DISCONNECTED};
    }

    static {
        h0[] h0VarArr$values = $values();
        $VALUES = h0VarArr$values;
        $ENTRIES = a.a.j(h0VarArr$values);
        Companion = new g0();
    }

    private h0(String str, int i10, o0 o0Var) {
        this.triggerType = o0Var;
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

    public final o0 getTriggerType() {
        return this.triggerType;
    }
}
