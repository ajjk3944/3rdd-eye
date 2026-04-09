package Ig;

import Dj.b;
import Dj.c;
import gg.l;
import yg.EnumC8672g;
import zg.AbstractC8755h;
import zg.C8748a;
import zg.EnumC8757j;

/* loaded from: classes4.dex */
public final class a implements l, c {

    /* renamed from: a, reason: collision with root package name */
    final b f9223a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f9224b;

    /* renamed from: c, reason: collision with root package name */
    c f9225c;

    /* renamed from: d, reason: collision with root package name */
    boolean f9226d;

    /* renamed from: e, reason: collision with root package name */
    C8748a f9227e;

    /* renamed from: f, reason: collision with root package name */
    volatile boolean f9228f;

    public a(b bVar) {
        this(bVar, false);
    }

    @Override // Dj.b
    public void a() {
        if (this.f9228f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f9228f) {
                    return;
                }
                if (!this.f9226d) {
                    this.f9228f = true;
                    this.f9226d = true;
                    this.f9223a.a();
                } else {
                    C8748a c8748a = this.f9227e;
                    if (c8748a == null) {
                        c8748a = new C8748a(4);
                        this.f9227e = c8748a;
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
                    c8748a = this.f9227e;
                    if (c8748a == null) {
                        this.f9226d = false;
                        return;
                    }
                    this.f9227e = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (!c8748a.a(this.f9223a));
    }

    @Override // Dj.c
    public void cancel() {
        this.f9225c.cancel();
    }

    @Override // Dj.b
    public void h(Object obj) {
        if (this.f9228f) {
            return;
        }
        if (obj == null) {
            this.f9225c.cancel();
            onError(AbstractC8755h.b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f9228f) {
                    return;
                }
                if (!this.f9226d) {
                    this.f9226d = true;
                    this.f9223a.h(obj);
                    b();
                } else {
                    C8748a c8748a = this.f9227e;
                    if (c8748a == null) {
                        c8748a = new C8748a(4);
                        this.f9227e = c8748a;
                    }
                    c8748a.c(EnumC8757j.next(obj));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // gg.l
    public void j(c cVar) {
        if (EnumC8672g.validate(this.f9225c, cVar)) {
            this.f9225c = cVar;
            this.f9223a.j(this);
        }
    }

    @Override // Dj.b
    public void onError(Throwable th2) {
        if (this.f9228f) {
            Eg.a.v(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f9228f) {
                    if (this.f9226d) {
                        this.f9228f = true;
                        C8748a c8748a = this.f9227e;
                        if (c8748a == null) {
                            c8748a = new C8748a(4);
                            this.f9227e = c8748a;
                        }
                        Object objError = EnumC8757j.error(th2);
                        if (this.f9224b) {
                            c8748a.c(objError);
                        } else {
                            c8748a.e(objError);
                        }
                        return;
                    }
                    this.f9228f = true;
                    this.f9226d = true;
                    z10 = false;
                }
                if (z10) {
                    Eg.a.v(th2);
                } else {
                    this.f9223a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // Dj.c
    public void request(long j10) {
        this.f9225c.request(j10);
    }

    public a(b bVar, boolean z10) {
        this.f9223a = bVar;
        this.f9224b = z10;
    }
}
