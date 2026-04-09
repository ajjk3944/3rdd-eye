package xg;

import gg.l;
import ig.AbstractC6152a;
import yg.EnumC8672g;

/* loaded from: classes4.dex */
public abstract class b implements l, Dg.d {

    /* renamed from: a, reason: collision with root package name */
    protected final Dj.b f66073a;

    /* renamed from: b, reason: collision with root package name */
    protected Dj.c f66074b;

    /* renamed from: c, reason: collision with root package name */
    protected Dg.d f66075c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f66076d;

    /* renamed from: e, reason: collision with root package name */
    protected int f66077e;

    public b(Dj.b bVar) {
        this.f66073a = bVar;
    }

    @Override // Dj.b
    public void a() {
        if (this.f66076d) {
            return;
        }
        this.f66076d = true;
        this.f66073a.a();
    }

    protected void b() {
    }

    protected boolean c() {
        return true;
    }

    @Override // Dj.c
    public void cancel() {
        this.f66074b.cancel();
    }

    public void clear() {
        this.f66075c.clear();
    }

    protected final void d(Throwable th2) {
        AbstractC6152a.b(th2);
        this.f66074b.cancel();
        onError(th2);
    }

    protected final int e(int i10) {
        Dg.d dVar = this.f66075c;
        if (dVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = dVar.requestFusion(i10);
        if (iRequestFusion != 0) {
            this.f66077e = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // Dg.g
    public boolean isEmpty() {
        return this.f66075c.isEmpty();
    }

    @Override // gg.l
    public final void j(Dj.c cVar) {
        if (EnumC8672g.validate(this.f66074b, cVar)) {
            this.f66074b = cVar;
            if (cVar instanceof Dg.d) {
                this.f66075c = (Dg.d) cVar;
            }
            if (c()) {
                this.f66073a.j(this);
                b();
            }
        }
    }

    @Override // Dg.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // Dj.b
    public void onError(Throwable th2) {
        if (this.f66076d) {
            Eg.a.v(th2);
        } else {
            this.f66076d = true;
            this.f66073a.onError(th2);
        }
    }

    @Override // Dj.c
    public void request(long j10) {
        this.f66074b.request(j10);
    }
}
