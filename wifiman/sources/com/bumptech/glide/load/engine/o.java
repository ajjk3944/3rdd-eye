package com.bumptech.glide.load.engine;

/* loaded from: classes.dex */
class o implements E2.c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f34459a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f34460b;

    /* renamed from: c, reason: collision with root package name */
    private final E2.c f34461c;

    /* renamed from: d, reason: collision with root package name */
    private final a f34462d;

    /* renamed from: e, reason: collision with root package name */
    private final C2.e f34463e;

    /* renamed from: f, reason: collision with root package name */
    private int f34464f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f34465g;

    interface a {
        void c(C2.e eVar, o oVar);
    }

    o(E2.c cVar, boolean z10, boolean z11, C2.e eVar, a aVar) {
        this.f34461c = (E2.c) W2.k.d(cVar);
        this.f34459a = z10;
        this.f34460b = z11;
        this.f34463e = eVar;
        this.f34462d = (a) W2.k.d(aVar);
    }

    @Override // E2.c
    public int a() {
        return this.f34461c.a();
    }

    synchronized void b() {
        if (this.f34465g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f34464f++;
    }

    @Override // E2.c
    public synchronized void c() {
        if (this.f34464f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f34465g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f34465g = true;
        if (this.f34460b) {
            this.f34461c.c();
        }
    }

    @Override // E2.c
    public Class d() {
        return this.f34461c.d();
    }

    E2.c e() {
        return this.f34461c;
    }

    boolean f() {
        return this.f34459a;
    }

    void g() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f34464f;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f34464f = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f34462d.c(this.f34463e, this);
        }
    }

    @Override // E2.c
    public Object get() {
        return this.f34461c.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f34459a + ", listener=" + this.f34462d + ", key=" + this.f34463e + ", acquired=" + this.f34464f + ", isRecycled=" + this.f34465g + ", resource=" + this.f34461c + '}';
    }
}
