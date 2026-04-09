package bh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final d Companion;

    /* renamed from: id, reason: collision with root package name */
    private final int f2751id;
    public static final e DATA_DISABLED_DUE_TO_POLICY = new e("DATA_DISABLED_DUE_TO_POLICY", 0, 1);
    public static final e DATA_DISABLED_DUE_TO_CARRIER = new e("DATA_DISABLED_DUE_TO_CARRIER", 1, 2);
    public static final e DATA_DISABLED_DUE_TO_DEVICE_OVERHEATING = new e("DATA_DISABLED_DUE_TO_DEVICE_OVERHEATING", 2, 3);
    public static final e AIRPLANE_MODE_ON = new e("AIRPLANE_MODE_ON", 3, 4);
    public static final e MOBILE_DATA_DISABLED = new e("MOBILE_DATA_DISABLED", 4, 5);
    public static final e ROAMING_DATA_DISABLED = new e("ROAMING_DATA_DISABLED", 5, 6);
    public static final e CONNECTED_TO_MOBILE_NETWORK_BUT_HAS_INTERNET_ISSUES = new e("CONNECTED_TO_MOBILE_NETWORK_BUT_HAS_INTERNET_ISSUES", 6, 7);
    public static final e CONNECTED_TO_WIFI_REQUIRES_LOGIN = new e("CONNECTED_TO_WIFI_REQUIRES_LOGIN", 7, 8);
    public static final e CONNECTED_TO_WIFI_BUT_HAS_INTERNET_ISSUES = new e("CONNECTED_TO_WIFI_BUT_HAS_INTERNET_ISSUES", 8, 9);
    public static final e PROBLEM_WITH_INTERNET_CONNECTION = new e("PROBLEM_WITH_INTERNET_CONNECTION", 9, 10);
    public static final e POOR_WIFI_SIGNAL = new e("POOR_WIFI_SIGNAL", 10, 11);
    public static final e POOR_4G_MOBILE_SIGNAL = new e("POOR_4G_MOBILE_SIGNAL", 11, 12);
    public static final e POWER_SAVING_MODE_ON = new e("POWER_SAVING_MODE_ON", 12, 13);
    public static final e MOBILE_CONNECTION_SLOW = new e("MOBILE_CONNECTION_SLOW", 13, 14);
    public static final e INTERNET_CONNECTION_SLOWER_THAN_USUAL = new e("INTERNET_CONNECTION_SLOWER_THAN_USUAL", 14, 15);
    public static final e CONNECTED_TO_2G_NETWORK = new e("CONNECTED_TO_2G_NETWORK", 15, 16);
    public static final e POOR_3G_MOBILE_SIGNAL = new e("POOR_3G_MOBILE_SIGNAL", 16, 17);
    public static final e POOR_5G_MOBILE_SIGNAL = new e("POOR_5G_MOBILE_SIGNAL", 17, 18);
    public static final e MOBILE_NETWORK_CONGESTED = new e("MOBILE_NETWORK_CONGESTED", 18, 19);

    private static final /* synthetic */ e[] $values() {
        return new e[]{DATA_DISABLED_DUE_TO_POLICY, DATA_DISABLED_DUE_TO_CARRIER, DATA_DISABLED_DUE_TO_DEVICE_OVERHEATING, AIRPLANE_MODE_ON, MOBILE_DATA_DISABLED, ROAMING_DATA_DISABLED, CONNECTED_TO_MOBILE_NETWORK_BUT_HAS_INTERNET_ISSUES, CONNECTED_TO_WIFI_REQUIRES_LOGIN, CONNECTED_TO_WIFI_BUT_HAS_INTERNET_ISSUES, PROBLEM_WITH_INTERNET_CONNECTION, POOR_WIFI_SIGNAL, POOR_4G_MOBILE_SIGNAL, POWER_SAVING_MODE_ON, MOBILE_CONNECTION_SLOW, INTERNET_CONNECTION_SLOWER_THAN_USUAL, CONNECTED_TO_2G_NETWORK, POOR_3G_MOBILE_SIGNAL, POOR_5G_MOBILE_SIGNAL, MOBILE_NETWORK_CONGESTED};
    }

    static {
        e[] eVarArr$values = $values();
        $VALUES = eVarArr$values;
        $ENTRIES = a.a.j(eVarArr$values);
        Companion = new d();
    }

    private e(String str, int i10, int i11) {
        this.f2751id = i11;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final int getId() {
        return this.f2751id;
    }
}
