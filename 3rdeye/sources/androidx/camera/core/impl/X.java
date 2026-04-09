package androidx.camera.core.impl;

import I.m;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicInteger;
import o0.b;

/* compiled from: DeferrableSurface.java */
/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: k, reason: collision with root package name */
    public static final Size f14983k = new Size(0, 0);

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f14984l = C.S.d("DeferrableSurface");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicInteger f14985m = new AtomicInteger(0);

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicInteger f14986n = new AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    public final Object f14987a;

    /* renamed from: b, reason: collision with root package name */
    public int f14988b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14989c;

    /* renamed from: d, reason: collision with root package name */
    public b.a<Void> f14990d;

    /* renamed from: e, reason: collision with root package name */
    public final b.d f14991e;

    /* renamed from: f, reason: collision with root package name */
    public b.a<Void> f14992f;

    /* renamed from: g, reason: collision with root package name */
    public final b.d f14993g;

    /* renamed from: h, reason: collision with root package name */
    public final Size f14994h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public Class<?> f14995j;

    /* compiled from: DeferrableSurface.java */
    public static final class a extends Exception {

        /* renamed from: b, reason: collision with root package name */
        public final X f14996b;

        public a(String str, X x10) {
            super(str);
            this.f14996b = x10;
        }
    }

    /* compiled from: DeferrableSurface.java */
    public static final class b extends Exception {
    }

    public X() {
        this(f14983k, 0);
    }

    public void a() {
        b.a<Void> aVar;
        synchronized (this.f14987a) {
            try {
                if (this.f14989c) {
                    aVar = null;
                } else {
                    this.f14989c = true;
                    this.f14992f.b(null);
                    if (this.f14988b == 0) {
                        aVar = this.f14990d;
                        this.f14990d = null;
                    } else {
                        aVar = null;
                    }
                    if (C.S.d("DeferrableSurface")) {
                        C.S.a("DeferrableSurface", "surface closed,  useCount=" + this.f14988b + " closed=true " + this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.b(null);
        }
    }

    public final void b() {
        b.a<Void> aVar;
        synchronized (this.f14987a) {
            try {
                int i = this.f14988b;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i10 = i - 1;
                this.f14988b = i10;
                if (i10 == 0 && this.f14989c) {
                    aVar = this.f14990d;
                    this.f14990d = null;
                } else {
                    aVar = null;
                }
                if (C.S.d("DeferrableSurface")) {
                    C.S.a("DeferrableSurface", "use count-1,  useCount=" + this.f14988b + " closed=" + this.f14989c + " " + this);
                    if (this.f14988b == 0) {
                        e(f14986n.get(), f14985m.decrementAndGet(), "Surface no longer in use");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.b(null);
        }
    }

    public final A4.a<Surface> c() {
        synchronized (this.f14987a) {
            try {
                if (this.f14989c) {
                    return new m.a(new a("DeferrableSurface already closed.", this));
                }
                return f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() throws a {
        synchronized (this.f14987a) {
            try {
                int i = this.f14988b;
                if (i == 0 && this.f14989c) {
                    throw new a("Cannot begin use on a closed surface.", this);
                }
                this.f14988b = i + 1;
                if (C.S.d("DeferrableSurface")) {
                    if (this.f14988b == 1) {
                        e(f14986n.get(), f14985m.incrementAndGet(), "New surface in use");
                    }
                    C.S.a("DeferrableSurface", "use count+1, useCount=" + this.f14988b + " " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(int i, int i10, String str) {
        if (!f14984l && C.S.d("DeferrableSurface")) {
            C.S.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        C.S.a("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i10 + "](" + this + "}");
    }

    public abstract A4.a<Surface> f();

    public X(Size size, int i) {
        this.f14987a = new Object();
        this.f14988b = 0;
        this.f14989c = false;
        this.f14994h = size;
        this.i = i;
        b.d dVarA = o0.b.a(new B.d(this, 16));
        this.f14991e = dVarA;
        this.f14993g = o0.b.a(new D7.c(this, 11));
        if (C.S.d("DeferrableSurface")) {
            e(f14986n.incrementAndGet(), f14985m.get(), "Surface created");
            dVarA.f44804c.addListener(new B.a(11, this, Log.getStackTraceString(new Exception())), E.u.y());
        }
    }
}
