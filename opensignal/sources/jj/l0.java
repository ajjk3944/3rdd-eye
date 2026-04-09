package jj;

/* loaded from: classes.dex */
public abstract /* synthetic */ class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13743a;

    static {
        int[] iArr = new int[o0.values().length];
        try {
            iArr[o0.APP_LIFECYCLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o0.CELLULAR_CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o0.CELLULAR_DISCONNECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[o0.WIFI_CONNECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[o0.WIFI_CONNECTED_TO_SSID.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[o0.WIFI_DISCONNECTED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[o0.WIFI_ON.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[o0.WIFI_OFF.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[o0.POWER_CONNECTED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[o0.POWER_DISCONNECTED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[o0.DEVICE_BOOT.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[o0.DEVICE_SHUTDOWN.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[o0.BATTERY_LOW.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[o0.BATTERY_OK.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[o0.SCREEN_ON.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[o0.SCREEN_OFF.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[o0.AUDIO_ON_CALL.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[o0.AUDIO_NOT_ON_CALL.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[o0.AUDIO_ON_TELEPHONY_CALL.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[o0.AUDIO_NOT_ON_TELEPHONY_CALL.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[o0.AUDIO_ON_VOIP_CALL.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[o0.AUDIO_NOT_ON_VOIP_CALL.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[o0.LOCATION_HAS_IMPROVED.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[o0.LOCATION_EXPIRED.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[o0.LOCATION_ENABLED_MANDATORY.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[o0.LOCATION_ENABLED_OPTIONAL.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[o0.LOCATION_DISABLED_MANDATORY.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[o0.LOCATION_DISABLED_OPTIONAL.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[o0.APP_FOREGROUND.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[o0.APP_BACKGROUND.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[o0.APP_BUCKET_ACTIVE.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[o0.APP_BUCKET_WORKING_SET.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[o0.APP_BUCKET_FREQUENT.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[o0.APP_BUCKET_RARE.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[o0.APP_BUCKET_RESTRICTED.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[o0.TWO_G_CONNECTED.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[o0.TWO_G_DISCONNECTED.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr[o0.THREE_G_CONNECTED.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr[o0.THREE_G_DISCONNECTED.ordinal()] = 39;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr[o0.FOUR_G_CONNECTED.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr[o0.FOUR_G_DISCONNECTED.ordinal()] = 41;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr[o0.FIVE_G_CONNECTED.ordinal()] = 42;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr[o0.FIVE_G_DISCONNECTED.ordinal()] = 43;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr[o0.FIVE_G_AVAILABLE.ordinal()] = 44;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr[o0.FIVE_G_MMWAVE_ENABLED.ordinal()] = 45;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr[o0.FIVE_G_MMWAVE_DISABLED.ordinal()] = 46;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr[o0.FIVE_G_STANDALONE_CONNECTED.ordinal()] = 47;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr[o0.FIVE_G_STANDALONE_DISCONNECTED.ordinal()] = 48;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr[o0.CDMA_CELL.ordinal()] = 49;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr[o0.WCDMA_CELL.ordinal()] = 50;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr[o0.GSM_CELL.ordinal()] = 51;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr[o0.NR_CELL.ordinal()] = 52;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr[o0.LTE_CELL.ordinal()] = 53;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr[o0.NETWORK_CONNECTED.ordinal()] = 54;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr[o0.NETWORK_DISCONNECTED.ordinal()] = 55;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr[o0.CONNECTION_CHANGED.ordinal()] = 56;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr[o0.WIFI_SCAN.ordinal()] = 57;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr[o0.NETWORK_BLOCKED.ordinal()] = 58;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr[o0.NETWORK_UNBLOCKED.ordinal()] = 59;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr[o0.APP_ACTIVE_OR_SCREEN_UNLOCKED.ordinal()] = 60;
        } catch (NoSuchFieldError unused60) {
        }
        f13743a = iArr;
    }
}
