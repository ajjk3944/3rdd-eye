package com.bytedance.adsdk.vt;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public enum qbp {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.adsdk.vt.qbp$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[qbp.values().length];
            ouw = iArr;
            try {
                iArr[qbp.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[qbp.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ouw[qbp.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final boolean ouw(int i4, boolean z3, int i10) {
        int i11 = AnonymousClass1.ouw[ordinal()];
        if (i11 == 1) {
            return false;
        }
        if (i11 != 2) {
            return (z3 && i4 < 28) || i10 > 4 || i4 <= 25;
        }
        return true;
    }
}
