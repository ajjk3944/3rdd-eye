package jj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o0 {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ o0[] $VALUES;
    public static final n0 Companion;
    public static final o0 APP_LIFECYCLE = new o0("APP_LIFECYCLE", 0);
    public static final o0 WIFI_ON = new o0("WIFI_ON", 1);
    public static final o0 WIFI_OFF = new o0("WIFI_OFF", 2);
    public static final o0 WIFI_CONNECTED = new o0("WIFI_CONNECTED", 3);
    public static final o0 WIFI_CONNECTED_TO_SSID = new o0("WIFI_CONNECTED_TO_SSID", 4);
    public static final o0 WIFI_DISCONNECTED = new o0("WIFI_DISCONNECTED", 5);
    public static final o0 CELLULAR_CONNECTED = new o0("CELLULAR_CONNECTED", 6);
    public static final o0 CELLULAR_DISCONNECTED = new o0("CELLULAR_DISCONNECTED", 7);
    public static final o0 POWER_CONNECTED = new o0("POWER_CONNECTED", 8);
    public static final o0 POWER_DISCONNECTED = new o0("POWER_DISCONNECTED", 9);
    public static final o0 DEVICE_BOOT = new o0("DEVICE_BOOT", 10);
    public static final o0 DEVICE_SHUTDOWN = new o0("DEVICE_SHUTDOWN", 11);
    public static final o0 BATTERY_LOW = new o0("BATTERY_LOW", 12);
    public static final o0 BATTERY_OK = new o0("BATTERY_OK", 13);
    public static final o0 SCREEN_ON = new o0("SCREEN_ON", 14);
    public static final o0 SCREEN_OFF = new o0("SCREEN_OFF", 15);
    public static final o0 LOCATION_ENABLED_MANDATORY = new o0("LOCATION_ENABLED_MANDATORY", 16);
    public static final o0 LOCATION_ENABLED_OPTIONAL = new o0("LOCATION_ENABLED_OPTIONAL", 17);
    public static final o0 LOCATION_DISABLED_MANDATORY = new o0("LOCATION_DISABLED_MANDATORY", 18);
    public static final o0 LOCATION_DISABLED_OPTIONAL = new o0("LOCATION_DISABLED_OPTIONAL", 19);
    public static final o0 LOCATION_EXPIRED = new o0("LOCATION_EXPIRED", 20);
    public static final o0 APP_FOREGROUND = new o0("APP_FOREGROUND", 21);
    public static final o0 APP_BACKGROUND = new o0("APP_BACKGROUND", 22);
    public static final o0 APP_BUCKET_ACTIVE = new o0("APP_BUCKET_ACTIVE", 23);
    public static final o0 APP_BUCKET_WORKING_SET = new o0("APP_BUCKET_WORKING_SET", 24);
    public static final o0 APP_BUCKET_FREQUENT = new o0("APP_BUCKET_FREQUENT", 25);
    public static final o0 APP_BUCKET_RARE = new o0("APP_BUCKET_RARE", 26);
    public static final o0 APP_BUCKET_RESTRICTED = new o0("APP_BUCKET_RESTRICTED", 27);
    public static final o0 TWO_G_CONNECTED = new o0("TWO_G_CONNECTED", 28);
    public static final o0 TWO_G_DISCONNECTED = new o0("TWO_G_DISCONNECTED", 29);
    public static final o0 THREE_G_CONNECTED = new o0("THREE_G_CONNECTED", 30);
    public static final o0 THREE_G_DISCONNECTED = new o0("THREE_G_DISCONNECTED", 31);
    public static final o0 FOUR_G_CONNECTED = new o0("FOUR_G_CONNECTED", 32);
    public static final o0 FOUR_G_DISCONNECTED = new o0("FOUR_G_DISCONNECTED", 33);
    public static final o0 FIVE_G_CONNECTED = new o0("FIVE_G_CONNECTED", 34);
    public static final o0 FIVE_G_DISCONNECTED = new o0("FIVE_G_DISCONNECTED", 35);
    public static final o0 FIVE_G_AVAILABLE = new o0("FIVE_G_AVAILABLE", 36);
    public static final o0 FIVE_G_MMWAVE_ENABLED = new o0("FIVE_G_MMWAVE_ENABLED", 37);
    public static final o0 FIVE_G_MMWAVE_DISABLED = new o0("FIVE_G_MMWAVE_DISABLED", 38);
    public static final o0 FIVE_G_STANDALONE_CONNECTED = new o0("FIVE_G_STANDALONE_CONNECTED", 39);
    public static final o0 FIVE_G_STANDALONE_DISCONNECTED = new o0("FIVE_G_STANDALONE_DISCONNECTED", 40);
    public static final o0 LOCATION_HAS_IMPROVED = new o0("LOCATION_HAS_IMPROVED", 41);
    public static final o0 AUDIO_ON_CALL = new o0("AUDIO_ON_CALL", 42);
    public static final o0 AUDIO_NOT_ON_CALL = new o0("AUDIO_NOT_ON_CALL", 43);
    public static final o0 AUDIO_ON_TELEPHONY_CALL = new o0("AUDIO_ON_TELEPHONY_CALL", 44);
    public static final o0 AUDIO_NOT_ON_TELEPHONY_CALL = new o0("AUDIO_NOT_ON_TELEPHONY_CALL", 45);
    public static final o0 AUDIO_ON_VOIP_CALL = new o0("AUDIO_ON_VOIP_CALL", 46);
    public static final o0 AUDIO_NOT_ON_VOIP_CALL = new o0("AUDIO_NOT_ON_VOIP_CALL", 47);
    public static final o0 LTE_CELL = new o0("LTE_CELL", 48);
    public static final o0 NR_CELL = new o0("NR_CELL", 49);
    public static final o0 GSM_CELL = new o0("GSM_CELL", 50);
    public static final o0 CDMA_CELL = new o0("CDMA_CELL", 51);
    public static final o0 WCDMA_CELL = new o0("WCDMA_CELL", 52);
    public static final o0 NETWORK_CONNECTED = new o0("NETWORK_CONNECTED", 53);
    public static final o0 NETWORK_DISCONNECTED = new o0("NETWORK_DISCONNECTED", 54);
    public static final o0 CONNECTION_CHANGED = new o0("CONNECTION_CHANGED", 55);
    public static final o0 WIFI_SCAN = new o0("WIFI_SCAN", 56);
    public static final o0 NETWORK_BLOCKED = new o0("NETWORK_BLOCKED", 57);
    public static final o0 NETWORK_UNBLOCKED = new o0("NETWORK_UNBLOCKED", 58);
    public static final o0 APP_ACTIVE_OR_SCREEN_UNLOCKED = new o0("APP_ACTIVE_OR_SCREEN_UNLOCKED", 59);

    private static final /* synthetic */ o0[] $values() {
        return new o0[]{APP_LIFECYCLE, WIFI_ON, WIFI_OFF, WIFI_CONNECTED, WIFI_CONNECTED_TO_SSID, WIFI_DISCONNECTED, CELLULAR_CONNECTED, CELLULAR_DISCONNECTED, POWER_CONNECTED, POWER_DISCONNECTED, DEVICE_BOOT, DEVICE_SHUTDOWN, BATTERY_LOW, BATTERY_OK, SCREEN_ON, SCREEN_OFF, LOCATION_ENABLED_MANDATORY, LOCATION_ENABLED_OPTIONAL, LOCATION_DISABLED_MANDATORY, LOCATION_DISABLED_OPTIONAL, LOCATION_EXPIRED, APP_FOREGROUND, APP_BACKGROUND, APP_BUCKET_ACTIVE, APP_BUCKET_WORKING_SET, APP_BUCKET_FREQUENT, APP_BUCKET_RARE, APP_BUCKET_RESTRICTED, TWO_G_CONNECTED, TWO_G_DISCONNECTED, THREE_G_CONNECTED, THREE_G_DISCONNECTED, FOUR_G_CONNECTED, FOUR_G_DISCONNECTED, FIVE_G_CONNECTED, FIVE_G_DISCONNECTED, FIVE_G_AVAILABLE, FIVE_G_MMWAVE_ENABLED, FIVE_G_MMWAVE_DISABLED, FIVE_G_STANDALONE_CONNECTED, FIVE_G_STANDALONE_DISCONNECTED, LOCATION_HAS_IMPROVED, AUDIO_ON_CALL, AUDIO_NOT_ON_CALL, AUDIO_ON_TELEPHONY_CALL, AUDIO_NOT_ON_TELEPHONY_CALL, AUDIO_ON_VOIP_CALL, AUDIO_NOT_ON_VOIP_CALL, LTE_CELL, NR_CELL, GSM_CELL, CDMA_CELL, WCDMA_CELL, NETWORK_CONNECTED, NETWORK_DISCONNECTED, CONNECTION_CHANGED, WIFI_SCAN, NETWORK_BLOCKED, NETWORK_UNBLOCKED, APP_ACTIVE_OR_SCREEN_UNLOCKED};
    }

    static {
        o0[] o0VarArr$values = $values();
        $VALUES = o0VarArr$values;
        $ENTRIES = a.a.j(o0VarArr$values);
        Companion = new n0();
    }

    private o0(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() throws CloneNotSupportedException {
        return (o0[]) $VALUES.clone();
    }
}
