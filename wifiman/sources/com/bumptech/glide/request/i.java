package com.bumptech.glide.request;

import com.bumptech.glide.request.d;

/* loaded from: classes.dex */
public class i implements d, c {

    /* renamed from: a, reason: collision with root package name */
    private final d f34663a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f34664b;

    /* renamed from: c, reason: collision with root package name */
    private volatile c f34665c;

    /* renamed from: d, reason: collision with root package name */
    private volatile c f34666d;

    /* renamed from: e, reason: collision with root package name */
    private d.a f34667e;

    /* renamed from: f, reason: collision with root package name */
    private d.a f34668f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f34669g;

    public i(Object obj, d dVar) {
        d.a aVar = d.a.CLEARED;
        this.f34667e = aVar;
        this.f34668f = aVar;
        this.f34664b = obj;
        this.f34663a = dVar;
    }

    private boolean k() {
        d dVar = this.f34663a;
        return dVar == null || dVar.j(this);
    }

    private boolean l() {
        d dVar = this.f34663a;
        return dVar == null || dVar.c(this);
    }

    private boolean m() {
        d dVar = this.f34663a;
        return dVar == null || dVar.f(this);
    }

    @Override // com.bumptech.glide.request.d
    public void a(c cVar) {
        synchronized (this.f34664b) {
            try {
                if (!cVar.equals(this.f34665c)) {
                    this.f34668f = d.a.FAILED;
                    return;
                }
                this.f34667e = d.a.FAILED;
                d dVar = this.f34663a;
                if (dVar != null) {
                    dVar.a(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.d, com.bumptech.glide.request.c
    public boolean b() {
        boolean z10;
        synchronized (this.f34664b) {
            try {
                z10 = this.f34666d.b() || this.f34665c.b();
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public boolean c(c cVar) {
        boolean z10;
        synchronized (this.f34664b) {
            try {
                z10 = l() && cVar.equals(this.f34665c) && !b();
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.c
    public void clear() {
        synchronized (this.f34664b) {
            this.f34669g = false;
            d.a aVar = d.a.CLEARED;
            this.f34667e = aVar;
            this.f34668f = aVar;
            this.f34666d.clear();
            this.f34665c.clear();
        }
    }

    @Override // com.bumptech.glide.request.c
    public boolean d(c cVar) {
        if (!(cVar instanceof i)) {
            return false;
        }
        i iVar = (i) cVar;
        if (this.f34665c == null) {
            if (iVar.f34665c != null) {
                return false;
            }
        } else if (!this.f34665c.d(iVar.f34665c)) {
            return false;
        }
        if (this.f34666d == null) {
            if (iVar.f34666d != null) {
                return false;
            }
        } else if (!this.f34666d.d(iVar.f34666d)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.c
    public void e() {
        synchronized (this.f34664b) {
            try {
                if (!this.f34668f.isComplete()) {
                    this.f34668f = d.a.PAUSED;
                    this.f34666d.e();
                }
                if (!this.f34667e.isComplete()) {
                    this.f34667e = d.a.PAUSED;
                    this.f34665c.e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.d
    public boolean f(c cVar) {
        boolean z10;
        synchronized (this.f34664b) {
            try {
                z10 = m() && (cVar.equals(this.f34665c) || this.f34667e != d.a.SUCCESS);
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.c
    public boolean g() {
        boolean z10;
        synchronized (this.f34664b) {
            z10 = this.f34667e == d.a.CLEARED;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public d getRoot() {
        d root;
        synchronized (this.f34664b) {
            try {
                d dVar = this.f34663a;
                root = dVar != null ? dVar.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.d
    public void h(c cVar) {
        synchronized (this.f34664b) {
            try {
                if (cVar.equals(this.f34666d)) {
                    this.f34668f = d.a.SUCCESS;
                    return;
                }
                this.f34667e = d.a.SUCCESS;
                d dVar = this.f34663a;
                if (dVar != null) {
                    dVar.h(this);
                }
                if (!this.f34668f.isComplete()) {
                    this.f34666d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.c
    public void i() {
        synchronized (this.f34664b) {
            try {
                this.f34669g = true;
                try {
                    if (this.f34667e != d.a.SUCCESS) {
                        d.a aVar = this.f34668f;
                        d.a aVar2 = d.a.RUNNING;
                        if (aVar != aVar2) {
                            this.f34668f = aVar2;
                            this.f34666d.i();
                        }
                    }
                    if (this.f34669g) {
                        d.a aVar3 = this.f34667e;
                        d.a aVar4 = d.a.RUNNING;
                        if (aVar3 != aVar4) {
                            this.f34667e = aVar4;
                            this.f34665c.i();
                        }
                    }
                    this.f34669g = false;
                } catch (Throwable th2) {
                    this.f34669g = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.bumptech.glide.request.c
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f34664b) {
            z10 = this.f34667e == d.a.SUCCESS;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f34664b) {
            z10 = this.f34667e == d.a.RUNNING;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public boolean j(c cVar) {
        boolean z10;
        synchronized (this.f34664b) {
            try {
                z10 = k() && cVar.equals(this.f34665c) && this.f34667e != d.a.PAUSED;
            } finally {
            }
        }
        return z10;
    }

    public void n(c cVar, c cVar2) {
        this.f34665c = cVar;
        this.f34666d = cVar2;
    }
}
