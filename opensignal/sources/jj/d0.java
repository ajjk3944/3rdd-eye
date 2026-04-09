package jj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d0 {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ d0[] $VALUES;
    public static final c0 Companion;
    private final o0 triggerType;
    public static final d0 CONNECTED = new d0("CONNECTED", 0, o0.NETWORK_CONNECTED);
    public static final d0 DISCONNECTED = new d0("DISCONNECTED", 1, o0.NETWORK_DISCONNECTED);

    private static final /* synthetic */ d0[] $values() {
        return new d0[]{CONNECTED, DISCONNECTED};
    }

    static {
        d0[] d0VarArr$values = $values();
        $VALUES = d0VarArr$values;
        $ENTRIES = a.a.j(d0VarArr$values);
        Companion = new c0();
    }

    private d0(String str, int i10, o0 o0Var) {
        this.triggerType = o0Var;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) $VALUES.clone();
    }

    public final o0 getTriggerType() {
        return this.triggerType;
    }
}
