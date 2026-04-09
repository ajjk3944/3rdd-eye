package com.vungle.ads.internal.util;

/* compiled from: RangeUtil.kt */
/* loaded from: classes2.dex */
public final class m {
    public static final m INSTANCE = new m();

    private m() {
    }

    public static /* synthetic */ boolean isInRange$default(m mVar, int i, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return mVar.isInRange(i, i10, i11);
    }

    public final boolean isInRange(float f10, float f11, float f12) {
        return f11 <= f10 && f10 <= f12;
    }

    public static /* synthetic */ boolean isInRange$default(m mVar, float f10, float f11, float f12, int i, Object obj) {
        if ((i & 4) != 0) {
            f12 = Float.MAX_VALUE;
        }
        return mVar.isInRange(f10, f11, f12);
    }

    public final boolean isInRange(int i, int i10, int i11) {
        return i10 <= i && i <= i11;
    }
}
