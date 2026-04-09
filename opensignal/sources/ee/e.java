package ee;

import lf.t1;

/* loaded from: classes.dex */
public final class e extends t1 {
    @Override // lf.t1
    public final void q(u uVar, float f10, float f11) {
        float f12 = f11 * f10;
        uVar.d(f12, 180.0f, 90.0f);
        double d6 = f12;
        uVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d6), (float) (Math.sin(Math.toRadians(0.0f)) * d6));
    }
}
