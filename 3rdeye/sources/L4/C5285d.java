package l4;

import T1.B;

/* compiled from: CutCornerTreatment.java */
/* renamed from: l4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5285d extends B {
    @Override // T1.B
    public final void i(l lVar, float f10, float f11) {
        lVar.d(f11 * f10, 180.0f, 90.0f);
        double d10 = f11;
        double d11 = f10;
        lVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d10 * d11), (float) (Math.sin(Math.toRadians(0.0f)) * d10 * d11));
    }
}
