package p8;

import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h implements d, c {

    /* renamed from: a, reason: collision with root package name */
    public final d f31499a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f31500b;

    /* renamed from: c, reason: collision with root package name */
    public volatile g f31501c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f31502d;

    /* renamed from: e, reason: collision with root package name */
    public int f31503e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f31504f = 3;
    public boolean g;

    public h(Object obj, d dVar) {
        this.f31500b = obj;
        this.f31499a = dVar;
    }

    @Override // p8.d, p8.c
    public final boolean a() {
        boolean z3;
        synchronized (this.f31500b) {
            try {
                z3 = this.f31502d.a() || this.f31501c.a();
            } finally {
            }
        }
        return z3;
    }

    @Override // p8.c
    public final boolean b() {
        boolean z3;
        synchronized (this.f31500b) {
            z3 = this.f31503e == 4;
        }
        return z3;
    }

    @Override // p8.d
    public final boolean c(c cVar) {
        boolean z3;
        synchronized (this.f31500b) {
            try {
                d dVar = this.f31499a;
                z3 = (dVar == null || dVar.c(this)) && (cVar.equals(this.f31501c) || this.f31503e != 4);
            } finally {
            }
        }
        return z3;
    }

    @Override // p8.c
    public final void clear() {
        synchronized (this.f31500b) {
            this.g = false;
            this.f31503e = 3;
            this.f31504f = 3;
            this.f31502d.clear();
            this.f31501c.clear();
        }
    }

    @Override // p8.d
    public final boolean d(c cVar) {
        boolean z3;
        synchronized (this.f31500b) {
            try {
                d dVar = this.f31499a;
                z3 = (dVar == null || dVar.d(this)) && cVar.equals(this.f31501c) && this.f31503e != 2;
            } finally {
            }
        }
        return z3;
    }

    @Override // p8.d
    public final void e(c cVar) {
        synchronized (this.f31500b) {
            try {
                if (cVar.equals(this.f31502d)) {
                    this.f31504f = 4;
                    return;
                }
                this.f31503e = 4;
                d dVar = this.f31499a;
                if (dVar != null) {
                    dVar.e(this);
                }
                if (!u.j(this.f31504f)) {
                    this.f31502d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p8.c
    public final boolean f() {
        boolean z3;
        synchronized (this.f31500b) {
            z3 = this.f31503e == 3;
        }
        return z3;
    }

    @Override // p8.c
    public final void g() {
        synchronized (this.f31500b) {
            try {
                this.g = true;
                try {
                    if (this.f31503e != 4 && this.f31504f != 1) {
                        this.f31504f = 1;
                        this.f31502d.g();
                    }
                    if (this.g && this.f31503e != 1) {
                        this.f31503e = 1;
                        this.f31501c.g();
                    }
                    this.g = false;
                } catch (Throwable th2) {
                    this.g = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p8.d
    public final d getRoot() {
        d root;
        synchronized (this.f31500b) {
            try {
                d dVar = this.f31499a;
                root = dVar != null ? dVar.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // p8.c
    public final boolean h(c cVar) {
        if (!(cVar instanceof h)) {
            return false;
        }
        h hVar = (h) cVar;
        if (this.f31501c == null) {
            if (hVar.f31501c != null) {
                return false;
            }
        } else if (!this.f31501c.h(hVar.f31501c)) {
            return false;
        }
        return this.f31502d == null ? hVar.f31502d == null : this.f31502d.h(hVar.f31502d);
    }

    @Override // p8.d
    public final boolean i(c cVar) {
        boolean z3;
        synchronized (this.f31500b) {
            try {
                d dVar = this.f31499a;
                z3 = (dVar == null || dVar.i(this)) && cVar.equals(this.f31501c) && !a();
            } finally {
            }
        }
        return z3;
    }

    @Override // p8.c
    public final boolean isRunning() {
        boolean z3;
        synchronized (this.f31500b) {
            z3 = true;
            if (this.f31503e != 1) {
                z3 = false;
            }
        }
        return z3;
    }

    @Override // p8.d
    public final void j(c cVar) {
        synchronized (this.f31500b) {
            try {
                if (!cVar.equals(this.f31501c)) {
                    this.f31504f = 5;
                    return;
                }
                this.f31503e = 5;
                d dVar = this.f31499a;
                if (dVar != null) {
                    dVar.j(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p8.c
    public final void pause() {
        synchronized (this.f31500b) {
            try {
                if (!u.j(this.f31504f)) {
                    this.f31504f = 2;
                    this.f31502d.pause();
                }
                if (!u.j(this.f31503e)) {
                    this.f31503e = 2;
                    this.f31501c.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
