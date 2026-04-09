package c3;

import c3.c;

/* loaded from: classes.dex */
public abstract class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public c.a f4727a;

    /* renamed from: b, reason: collision with root package name */
    public c.g f4728b;

    /* renamed from: c, reason: collision with root package name */
    public c.InterfaceC0062c f4729c;

    /* renamed from: d, reason: collision with root package name */
    public c.f f4730d;

    /* renamed from: e, reason: collision with root package name */
    public c.d f4731e;

    /* renamed from: f, reason: collision with root package name */
    public c.e f4732f;

    /* renamed from: g, reason: collision with root package name */
    public c.b f4733g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4734h = false;

    @Override // c3.c
    public final void b(c.b bVar) {
        this.f4733g = bVar;
    }

    @Override // c3.c
    public final void c(c.f fVar) {
        this.f4730d = fVar;
    }

    @Override // c3.c
    public final void d(c.a aVar) {
        this.f4727a = aVar;
    }

    @Override // c3.c
    public final void e(c.d dVar) {
        this.f4731e = dVar;
    }

    @Override // c3.c
    public void emc(boolean z10) {
        this.f4734h = z10;
    }

    @Override // c3.c
    public final void h(c.g gVar) {
        this.f4728b = gVar;
    }

    @Override // c3.c
    public final void i(c.e eVar) {
        this.f4732f = eVar;
    }

    @Override // c3.c
    public final void j(c.InterfaceC0062c interfaceC0062c) {
        this.f4729c = interfaceC0062c;
    }

    public final void l() {
        try {
            c.f fVar = this.f4730d;
            if (fVar != null) {
                fVar.xq(this);
            }
        } catch (Throwable unused) {
        }
    }

    public void m() {
        this.f4727a = null;
        this.f4729c = null;
        this.f4728b = null;
        this.f4730d = null;
        this.f4731e = null;
        this.f4732f = null;
        this.f4733g = null;
    }

    public final void n(int i10) {
        try {
            c.InterfaceC0062c interfaceC0062c = this.f4729c;
            if (interfaceC0062c != null) {
                interfaceC0062c.emc(this, i10);
            }
        } catch (Throwable unused) {
        }
    }

    public final void o(int i10, int i11, int i12, int i13) {
        try {
            c.d dVar = this.f4731e;
            if (dVar != null) {
                dVar.emc(this, i10, i11, i12, i13);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean p(int i10, int i11) {
        try {
            c.e eVar = this.f4732f;
            if (eVar != null) {
                if (eVar.emc(this, i10, i11)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public final void q() {
        try {
            c.g gVar = this.f4728b;
            if (gVar != null) {
                gVar.emc(this);
            }
        } catch (Throwable unused) {
        }
    }

    public final void r() {
        try {
            c.a aVar = this.f4727a;
            if (aVar != null) {
                aVar.ypw(this);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean s(int i10, int i11) {
        try {
            c.b bVar = this.f4733g;
            if (bVar != null) {
                if (bVar.ypw(this, i10, i11)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
