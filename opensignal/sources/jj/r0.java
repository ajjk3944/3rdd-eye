package jj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r0 {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ r0[] $VALUES;
    public static final r0 CONNECTED = new r0("CONNECTED", 0, o0.WIFI_CONNECTED);
    public static final r0 CONNECTED_TO_SSID = new r0("CONNECTED_TO_SSID", 1, o0.WIFI_CONNECTED_TO_SSID);
    public static final r0 DISCONNECTED = new r0("DISCONNECTED", 2, o0.WIFI_DISCONNECTED);
    private final o0 triggerType;

    private static final /* synthetic */ r0[] $values() {
        return new r0[]{CONNECTED, CONNECTED_TO_SSID, DISCONNECTED};
    }

    static {
        r0[] r0VarArr$values = $values();
        $VALUES = r0VarArr$values;
        $ENTRIES = a.a.j(r0VarArr$values);
    }

    private r0(String str, int i10, o0 o0Var) {
        this.triggerType = o0Var;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) $VALUES.clone();
    }

    public final o0 getTriggerType() {
        return this.triggerType;
    }
}
