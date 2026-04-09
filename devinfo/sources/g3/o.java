package g3;

import c2.a0;
import i2.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class o extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f24523a;

    public o(a0 a0Var) {
        this.f24523a = a0Var;
    }

    @Override // i2.v0
    public final i1.m d() {
        return new p(this.f24523a);
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        p pVar = (p) mVar;
        a0 a0Var = this.f24523a;
        pVar.f24524o = a0Var;
        if (pVar.f25565n) {
            a0Var.invoke(pVar.f24525p);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return this.f24523a == ((o) obj).f24523a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24523a.hashCode();
    }
}
