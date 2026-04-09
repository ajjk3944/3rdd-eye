package F;

import L0.C3174d;
import Q0.AbstractC3434k;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public abstract class i0 {
    public static final boolean a(L0.M m10, C3174d c3174d, L0.U u10, List list, int i10, boolean z10, int i11, Y0.d dVar, Y0.t tVar, AbstractC3434k.b bVar, long j10) {
        L0.L l10 = m10.l();
        if (m10.w().j().c() || !AbstractC6492s.d(l10.j(), c3174d) || !l10.i().G(u10) || !AbstractC6492s.d(l10.g(), list) || l10.e() != i10 || l10.h() != z10 || !W0.t.e(l10.f(), i11) || !AbstractC6492s.d(l10.b(), dVar) || l10.d() != tVar || !AbstractC6492s.d(l10.c(), bVar) || Y0.b.n(j10) != Y0.b.n(l10.a())) {
            return false;
        }
        if (z10 || W0.t.e(i11, W0.t.f23567a.b())) {
            return Y0.b.l(j10) == Y0.b.l(l10.a()) && Y0.b.k(j10) == Y0.b.k(l10.a());
        }
        return true;
    }
}
