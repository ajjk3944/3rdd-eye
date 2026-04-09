package u0;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o extends t {

    /* renamed from: a, reason: collision with root package name */
    public final long f34884a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f34885b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34886c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f34887d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f34888e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final d1 f34889f = new d1(c1.l.f2565d, e.f34770e);
    public final /* synthetic */ p g;

    public o(p pVar, long j, boolean z3, boolean z10, nm.d0 d0Var) {
        this.g = pVar;
        this.f34884a = j;
        this.f34885b = z3;
        this.f34886c = z10;
    }

    @Override // u0.t
    public final void a(w wVar, mk.e eVar) {
        this.g.f34899b.a(wVar, eVar);
    }

    @Override // u0.t
    public final x.f0 b(w wVar, z1 z1Var, mk.e eVar) {
        return this.g.f34899b.b(wVar, z1Var, eVar);
    }

    @Override // u0.t
    public final void c() {
        p pVar = this.g;
        pVar.A--;
    }

    @Override // u0.t
    public final boolean d() {
        return this.g.f34899b.d();
    }

    @Override // u0.t
    public final boolean e() {
        return this.f34885b;
    }

    @Override // u0.t
    public final boolean f() {
        return this.f34886c;
    }

    @Override // u0.t
    public final long g() {
        return this.f34884a;
    }

    @Override // u0.t
    public final s h() {
        return this.g.f34904h;
    }

    @Override // u0.t
    public final i1 i() {
        return (i1) this.f34889f.getValue();
    }

    @Override // u0.t
    public final ck.h j() {
        return this.g.f34899b.j();
    }

    @Override // u0.t
    public final boolean k() {
        return this.g.f34899b.k();
    }

    @Override // u0.t
    public final void l(w wVar) {
        p pVar = this.g;
        pVar.f34899b.l(pVar.f34904h);
        pVar.f34899b.l(wVar);
    }

    @Override // u0.t
    public final s0 m(t0 t0Var) {
        return this.g.f34899b.m(t0Var);
    }

    @Override // u0.t
    public final x.f0 n(w wVar, z1 z1Var, x.f0 f0Var) {
        return this.g.f34899b.n(wVar, z1Var, f0Var);
    }

    @Override // u0.t
    public final void o(Set set) {
        HashSet hashSet = this.f34887d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f34887d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // u0.t
    public final void p(p pVar) {
        this.f34888e.add(pVar);
    }

    @Override // u0.t
    public final void q(m1 m1Var) {
        this.g.f34899b.q(m1Var);
    }

    @Override // u0.t
    public final void r(w wVar) {
        this.g.f34899b.r(wVar);
    }

    @Override // u0.t
    public final f s(b2.b bVar) {
        return this.g.f34899b.s(bVar);
    }

    @Override // u0.t
    public final void t() {
        this.g.A++;
    }

    @Override // u0.t
    public final void u(p pVar) {
        HashSet hashSet = this.f34887d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                nk.k.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(pVar.w());
            }
        }
        nk.x.a(this.f34888e).remove(pVar);
    }

    @Override // u0.t
    public final void v(w wVar) {
        this.g.f34899b.v(wVar);
    }

    public final void w() {
        LinkedHashSet<p> linkedHashSet = this.f34888e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f34887d;
        if (hashSet != null) {
            for (p pVar : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(pVar.w());
                }
            }
        }
        linkedHashSet.clear();
    }
}
