package en;

import bh.g;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8235a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.TESTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.CONNECTED_VIA_MOBILE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.CONNECTED_VIA_WIFI.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[g.CONNECTED_TO_MOBILE_NO_INTERNET.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[g.CONNECTED_TO_WIFI_NO_INTERNET.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[g.CONNECTED_TO_MOBILE_POSSIBLE_ISSUES.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[g.CONNECTED_TO_WIFI_POSSIBLE_ISSUES.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[g.WEAK_MOBILE_CONNECTION.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[g.WEAK_WIFI_CONNECTION.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[g.NO_MOBILE_CONNECTION.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[g.NO_WIFI_CONNECTION.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        f8235a = iArr;
    }
}
