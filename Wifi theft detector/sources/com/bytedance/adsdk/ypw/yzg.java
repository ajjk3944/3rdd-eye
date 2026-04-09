package com.bytedance.adsdk.ypw;

/* loaded from: classes.dex */
public enum yzg {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* renamed from: com.bytedance.adsdk.ypw.yzg$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] emc;

        static {
            int[] iArr = new int[yzg.values().length];
            emc = iArr;
            try {
                iArr[yzg.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                emc[yzg.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                emc[yzg.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean emc(int i10, boolean z10, int i11) {
        int i12 = AnonymousClass1.emc[ordinal()];
        if (i12 == 1) {
            return false;
        }
        if (i12 != 2) {
            return (z10 && i10 < 28) || i11 > 4 || i10 <= 25;
        }
        return true;
    }
}
