package xk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g1 extends a0 {

    /* renamed from: e, reason: collision with root package name */
    public final ck.c f37190e;

    public g1(ck.h hVar, mk.e eVar) {
        super(hVar, false, 1);
        this.f37190e = a.a.h(this, this, eVar);
    }

    @Override // xk.f1
    public final void Z() throws Throwable {
        try {
            cl.b.h(a.a.r(this.f37190e), yj.u.f37649a);
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof c0) {
                th = ((c0) th).f37174a;
            }
            resumeWith(ci.b.h(th));
            throw th;
        }
    }
}
