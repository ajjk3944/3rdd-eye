package com.bumptech.glide.load.engine;

import X2.a;

/* loaded from: classes.dex */
final class r implements E2.c, a.f {

    /* renamed from: e, reason: collision with root package name */
    private static final E1.e f34472e = X2.a.d(20, new a());

    /* renamed from: a, reason: collision with root package name */
    private final X2.c f34473a = X2.c.a();

    /* renamed from: b, reason: collision with root package name */
    private E2.c f34474b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f34475c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f34476d;

    class a implements a.d {
        a() {
        }

        @Override // X2.a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public r create() {
            return new r();
        }
    }

    r() {
    }

    private void e(E2.c cVar) {
        this.f34476d = false;
        this.f34475c = true;
        this.f34474b = cVar;
    }

    static r f(E2.c cVar) {
        r rVar = (r) W2.k.d((r) f34472e.b());
        rVar.e(cVar);
        return rVar;
    }

    private void g() {
        this.f34474b = null;
        f34472e.a(this);
    }

    @Override // E2.c
    public int a() {
        return this.f34474b.a();
    }

    @Override // X2.a.f
    public X2.c b() {
        return this.f34473a;
    }

    @Override // E2.c
    public synchronized void c() {
        this.f34473a.c();
        this.f34476d = true;
        if (!this.f34475c) {
            this.f34474b.c();
            g();
        }
    }

    @Override // E2.c
    public Class d() {
        return this.f34474b.d();
    }

    @Override // E2.c
    public Object get() {
        return this.f34474b.get();
    }

    synchronized void h() {
        this.f34473a.c();
        if (!this.f34475c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f34475c = false;
        if (this.f34476d) {
            c();
        }
    }
}
