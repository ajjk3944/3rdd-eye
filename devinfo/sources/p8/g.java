package p8;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.i;
import com.google.android.gms.internal.measurement.d5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w4.m;
import z7.j;
import z7.k;
import z7.o;
import z7.u;
import z7.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g implements c, q8.d {
    public static final boolean C = Log.isLoggable("GlideRequest", 2);
    public final RuntimeException A;
    public int B;

    /* renamed from: a, reason: collision with root package name */
    public final String f31475a;

    /* renamed from: b, reason: collision with root package name */
    public final u8.e f31476b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f31477c;

    /* renamed from: d, reason: collision with root package name */
    public final d f31478d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f31479e;

    /* renamed from: f, reason: collision with root package name */
    public final com.bumptech.glide.h f31480f;
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f31481h;

    /* renamed from: i, reason: collision with root package name */
    public final a f31482i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f31483k;

    /* renamed from: l, reason: collision with root package name */
    public final i f31484l;

    /* renamed from: m, reason: collision with root package name */
    public final q8.e f31485m;

    /* renamed from: n, reason: collision with root package name */
    public final List f31486n;

    /* renamed from: o, reason: collision with root package name */
    public final r8.a f31487o;

    /* renamed from: p, reason: collision with root package name */
    public final ae.d f31488p;

    /* renamed from: q, reason: collision with root package name */
    public y f31489q;

    /* renamed from: r, reason: collision with root package name */
    public m f31490r;

    /* renamed from: s, reason: collision with root package name */
    public long f31491s;

    /* renamed from: t, reason: collision with root package name */
    public volatile k f31492t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f31493u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f31494v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f31495w;

    /* renamed from: x, reason: collision with root package name */
    public int f31496x;

    /* renamed from: y, reason: collision with root package name */
    public int f31497y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f31498z;

    public g(Context context, com.bumptech.glide.h hVar, Object obj, Object obj2, Class cls, a aVar, int i4, int i10, i iVar, q8.e eVar, ArrayList arrayList, d dVar, k kVar, r8.a aVar2) {
        ae.d dVar2 = t8.f.f34509a;
        this.f31475a = C ? String.valueOf(hashCode()) : null;
        this.f31476b = new u8.e();
        this.f31477c = obj;
        this.f31479e = context;
        this.f31480f = hVar;
        this.g = obj2;
        this.f31481h = cls;
        this.f31482i = aVar;
        this.j = i4;
        this.f31483k = i10;
        this.f31484l = iVar;
        this.f31485m = eVar;
        this.f31486n = arrayList;
        this.f31478d = dVar;
        this.f31492t = kVar;
        this.f31487o = aVar2;
        this.f31488p = dVar2;
        this.B = 1;
        if (this.A == null && ((Map) hVar.f6496h.f30419b).containsKey(com.bumptech.glide.d.class)) {
            this.A = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // p8.c
    public final boolean a() {
        boolean z3;
        synchronized (this.f31477c) {
            z3 = this.B == 4;
        }
        return z3;
    }

    @Override // p8.c
    public final boolean b() {
        boolean z3;
        synchronized (this.f31477c) {
            z3 = this.B == 4;
        }
        return z3;
    }

    public final void c() {
        if (this.f31498z) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f31476b.a();
        this.f31485m.c(this);
        m mVar = this.f31490r;
        if (mVar != null) {
            synchronized (((k) mVar.f36444c)) {
                ((o) mVar.f36442a).j((g) mVar.f36443b);
            }
            this.f31490r = null;
        }
    }

    @Override // p8.c
    public final void clear() {
        synchronized (this.f31477c) {
            try {
                if (this.f31498z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f31476b.a();
                if (this.B == 6) {
                    return;
                }
                c();
                y yVar = this.f31489q;
                if (yVar != null) {
                    this.f31489q = null;
                } else {
                    yVar = null;
                }
                d dVar = this.f31478d;
                if (dVar == null || dVar.d(this)) {
                    this.f31485m.g(d());
                }
                this.B = 6;
                if (yVar != null) {
                    this.f31492t.getClass();
                    k.g(yVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Drawable d() {
        if (this.f31494v == null) {
            a aVar = this.f31482i;
            aVar.getClass();
            this.f31494v = null;
            int i4 = aVar.f31457e;
            if (i4 > 0) {
                Resources.Theme theme = aVar.f31465o;
                Context context = this.f31479e;
                if (theme == null) {
                    theme = context.getTheme();
                }
                this.f31494v = d5.i(context, context, i4, theme);
            }
        }
        return this.f31494v;
    }

    public final void e(String str) {
        StringBuilder sbB = i3.e.b(str, " this: ");
        sbB.append(this.f31475a);
        Log.v("GlideRequest", sbB.toString());
    }

    @Override // p8.c
    public final boolean f() {
        boolean z3;
        synchronized (this.f31477c) {
            z3 = this.B == 6;
        }
        return z3;
    }

    @Override // p8.c
    public final void g() {
        synchronized (this.f31477c) {
            try {
                if (this.f31498z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f31476b.a();
                int i4 = t8.h.f34512b;
                this.f31491s = SystemClock.elapsedRealtimeNanos();
                if (this.g == null) {
                    if (t8.m.i(this.j, this.f31483k)) {
                        this.f31496x = this.j;
                        this.f31497y = this.f31483k;
                    }
                    if (this.f31495w == null) {
                        this.f31482i.getClass();
                        this.f31495w = null;
                    }
                    i(new u("Received null model"), this.f31495w == null ? 5 : 3);
                    return;
                }
                int i10 = this.B;
                if (i10 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i10 == 4) {
                    j(this.f31489q, 5, false);
                    return;
                }
                List<e> list = this.f31486n;
                if (list != null) {
                    for (e eVar : list) {
                    }
                }
                this.B = 3;
                if (t8.m.i(this.j, this.f31483k)) {
                    l(this.j, this.f31483k);
                } else {
                    this.f31485m.h(this);
                }
                int i11 = this.B;
                if (i11 == 2 || i11 == 3) {
                    d dVar = this.f31478d;
                    if (dVar == null || dVar.i(this)) {
                        this.f31485m.e(d());
                    }
                }
                if (C) {
                    e("finished run method in " + t8.h.a(this.f31491s));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p8.c
    public final boolean h(c cVar) {
        int i4;
        int i10;
        Object obj;
        Class cls;
        a aVar;
        i iVar;
        int size;
        int i11;
        int i12;
        Object obj2;
        Class cls2;
        a aVar2;
        i iVar2;
        int size2;
        if (!(cVar instanceof g)) {
            return false;
        }
        synchronized (this.f31477c) {
            try {
                i4 = this.j;
                i10 = this.f31483k;
                obj = this.g;
                cls = this.f31481h;
                aVar = this.f31482i;
                iVar = this.f31484l;
                List list = this.f31486n;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        g gVar = (g) cVar;
        synchronized (gVar.f31477c) {
            try {
                i11 = gVar.j;
                i12 = gVar.f31483k;
                obj2 = gVar.g;
                cls2 = gVar.f31481h;
                aVar2 = gVar.f31482i;
                iVar2 = gVar.f31484l;
                List list2 = gVar.f31486n;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i4 == i11 && i10 == i12) {
            char[] cArr = t8.m.f34520a;
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2)) {
                if ((aVar == null ? aVar2 == null : aVar.g(aVar2)) && iVar == iVar2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void i(u uVar, int i4) {
        Drawable drawableD;
        this.f31476b.a();
        synchronized (this.f31477c) {
            try {
                uVar.getClass();
                int i10 = this.f31480f.f6497i;
                if (i10 <= i4) {
                    Log.w("Glide", "Load failed for [" + this.g + "] with dimensions [" + this.f31496x + "x" + this.f31497y + "]", uVar);
                    if (i10 <= 4) {
                        uVar.d();
                    }
                }
                this.f31490r = null;
                this.B = 5;
                d dVar = this.f31478d;
                if (dVar != null) {
                    dVar.j(this);
                }
                boolean z3 = true;
                this.f31498z = true;
                try {
                    List<e> list = this.f31486n;
                    if (list != null) {
                        for (e eVar : list) {
                            q8.e eVar2 = this.f31485m;
                            d dVar2 = this.f31478d;
                            if (dVar2 != null) {
                                dVar2.getRoot().a();
                            }
                            eVar.b(eVar2);
                        }
                    }
                    d dVar3 = this.f31478d;
                    if (dVar3 != null && !dVar3.i(this)) {
                        z3 = false;
                    }
                    if (z3) {
                        if (this.g == null) {
                            if (this.f31495w == null) {
                                this.f31482i.getClass();
                                this.f31495w = null;
                            }
                            drawableD = this.f31495w;
                        } else {
                            drawableD = null;
                        }
                        if (drawableD == null) {
                            if (this.f31493u == null) {
                                a aVar = this.f31482i;
                                aVar.getClass();
                                this.f31493u = null;
                                int i11 = aVar.f31456d;
                                if (i11 > 0) {
                                    Context context = this.f31479e;
                                    Resources.Theme theme = this.f31482i.f31465o;
                                    if (theme == null) {
                                        theme = context.getTheme();
                                    }
                                    this.f31493u = d5.i(context, context, i11, theme);
                                }
                            }
                            drawableD = this.f31493u;
                        }
                        if (drawableD == null) {
                            drawableD = d();
                        }
                        this.f31485m.d(drawableD);
                    }
                } finally {
                    this.f31498z = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p8.c
    public final boolean isRunning() {
        boolean z3;
        synchronized (this.f31477c) {
            int i4 = this.B;
            z3 = i4 == 2 || i4 == 3;
        }
        return z3;
    }

    public final void j(y yVar, int i4, boolean z3) {
        this.f31476b.a();
        y yVar2 = null;
        try {
            synchronized (this.f31477c) {
                try {
                    this.f31490r = null;
                    if (yVar == null) {
                        i(new u("Expected to receive a Resource<R> with an object of " + this.f31481h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = yVar.get();
                    try {
                        if (obj == null || !this.f31481h.isAssignableFrom(obj.getClass())) {
                            this.f31489q = null;
                            StringBuilder sb2 = new StringBuilder("Expected to receive an object of ");
                            sb2.append(this.f31481h);
                            sb2.append(" but instead got ");
                            sb2.append(obj != null ? obj.getClass() : "");
                            sb2.append("{");
                            sb2.append(obj);
                            sb2.append("} inside Resource{");
                            sb2.append(yVar);
                            sb2.append("}.");
                            sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            i(new u(sb2.toString()), 5);
                        } else {
                            d dVar = this.f31478d;
                            if (dVar == null || dVar.c(this)) {
                                k(yVar, obj, i4);
                                return;
                            } else {
                                this.f31489q = null;
                                this.B = 4;
                            }
                        }
                        this.f31492t.getClass();
                        k.g(yVar);
                    } catch (Throwable th2) {
                        yVar2 = yVar;
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (yVar2 != null) {
                this.f31492t.getClass();
                k.g(yVar2);
            }
            throw th4;
        }
    }

    public final void k(y yVar, Object obj, int i4) {
        d dVar = this.f31478d;
        if (dVar != null) {
            dVar.getRoot().a();
        }
        this.B = 4;
        this.f31489q = yVar;
        int i10 = this.f31480f.f6497i;
        Object obj2 = this.g;
        if (i10 <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + r5.c.u(i4) + " for " + obj2 + " with size [" + this.f31496x + "x" + this.f31497y + "] in " + t8.h.a(this.f31491s) + " ms");
        }
        if (dVar != null) {
            dVar.e(this);
        }
        this.f31498z = true;
        try {
            List list = this.f31486n;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).a(i4, obj, obj2);
                }
            }
            this.f31487o.getClass();
            this.f31485m.b(obj);
            this.f31498z = false;
        } catch (Throwable th2) {
            this.f31498z = false;
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(int i4, int i10) throws Throwable {
        x7.h hVar;
        boolean z3;
        boolean z10;
        ae.d dVar;
        g gVar = this;
        int iRound = i4;
        gVar.f31476b.a();
        Object obj = gVar.f31477c;
        synchronized (obj) {
            try {
                try {
                    boolean z11 = C;
                    if (z11) {
                        gVar.e("Got onSizeReady in " + t8.h.a(gVar.f31491s));
                    }
                    if (gVar.B == 3) {
                        gVar.B = 2;
                        gVar.f31482i.getClass();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * 1.0f);
                        }
                        gVar.f31496x = iRound;
                        gVar.f31497y = i10 == Integer.MIN_VALUE ? i10 : Math.round(1.0f * i10);
                        if (z11) {
                            gVar.e("finished setup for calling load in " + t8.h.a(gVar.f31491s));
                        }
                        k kVar = gVar.f31492t;
                        com.bumptech.glide.h hVar2 = gVar.f31480f;
                        Object obj2 = gVar.g;
                        a aVar = gVar.f31482i;
                        x7.e eVar = aVar.f31460i;
                        try {
                            int i11 = gVar.f31496x;
                            int i12 = gVar.f31497y;
                            Class cls = aVar.f31463m;
                            try {
                                Class cls2 = gVar.f31481h;
                                i iVar = gVar.f31484l;
                                j jVar = aVar.f31454b;
                                try {
                                    t8.c cVar = aVar.f31462l;
                                    boolean z12 = aVar.j;
                                    boolean z13 = aVar.f31467q;
                                    try {
                                        hVar = aVar.f31461k;
                                        z3 = aVar.f31458f;
                                        z10 = aVar.f31468r;
                                        dVar = gVar.f31488p;
                                        gVar = obj;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        gVar = obj;
                                    }
                                    try {
                                        gVar.f31490r = kVar.a(hVar2, obj2, eVar, i11, i12, cls, cls2, iVar, jVar, cVar, z12, z13, hVar, z3, z10, gVar, dVar);
                                        if (gVar.B != 2) {
                                            gVar.f31490r = null;
                                        }
                                        if (z11) {
                                            gVar.e("finished onSizeReady in " + t8.h.a(gVar.f31491s));
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    gVar = obj;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                gVar = obj;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            gVar = obj;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    gVar = obj;
                }
            } catch (Throwable th8) {
                th = th8;
            }
        }
    }

    @Override // p8.c
    public final void pause() {
        synchronized (this.f31477c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f31477c) {
            obj = this.g;
            cls = this.f31481h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
