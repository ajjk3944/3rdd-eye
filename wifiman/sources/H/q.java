package H;

import F.v0;
import H.f;
import L0.S;
import L0.T;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public abstract class q {
    private static final boolean a(K.d dVar) {
        return AbstractC6492s.d(dVar.f(), "\n") || AbstractC6492s.d(dVar.f(), "\r\n");
    }

    public static final K.d b(K.d dVar, K.d dVar2) {
        if (!dVar.b() || !dVar2.b() || dVar2.j() < dVar.j() || dVar2.j() - dVar.j() >= v0.a() || a(dVar) || a(dVar2) || dVar.i() != dVar2.i()) {
            return null;
        }
        if (dVar.i() == K.b.Insert && dVar.d() + dVar.f().length() == dVar2.d()) {
            return new K.d(dVar.d(), "", dVar.f() + dVar2.f(), dVar.g(), dVar2.e(), dVar.j(), false, 64, null);
        }
        if (dVar.i() == K.b.Delete && dVar.c() == dVar2.c() && (dVar.c() == K.a.Start || dVar.c() == K.a.End)) {
            if (dVar.d() == dVar2.d() + dVar2.h().length()) {
                return new K.d(dVar2.d(), dVar2.h() + dVar.h(), "", dVar.g(), dVar2.e(), dVar.j(), false, 64, null);
            }
            if (dVar.d() == dVar2.d()) {
                return new K.d(dVar.d(), dVar.h() + dVar2.h(), "", dVar.g(), dVar2.e(), dVar.j(), false, 64, null);
            }
        }
        return null;
    }

    public static final void c(p pVar, h hVar, h hVar2, f.a aVar, boolean z10) {
        if (aVar.a() > 1) {
            pVar.h(new K.d(0, hVar.toString(), hVar2.toString(), hVar.f(), hVar2.f(), 0L, false, 32, null));
            return;
        }
        if (aVar.a() == 1) {
            long jB = aVar.b(0);
            long jC = aVar.c(0);
            if (S.h(jB) && S.h(jC)) {
                return;
            }
            pVar.h(new K.d(S.l(jB), T.e(hVar, jB), T.e(hVar2, jC), hVar.f(), hVar2.f(), 0L, z10, 32, null));
        }
    }
}
