package dd;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class l implements n, e, d, b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7304a;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f7305d;

    /* renamed from: g, reason: collision with root package name */
    public final a f7306g;

    /* renamed from: r, reason: collision with root package name */
    public final r f7307r;

    public /* synthetic */ l(Executor executor, a aVar, r rVar, int i10) {
        this.f7304a = i10;
        this.f7305d = executor;
        this.f7306g = aVar;
        this.f7307r = rVar;
    }

    @Override // dd.n
    public final void a(r rVar) {
        switch (this.f7304a) {
            case 0:
                this.f7305d.execute(new re.a(7, this, rVar, false));
                break;
            default:
                this.f7305d.execute(new re.a(8, this, rVar, false));
                break;
        }
    }

    @Override // dd.n
    public final void b() {
        switch (this.f7304a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // dd.e
    public void h(Object obj) {
        this.f7307r.l(obj);
    }

    @Override // dd.b
    public void q() {
        this.f7307r.o();
    }

    @Override // dd.d
    public void y(Exception exc) {
        this.f7307r.n(exc);
    }
}
