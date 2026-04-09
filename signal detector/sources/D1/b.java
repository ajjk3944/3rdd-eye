package D1;

/* loaded from: classes.dex */
public final class b implements d, c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1218a;

    /* renamed from: b, reason: collision with root package name */
    public final d f1219b;

    /* renamed from: c, reason: collision with root package name */
    public volatile c f1220c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f1221d;

    /* renamed from: e, reason: collision with root package name */
    public int f1222e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f1223f = 3;

    public b(Object obj, d dVar) {
        this.f1218a = obj;
        this.f1219b = dVar;
    }

    @Override // D1.d, D1.c
    public final boolean a() {
        boolean z6;
        synchronized (this.f1218a) {
            try {
                z6 = this.f1220c.a() || this.f1221d.a();
            } finally {
            }
        }
        return z6;
    }

    @Override // D1.d
    public final void b(c cVar) {
        synchronized (this.f1218a) {
            try {
                if (cVar.equals(this.f1220c)) {
                    this.f1222e = 4;
                } else if (cVar.equals(this.f1221d)) {
                    this.f1223f = 4;
                }
                d dVar = this.f1219b;
                if (dVar != null) {
                    dVar.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D1.c
    public final boolean c(c cVar) {
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            if (this.f1220c.c(bVar.f1220c) && this.f1221d.c(bVar.f1221d)) {
                return true;
            }
        }
        return false;
    }

    @Override // D1.c
    public final void clear() {
        synchronized (this.f1218a) {
            try {
                this.f1222e = 3;
                this.f1220c.clear();
                if (this.f1223f != 3) {
                    this.f1223f = 3;
                    this.f1221d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D1.c
    public final void d() {
        synchronized (this.f1218a) {
            try {
                if (this.f1222e == 1) {
                    this.f1222e = 2;
                    this.f1220c.d();
                }
                if (this.f1223f == 1) {
                    this.f1223f = 2;
                    this.f1221d.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D1.d
    public final void e(c cVar) {
        synchronized (this.f1218a) {
            try {
                if (cVar.equals(this.f1221d)) {
                    this.f1223f = 5;
                    d dVar = this.f1219b;
                    if (dVar != null) {
                        dVar.e(this);
                    }
                    return;
                }
                this.f1222e = 5;
                if (this.f1223f != 1) {
                    this.f1223f = 1;
                    this.f1221d.j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D1.d
    public final boolean f(c cVar) {
        boolean z6;
        int i;
        synchronized (this.f1218a) {
            d dVar = this.f1219b;
            z6 = false;
            if (dVar == null || dVar.f(this)) {
                if (this.f1222e != 5 ? cVar.equals(this.f1220c) : cVar.equals(this.f1221d) && ((i = this.f1223f) == 4 || i == 5)) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    @Override // D1.c
    public final boolean g() {
        boolean z6;
        synchronized (this.f1218a) {
            try {
                z6 = this.f1222e == 3 && this.f1223f == 3;
            } finally {
            }
        }
        return z6;
    }

    @Override // D1.d
    public final d getRoot() {
        d root;
        synchronized (this.f1218a) {
            try {
                d dVar = this.f1219b;
                root = dVar != null ? dVar.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // D1.d
    public final boolean h(c cVar) {
        boolean z6;
        synchronized (this.f1218a) {
            d dVar = this.f1219b;
            z6 = (dVar == null || dVar.h(this)) && cVar.equals(this.f1220c);
        }
        return z6;
    }

    @Override // D1.d
    public final boolean i(c cVar) {
        boolean z6;
        synchronized (this.f1218a) {
            d dVar = this.f1219b;
            z6 = dVar == null || dVar.i(this);
        }
        return z6;
    }

    @Override // D1.c
    public final boolean isRunning() {
        boolean z6;
        synchronized (this.f1218a) {
            try {
                z6 = true;
                if (this.f1222e != 1 && this.f1223f != 1) {
                    z6 = false;
                }
            } finally {
            }
        }
        return z6;
    }

    @Override // D1.c
    public final void j() {
        synchronized (this.f1218a) {
            try {
                if (this.f1222e != 1) {
                    this.f1222e = 1;
                    this.f1220c.j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D1.c
    public final boolean k() {
        boolean z6;
        synchronized (this.f1218a) {
            try {
                z6 = this.f1222e == 4 || this.f1223f == 4;
            } finally {
            }
        }
        return z6;
    }
}
