package n0;

/* loaded from: classes.dex */
public final class h1 implements x0, wt.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0 f17177a;

    /* renamed from: d, reason: collision with root package name */
    public final pq.h f17178d;

    public h1(x0 x0Var, pq.h hVar) {
        this.f17177a = x0Var;
        this.f17178d = hVar;
    }

    @Override // wt.t
    public final pq.h getCoroutineContext() {
        return this.f17178d;
    }

    @Override // n0.g2
    public final Object getValue() {
        return this.f17177a.getValue();
    }

    @Override // n0.x0
    public final void setValue(Object obj) {
        this.f17177a.setValue(obj);
    }
}
