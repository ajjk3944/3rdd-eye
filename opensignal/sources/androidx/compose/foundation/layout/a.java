package androidx.compose.foundation.layout;

import z0.m;

/* loaded from: classes.dex */
public abstract class a {
    public static final m a(m mVar, float f10) {
        return mVar.c(new PaddingElement(f10, f10, f10, f10));
    }

    public static final m b(m mVar, float f10, float f11) {
        return mVar.c(new PaddingElement(f10, f11, f10, f11));
    }

    public static m c(m mVar, float f10, float f11, float f12, int i10) {
        float f13 = i0.a.f11135a;
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        if ((i10 & 4) != 0) {
            f12 = 0;
        }
        if ((i10 & 8) != 0) {
            f13 = 0;
        }
        return mVar.c(new PaddingElement(f10, f11, f12, f13));
    }
}
