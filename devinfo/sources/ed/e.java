package ed;

import com.google.android.gms.internal.play_billing.m1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends m1 {
    @Override // com.google.android.gms.internal.play_billing.m1
    public final void p(x xVar, float f10, float f11) {
        float f12 = f11 * f10;
        xVar.d(0.0f, f12, 180.0f, 90.0f);
        double d10 = f12;
        xVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d10), (float) (Math.sin(Math.toRadians(0.0f)) * d10));
    }
}
