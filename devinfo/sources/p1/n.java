package p1;

import i2.d1;
import i2.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class n extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final mk.c f31008a;

    public n(mk.c cVar) {
        this.f31008a = cVar;
    }

    @Override // i2.v0
    public final i1.m d() {
        o oVar = new o();
        oVar.f31009o = this.f31008a;
        return oVar;
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        d1 d1Var;
        o oVar = (o) mVar;
        mk.c cVar = this.f31008a;
        oVar.f31009o = cVar;
        if (oVar.f25554a.f25565n && (d1Var = i2.k.q(oVar, 2).f25611p) != null) {
            d1Var.U0(cVar, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.f31008a == ((n) obj).f31008a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31008a.hashCode();
    }
}
