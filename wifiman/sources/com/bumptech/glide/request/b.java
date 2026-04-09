package com.bumptech.glide.request;

import com.bumptech.glide.request.d;

/* loaded from: classes.dex */
public final class b implements d, c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f34626a;

    /* renamed from: b, reason: collision with root package name */
    private final d f34627b;

    /* renamed from: c, reason: collision with root package name */
    private volatile c f34628c;

    /* renamed from: d, reason: collision with root package name */
    private volatile c f34629d;

    /* renamed from: e, reason: collision with root package name */
    private d.a f34630e;

    /* renamed from: f, reason: collision with root package name */
    private d.a f34631f;

    public b(Object obj, d dVar) {
        d.a aVar = d.a.CLEARED;
        this.f34630e = aVar;
        this.f34631f = aVar;
        this.f34626a = obj;
        this.f34627b = dVar;
    }

    private boolean k(c cVar) {
        d.a aVar;
        d.a aVar2 = this.f34630e;
        d.a aVar3 = d.a.FAILED;
        return aVar2 != aVar3 ? cVar.equals(this.f34628c) : cVar.equals(this.f34629d) && ((aVar = this.f34631f) == d.a.SUCCESS || aVar == aVar3);
    }

    private boolean l() {
        d dVar = this.f34627b;
        return dVar == null || dVar.j(this);
    }

    private boolean m() {
        d dVar = this.f34627b;
        return dVar == null || dVar.c(this);
    }

    private boolean n() {
        d dVar = this.f34627b;
        return dVar == null || dVar.f(this);
    }

    @Override // com.bumptech.glide.request.d
    public void a(c cVar) {
        synchronized (this.f34626a) {
            try {
                if (cVar.equals(this.f34629d)) {
                    this.f34631f = d.a.FAILED;
                    d dVar = this.f34627b;
                    if (dVar != null) {
                        dVar.a(this);
                    }
                    return;
                }
                this.f34630e = d.a.FAILED;
                d.a aVar = this.f34631f;
                d.a aVar2 = d.a.RUNNING;
                if (aVar != aVar2) {
                    this.f34631f = aVar2;
                    this.f34629d.i();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.d, com.bumptech.glide.request.c
    public boolean b() {
        boolean z10;
        synchronized (this.f34626a) {
            try {
                z10 = this.f34628c.b() || this.f34629d.b();
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public boolean c(c cVar) {
        boolean z10;
        synchronized (this.f34626a) {
            try {
                z10 = m() && k(cVar);
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.c
    public void clear() {
        synchronized (this.f34626a) {
            try {
                d.a aVar = d.a.CLEARED;
                this.f34630e = aVar;
                this.f34628c.clear();
                if (this.f34631f != aVar) {
                    this.f34631f = aVar;
                    this.f34629d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.c
    public boolean d(c cVar) {
        if (!(cVar instanceof b)) {
            return false;
        }
        b bVar = (b) cVar;
        return this.f34628c.d(bVar.f34628c) && this.f34629d.d(bVar.f34629d);
    }

    @Override // com.bumptech.glide.request.c
    public void e() {
        synchronized (this.f34626a) {
            try {
                d.a aVar = this.f34630e;
                d.a aVar2 = d.a.RUNNING;
                if (aVar == aVar2) {
                    this.f34630e = d.a.PAUSED;
                    this.f34628c.e();
                }
                if (this.f34631f == aVar2) {
                    this.f34631f = d.a.PAUSED;
                    this.f34629d.e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.d
    public boolean f(c cVar) {
        boolean zN;
        synchronized (this.f34626a) {
            zN = n();
        }
        return zN;
    }

    @Override // com.bumptech.glide.request.c
    public boolean g() {
        boolean z10;
        synchronized (this.f34626a) {
            try {
                d.a aVar = this.f34630e;
                d.a aVar2 = d.a.CLEARED;
                z10 = aVar == aVar2 && this.f34631f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public d getRoot() {
        d root;
        synchronized (this.f34626a) {
            try {
                d dVar = this.f34627b;
                root = dVar != null ? dVar.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.d
    public void h(c cVar) {
        synchronized (this.f34626a) {
            try {
                if (cVar.equals(this.f34628c)) {
                    this.f34630e = d.a.SUCCESS;
                } else if (cVar.equals(this.f34629d)) {
                    this.f34631f = d.a.SUCCESS;
                }
                d dVar = this.f34627b;
                if (dVar != null) {
                    dVar.h(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.c
    public void i() {
        synchronized (this.f34626a) {
            try {
                d.a aVar = this.f34630e;
                d.a aVar2 = d.a.RUNNING;
                if (aVar != aVar2) {
                    this.f34630e = aVar2;
                    this.f34628c.i();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.c
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f34626a) {
            try {
                d.a aVar = this.f34630e;
                d.a aVar2 = d.a.SUCCESS;
                z10 = aVar == aVar2 || this.f34631f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f34626a) {
            try {
                d.a aVar = this.f34630e;
                d.a aVar2 = d.a.RUNNING;
                z10 = aVar == aVar2 || this.f34631f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public boolean j(c cVar) {
        boolean z10;
        synchronized (this.f34626a) {
            try {
                z10 = l() && cVar.equals(this.f34628c);
            } finally {
            }
        }
        return z10;
    }

    public void o(c cVar, c cVar2) {
        this.f34628c = cVar;
        this.f34629d = cVar2;
    }
}
