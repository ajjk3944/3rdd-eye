package l4;

import T1.B;
import l4.l;

/* compiled from: RoundedCornerTreatment.java */
/* renamed from: l4.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5289h extends B {
    @Override // T1.B
    public final void i(l lVar, float f10, float f11) {
        lVar.d(f11 * f10, 180.0f, 90.0f);
        float f12 = f11 * 2.0f * f10;
        lVar.getClass();
        l.c cVar = new l.c(0.0f, 0.0f, f12, f12);
        cVar.f43852f = 180.0f;
        cVar.f43853g = 90.0f;
        lVar.f43841f.add(cVar);
        l.a aVar = new l.a(cVar);
        float f13 = 180.0f + 90.0f;
        boolean z10 = 90.0f < 0.0f;
        float f14 = z10 ? (180.0f + 180.0f) % 360.0f : 180.0f;
        float f15 = z10 ? (180.0f + f13) % 360.0f : f13;
        lVar.a(f14);
        lVar.f43842g.add(aVar);
        lVar.f43839d = f15;
        double d10 = f13;
        lVar.f43837b = (((f12 - 0.0f) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))) + ((0.0f + f12) * 0.5f);
        lVar.f43838c = (((f12 - 0.0f) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))) + ((0.0f + f12) * 0.5f);
    }
}
