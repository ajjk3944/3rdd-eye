package l1;

import g2.v;
import g3.f;
import i1.m;
import i2.k;
import i2.t;
import i2.z1;
import me.t1;
import nk.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends m implements z1, t {

    /* renamed from: o, reason: collision with root package name */
    public e f28542o;

    /* renamed from: p, reason: collision with root package name */
    public e f28543p;

    /* renamed from: q, reason: collision with root package name */
    public long f28544q;

    @Override // i2.z1
    public final Object e() {
        return d.f28541a;
    }

    @Override // i2.t
    public final void g(long j) {
        this.f28544q = j;
    }

    @Override // i1.m
    public final void h0() {
        this.f28543p = null;
        this.f28542o = null;
    }

    public final boolean p0(jf.c cVar) {
        e eVar = this.f28542o;
        if (eVar != null) {
            return eVar.p0(cVar);
        }
        e eVar2 = this.f28543p;
        if (eVar2 != null) {
            return eVar2.p0(cVar);
        }
        return false;
    }

    public final void q0(jf.c cVar) {
        e eVar = this.f28543p;
        if (eVar != null) {
            eVar.q0(cVar);
            return;
        }
        e eVar2 = this.f28542o;
        if (eVar2 != null) {
            eVar2.q0(cVar);
        }
    }

    public final void r0(jf.c cVar) {
        e eVar = this.f28543p;
        if (eVar != null) {
            eVar.r0(cVar);
        }
        e eVar2 = this.f28542o;
        if (eVar2 != null) {
            eVar2.r0(cVar);
        }
        this.f28542o = null;
    }

    public final void s0(jf.c cVar) {
        z1 z1Var;
        e eVar;
        e eVar2 = this.f28542o;
        if (eVar2 == null || !jm.a.a(eVar2, t1.p(cVar))) {
            if (this.f25554a.f25565n) {
                u uVar = new u();
                k.w(this, new f(uVar, this, cVar, 1));
                z1Var = (z1) uVar.f29986a;
            } else {
                z1Var = null;
            }
            eVar = (e) z1Var;
        } else {
            eVar = eVar2;
        }
        if (eVar != null && eVar2 == null) {
            eVar.q0(cVar);
            eVar.s0(cVar);
            e eVar3 = this.f28543p;
            if (eVar3 != null) {
                eVar3.r0(cVar);
            }
        } else if (eVar == null && eVar2 != null) {
            e eVar4 = this.f28543p;
            if (eVar4 != null) {
                eVar4.q0(cVar);
                eVar4.s0(cVar);
            }
            eVar2.r0(cVar);
        } else if (!nk.k.a(eVar, eVar2)) {
            if (eVar != null) {
                eVar.q0(cVar);
                eVar.s0(cVar);
            }
            if (eVar2 != null) {
                eVar2.r0(cVar);
            }
        } else if (eVar != null) {
            eVar.s0(cVar);
        } else {
            e eVar5 = this.f28543p;
            if (eVar5 != null) {
                eVar5.s0(cVar);
            }
        }
        this.f28542o = eVar;
    }

    public final void t0(jf.c cVar) {
        e eVar = this.f28543p;
        if (eVar != null) {
            eVar.t0(cVar);
            return;
        }
        e eVar2 = this.f28542o;
        if (eVar2 != null) {
            eVar2.t0(cVar);
        }
    }

    @Override // i2.t
    public final /* synthetic */ void w(v vVar) {
    }
}
