package d3;

import N2.l;
import N2.m;
import N2.q;
import N2.u;
import N7.G8;
import R2.n;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import e3.InterfaceC4312f;
import e3.InterfaceC4313g;
import f3.C4332a;
import h3.e;
import i3.d;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: SingleRequest.java */
/* loaded from: classes.dex */
public final class h<R> implements InterfaceC4272d, InterfaceC4312f {

    /* renamed from: B, reason: collision with root package name */
    public static final boolean f37393B = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A, reason: collision with root package name */
    public final RuntimeException f37394A;

    /* renamed from: a, reason: collision with root package name */
    public final String f37395a;

    /* renamed from: b, reason: collision with root package name */
    public final d.a f37396b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f37397c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f37398d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.e f37399e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f37400f;

    /* renamed from: g, reason: collision with root package name */
    public final Class<R> f37401g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC4269a<?> f37402h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f37403j;

    /* renamed from: k, reason: collision with root package name */
    public final com.bumptech.glide.h f37404k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC4313g<R> f37405l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f37406m;

    /* renamed from: n, reason: collision with root package name */
    public final C4332a.C0452a f37407n;

    /* renamed from: o, reason: collision with root package name */
    public final e.a f37408o;

    /* renamed from: p, reason: collision with root package name */
    public u<R> f37409p;

    /* renamed from: q, reason: collision with root package name */
    public m.d f37410q;

    /* renamed from: r, reason: collision with root package name */
    public long f37411r;

    /* renamed from: s, reason: collision with root package name */
    public volatile m f37412s;

    /* renamed from: t, reason: collision with root package name */
    public a f37413t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f37414u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f37415v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f37416w;

    /* renamed from: x, reason: collision with root package name */
    public int f37417x;

    /* renamed from: y, reason: collision with root package name */
    public int f37418y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f37419z;

    /* compiled from: SingleRequest.java */
    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public h(Context context, com.bumptech.glide.e eVar, Object obj, Object obj2, Class cls, AbstractC4269a abstractC4269a, int i, int i10, com.bumptech.glide.h hVar, InterfaceC4313g interfaceC4313g, ArrayList arrayList, InterfaceC4273e interfaceC4273e, m mVar) {
        C4332a.C0452a c0452a = C4332a.f37816a;
        e.a aVar = h3.e.f38202a;
        this.f37395a = f37393B ? String.valueOf(hashCode()) : null;
        this.f37396b = new d.a();
        this.f37397c = obj;
        this.f37399e = eVar;
        this.f37400f = obj2;
        this.f37401g = cls;
        this.f37402h = abstractC4269a;
        this.i = i;
        this.f37403j = i10;
        this.f37404k = hVar;
        this.f37405l = interfaceC4313g;
        this.f37406m = arrayList;
        this.f37398d = interfaceC4273e;
        this.f37412s = mVar;
        this.f37407n = c0452a;
        this.f37408o = aVar;
        this.f37413t = a.PENDING;
        if (this.f37394A == null && eVar.f22252h.f22254a.containsKey(com.bumptech.glide.d.class)) {
            this.f37394A = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // d3.InterfaceC4272d
    public final boolean a() {
        boolean z10;
        synchronized (this.f37397c) {
            z10 = this.f37413t == a.COMPLETE;
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e3.InterfaceC4312f
    public final void b(int i, int i10) throws Throwable {
        L2.h hVar;
        boolean z10;
        boolean z11;
        e.a aVar;
        h<R> hVar2 = this;
        int iRound = i;
        hVar2.f37396b.a();
        Object obj = hVar2.f37397c;
        synchronized (obj) {
            try {
                try {
                    boolean z12 = f37393B;
                    if (z12) {
                        hVar2.e("Got onSizeReady in " + h3.h.a(hVar2.f37411r));
                    }
                    if (hVar2.f37413t == a.WAITING_FOR_SIZE) {
                        a aVar2 = a.RUNNING;
                        hVar2.f37413t = aVar2;
                        hVar2.f37402h.getClass();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * 1.0f);
                        }
                        hVar2.f37417x = iRound;
                        hVar2.f37418y = i10 == Integer.MIN_VALUE ? i10 : Math.round(1.0f * i10);
                        if (z12) {
                            hVar2.e("finished setup for calling load in " + h3.h.a(hVar2.f37411r));
                        }
                        m mVar = hVar2.f37412s;
                        com.bumptech.glide.e eVar = hVar2.f37399e;
                        Object obj2 = hVar2.f37400f;
                        AbstractC4269a<?> abstractC4269a = hVar2.f37402h;
                        L2.f fVar = abstractC4269a.f37378h;
                        try {
                            int i11 = hVar2.f37417x;
                            int i12 = hVar2.f37418y;
                            Class<?> cls = abstractC4269a.f37382m;
                            try {
                                Class<R> cls2 = hVar2.f37401g;
                                com.bumptech.glide.h hVar3 = hVar2.f37404k;
                                l lVar = abstractC4269a.f37373c;
                                try {
                                    h3.b bVar = abstractC4269a.f37381l;
                                    boolean z13 = abstractC4269a.i;
                                    boolean z14 = abstractC4269a.f37385p;
                                    try {
                                        hVar = abstractC4269a.f37380k;
                                        z10 = abstractC4269a.f37375e;
                                        z11 = abstractC4269a.f37386q;
                                        aVar = hVar2.f37408o;
                                        hVar2 = obj;
                                    } catch (Throwable th) {
                                        th = th;
                                        hVar2 = obj;
                                    }
                                    try {
                                        hVar2.f37410q = mVar.a(eVar, obj2, fVar, i11, i12, cls, cls2, hVar3, lVar, bVar, z13, z14, hVar, z10, z11, hVar2, aVar);
                                        if (hVar2.f37413t != aVar2) {
                                            hVar2.f37410q = null;
                                        }
                                        if (z12) {
                                            hVar2.e("finished onSizeReady in " + h3.h.a(hVar2.f37411r));
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    hVar2 = obj;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                hVar2 = obj;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            hVar2 = obj;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    hVar2 = obj;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }
    }

    public final void c() {
        if (this.f37419z) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f37396b.a();
        this.f37405l.a(this);
        m.d dVar = this.f37410q;
        if (dVar != null) {
            synchronized (m.this) {
                dVar.f4575a.j(dVar.f4576b);
            }
            this.f37410q = null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [d3.e, java.lang.Object] */
    @Override // d3.InterfaceC4272d
    public final void clear() {
        synchronized (this.f37397c) {
            try {
                if (this.f37419z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f37396b.a();
                a aVar = this.f37413t;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                c();
                u<R> uVar = this.f37409p;
                if (uVar != null) {
                    this.f37409p = null;
                } else {
                    uVar = null;
                }
                ?? r32 = this.f37398d;
                if (r32 == 0 || r32.b(this)) {
                    this.f37405l.h(d());
                }
                this.f37413t = aVar2;
                if (uVar != null) {
                    this.f37412s.getClass();
                    m.g(uVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Drawable d() {
        if (this.f37415v == null) {
            this.f37402h.getClass();
            this.f37415v = null;
        }
        return this.f37415v;
    }

    public final void e(String str) {
        StringBuilder sbV = G8.v(str, " this: ");
        sbV.append(this.f37395a);
        Log.v("GlideRequest", sbV.toString());
    }

    @Override // d3.InterfaceC4272d
    public final boolean f(InterfaceC4272d interfaceC4272d) {
        int i;
        int i10;
        Object obj;
        Class<R> cls;
        AbstractC4269a<?> abstractC4269a;
        com.bumptech.glide.h hVar;
        int size;
        int i11;
        int i12;
        Object obj2;
        Class<R> cls2;
        AbstractC4269a<?> abstractC4269a2;
        com.bumptech.glide.h hVar2;
        int size2;
        if (!(interfaceC4272d instanceof h)) {
            return false;
        }
        synchronized (this.f37397c) {
            try {
                i = this.i;
                i10 = this.f37403j;
                obj = this.f37400f;
                cls = this.f37401g;
                abstractC4269a = this.f37402h;
                hVar = this.f37404k;
                ArrayList arrayList = this.f37406m;
                size = arrayList != null ? arrayList.size() : 0;
            } finally {
            }
        }
        h hVar3 = (h) interfaceC4272d;
        synchronized (hVar3.f37397c) {
            try {
                i11 = hVar3.i;
                i12 = hVar3.f37403j;
                obj2 = hVar3.f37400f;
                cls2 = hVar3.f37401g;
                abstractC4269a2 = hVar3.f37402h;
                hVar2 = hVar3.f37404k;
                ArrayList arrayList2 = hVar3.f37406m;
                size2 = arrayList2 != null ? arrayList2.size() : 0;
            } finally {
            }
        }
        if (i != i11 || i10 != i12) {
            return false;
        }
        char[] cArr = h3.l.f38217a;
        if ((obj == null ? obj2 == null : obj instanceof n ? ((n) obj).a() : obj.equals(obj2)) && cls.equals(cls2)) {
            return (abstractC4269a == null ? abstractC4269a2 == null : abstractC4269a.f(abstractC4269a2)) && hVar == hVar2 && size == size2;
        }
        return false;
    }

    @Override // d3.InterfaceC4272d
    public final boolean g() {
        boolean z10;
        synchronized (this.f37397c) {
            z10 = this.f37413t == a.CLEARED;
        }
        return z10;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [d3.e, java.lang.Object] */
    @Override // d3.InterfaceC4272d
    public final void h() {
        synchronized (this.f37397c) {
            try {
                if (this.f37419z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f37396b.a();
                int i = h3.h.f38207b;
                this.f37411r = SystemClock.elapsedRealtimeNanos();
                if (this.f37400f == null) {
                    if (h3.l.i(this.i, this.f37403j)) {
                        this.f37417x = this.i;
                        this.f37418y = this.f37403j;
                    }
                    if (this.f37416w == null) {
                        this.f37402h.getClass();
                        this.f37416w = null;
                    }
                    i(new q("Received null model"), this.f37416w == null ? 5 : 3);
                    return;
                }
                a aVar = this.f37413t;
                if (aVar == a.RUNNING) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.COMPLETE) {
                    k(this.f37409p, L2.a.MEMORY_CACHE, false);
                    return;
                }
                ArrayList arrayList = this.f37406m;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        InterfaceC4274f interfaceC4274f = (InterfaceC4274f) it.next();
                        if (interfaceC4274f instanceof AbstractC4271c) {
                            ((AbstractC4271c) interfaceC4274f).getClass();
                        }
                    }
                }
                a aVar2 = a.WAITING_FOR_SIZE;
                this.f37413t = aVar2;
                if (h3.l.i(this.i, this.f37403j)) {
                    b(this.i, this.f37403j);
                } else {
                    this.f37405l.d(this);
                }
                a aVar3 = this.f37413t;
                if (aVar3 == a.RUNNING || aVar3 == aVar2) {
                    ?? r12 = this.f37398d;
                    if (r12 == 0 || r12.k(this)) {
                        this.f37405l.f(d());
                    }
                }
                if (f37393B) {
                    e("finished run method in " + h3.h.a(this.f37411r));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [d3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [d3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [d3.e, java.lang.Object] */
    public final void i(q qVar, int i) {
        boolean zB;
        Drawable drawableD;
        this.f37396b.a();
        synchronized (this.f37397c) {
            try {
                qVar.getClass();
                int i10 = this.f37399e.i;
                if (i10 <= i) {
                    Log.w("Glide", "Load failed for [" + this.f37400f + "] with dimensions [" + this.f37417x + "x" + this.f37418y + "]", qVar);
                    if (i10 <= 4) {
                        qVar.d();
                    }
                }
                this.f37410q = null;
                this.f37413t = a.FAILED;
                ?? r82 = this.f37398d;
                if (r82 != 0) {
                    r82.i(this);
                }
                boolean z10 = true;
                this.f37419z = true;
                try {
                    ArrayList arrayList = this.f37406m;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        zB = false;
                        while (it.hasNext()) {
                            InterfaceC4274f interfaceC4274f = (InterfaceC4274f) it.next();
                            ?? r52 = this.f37398d;
                            if (r52 != 0) {
                                r52.d().a();
                            }
                            zB |= interfaceC4274f.b();
                        }
                    } else {
                        zB = false;
                    }
                    if (!zB) {
                        ?? r22 = this.f37398d;
                        if (r22 != 0 && !r22.k(this)) {
                            z10 = false;
                        }
                        if (z10) {
                            if (this.f37400f == null) {
                                if (this.f37416w == null) {
                                    this.f37402h.getClass();
                                    this.f37416w = null;
                                }
                                drawableD = this.f37416w;
                            } else {
                                drawableD = null;
                            }
                            if (drawableD == null) {
                                if (this.f37414u == null) {
                                    this.f37402h.getClass();
                                    this.f37414u = null;
                                }
                                drawableD = this.f37414u;
                            }
                            if (drawableD == null) {
                                drawableD = d();
                            }
                            this.f37405l.e(drawableD);
                        }
                    }
                } finally {
                    this.f37419z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // d3.InterfaceC4272d
    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f37397c) {
            try {
                a aVar = this.f37413t;
                z10 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z10;
    }

    @Override // d3.InterfaceC4272d
    public final boolean j() {
        boolean z10;
        synchronized (this.f37397c) {
            z10 = this.f37413t == a.COMPLETE;
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [d3.e, java.lang.Object] */
    public final void k(u<?> uVar, L2.a aVar, boolean z10) {
        this.f37396b.a();
        u<?> uVar2 = null;
        try {
            synchronized (this.f37397c) {
                try {
                    this.f37410q = null;
                    if (uVar == null) {
                        i(new q("Expected to receive a Resource<R> with an object of " + this.f37401g + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = uVar.get();
                    try {
                        if (obj == null || !this.f37401g.isAssignableFrom(obj.getClass())) {
                            this.f37409p = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.f37401g);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(uVar);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            i(new q(sb.toString()), 5);
                        } else {
                            ?? r02 = this.f37398d;
                            if (r02 == 0 || r02.c(this)) {
                                l(uVar, obj, aVar, z10);
                                return;
                            } else {
                                this.f37409p = null;
                                this.f37413t = a.COMPLETE;
                            }
                        }
                        this.f37412s.getClass();
                        m.g(uVar);
                    } catch (Throwable th) {
                        uVar2 = uVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (uVar2 != null) {
                this.f37412s.getClass();
                m.g(uVar2);
            }
            throw th3;
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [d3.e, java.lang.Object] */
    public final void l(u<R> uVar, R r9, L2.a aVar, boolean z10) {
        boolean zA;
        ?? r62 = this.f37398d;
        if (r62 != 0) {
            r62.d().a();
        }
        this.f37413t = a.COMPLETE;
        this.f37409p = uVar;
        if (this.f37399e.i <= 3) {
            Log.d("Glide", "Finished loading " + r9.getClass().getSimpleName() + " from " + aVar + " for " + this.f37400f + " with size [" + this.f37417x + "x" + this.f37418y + "] in " + h3.h.a(this.f37411r) + " ms");
        }
        if (r62 != 0) {
            r62.e(this);
        }
        this.f37419z = true;
        try {
            ArrayList arrayList = this.f37406m;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                zA = false;
                while (it.hasNext()) {
                    InterfaceC4274f interfaceC4274f = (InterfaceC4274f) it.next();
                    zA |= interfaceC4274f.a();
                    if (interfaceC4274f instanceof AbstractC4271c) {
                        zA |= ((AbstractC4271c) interfaceC4274f).c();
                    }
                }
            } else {
                zA = false;
            }
            if (!zA) {
                this.f37407n.getClass();
                this.f37405l.c(r9);
            }
            this.f37419z = false;
        } catch (Throwable th) {
            this.f37419z = false;
            throw th;
        }
    }

    @Override // d3.InterfaceC4272d
    public final void pause() {
        synchronized (this.f37397c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f37397c) {
            obj = this.f37400f;
            cls = this.f37401g;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
