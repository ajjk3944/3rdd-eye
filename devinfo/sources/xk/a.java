package xk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a extends f1 implements ck.c, v {

    /* renamed from: c, reason: collision with root package name */
    public final ck.h f37167c;

    public a(ck.h hVar, boolean z3) {
        super(z3);
        P((y0) hVar.O(s.f37235b));
        this.f37167c = hVar.y(this);
    }

    @Override // xk.v
    public final ck.h A() {
        return this.f37167c;
    }

    @Override // xk.f1
    public final void M(ac.m mVar) {
        x.q(this.f37167c, mVar);
    }

    @Override // xk.f1
    public final void Y(Object obj) {
        if (!(obj instanceof p)) {
            h0(obj);
        } else {
            p pVar = (p) obj;
            g0(pVar.f37219a, p.f37218b.get(pVar) == 1);
        }
    }

    @Override // ck.c
    public final ck.h getContext() {
        return this.f37167c;
    }

    public final void i0(w wVar, a aVar, mk.e eVar) {
        Object objInvoke;
        int iOrdinal = wVar.ordinal();
        yj.u uVar = yj.u.f37649a;
        if (iOrdinal == 0) {
            try {
                cl.b.h(a.a.r(a.a.h(aVar, this, eVar)), uVar);
                return;
            } finally {
                th = th;
                if (th instanceof c0) {
                    th = ((c0) th).f37174a;
                }
                resumeWith(ci.b.h(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                nk.k.e(eVar, "<this>");
                a.a.r(a.a.h(aVar, this, eVar)).resumeWith(uVar);
                return;
            }
            if (iOrdinal != 3) {
                throw new ac.m();
            }
            try {
                ck.h hVar = this.f37167c;
                Object objN = cl.b.n(hVar, null);
                try {
                    if (eVar instanceof ek.a) {
                        nk.x.d(2, eVar);
                        objInvoke = eVar.invoke(aVar, this);
                    } else {
                        objInvoke = a.a.w(eVar, aVar, this);
                    }
                    cl.b.g(hVar, objN);
                    if (objInvoke != dk.a.f22275a) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th2) {
                    cl.b.g(hVar, objN);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // ck.c
    public final void resumeWith(Object obj) {
        Throwable thA = yj.l.a(obj);
        if (thA != null) {
            obj = new p(thA, false);
        }
        Object objU = U(obj);
        if (objU == x.f37254e) {
            return;
        }
        q(objU);
    }

    @Override // xk.f1
    public final String u() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void h0(Object obj) {
    }

    public void g0(Throwable th2, boolean z3) {
    }
}
