package ok;

import nk.c0;
import nk.r;
import nk.v;
import nk.w;

/* loaded from: classes.dex */
public final class b extends r {

    /* renamed from: a, reason: collision with root package name */
    public final r f19530a;

    public b(r rVar) {
        this.f19530a = rVar;
    }

    @Override // nk.r
    public final Object fromJson(w wVar) {
        if (wVar.f0() != v.NULL) {
            return this.f19530a.fromJson(wVar);
        }
        wVar.Y();
        return null;
    }

    @Override // nk.r
    public final void toJson(c0 c0Var, Object obj) {
        if (obj == null) {
            c0Var.G();
        } else {
            this.f19530a.toJson(c0Var, obj);
        }
    }

    public final String toString() {
        return this.f19530a + ".nullSafe()";
    }
}
