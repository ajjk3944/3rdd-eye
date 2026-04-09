package wt;

/* loaded from: classes.dex */
public abstract class a extends b1 implements pq.c, t {

    /* renamed from: g, reason: collision with root package name */
    public final pq.h f24597g;

    public a(pq.h hVar, boolean z10) {
        super(z10);
        F((t0) hVar.Y(r.f24653d));
        this.f24597g = hVar.i0(this);
    }

    @Override // wt.b1
    public final void E(bf.n nVar) {
        w.o(nVar, this.f24597g);
    }

    @Override // wt.b1
    public final void N(Object obj) {
        if (!(obj instanceof o)) {
            a0(obj);
        } else {
            o oVar = (o) obj;
            X(oVar.f24644a, o.f24643b.get(oVar) != 0);
        }
    }

    @Override // pq.c
    public final void g(Object obj) {
        Throwable thA = lq.o.a(obj);
        if (thA != null) {
            obj = new o(thA, false);
        }
        Object objJ = J(obj);
        if (objJ == w.f24666e) {
            return;
        }
        l(objJ);
    }

    @Override // wt.t
    public final pq.h getCoroutineContext() {
        return this.f24597g;
    }

    @Override // pq.c
    public final pq.h m() {
        return this.f24597g;
    }

    @Override // wt.b1
    public final String s() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void a0(Object obj) {
    }

    public void X(Throwable th2, boolean z10) {
    }
}
