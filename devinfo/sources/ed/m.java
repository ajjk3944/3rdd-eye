package ed;

import com.google.android.gms.internal.play_billing.m1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m extends m1 {
    @Override // com.google.android.gms.internal.play_billing.m1
    public final void p(x xVar, float f10, float f11) {
        float f12 = f11 * f10;
        xVar.d(0.0f, f12, 180.0f, 90.0f);
        float f13 = f12 * 2.0f;
        t tVar = new t(0.0f, 0.0f, f13, f13);
        tVar.f23375f = 180.0f;
        tVar.g = 90.0f;
        xVar.g.add(tVar);
        r rVar = new r(tVar);
        xVar.a(180.0f);
        xVar.f23387h.add(rVar);
        xVar.f23385e = 270.0f;
        float f14 = (0.0f + f13) * 0.5f;
        float f15 = (f13 - 0.0f) / 2.0f;
        double d10 = 270.0f;
        xVar.f23383c = (((float) Math.cos(Math.toRadians(d10))) * f15) + f14;
        xVar.f23384d = (f15 * ((float) Math.sin(Math.toRadians(d10)))) + f14;
    }
}
