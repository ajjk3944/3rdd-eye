package N2;

import t4.C5606d;

/* compiled from: EngineResource.java */
/* loaded from: classes.dex */
public final class p<Z> implements u<Z> {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4615b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4616c;

    /* renamed from: d, reason: collision with root package name */
    public final u<Z> f4617d;

    /* renamed from: e, reason: collision with root package name */
    public final m f4618e;

    /* renamed from: f, reason: collision with root package name */
    public final o f4619f;

    /* renamed from: g, reason: collision with root package name */
    public int f4620g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4621h;

    public p(u uVar, boolean z10, boolean z11, o oVar, m mVar) {
        C5606d.l(uVar, "Argument must not be null");
        this.f4617d = uVar;
        this.f4615b = z10;
        this.f4616c = z11;
        this.f4619f = oVar;
        C5606d.l(mVar, "Argument must not be null");
        this.f4618e = mVar;
    }

    @Override // N2.u
    public final synchronized void a() {
        if (this.f4620g > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f4621h) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f4621h = true;
        if (this.f4616c) {
            this.f4617d.a();
        }
    }

    public final synchronized void b() {
        if (this.f4621h) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f4620g++;
    }

    @Override // N2.u
    public final Class<Z> c() {
        return this.f4617d.c();
    }

    public final void d() {
        boolean z10;
        synchronized (this) {
            int i = this.f4620g;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i10 = i - 1;
            this.f4620g = i10;
            if (i10 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f4618e.f(this.f4619f, this);
        }
    }

    @Override // N2.u
    public final Z get() {
        return this.f4617d.get();
    }

    @Override // N2.u
    public final int getSize() {
        return this.f4617d.getSize();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f4615b + ", listener=" + this.f4618e + ", key=" + this.f4619f + ", acquired=" + this.f4620g + ", isRecycled=" + this.f4621h + ", resource=" + this.f4617d + '}';
    }
}
