package ok;

import bf.n;
import nk.c0;
import nk.r;
import nk.v;
import nk.w;

/* loaded from: classes.dex */
public final class a extends r {

    /* renamed from: a, reason: collision with root package name */
    public final r f19529a;

    public a(r rVar) {
        this.f19529a = rVar;
    }

    @Override // nk.r
    public final Object fromJson(w wVar) {
        if (wVar.f0() != v.NULL) {
            return this.f19529a.fromJson(wVar);
        }
        throw new n("Unexpected null at " + wVar.q());
    }

    @Override // nk.r
    public final void toJson(c0 c0Var, Object obj) {
        if (obj != null) {
            this.f19529a.toJson(c0Var, obj);
        } else {
            throw new n("Unexpected null at " + c0Var.w());
        }
    }

    public final String toString() {
        return this.f19529a + ".nonNull()";
    }
}
