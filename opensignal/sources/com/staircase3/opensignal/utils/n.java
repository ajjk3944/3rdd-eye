package com.staircase3.opensignal.utils;

/* loaded from: classes.dex */
public abstract /* synthetic */ class n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6187a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f6188b;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.OUT_OF_SERVICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.EMERGENCY_CALLS_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l.CELL_RADIO_OFF.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[l.TWO_G.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[l.THREE_G.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[l.FOUR_G.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[l.FIVE_G.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[l.THREE_POINT5_G.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[l.IWLAN.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f6187a = iArr;
        int[] iArr2 = new int[m.values().length];
        try {
            iArr2[m.EVDO.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[m.CDMA.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[m.LTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[m.FIVE_G.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[m.GSM.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[m.WCDMA.ordinal()] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[m.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused17) {
        }
        f6188b = iArr2;
    }
}
