package wi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final g Companion;
    public static final h BATTERY_STATE = new h("BATTERY_STATE", 0);
    public static final h DEVICE_SHUTDOWN = new h("DEVICE_SHUTDOWN", 1);
    public static final h POWER_STATE = new h("POWER_STATE", 2);
    public static final h SCREEN_STATE = new h("SCREEN_STATE", 3);
    public static final h RADIO_STATE = new h("RADIO_STATE", 4);
    public static final h WIFI_SCAN = new h("WIFI_SCAN", 5);

    private static final /* synthetic */ h[] $values() {
        return new h[]{BATTERY_STATE, DEVICE_SHUTDOWN, POWER_STATE, SCREEN_STATE, RADIO_STATE, WIFI_SCAN};
    }

    static {
        h[] hVarArr$values = $values();
        $VALUES = hVarArr$values;
        $ENTRIES = a.a.j(hVarArr$values);
        Companion = new g();
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
