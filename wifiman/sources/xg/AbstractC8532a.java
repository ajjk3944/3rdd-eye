package xg;

import ig.AbstractC6152a;
import yg.EnumC8672g;

/* renamed from: xg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8532a implements Dg.a, Dg.d {

    /* renamed from: a, reason: collision with root package name */
    protected final Dg.a f66068a;

    /* renamed from: b, reason: collision with root package name */
    protected Dj.c f66069b;

    /* renamed from: c, reason: collision with root package name */
    protected Dg.d f66070c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f66071d;

    /* renamed from: e, reason: collision with root package name */
    protected int f66072e;

    public AbstractC8532a(Dg.a aVar) {
        this.f66068a = aVar;
    }

    @Override // Dj.b
    public void a() {
        if (this.f66071d) {
            return;
        }
        this.f66071d = true;
        this.f66068a.a();
    }

    protected void b() {
    }

    protected boolean c() {
        return true;
    }

    @Override // Dj.c
    public void cancel() {
        this.f66069b.cancel();
    }

    @Override // Dg.g
    public void clear() {
        this.f66070c.clear();
    }

    protected final void d(Throwable th2) {
        AbstractC6152a.b(th2);
        this.f66069b.cancel();
        onError(th2);
    }

    protected final int e(int i10) {
        Dg.d dVar = this.f66070c;
        if (dVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = dVar.requestFusion(i10);
        if (iRequestFusion != 0) {
            this.f66072e = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // Dg.g
    public boolean isEmpty() {
        return this.f66070c.isEmpty();
    }

    @Override // gg.l
    public final void j(Dj.c cVar) {
        if (EnumC8672g.validate(this.f66069b, cVar)) {
            this.f66069b = cVar;
            if (cVar instanceof Dg.d) {
                this.f66070c = (Dg.d) cVar;
            }
            if (c()) {
                this.f66068a.j(this);
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
        if (this.f66071d) {
            Eg.a.v(th2);
        } else {
            this.f66071d = true;
            this.f66068a.onError(th2);
        }
    }

    @Override // Dj.c
    public void request(long j10) {
        this.f66069b.request(j10);
    }
}
