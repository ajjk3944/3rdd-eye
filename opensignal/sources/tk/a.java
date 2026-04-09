package tk;

import bh.e;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22878a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.DATA_DISABLED_DUE_TO_POLICY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.DATA_DISABLED_DUE_TO_CARRIER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.DATA_DISABLED_DUE_TO_DEVICE_OVERHEATING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e.AIRPLANE_MODE_ON.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[e.MOBILE_DATA_DISABLED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[e.ROAMING_DATA_DISABLED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[e.CONNECTED_TO_MOBILE_NETWORK_BUT_HAS_INTERNET_ISSUES.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[e.CONNECTED_TO_WIFI_REQUIRES_LOGIN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[e.CONNECTED_TO_WIFI_BUT_HAS_INTERNET_ISSUES.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[e.PROBLEM_WITH_INTERNET_CONNECTION.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[e.POOR_WIFI_SIGNAL.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[e.POOR_4G_MOBILE_SIGNAL.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[e.POWER_SAVING_MODE_ON.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[e.MOBILE_CONNECTION_SLOW.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[e.INTERNET_CONNECTION_SLOWER_THAN_USUAL.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[e.CONNECTED_TO_2G_NETWORK.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[e.POOR_3G_MOBILE_SIGNAL.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[e.POOR_5G_MOBILE_SIGNAL.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[e.MOBILE_NETWORK_CONGESTED.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        f22878a = iArr;
    }
}
