package Fg;

import zg.C8748a;
import zg.EnumC8757j;

/* loaded from: classes4.dex */
final class d extends b {

    /* renamed from: b, reason: collision with root package name */
    final b f6650b;

    /* renamed from: c, reason: collision with root package name */
    boolean f6651c;

    /* renamed from: d, reason: collision with root package name */
    C8748a f6652d;

    /* renamed from: e, reason: collision with root package name */
    volatile boolean f6653e;

    d(b bVar) {
        this.f6650b = bVar;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f6650b.b(bVar);
    }

    @Override // Dj.b
    public void a() {
        if (this.f6653e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f6653e) {
                    return;
                }
                this.f6653e = true;
                if (!this.f6651c) {
                    this.f6651c = true;
                    this.f6650b.a();
                    return;
                }
                C8748a c8748a = this.f6652d;
                if (c8748a == null) {
                    c8748a = new C8748a(4);
                    this.f6652d = c8748a;
                }
                c8748a.c(EnumC8757j.complete());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Dj.b
    public void h(Object obj) {
        if (this.f6653e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f6653e) {
                    return;
                }
                if (!this.f6651c) {
                    this.f6651c = true;
                    this.f6650b.h(obj);
                    i2();
                } else {
                    C8748a c8748a = this.f6652d;
                    if (c8748a == null) {
                        c8748a = new C8748a(4);
                        this.f6652d = c8748a;
                    }
                    c8748a.c(EnumC8757j.next(obj));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void i2() {
        C8748a c8748a;
        while (true) {
            synchronized (this) {
                try {
                    c8748a = this.f6652d;
                    if (c8748a == null) {
                        this.f6651c = false;
                        return;
                    }
                    this.f6652d = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c8748a.a(this.f6650b);
        }
    }

    @Override // Dj.b, gg.l
    public void j(Dj.c cVar) {
        boolean z10 = true;
        if (!this.f6653e) {
            synchronized (this) {
                try {
                    if (!this.f6653e) {
                        if (this.f6651c) {
                            C8748a c8748a = this.f6652d;
                            if (c8748a == null) {
                                c8748a = new C8748a(4);
                                this.f6652d = c8748a;
                            }
                            c8748a.c(EnumC8757j.subscription(cVar));
                            return;
                        }
                        this.f6651c = true;
                        z10 = false;
                    }
                } finally {
                }
            }
        }
        if (z10) {
            cVar.cancel();
        } else {
            this.f6650b.j(cVar);
            i2();
        }
    }

    @Override // Dj.b
    public void onError(Throwable th2) {
        if (this.f6653e) {
            Eg.a.v(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f6653e) {
                    this.f6653e = true;
                    if (this.f6651c) {
                        C8748a c8748a = this.f6652d;
                        if (c8748a == null) {
                            c8748a = new C8748a(4);
                            this.f6652d = c8748a;
                        }
                        c8748a.e(EnumC8757j.error(th2));
                        return;
                    }
                    this.f6651c = true;
                    z10 = false;
                }
                if (z10) {
                    Eg.a.v(th2);
                } else {
                    this.f6650b.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
