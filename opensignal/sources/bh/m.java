package bh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final l Companion;

    /* renamed from: id, reason: collision with root package name */
    private final int f2760id;
    private final String uri;
    public static final m TURN_AIRPLANE_MODE_OFF = new m("TURN_AIRPLANE_MODE_OFF", 0, 1, "android.settings.AIRPLANE_MODE_SETTINGS");
    public static final m TURN_ON_MOBILE_DATA = new m("TURN_ON_MOBILE_DATA", 1, 2, "android.settings.panel.action.INTERNET_CONNECTIVITY");
    public static final m CONNECT_TO_WIFI_ROUTER = new m("CONNECT_TO_WIFI_ROUTER", 2, 3, "android.settings.panel.action.INTERNET_CONNECTIVITY");
    public static final m TURN_OFF_WIFI = new m("TURN_OFF_WIFI", 3, 4, "android.settings.panel.action.INTERNET_CONNECTIVITY");
    public static final m SWITCH_DATA_TO_OTHER_SIM = new m("SWITCH_DATA_TO_OTHER_SIM", 4, 5, null);
    public static final m CONNECT_TO_ANOTHER_WIFI_ROUTER = new m("CONNECT_TO_ANOTHER_WIFI_ROUTER", 5, 6, "android.settings.WIFI_SETTINGS");
    public static final m TURN_AIRPLANE_MODE_ON_OFF = new m("TURN_AIRPLANE_MODE_ON_OFF", 6, 7, "android.settings.AIRPLANE_MODE_SETTINGS");
    public static final m LOG_IN_THE_WIFI_NETWORK = new m("LOG_IN_THE_WIFI_NETWORK", 7, 8, "android.settings.panel.action.INTERNET_CONNECTIVITY");
    public static final m MOVE_CLOSER_TO_WIFI_ROUTER = new m("MOVE_CLOSER_TO_WIFI_ROUTER", 8, 9, null);
    public static final m MOVE_CLOSER_TO_MOBILE_ANTENNA = new m("MOVE_CLOSER_TO_MOBILE_ANTENNA", 9, 10, null);

    private static final /* synthetic */ m[] $values() {
        return new m[]{TURN_AIRPLANE_MODE_OFF, TURN_ON_MOBILE_DATA, CONNECT_TO_WIFI_ROUTER, TURN_OFF_WIFI, SWITCH_DATA_TO_OTHER_SIM, CONNECT_TO_ANOTHER_WIFI_ROUTER, TURN_AIRPLANE_MODE_ON_OFF, LOG_IN_THE_WIFI_NETWORK, MOVE_CLOSER_TO_WIFI_ROUTER, MOVE_CLOSER_TO_MOBILE_ANTENNA};
    }

    static {
        m[] mVarArr$values = $values();
        $VALUES = mVarArr$values;
        $ENTRIES = a.a.j(mVarArr$values);
        Companion = new l();
    }

    private m(String str, int i10, int i11, String str2) {
        this.f2760id = i11;
        this.uri = str2;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    public final int getId() {
        return this.f2760id;
    }

    public final String getUri() {
        return this.uri;
    }
}
