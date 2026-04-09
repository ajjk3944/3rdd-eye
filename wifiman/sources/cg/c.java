package Cg;

import gg.x;
import hg.InterfaceC6043c;
import lg.EnumC6592b;
import zg.AbstractC8755h;
import zg.C8748a;
import zg.EnumC8757j;

/* loaded from: classes4.dex */
public final class c implements x, InterfaceC6043c {

    /* renamed from: a, reason: collision with root package name */
    final x f2746a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f2747b;

    /* renamed from: c, reason: collision with root package name */
    InterfaceC6043c f2748c;

    /* renamed from: d, reason: collision with root package name */
    boolean f2749d;

    /* renamed from: e, reason: collision with root package name */
    C8748a f2750e;

    /* renamed from: f, reason: collision with root package name */
    volatile boolean f2751f;

    public c(x xVar) {
        this(xVar, false);
    }

    @Override // gg.x
    public void a() {
        if (this.f2751f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f2751f) {
                    return;
                }
                if (!this.f2749d) {
                    this.f2751f = true;
                    this.f2749d = true;
                    this.f2746a.a();
                } else {
                    C8748a c8748a = this.f2750e;
                    if (c8748a == null) {
                        c8748a = new C8748a(4);
                        this.f2750e = c8748a;
                    }
                    c8748a.c(EnumC8757j.complete());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void b() {
        C8748a c8748a;
        do {
            synchronized (this) {
                try {
                    c8748a = this.f2750e;
                    if (c8748a == null) {
                        this.f2749d = false;
                        return;
                    }
                    this.f2750e = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (!c8748a.b(this.f2746a));
    }

    @Override // gg.x
    public void c(InterfaceC6043c interfaceC6043c) {
        if (EnumC6592b.validate(this.f2748c, interfaceC6043c)) {
            this.f2748c = interfaceC6043c;
            this.f2746a.c(this);
        }
    }

    @Override // hg.InterfaceC6043c
    public void dispose() {
        this.f2751f = true;
        this.f2748c.dispose();
    }

    @Override // gg.x
    public void h(Object obj) {
        if (this.f2751f) {
            return;
        }
        if (obj == null) {
            this.f2748c.dispose();
            onError(AbstractC8755h.b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f2751f) {
                    return;
                }
                if (!this.f2749d) {
                    this.f2749d = true;
                    this.f2746a.h(obj);
                    b();
                } else {
                    C8748a c8748a = this.f2750e;
                    if (c8748a == null) {
                        c8748a = new C8748a(4);
                        this.f2750e = c8748a;
                    }
                    c8748a.c(EnumC8757j.next(obj));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // hg.InterfaceC6043c
    public boolean isDisposed() {
        return this.f2748c.isDisposed();
    }

    @Override // gg.x
    public void onError(Throwable th2) {
        if (this.f2751f) {
            Eg.a.v(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f2751f) {
                    if (this.f2749d) {
                        this.f2751f = true;
                        C8748a c8748a = this.f2750e;
                        if (c8748a == null) {
                            c8748a = new C8748a(4);
                            this.f2750e = c8748a;
                        }
                        Object objError = EnumC8757j.error(th2);
                        if (this.f2747b) {
                            c8748a.c(objError);
                        } else {
                            c8748a.e(objError);
                        }
                        return;
                    }
                    this.f2751f = true;
                    this.f2749d = true;
                    z10 = false;
                }
                if (z10) {
                    Eg.a.v(th2);
                } else {
                    this.f2746a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public c(x xVar, boolean z10) {
        this.f2746a = xVar;
        this.f2747b = z10;
    }
}
