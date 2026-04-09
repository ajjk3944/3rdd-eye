package androidx.lifecycle;

import androidx.lifecycle.AbstractC4013k;
import java.util.Map;
import m.C6653c;
import n.C6854b;

/* renamed from: androidx.lifecycle.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4020s {

    /* renamed from: k, reason: collision with root package name */
    static final Object f31677k = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Object f31678a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private C6854b f31679b = new C6854b();

    /* renamed from: c, reason: collision with root package name */
    int f31680c = 0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f31681d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f31682e;

    /* renamed from: f, reason: collision with root package name */
    volatile Object f31683f;

    /* renamed from: g, reason: collision with root package name */
    private int f31684g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f31685h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f31686i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f31687j;

    /* renamed from: androidx.lifecycle.s$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (AbstractC4020s.this.f31678a) {
                obj = AbstractC4020s.this.f31683f;
                AbstractC4020s.this.f31683f = AbstractC4020s.f31677k;
            }
            AbstractC4020s.this.n(obj);
        }
    }

    /* renamed from: androidx.lifecycle.s$b */
    private class b extends d {
        b(v vVar) {
            super(vVar);
        }

        @Override // androidx.lifecycle.AbstractC4020s.d
        boolean d() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.s$c */
    class c extends d implements InterfaceC4015m {

        /* renamed from: e, reason: collision with root package name */
        final InterfaceC4017o f31690e;

        c(InterfaceC4017o interfaceC4017o, v vVar) {
            super(vVar);
            this.f31690e = interfaceC4017o;
        }

        @Override // androidx.lifecycle.AbstractC4020s.d
        void b() {
            this.f31690e.O().c(this);
        }

        @Override // androidx.lifecycle.AbstractC4020s.d
        boolean c(InterfaceC4017o interfaceC4017o) {
            return this.f31690e == interfaceC4017o;
        }

        @Override // androidx.lifecycle.AbstractC4020s.d
        boolean d() {
            return this.f31690e.O().b().isAtLeast(AbstractC4013k.b.STARTED);
        }

        @Override // androidx.lifecycle.InterfaceC4015m
        public void j(InterfaceC4017o interfaceC4017o, AbstractC4013k.a aVar) {
            AbstractC4013k.b bVarB = this.f31690e.O().b();
            if (bVarB == AbstractC4013k.b.DESTROYED) {
                AbstractC4020s.this.m(this.f31692a);
                return;
            }
            AbstractC4013k.b bVar = null;
            while (bVar != bVarB) {
                a(d());
                bVar = bVarB;
                bVarB = this.f31690e.O().b();
            }
        }
    }

    /* renamed from: androidx.lifecycle.s$d */
    private abstract class d {

        /* renamed from: a, reason: collision with root package name */
        final v f31692a;

        /* renamed from: b, reason: collision with root package name */
        boolean f31693b;

        /* renamed from: c, reason: collision with root package name */
        int f31694c = -1;

        d(v vVar) {
            this.f31692a = vVar;
        }

        void a(boolean z10) {
            if (z10 == this.f31693b) {
                return;
            }
            this.f31693b = z10;
            AbstractC4020s.this.c(z10 ? 1 : -1);
            if (this.f31693b) {
                AbstractC4020s.this.e(this);
            }
        }

        void b() {
        }

        boolean c(InterfaceC4017o interfaceC4017o) {
            return false;
        }

        abstract boolean d();
    }

    public AbstractC4020s() {
        Object obj = f31677k;
        this.f31683f = obj;
        this.f31687j = new a();
        this.f31682e = obj;
        this.f31684g = -1;
    }

    static void b(String str) {
        if (C6653c.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(d dVar) {
        if (dVar.f31693b) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i10 = dVar.f31694c;
            int i11 = this.f31684g;
            if (i10 >= i11) {
                return;
            }
            dVar.f31694c = i11;
            dVar.f31692a.a(this.f31682e);
        }
    }

    void c(int i10) {
        int i11 = this.f31680c;
        this.f31680c = i10 + i11;
        if (this.f31681d) {
            return;
        }
        this.f31681d = true;
        while (true) {
            try {
                int i12 = this.f31680c;
                if (i11 == i12) {
                    this.f31681d = false;
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    j();
                } else if (z11) {
                    k();
                }
                i11 = i12;
            } catch (Throwable th2) {
                this.f31681d = false;
                throw th2;
            }
        }
    }

    void e(d dVar) {
        if (this.f31685h) {
            this.f31686i = true;
            return;
        }
        this.f31685h = true;
        do {
            this.f31686i = false;
            if (dVar != null) {
                d(dVar);
                dVar = null;
            } else {
                C6854b.d dVarF = this.f31679b.f();
                while (dVarF.hasNext()) {
                    d((d) ((Map.Entry) dVarF.next()).getValue());
                    if (this.f31686i) {
                        break;
                    }
                }
            }
        } while (this.f31686i);
        this.f31685h = false;
    }

    public Object f() {
        Object obj = this.f31682e;
        if (obj != f31677k) {
            return obj;
        }
        return null;
    }

    public boolean g() {
        return this.f31680c > 0;
    }

    public void h(InterfaceC4017o interfaceC4017o, v vVar) {
        b("observe");
        if (interfaceC4017o.O().b() == AbstractC4013k.b.DESTROYED) {
            return;
        }
        c cVar = new c(interfaceC4017o, vVar);
        d dVar = (d) this.f31679b.j(vVar, cVar);
        if (dVar != null && !dVar.c(interfaceC4017o)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        interfaceC4017o.O().a(cVar);
    }

    public void i(v vVar) {
        b("observeForever");
        b bVar = new b(vVar);
        d dVar = (d) this.f31679b.j(vVar, bVar);
        if (dVar instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        bVar.a(true);
    }

    protected void j() {
    }

    protected void k() {
    }

    protected void l(Object obj) {
        boolean z10;
        synchronized (this.f31678a) {
            z10 = this.f31683f == f31677k;
            this.f31683f = obj;
        }
        if (z10) {
            C6653c.g().c(this.f31687j);
        }
    }

    public void m(v vVar) {
        b("removeObserver");
        d dVar = (d) this.f31679b.k(vVar);
        if (dVar == null) {
            return;
        }
        dVar.b();
        dVar.a(false);
    }

    protected void n(Object obj) {
        b("setValue");
        this.f31684g++;
        this.f31682e = obj;
        e(null);
    }
}
