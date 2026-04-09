package nt;

import br.l;
import ht.d1;
import ht.g0;
import ht.m0;
import ht.n0;
import ht.p0;

/* loaded from: classes.dex */
public final class d extends n0 {
    @Override // ht.n0
    public final p0 g(m0 m0Var) {
        l.e(m0Var, "key");
        us.b bVar = m0Var instanceof us.b ? (us.b) m0Var : null;
        if (bVar == null) {
            return null;
        }
        if (bVar.a().c()) {
            return new g0(bVar.a().b(), d1.OUT_VARIANCE);
        }
        return bVar.a();
    }
}
