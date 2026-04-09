package G3;

import a.AbstractC0241a;

/* loaded from: classes.dex */
public final class m extends AbstractC0241a {
    @Override // a.AbstractC0241a
    public final void c(y yVar, float f2, float f5) {
        float f6 = f5 * f2;
        yVar.d(0.0f, f6, 180.0f, 90.0f);
        float f7 = f6 * 2.0f;
        u uVar = new u(0.0f, 0.0f, f7, f7);
        uVar.f1658f = 180.0f;
        uVar.f1659g = 90.0f;
        yVar.f1671g.add(uVar);
        s sVar = new s(uVar);
        yVar.a(180.0f);
        yVar.f1672h.add(sVar);
        yVar.f1669e = 270.0f;
        float f8 = (0.0f + f7) * 0.5f;
        float f9 = (f7 - 0.0f) / 2.0f;
        double d6 = 270.0f;
        yVar.f1667c = (((float) Math.cos(Math.toRadians(d6))) * f9) + f8;
        yVar.f1668d = (f9 * ((float) Math.sin(Math.toRadians(d6)))) + f8;
    }
}
