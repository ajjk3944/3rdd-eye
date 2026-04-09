package com.bumptech.glide.request;

import W2.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.c;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.j;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class h implements c, T2.c, g {

    /* renamed from: E, reason: collision with root package name */
    private static final boolean f34632E = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A, reason: collision with root package name */
    private int f34633A;

    /* renamed from: B, reason: collision with root package name */
    private int f34634B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f34635C;

    /* renamed from: D, reason: collision with root package name */
    private RuntimeException f34636D;

    /* renamed from: a, reason: collision with root package name */
    private int f34637a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34638b;

    /* renamed from: c, reason: collision with root package name */
    private final X2.c f34639c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f34640d;

    /* renamed from: e, reason: collision with root package name */
    private final e f34641e;

    /* renamed from: f, reason: collision with root package name */
    private final d f34642f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f34643g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.d f34644h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f34645i;

    /* renamed from: j, reason: collision with root package name */
    private final Class f34646j;

    /* renamed from: k, reason: collision with root package name */
    private final com.bumptech.glide.request.a f34647k;

    /* renamed from: l, reason: collision with root package name */
    private final int f34648l;

    /* renamed from: m, reason: collision with root package name */
    private final int f34649m;

    /* renamed from: n, reason: collision with root package name */
    private final com.bumptech.glide.g f34650n;

    /* renamed from: o, reason: collision with root package name */
    private final T2.d f34651o;

    /* renamed from: p, reason: collision with root package name */
    private final List f34652p;

    /* renamed from: q, reason: collision with root package name */
    private final U2.c f34653q;

    /* renamed from: r, reason: collision with root package name */
    private final Executor f34654r;

    /* renamed from: s, reason: collision with root package name */
    private E2.c f34655s;

    /* renamed from: t, reason: collision with root package name */
    private j.d f34656t;

    /* renamed from: u, reason: collision with root package name */
    private long f34657u;

    /* renamed from: v, reason: collision with root package name */
    private volatile j f34658v;

    /* renamed from: w, reason: collision with root package name */
    private a f34659w;

    /* renamed from: x, reason: collision with root package name */
    private Drawable f34660x;

    /* renamed from: y, reason: collision with root package name */
    private Drawable f34661y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f34662z;

    private enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private h(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class cls, com.bumptech.glide.request.a aVar, int i10, int i11, com.bumptech.glide.g gVar, T2.d dVar2, e eVar, List list, d dVar3, j jVar, U2.c cVar, Executor executor) {
        this.f34638b = f34632E ? String.valueOf(super.hashCode()) : null;
        this.f34639c = X2.c.a();
        this.f34640d = obj;
        this.f34643g = context;
        this.f34644h = dVar;
        this.f34645i = obj2;
        this.f34646j = cls;
        this.f34647k = aVar;
        this.f34648l = i10;
        this.f34649m = i11;
        this.f34650n = gVar;
        this.f34651o = dVar2;
        this.f34641e = eVar;
        this.f34652p = list;
        this.f34642f = dVar3;
        this.f34658v = jVar;
        this.f34653q = cVar;
        this.f34654r = executor;
        this.f34659w = a.PENDING;
        if (this.f34636D == null && dVar.f().a(c.C1192c.class)) {
            this.f34636D = new RuntimeException("Glide request origin trace");
        }
    }

    private void A(E2.c cVar, Object obj, C2.a aVar, boolean z10) {
        boolean zA;
        boolean zS = s();
        this.f34659w = a.COMPLETE;
        this.f34655s = cVar;
        if (this.f34644h.g() <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + aVar + " for " + this.f34645i + " with size [" + this.f34633A + "x" + this.f34634B + "] in " + W2.g.a(this.f34657u) + " ms");
        }
        x();
        boolean z11 = true;
        this.f34635C = true;
        try {
            List list = this.f34652p;
            if (list != null) {
                Iterator it = list.iterator();
                zA = false;
                while (it.hasNext()) {
                    zA |= ((e) it.next()).a(obj, this.f34645i, this.f34651o, aVar, zS);
                }
            } else {
                zA = false;
            }
            e eVar = this.f34641e;
            if (eVar == null || !eVar.a(obj, this.f34645i, this.f34651o, aVar, zS)) {
                z11 = false;
            }
            if (!(z11 | zA)) {
                this.f34651o.g(obj, this.f34653q.a(aVar, zS));
            }
            this.f34635C = false;
            X2.b.f("GlideRequest", this.f34637a);
        } catch (Throwable th2) {
            this.f34635C = false;
            throw th2;
        }
    }

    private void B() {
        if (l()) {
            Drawable drawableQ = this.f34645i == null ? q() : null;
            if (drawableQ == null) {
                drawableQ = p();
            }
            if (drawableQ == null) {
                drawableQ = r();
            }
            this.f34651o.h(drawableQ);
        }
    }

    private void j() {
        if (this.f34635C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean k() {
        d dVar = this.f34642f;
        return dVar == null || dVar.j(this);
    }

    private boolean l() {
        d dVar = this.f34642f;
        return dVar == null || dVar.c(this);
    }

    private boolean m() {
        d dVar = this.f34642f;
        return dVar == null || dVar.f(this);
    }

    private void n() {
        j();
        this.f34639c.c();
        this.f34651o.d(this);
        j.d dVar = this.f34656t;
        if (dVar != null) {
            dVar.a();
            this.f34656t = null;
        }
    }

    private void o(Object obj) {
        List<e> list = this.f34652p;
        if (list == null) {
            return;
        }
        for (e eVar : list) {
        }
    }

    private Drawable p() {
        if (this.f34660x == null) {
            Drawable drawableK = this.f34647k.k();
            this.f34660x = drawableK;
            if (drawableK == null && this.f34647k.i() > 0) {
                this.f34660x = t(this.f34647k.i());
            }
        }
        return this.f34660x;
    }

    private Drawable q() {
        if (this.f34662z == null) {
            Drawable drawableL = this.f34647k.l();
            this.f34662z = drawableL;
            if (drawableL == null && this.f34647k.m() > 0) {
                this.f34662z = t(this.f34647k.m());
            }
        }
        return this.f34662z;
    }

    private Drawable r() {
        if (this.f34661y == null) {
            Drawable drawableR = this.f34647k.r();
            this.f34661y = drawableR;
            if (drawableR == null && this.f34647k.t() > 0) {
                this.f34661y = t(this.f34647k.t());
            }
        }
        return this.f34661y;
    }

    private boolean s() {
        d dVar = this.f34642f;
        return dVar == null || !dVar.getRoot().b();
    }

    private Drawable t(int i10) {
        return M2.i.a(this.f34643g, i10, this.f34647k.A() != null ? this.f34647k.A() : this.f34643g.getTheme());
    }

    private void u(String str) {
        Log.v("GlideRequest", str + " this: " + this.f34638b);
    }

    private static int v(int i10, float f10) {
        return i10 == Integer.MIN_VALUE ? i10 : Math.round(f10 * i10);
    }

    private void w() {
        d dVar = this.f34642f;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    private void x() {
        d dVar = this.f34642f;
        if (dVar != null) {
            dVar.h(this);
        }
    }

    public static h y(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class cls, com.bumptech.glide.request.a aVar, int i10, int i11, com.bumptech.glide.g gVar, T2.d dVar2, e eVar, List list, d dVar3, j jVar, U2.c cVar, Executor executor) {
        return new h(context, dVar, obj, obj2, cls, aVar, i10, i11, gVar, dVar2, eVar, list, dVar3, jVar, cVar, executor);
    }

    private void z(GlideException glideException, int i10) {
        boolean zB;
        this.f34639c.c();
        synchronized (this.f34640d) {
            try {
                glideException.p(this.f34636D);
                int iG = this.f34644h.g();
                if (iG <= i10) {
                    Log.w("Glide", "Load failed for [" + this.f34645i + "] with dimensions [" + this.f34633A + "x" + this.f34634B + "]", glideException);
                    if (iG <= 4) {
                        glideException.l("Glide");
                    }
                }
                this.f34656t = null;
                this.f34659w = a.FAILED;
                w();
                boolean z10 = true;
                this.f34635C = true;
                try {
                    List list = this.f34652p;
                    if (list != null) {
                        Iterator it = list.iterator();
                        zB = false;
                        while (it.hasNext()) {
                            zB |= ((e) it.next()).b(glideException, this.f34645i, this.f34651o, s());
                        }
                    } else {
                        zB = false;
                    }
                    e eVar = this.f34641e;
                    if (eVar == null || !eVar.b(glideException, this.f34645i, this.f34651o, s())) {
                        z10 = false;
                    }
                    if (!(zB | z10)) {
                        B();
                    }
                    this.f34635C = false;
                    X2.b.f("GlideRequest", this.f34637a);
                } catch (Throwable th2) {
                    this.f34635C = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.bumptech.glide.request.g
    public void a(GlideException glideException) {
        z(glideException, 5);
    }

    @Override // com.bumptech.glide.request.c
    public boolean b() {
        boolean z10;
        synchronized (this.f34640d) {
            z10 = this.f34659w == a.COMPLETE;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.g
    public void c(E2.c cVar, C2.a aVar, boolean z10) {
        this.f34639c.c();
        E2.c cVar2 = null;
        try {
            synchronized (this.f34640d) {
                try {
                    this.f34656t = null;
                    if (cVar == null) {
                        a(new GlideException("Expected to receive a Resource<R> with an object of " + this.f34646j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = cVar.get();
                    try {
                        if (obj != null && this.f34646j.isAssignableFrom(obj.getClass())) {
                            if (m()) {
                                A(cVar, obj, aVar, z10);
                                return;
                            }
                            this.f34655s = null;
                            this.f34659w = a.COMPLETE;
                            X2.b.f("GlideRequest", this.f34637a);
                            this.f34658v.k(cVar);
                            return;
                        }
                        this.f34655s = null;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected to receive an object of ");
                        sb2.append(this.f34646j);
                        sb2.append(" but instead got ");
                        sb2.append(obj != null ? obj.getClass() : "");
                        sb2.append("{");
                        sb2.append(obj);
                        sb2.append("} inside Resource{");
                        sb2.append(cVar);
                        sb2.append("}.");
                        sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        a(new GlideException(sb2.toString()));
                        this.f34658v.k(cVar);
                    } catch (Throwable th2) {
                        cVar2 = cVar;
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (cVar2 != null) {
                this.f34658v.k(cVar2);
            }
            throw th4;
        }
    }

    @Override // com.bumptech.glide.request.c
    public void clear() {
        synchronized (this.f34640d) {
            try {
                j();
                this.f34639c.c();
                a aVar = this.f34659w;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                n();
                E2.c cVar = this.f34655s;
                if (cVar != null) {
                    this.f34655s = null;
                } else {
                    cVar = null;
                }
                if (k()) {
                    this.f34651o.k(r());
                }
                X2.b.f("GlideRequest", this.f34637a);
                this.f34659w = aVar2;
                if (cVar != null) {
                    this.f34658v.k(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.c
    public boolean d(c cVar) {
        int i10;
        int i11;
        Object obj;
        Class cls;
        com.bumptech.glide.request.a aVar;
        com.bumptech.glide.g gVar;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class cls2;
        com.bumptech.glide.request.a aVar2;
        com.bumptech.glide.g gVar2;
        int size2;
        if (!(cVar instanceof h)) {
            return false;
        }
        synchronized (this.f34640d) {
            try {
                i10 = this.f34648l;
                i11 = this.f34649m;
                obj = this.f34645i;
                cls = this.f34646j;
                aVar = this.f34647k;
                gVar = this.f34650n;
                List list = this.f34652p;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        h hVar = (h) cVar;
        synchronized (hVar.f34640d) {
            try {
                i12 = hVar.f34648l;
                i13 = hVar.f34649m;
                obj2 = hVar.f34645i;
                cls2 = hVar.f34646j;
                aVar2 = hVar.f34647k;
                gVar2 = hVar.f34650n;
                List list2 = hVar.f34652p;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        return i10 == i12 && i11 == i13 && l.c(obj, obj2) && cls.equals(cls2) && l.b(aVar, aVar2) && gVar == gVar2 && size == size2;
    }

    @Override // com.bumptech.glide.request.c
    public void e() {
        synchronized (this.f34640d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // T2.c
    public void f(int i10, int i11) throws Throwable {
        Object obj;
        this.f34639c.c();
        Object obj2 = this.f34640d;
        synchronized (obj2) {
            try {
                try {
                    boolean z10 = f34632E;
                    if (z10) {
                        u("Got onSizeReady in " + W2.g.a(this.f34657u));
                    }
                    if (this.f34659w == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        this.f34659w = aVar;
                        float fZ = this.f34647k.z();
                        this.f34633A = v(i10, fZ);
                        this.f34634B = v(i11, fZ);
                        if (z10) {
                            u("finished setup for calling load in " + W2.g.a(this.f34657u));
                        }
                        obj = obj2;
                        try {
                            this.f34656t = this.f34658v.f(this.f34644h, this.f34645i, this.f34647k.x(), this.f34633A, this.f34634B, this.f34647k.w(), this.f34646j, this.f34650n, this.f34647k.h(), this.f34647k.B(), this.f34647k.N(), this.f34647k.K(), this.f34647k.o(), this.f34647k.H(), this.f34647k.E(), this.f34647k.D(), this.f34647k.n(), this, this.f34654r);
                            if (this.f34659w != aVar) {
                                this.f34656t = null;
                            }
                            if (z10) {
                                u("finished onSizeReady in " + W2.g.a(this.f34657u));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // com.bumptech.glide.request.c
    public boolean g() {
        boolean z10;
        synchronized (this.f34640d) {
            z10 = this.f34659w == a.CLEARED;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.g
    public Object h() {
        this.f34639c.c();
        return this.f34640d;
    }

    @Override // com.bumptech.glide.request.c
    public void i() {
        synchronized (this.f34640d) {
            try {
                j();
                this.f34639c.c();
                this.f34657u = W2.g.b();
                Object obj = this.f34645i;
                if (obj == null) {
                    if (l.t(this.f34648l, this.f34649m)) {
                        this.f34633A = this.f34648l;
                        this.f34634B = this.f34649m;
                    }
                    z(new GlideException("Received null model"), q() == null ? 5 : 3);
                    return;
                }
                a aVar = this.f34659w;
                a aVar2 = a.RUNNING;
                if (aVar == aVar2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.COMPLETE) {
                    c(this.f34655s, C2.a.MEMORY_CACHE, false);
                    return;
                }
                o(obj);
                this.f34637a = X2.b.b("GlideRequest");
                a aVar3 = a.WAITING_FOR_SIZE;
                this.f34659w = aVar3;
                if (l.t(this.f34648l, this.f34649m)) {
                    f(this.f34648l, this.f34649m);
                } else {
                    this.f34651o.l(this);
                }
                a aVar4 = this.f34659w;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && l()) {
                    this.f34651o.i(r());
                }
                if (f34632E) {
                    u("finished run method in " + W2.g.a(this.f34657u));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.c
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f34640d) {
            z10 = this.f34659w == a.COMPLETE;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f34640d) {
            try {
                a aVar = this.f34659w;
                z10 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z10;
    }

    public String toString() {
        Object obj;
        Class cls;
        synchronized (this.f34640d) {
            obj = this.f34645i;
            cls = this.f34646j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
