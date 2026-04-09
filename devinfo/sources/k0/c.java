package k0;

import d0.i;
import ek.j;
import g2.v;
import i1.m;
import i2.d1;
import i2.k;
import i2.t;
import xk.x;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends m implements m2.a, t {

    /* renamed from: o, reason: collision with root package name */
    public i f27779o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f27780p;

    public static final o1.c p0(c cVar, d1 d1Var, c2.c cVar2) {
        o1.c cVar3;
        if (cVar.f25565n && cVar.f27780p) {
            d1 d1VarR = k.r(cVar);
            if (!d1Var.z0().f25565n) {
                d1Var = null;
            }
            if (d1Var != null && (cVar3 = (o1.c) cVar2.invoke()) != null) {
                float f10 = d1VarR.r(d1Var, false).f30366a;
                return cVar3.f((Float.floatToRawIntBits(r4.f30367b) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
            }
        }
        return null;
    }

    @Override // i1.m
    public final boolean c0() {
        return false;
    }

    @Override // m2.a
    public final Object n(d1 d1Var, c2.c cVar, j jVar) {
        Object objH = x.h(new b(this, d1Var, cVar, new c1.b(this, d1Var, cVar, 4), null), jVar);
        return objH == dk.a.f22275a ? objH : u.f37649a;
    }

    @Override // i2.t
    public final void w(v vVar) {
        this.f27780p = true;
    }

    @Override // i2.t
    public final /* synthetic */ void g(long j) {
    }
}
