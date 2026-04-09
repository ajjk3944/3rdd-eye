package bn;

import bh.m;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2843a;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.TURN_AIRPLANE_MODE_OFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.TURN_ON_MOBILE_DATA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m.CONNECT_TO_WIFI_ROUTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[m.TURN_OFF_WIFI.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[m.SWITCH_DATA_TO_OTHER_SIM.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[m.CONNECT_TO_ANOTHER_WIFI_ROUTER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[m.TURN_AIRPLANE_MODE_ON_OFF.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[m.LOG_IN_THE_WIFI_NETWORK.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[m.MOVE_CLOSER_TO_WIFI_ROUTER.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[m.MOVE_CLOSER_TO_MOBILE_ANTENNA.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f2843a = iArr;
    }
}
