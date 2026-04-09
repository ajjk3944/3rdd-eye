package Hg;

import gg.x;
import hg.InterfaceC6043c;
import zg.C8748a;
import zg.EnumC8757j;

/* loaded from: classes4.dex */
final class c extends d implements C8748a.InterfaceC2392a {

    /* renamed from: a, reason: collision with root package name */
    final d f7963a;

    /* renamed from: b, reason: collision with root package name */
    boolean f7964b;

    /* renamed from: c, reason: collision with root package name */
    C8748a f7965c;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f7966d;

    c(d dVar) {
        this.f7963a = dVar;
    }

    @Override // gg.s
    protected void L0(x xVar) {
        this.f7963a.d(xVar);
    }

    @Override // gg.x
    public void a() {
        if (this.f7966d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f7966d) {
                    return;
                }
                this.f7966d = true;
                if (!this.f7964b) {
                    this.f7964b = true;
                    this.f7963a.a();
                    return;
                }
                C8748a c8748a = this.f7965c;
                if (c8748a == null) {
                    c8748a = new C8748a(4);
                    this.f7965c = c8748a;
                }
                c8748a.c(EnumC8757j.complete());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // gg.x
    public void c(InterfaceC6043c interfaceC6043c) {
        boolean z10 = true;
        if (!this.f7966d) {
            synchronized (this) {
                try {
                    if (!this.f7966d) {
                        if (this.f7964b) {
                            C8748a c8748a = this.f7965c;
                            if (c8748a == null) {
                                c8748a = new C8748a(4);
                                this.f7965c = c8748a;
                            }
                            c8748a.c(EnumC8757j.disposable(interfaceC6043c));
                            return;
                        }
                        this.f7964b = true;
                        z10 = false;
                    }
                } finally {
                }
            }
        }
        if (z10) {
            interfaceC6043c.dispose();
        } else {
            this.f7963a.c(interfaceC6043c);
            j1();
        }
    }

    @Override // gg.x
    public void h(Object obj) {
        if (this.f7966d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f7966d) {
                    return;
                }
                if (!this.f7964b) {
                    this.f7964b = true;
                    this.f7963a.h(obj);
                    j1();
                } else {
                    C8748a c8748a = this.f7965c;
                    if (c8748a == null) {
                        c8748a = new C8748a(4);
                        this.f7965c = c8748a;
                    }
                    c8748a.c(EnumC8757j.next(obj));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void j1() {
        C8748a c8748a;
        while (true) {
            synchronized (this) {
                try {
                    c8748a = this.f7965c;
                    if (c8748a == null) {
                        this.f7964b = false;
                        return;
                    }
                    this.f7965c = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c8748a.d(this);
        }
    }

    @Override // gg.x
    public void onError(Throwable th2) {
        if (this.f7966d) {
            Eg.a.v(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f7966d) {
                    this.f7966d = true;
                    if (this.f7964b) {
                        C8748a c8748a = this.f7965c;
                        if (c8748a == null) {
                            c8748a = new C8748a(4);
                            this.f7965c = c8748a;
                        }
                        c8748a.e(EnumC8757j.error(th2));
                        return;
                    }
                    this.f7964b = true;
                    z10 = false;
                }
                if (z10) {
                    Eg.a.v(th2);
                } else {
                    this.f7963a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // zg.C8748a.InterfaceC2392a, kg.p
    public boolean test(Object obj) {
        return EnumC8757j.acceptFull(obj, this.f7963a);
    }
}
