package p8;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements d, c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f31469a;

    /* renamed from: b, reason: collision with root package name */
    public final d f31470b;

    /* renamed from: c, reason: collision with root package name */
    public volatile c f31471c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f31472d;

    /* renamed from: e, reason: collision with root package name */
    public int f31473e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f31474f = 3;

    public b(Object obj, d dVar) {
        this.f31469a = obj;
        this.f31470b = dVar;
    }

    @Override // p8.d, p8.c
    public final boolean a() {
        boolean z3;
        synchronized (this.f31469a) {
            try {
                z3 = this.f31471c.a() || this.f31472d.a();
            } finally {
            }
        }
        return z3;
    }

    @Override // p8.c
    public final boolean b() {
        boolean z3;
        synchronized (this.f31469a) {
            try {
                z3 = this.f31473e == 4 || this.f31474f == 4;
            } finally {
            }
        }
        return z3;
    }

    @Override // p8.d
    public final boolean c(c cVar) {
        boolean z3;
        synchronized (this.f31469a) {
            d dVar = this.f31470b;
            z3 = dVar == null || dVar.c(this);
        }
        return z3;
    }

    @Override // p8.c
    public final void clear() {
        synchronized (this.f31469a) {
            try {
                this.f31473e = 3;
                this.f31471c.clear();
                if (this.f31474f != 3) {
                    this.f31474f = 3;
                    this.f31472d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p8.d
    public final boolean d(c cVar) {
        boolean z3;
        synchronized (this.f31469a) {
            d dVar = this.f31470b;
            z3 = (dVar == null || dVar.d(this)) && cVar.equals(this.f31471c);
        }
        return z3;
    }

    @Override // p8.d
    public final void e(c cVar) {
        synchronized (this.f31469a) {
            try {
                if (cVar.equals(this.f31471c)) {
                    this.f31473e = 4;
                } else if (cVar.equals(this.f31472d)) {
                    this.f31474f = 4;
                }
                d dVar = this.f31470b;
                if (dVar != null) {
                    dVar.e(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p8.c
    public final boolean f() {
        boolean z3;
        synchronized (this.f31469a) {
            try {
                z3 = this.f31473e == 3 && this.f31474f == 3;
            } finally {
            }
        }
        return z3;
    }

    @Override // p8.c
    public final void g() {
        synchronized (this.f31469a) {
            try {
                if (this.f31473e != 1) {
                    this.f31473e = 1;
                    this.f31471c.g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p8.d
    public final d getRoot() {
        d root;
        synchronized (this.f31469a) {
            try {
                d dVar = this.f31470b;
                root = dVar != null ? dVar.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // p8.c
    public final boolean h(c cVar) {
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            if (this.f31471c.h(bVar.f31471c) && this.f31472d.h(bVar.f31472d)) {
                return true;
            }
        }
        return false;
    }

    @Override // p8.d
    public final boolean i(c cVar) {
        boolean z3;
        int i4;
        synchronized (this.f31469a) {
            d dVar = this.f31470b;
            z3 = false;
            if (dVar == null || dVar.i(this)) {
                if (this.f31473e != 5 ? cVar.equals(this.f31471c) : cVar.equals(this.f31472d) && ((i4 = this.f31474f) == 4 || i4 == 5)) {
                    z3 = true;
                }
            }
        }
        return z3;
    }

    @Override // p8.c
    public final boolean isRunning() {
        boolean z3;
        synchronized (this.f31469a) {
            try {
                z3 = true;
                if (this.f31473e != 1 && this.f31474f != 1) {
                    z3 = false;
                }
            } finally {
            }
        }
        return z3;
    }

    @Override // p8.d
    public final void j(c cVar) {
        synchronized (this.f31469a) {
            try {
                if (cVar.equals(this.f31472d)) {
                    this.f31474f = 5;
                    d dVar = this.f31470b;
                    if (dVar != null) {
                        dVar.j(this);
                    }
                    return;
                }
                this.f31473e = 5;
                if (this.f31474f != 1) {
                    this.f31474f = 1;
                    this.f31472d.g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p8.c
    public final void pause() {
        synchronized (this.f31469a) {
            try {
                if (this.f31473e == 1) {
                    this.f31473e = 2;
                    this.f31471c.pause();
                }
                if (this.f31474f == 1) {
                    this.f31474f = 2;
                    this.f31472d.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
