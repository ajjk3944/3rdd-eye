package z7;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s implements y {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f38090a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f38091b;

    /* renamed from: c, reason: collision with root package name */
    public final y f38092c;

    /* renamed from: d, reason: collision with root package name */
    public final r f38093d;

    /* renamed from: e, reason: collision with root package name */
    public final x7.e f38094e;

    /* renamed from: f, reason: collision with root package name */
    public int f38095f;
    public boolean g;

    public s(y yVar, boolean z3, boolean z10, x7.e eVar, r rVar) {
        t8.f.c(yVar, "Argument must not be null");
        this.f38092c = yVar;
        this.f38090a = z3;
        this.f38091b = z10;
        this.f38094e = eVar;
        t8.f.c(rVar, "Argument must not be null");
        this.f38093d = rVar;
    }

    @Override // z7.y
    public final synchronized void a() {
        if (this.f38095f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.g = true;
        if (this.f38091b) {
            this.f38092c.a();
        }
    }

    @Override // z7.y
    public final Class b() {
        return this.f38092c.b();
    }

    public final synchronized void c() {
        if (this.g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f38095f++;
    }

    public final void d() {
        boolean z3;
        synchronized (this) {
            int i4 = this.f38095f;
            if (i4 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z3 = true;
            int i10 = i4 - 1;
            this.f38095f = i10;
            if (i10 != 0) {
                z3 = false;
            }
        }
        if (z3) {
            ((k) this.f38093d).f(this.f38094e, this);
        }
    }

    @Override // z7.y
    public final Object get() {
        return this.f38092c.get();
    }

    @Override // z7.y
    public final int getSize() {
        return this.f38092c.getSize();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f38090a + ", listener=" + this.f38093d + ", key=" + this.f38094e + ", acquired=" + this.f38095f + ", isRecycled=" + this.g + ", resource=" + this.f38092c + '}';
    }
}
