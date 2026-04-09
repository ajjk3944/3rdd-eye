package D1;

/* loaded from: classes.dex */
public final class g implements d, c {

    /* renamed from: a, reason: collision with root package name */
    public final d f1252a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1253b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f1254c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f1255d;

    /* renamed from: e, reason: collision with root package name */
    public int f1256e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f1257f = 3;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1258g;

    public g(Object obj, d dVar) {
        this.f1253b = obj;
        this.f1252a = dVar;
    }

    @Override // D1.d, D1.c
    public final boolean a() {
        boolean z6;
        synchronized (this.f1253b) {
            try {
                z6 = this.f1255d.a() || this.f1254c.a();
            } finally {
            }
        }
        return z6;
    }

    @Override // D1.d
    public final void b(c cVar) {
        synchronized (this.f1253b) {
            try {
                if (cVar.equals(this.f1255d)) {
                    this.f1257f = 4;
                    return;
                }
                this.f1256e = 4;
                d dVar = this.f1252a;
                if (dVar != null) {
                    dVar.b(this);
                }
                if (!A.f.c(this.f1257f)) {
                    this.f1255d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D1.c
    public final boolean c(c cVar) {
        if (!(cVar instanceof g)) {
            return false;
        }
        g gVar = (g) cVar;
        if (this.f1254c == null) {
            if (gVar.f1254c != null) {
                return false;
            }
        } else if (!this.f1254c.c(gVar.f1254c)) {
            return false;
        }
        return this.f1255d == null ? gVar.f1255d == null : this.f1255d.c(gVar.f1255d);
    }

    @Override // D1.c
    public final void clear() {
        synchronized (this.f1253b) {
            this.f1258g = false;
            this.f1256e = 3;
            this.f1257f = 3;
            this.f1255d.clear();
            this.f1254c.clear();
        }
    }

    @Override // D1.c
    public final void d() {
        synchronized (this.f1253b) {
            try {
                if (!A.f.c(this.f1257f)) {
                    this.f1257f = 2;
                    this.f1255d.d();
                }
                if (!A.f.c(this.f1256e)) {
                    this.f1256e = 2;
                    this.f1254c.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D1.d
    public final void e(c cVar) {
        synchronized (this.f1253b) {
            try {
                if (!cVar.equals(this.f1254c)) {
                    this.f1257f = 5;
                    return;
                }
                this.f1256e = 5;
                d dVar = this.f1252a;
                if (dVar != null) {
                    dVar.e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D1.d
    public final boolean f(c cVar) {
        boolean z6;
        synchronized (this.f1253b) {
            try {
                d dVar = this.f1252a;
                z6 = (dVar == null || dVar.f(this)) && cVar.equals(this.f1254c) && !a();
            } finally {
            }
        }
        return z6;
    }

    @Override // D1.c
    public final boolean g() {
        boolean z6;
        synchronized (this.f1253b) {
            z6 = this.f1256e == 3;
        }
        return z6;
    }

    @Override // D1.d
    public final d getRoot() {
        d root;
        synchronized (this.f1253b) {
            try {
                d dVar = this.f1252a;
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
        synchronized (this.f1253b) {
            try {
                d dVar = this.f1252a;
                z6 = (dVar == null || dVar.h(this)) && cVar.equals(this.f1254c) && this.f1256e != 2;
            } finally {
            }
        }
        return z6;
    }

    @Override // D1.d
    public final boolean i(c cVar) {
        boolean z6;
        synchronized (this.f1253b) {
            try {
                d dVar = this.f1252a;
                z6 = (dVar == null || dVar.i(this)) && (cVar.equals(this.f1254c) || this.f1256e != 4);
            } finally {
            }
        }
        return z6;
    }

    @Override // D1.c
    public final boolean isRunning() {
        boolean z6;
        synchronized (this.f1253b) {
            z6 = true;
            if (this.f1256e != 1) {
                z6 = false;
            }
        }
        return z6;
    }

    @Override // D1.c
    public final void j() {
        synchronized (this.f1253b) {
            try {
                this.f1258g = true;
                try {
                    if (this.f1256e != 4 && this.f1257f != 1) {
                        this.f1257f = 1;
                        this.f1255d.j();
                    }
                    if (this.f1258g && this.f1256e != 1) {
                        this.f1256e = 1;
                        this.f1254c.j();
                    }
                    this.f1258g = false;
                } catch (Throwable th) {
                    this.f1258g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // D1.c
    public final boolean k() {
        boolean z6;
        synchronized (this.f1253b) {
            z6 = this.f1256e == 4;
        }
        return z6;
    }
}
