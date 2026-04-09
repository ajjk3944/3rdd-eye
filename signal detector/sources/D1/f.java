package D1;

import H1.j;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.h;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l1.InterfaceC2639e;
import n1.k;
import n1.l;
import n1.p;
import n1.v;
import n1.z;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class f implements c, E1.b {

    /* renamed from: C, reason: collision with root package name */
    public static final boolean f1224C = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A, reason: collision with root package name */
    public final RuntimeException f1225A;

    /* renamed from: B, reason: collision with root package name */
    public int f1226B;

    /* renamed from: a, reason: collision with root package name */
    public final String f1227a;

    /* renamed from: b, reason: collision with root package name */
    public final I1.d f1228b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1229c;

    /* renamed from: d, reason: collision with root package name */
    public final d f1230d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f1231e;

    /* renamed from: f, reason: collision with root package name */
    public final com.bumptech.glide.f f1232f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1233g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f1234h;
    public final a i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1235j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1236k;

    /* renamed from: l, reason: collision with root package name */
    public final h f1237l;

    /* renamed from: m, reason: collision with root package name */
    public final E1.c f1238m;

    /* renamed from: n, reason: collision with root package name */
    public final List f1239n;

    /* renamed from: o, reason: collision with root package name */
    public final F1.a f1240o;

    /* renamed from: p, reason: collision with root package name */
    public final H1.f f1241p;

    /* renamed from: q, reason: collision with root package name */
    public z f1242q;

    /* renamed from: r, reason: collision with root package name */
    public V2.e f1243r;

    /* renamed from: s, reason: collision with root package name */
    public long f1244s;

    /* renamed from: t, reason: collision with root package name */
    public volatile l f1245t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f1246u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f1247v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f1248w;

    /* renamed from: x, reason: collision with root package name */
    public int f1249x;

    /* renamed from: y, reason: collision with root package name */
    public int f1250y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1251z;

    public f(Context context, com.bumptech.glide.f fVar, Object obj, Object obj2, Class cls, a aVar, int i, int i3, h hVar, E1.c cVar, ArrayList arrayList, d dVar, l lVar, F1.a aVar2) {
        H1.f fVar2 = H1.g.f1763a;
        this.f1227a = f1224C ? String.valueOf(hashCode()) : null;
        this.f1228b = new I1.d();
        this.f1229c = obj;
        this.f1231e = context;
        this.f1232f = fVar;
        this.f1233g = obj2;
        this.f1234h = cls;
        this.i = aVar;
        this.f1235j = i;
        this.f1236k = i3;
        this.f1237l = hVar;
        this.f1238m = cVar;
        this.f1239n = arrayList;
        this.f1230d = dVar;
        this.f1245t = lVar;
        this.f1240o = aVar2;
        this.f1241p = fVar2;
        this.f1226B = 1;
        if (this.f1225A == null && ((Map) fVar.f6505h.f245b).containsKey(com.bumptech.glide.c.class)) {
            this.f1225A = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // D1.c
    public final boolean a() {
        boolean z6;
        synchronized (this.f1229c) {
            z6 = this.f1226B == 4;
        }
        return z6;
    }

    public final void b() {
        if (this.f1251z) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f1228b.a();
        this.f1238m.c(this);
        V2.e eVar = this.f1243r;
        if (eVar != null) {
            synchronized (((l) eVar.f3870d)) {
                ((p) eVar.f3868b).j((f) eVar.f3869c);
            }
            this.f1243r = null;
        }
    }

    @Override // D1.c
    public final boolean c(c cVar) {
        int i;
        int i3;
        Object obj;
        Class cls;
        a aVar;
        h hVar;
        int size;
        int i6;
        int i7;
        Object obj2;
        Class cls2;
        a aVar2;
        h hVar2;
        int size2;
        if (!(cVar instanceof f)) {
            return false;
        }
        synchronized (this.f1229c) {
            try {
                i = this.f1235j;
                i3 = this.f1236k;
                obj = this.f1233g;
                cls = this.f1234h;
                aVar = this.i;
                hVar = this.f1237l;
                List list = this.f1239n;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        f fVar = (f) cVar;
        synchronized (fVar.f1229c) {
            try {
                i6 = fVar.f1235j;
                i7 = fVar.f1236k;
                obj2 = fVar.f1233g;
                cls2 = fVar.f1234h;
                aVar2 = fVar.i;
                hVar2 = fVar.f1237l;
                List list2 = fVar.f1239n;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i == i6 && i3 == i7) {
            char[] cArr = H1.p.f1779a;
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2)) {
                if ((aVar == null ? aVar2 == null : aVar.f(aVar2)) && hVar == hVar2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // D1.c
    public final void clear() {
        synchronized (this.f1229c) {
            try {
                if (this.f1251z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f1228b.a();
                if (this.f1226B == 6) {
                    return;
                }
                b();
                z zVar = this.f1242q;
                if (zVar != null) {
                    this.f1242q = null;
                } else {
                    zVar = null;
                }
                d dVar = this.f1230d;
                if (dVar == null || dVar.h(this)) {
                    this.f1238m.i(e());
                }
                this.f1226B = 6;
                if (zVar != null) {
                    this.f1245t.getClass();
                    l.g(zVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D1.c
    public final void d() {
        synchronized (this.f1229c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Drawable e() {
        if (this.f1247v == null) {
            this.i.getClass();
            this.f1247v = null;
        }
        return this.f1247v;
    }

    public final void f(String str) {
        StringBuilder sbB = AbstractC2984e.b(str, " this: ");
        sbB.append(this.f1227a);
        Log.v("GlideRequest", sbB.toString());
    }

    @Override // D1.c
    public final boolean g() {
        boolean z6;
        synchronized (this.f1229c) {
            z6 = this.f1226B == 6;
        }
        return z6;
    }

    public final void h(v vVar, int i) {
        Drawable drawableE;
        this.f1228b.a();
        synchronized (this.f1229c) {
            try {
                vVar.getClass();
                int i3 = this.f1232f.i;
                if (i3 <= i) {
                    Log.w("Glide", "Load failed for [" + this.f1233g + "] with dimensions [" + this.f1249x + "x" + this.f1250y + "]", vVar);
                    if (i3 <= 4) {
                        vVar.d();
                    }
                }
                this.f1243r = null;
                this.f1226B = 5;
                d dVar = this.f1230d;
                if (dVar != null) {
                    dVar.e(this);
                }
                boolean z6 = true;
                this.f1251z = true;
                try {
                    List list = this.f1239n;
                    if (list != null) {
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            d dVar2 = this.f1230d;
                            if (dVar2 == null) {
                                throw null;
                            }
                            dVar2.getRoot().a();
                            throw null;
                        }
                    }
                    d dVar3 = this.f1230d;
                    if (dVar3 != null && !dVar3.f(this)) {
                        z6 = false;
                    }
                    if (z6) {
                        if (this.f1233g == null) {
                            if (this.f1248w == null) {
                                this.i.getClass();
                                this.f1248w = null;
                            }
                            drawableE = this.f1248w;
                        } else {
                            drawableE = null;
                        }
                        if (drawableE == null) {
                            if (this.f1246u == null) {
                                a aVar = this.i;
                                aVar.getClass();
                                this.f1246u = null;
                                int i6 = aVar.f1208d;
                                if (i6 > 0) {
                                    Context context = this.f1231e;
                                    this.i.getClass();
                                    this.f1246u = T2.g.p(context, context, i6, context.getTheme());
                                }
                            }
                            drawableE = this.f1246u;
                        }
                        if (drawableE == null) {
                            drawableE = e();
                        }
                        this.f1238m.d(drawableE);
                    }
                } finally {
                    this.f1251z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(z zVar, int i, boolean z6) {
        this.f1228b.a();
        z zVar2 = null;
        try {
            synchronized (this.f1229c) {
                try {
                    this.f1243r = null;
                    if (zVar == null) {
                        h(new v("Expected to receive a Resource<R> with an object of " + this.f1234h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = zVar.get();
                    try {
                        if (obj == null || !this.f1234h.isAssignableFrom(obj.getClass())) {
                            this.f1242q = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.f1234h);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(zVar);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            h(new v(sb.toString()), 5);
                        } else {
                            d dVar = this.f1230d;
                            if (dVar == null || dVar.i(this)) {
                                l(zVar, obj, i);
                                return;
                            } else {
                                this.f1242q = null;
                                this.f1226B = 4;
                            }
                        }
                        this.f1245t.getClass();
                        l.g(zVar);
                    } catch (Throwable th) {
                        zVar2 = zVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (zVar2 != null) {
                this.f1245t.getClass();
                l.g(zVar2);
            }
            throw th3;
        }
    }

    @Override // D1.c
    public final boolean isRunning() {
        boolean z6;
        synchronized (this.f1229c) {
            int i = this.f1226B;
            z6 = i == 2 || i == 3;
        }
        return z6;
    }

    @Override // D1.c
    public final void j() {
        synchronized (this.f1229c) {
            try {
                if (this.f1251z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f1228b.a();
                int i = j.f1768b;
                this.f1244s = SystemClock.elapsedRealtimeNanos();
                if (this.f1233g == null) {
                    if (H1.p.i(this.f1235j, this.f1236k)) {
                        this.f1249x = this.f1235j;
                        this.f1250y = this.f1236k;
                    }
                    if (this.f1248w == null) {
                        this.i.getClass();
                        this.f1248w = null;
                    }
                    h(new v("Received null model"), this.f1248w == null ? 5 : 3);
                    return;
                }
                int i3 = this.f1226B;
                if (i3 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i3 == 4) {
                    i(this.f1242q, 5, false);
                    return;
                }
                List list = this.f1239n;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                    }
                }
                this.f1226B = 3;
                if (H1.p.i(this.f1235j, this.f1236k)) {
                    m(this.f1235j, this.f1236k);
                } else {
                    this.f1238m.a(this);
                }
                int i6 = this.f1226B;
                if (i6 == 2 || i6 == 3) {
                    d dVar = this.f1230d;
                    if (dVar == null || dVar.f(this)) {
                        this.f1238m.g(e());
                    }
                }
                if (f1224C) {
                    f("finished run method in " + j.a(this.f1244s));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D1.c
    public final boolean k() {
        boolean z6;
        synchronized (this.f1229c) {
            z6 = this.f1226B == 4;
        }
        return z6;
    }

    public final void l(z zVar, Object obj, int i) {
        d dVar = this.f1230d;
        if (dVar != null) {
            dVar.getRoot().a();
        }
        this.f1226B = 4;
        this.f1242q = zVar;
        if (this.f1232f.i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + AbstractC1135f5.v(i) + " for " + this.f1233g + " with size [" + this.f1249x + "x" + this.f1250y + "] in " + j.a(this.f1244s) + " ms");
        }
        if (dVar != null) {
            dVar.b(this);
        }
        this.f1251z = true;
        try {
            List list = this.f1239n;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            this.f1240o.getClass();
            this.f1238m.b(obj);
            this.f1251z = false;
        } catch (Throwable th) {
            this.f1251z = false;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(int i, int i3) throws Throwable {
        l1.h hVar;
        boolean z6;
        boolean z7;
        H1.f fVar;
        f fVar2 = this;
        int iRound = i;
        fVar2.f1228b.a();
        Object obj = fVar2.f1229c;
        synchronized (obj) {
            try {
                try {
                    boolean z8 = f1224C;
                    if (z8) {
                        fVar2.f("Got onSizeReady in " + j.a(fVar2.f1244s));
                    }
                    if (fVar2.f1226B == 3) {
                        fVar2.f1226B = 2;
                        fVar2.i.getClass();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * 1.0f);
                        }
                        fVar2.f1249x = iRound;
                        fVar2.f1250y = i3 == Integer.MIN_VALUE ? i3 : Math.round(1.0f * i3);
                        if (z8) {
                            fVar2.f("finished setup for calling load in " + j.a(fVar2.f1244s));
                        }
                        l lVar = fVar2.f1245t;
                        com.bumptech.glide.f fVar3 = fVar2.f1232f;
                        Object obj2 = fVar2.f1233g;
                        a aVar = fVar2.i;
                        InterfaceC2639e interfaceC2639e = aVar.f1212h;
                        try {
                            int i6 = fVar2.f1249x;
                            int i7 = fVar2.f1250y;
                            Class cls = aVar.f1215l;
                            try {
                                Class cls2 = fVar2.f1234h;
                                h hVar2 = fVar2.f1237l;
                                k kVar = aVar.f1206b;
                                try {
                                    H1.c cVar = aVar.f1214k;
                                    boolean z9 = aVar.i;
                                    boolean z10 = aVar.f1203C;
                                    try {
                                        hVar = aVar.f1213j;
                                        z6 = aVar.f1209e;
                                        z7 = aVar.f1204D;
                                        fVar = fVar2.f1241p;
                                        fVar2 = obj;
                                    } catch (Throwable th) {
                                        th = th;
                                        fVar2 = obj;
                                    }
                                    try {
                                        fVar2.f1243r = lVar.a(fVar3, obj2, interfaceC2639e, i6, i7, cls, cls2, hVar2, kVar, cVar, z9, z10, hVar, z6, z7, fVar2, fVar);
                                        if (fVar2.f1226B != 2) {
                                            fVar2.f1243r = null;
                                        }
                                        if (z8) {
                                            fVar2.f("finished onSizeReady in " + j.a(fVar2.f1244s));
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    fVar2 = obj;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                fVar2 = obj;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fVar2 = obj;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    fVar2 = obj;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f1229c) {
            obj = this.f1233g;
            cls = this.f1234h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
