package ee;

import java.util.ArrayList;
import lf.t1;

/* loaded from: classes.dex */
public final class k extends t1 {
    @Override // lf.t1
    public final void q(u uVar, float f10, float f11) {
        float f12 = f11 * f10;
        uVar.d(f12, 180.0f, 90.0f);
        float f13 = f12 * 2.0f;
        q qVar = new q(0.0f, 0.0f, f13, f13);
        qVar.f8146f = 180.0f;
        qVar.f8147g = 90.0f;
        ((ArrayList) uVar.f8158f).add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        ((ArrayList) uVar.f8159g).add(oVar);
        uVar.f8156d = 270.0f;
        float f14 = (0.0f + f13) * 0.5f;
        float f15 = (f13 - 0.0f) / 2.0f;
        double d6 = 270.0f;
        uVar.f8154b = (((float) Math.cos(Math.toRadians(d6))) * f15) + f14;
        uVar.f8155c = (f15 * ((float) Math.sin(Math.toRadians(d6)))) + f14;
    }
}
