package com.bumptech.glide.load.engine;

import X2.a;
import android.util.Log;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.engine.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class h implements f.a, Runnable, Comparable, a.f {

    /* renamed from: A, reason: collision with root package name */
    private C2.a f34343A;

    /* renamed from: B, reason: collision with root package name */
    private com.bumptech.glide.load.data.d f34344B;

    /* renamed from: C, reason: collision with root package name */
    private volatile com.bumptech.glide.load.engine.f f34345C;

    /* renamed from: D, reason: collision with root package name */
    private volatile boolean f34346D;

    /* renamed from: E, reason: collision with root package name */
    private volatile boolean f34347E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f34348F;

    /* renamed from: d, reason: collision with root package name */
    private final e f34352d;

    /* renamed from: e, reason: collision with root package name */
    private final E1.e f34353e;

    /* renamed from: h, reason: collision with root package name */
    private com.bumptech.glide.d f34356h;

    /* renamed from: i, reason: collision with root package name */
    private C2.e f34357i;

    /* renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.g f34358j;

    /* renamed from: k, reason: collision with root package name */
    private m f34359k;

    /* renamed from: l, reason: collision with root package name */
    private int f34360l;

    /* renamed from: m, reason: collision with root package name */
    private int f34361m;

    /* renamed from: n, reason: collision with root package name */
    private E2.a f34362n;

    /* renamed from: o, reason: collision with root package name */
    private C2.g f34363o;

    /* renamed from: p, reason: collision with root package name */
    private b f34364p;

    /* renamed from: q, reason: collision with root package name */
    private int f34365q;

    /* renamed from: r, reason: collision with root package name */
    private EnumC1196h f34366r;

    /* renamed from: s, reason: collision with root package name */
    private g f34367s;

    /* renamed from: t, reason: collision with root package name */
    private long f34368t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f34369u;

    /* renamed from: v, reason: collision with root package name */
    private Object f34370v;

    /* renamed from: w, reason: collision with root package name */
    private Thread f34371w;

    /* renamed from: x, reason: collision with root package name */
    private C2.e f34372x;

    /* renamed from: y, reason: collision with root package name */
    private C2.e f34373y;

    /* renamed from: z, reason: collision with root package name */
    private Object f34374z;

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.g f34349a = new com.bumptech.glide.load.engine.g();

    /* renamed from: b, reason: collision with root package name */
    private final List f34350b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final X2.c f34351c = X2.c.a();

    /* renamed from: f, reason: collision with root package name */
    private final d f34354f = new d();

    /* renamed from: g, reason: collision with root package name */
    private final f f34355g = new f();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34375a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f34376b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f34377c;

        static {
            int[] iArr = new int[C2.c.values().length];
            f34377c = iArr;
            try {
                iArr[C2.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34377c[C2.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC1196h.values().length];
            f34376b = iArr2;
            try {
                iArr2[EnumC1196h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34376b[EnumC1196h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34376b[EnumC1196h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34376b[EnumC1196h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34376b[EnumC1196h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f34375a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34375a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34375a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    interface b {
        void a(GlideException glideException);

        void c(E2.c cVar, C2.a aVar, boolean z10);

        void d(h hVar);
    }

    private final class c implements i.a {

        /* renamed from: a, reason: collision with root package name */
        private final C2.a f34378a;

        c(C2.a aVar) {
            this.f34378a = aVar;
        }

        @Override // com.bumptech.glide.load.engine.i.a
        public E2.c a(E2.c cVar) {
            return h.this.I(this.f34378a, cVar);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private C2.e f34380a;

        /* renamed from: b, reason: collision with root package name */
        private C2.j f34381b;

        /* renamed from: c, reason: collision with root package name */
        private r f34382c;

        d() {
        }

        void a() {
            this.f34380a = null;
            this.f34381b = null;
            this.f34382c = null;
        }

        void b(e eVar, C2.g gVar) {
            X2.b.a("DecodeJob.encode");
            try {
                eVar.a().a(this.f34380a, new com.bumptech.glide.load.engine.e(this.f34381b, this.f34382c, gVar));
            } finally {
                this.f34382c.h();
                X2.b.e();
            }
        }

        boolean c() {
            return this.f34382c != null;
        }

        void d(C2.e eVar, C2.j jVar, r rVar) {
            this.f34380a = eVar;
            this.f34381b = jVar;
            this.f34382c = rVar;
        }
    }

    interface e {
        G2.a a();
    }

    private static class f {

        /* renamed from: a, reason: collision with root package name */
        private boolean f34383a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f34384b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f34385c;

        f() {
        }

        private boolean a(boolean z10) {
            return (this.f34385c || z10 || this.f34384b) && this.f34383a;
        }

        synchronized boolean b() {
            this.f34384b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.f34385c = true;
            return a(false);
        }

        synchronized boolean d(boolean z10) {
            this.f34383a = true;
            return a(z10);
        }

        synchronized void e() {
            this.f34384b = false;
            this.f34383a = false;
            this.f34385c = false;
        }
    }

    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: com.bumptech.glide.load.engine.h$h, reason: collision with other inner class name */
    private enum EnumC1196h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    h(e eVar, E1.e eVar2) {
        this.f34352d = eVar;
        this.f34353e = eVar2;
    }

    private void B(E2.c cVar, C2.a aVar, boolean z10) {
        U();
        this.f34364p.c(cVar, aVar, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void C(E2.c cVar, C2.a aVar, boolean z10) {
        r rVar;
        X2.b.a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (cVar instanceof E2.b) {
                ((E2.b) cVar).b();
            }
            if (this.f34354f.c()) {
                cVar = r.f(cVar);
                rVar = cVar;
            } else {
                rVar = 0;
            }
            B(cVar, aVar, z10);
            this.f34366r = EnumC1196h.ENCODE;
            try {
                if (this.f34354f.c()) {
                    this.f34354f.b(this.f34352d, this.f34363o);
                }
                E();
                X2.b.e();
            } finally {
                if (rVar != 0) {
                    rVar.h();
                }
            }
        } catch (Throwable th2) {
            X2.b.e();
            throw th2;
        }
    }

    private void D() {
        U();
        this.f34364p.a(new GlideException("Failed to load resource", new ArrayList(this.f34350b)));
        H();
    }

    private void E() {
        if (this.f34355g.b()) {
            K();
        }
    }

    private void H() {
        if (this.f34355g.c()) {
            K();
        }
    }

    private void K() {
        this.f34355g.e();
        this.f34354f.a();
        this.f34349a.a();
        this.f34346D = false;
        this.f34356h = null;
        this.f34357i = null;
        this.f34363o = null;
        this.f34358j = null;
        this.f34359k = null;
        this.f34364p = null;
        this.f34366r = null;
        this.f34345C = null;
        this.f34371w = null;
        this.f34372x = null;
        this.f34374z = null;
        this.f34343A = null;
        this.f34344B = null;
        this.f34368t = 0L;
        this.f34347E = false;
        this.f34370v = null;
        this.f34350b.clear();
        this.f34353e.a(this);
    }

    private void M(g gVar) {
        this.f34367s = gVar;
        this.f34364p.d(this);
    }

    private void N() {
        this.f34371w = Thread.currentThread();
        this.f34368t = W2.g.b();
        boolean zB = false;
        while (!this.f34347E && this.f34345C != null && !(zB = this.f34345C.b())) {
            this.f34366r = r(this.f34366r);
            this.f34345C = p();
            if (this.f34366r == EnumC1196h.SOURCE) {
                M(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f34366r == EnumC1196h.FINISHED || this.f34347E) && !zB) {
            D();
        }
    }

    private E2.c P(Object obj, C2.a aVar, q qVar) {
        C2.g gVarS = s(aVar);
        com.bumptech.glide.load.data.e eVarL = this.f34356h.h().l(obj);
        try {
            return qVar.a(eVarL, gVarS, this.f34360l, this.f34361m, new c(aVar));
        } finally {
            eVarL.b();
        }
    }

    private void T() {
        int i10 = a.f34375a[this.f34367s.ordinal()];
        if (i10 == 1) {
            this.f34366r = r(EnumC1196h.INITIALIZE);
            this.f34345C = p();
            N();
        } else if (i10 == 2) {
            N();
        } else {
            if (i10 == 3) {
                n();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f34367s);
        }
    }

    private void U() {
        Throwable th2;
        this.f34351c.c();
        if (!this.f34346D) {
            this.f34346D = true;
            return;
        }
        if (this.f34350b.isEmpty()) {
            th2 = null;
        } else {
            List list = this.f34350b;
            th2 = (Throwable) list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th2);
    }

    private E2.c j(com.bumptech.glide.load.data.d dVar, Object obj, C2.a aVar) {
        if (obj == null) {
            dVar.b();
            return null;
        }
        try {
            long jB = W2.g.b();
            E2.c cVarL = l(obj, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                y("Decoded result " + cVarL, jB);
            }
            return cVarL;
        } finally {
            dVar.b();
        }
    }

    private E2.c l(Object obj, C2.a aVar) {
        return P(obj, aVar, this.f34349a.h(obj.getClass()));
    }

    private void n() {
        E2.c cVarJ;
        if (Log.isLoggable("DecodeJob", 2)) {
            z("Retrieved data", this.f34368t, "data: " + this.f34374z + ", cache key: " + this.f34372x + ", fetcher: " + this.f34344B);
        }
        try {
            cVarJ = j(this.f34344B, this.f34374z, this.f34343A);
        } catch (GlideException e10) {
            e10.n(this.f34373y, this.f34343A);
            this.f34350b.add(e10);
            cVarJ = null;
        }
        if (cVarJ != null) {
            C(cVarJ, this.f34343A, this.f34348F);
        } else {
            N();
        }
    }

    private com.bumptech.glide.load.engine.f p() {
        int i10 = a.f34376b[this.f34366r.ordinal()];
        if (i10 == 1) {
            return new s(this.f34349a, this);
        }
        if (i10 == 2) {
            return new com.bumptech.glide.load.engine.c(this.f34349a, this);
        }
        if (i10 == 3) {
            return new v(this.f34349a, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f34366r);
    }

    private EnumC1196h r(EnumC1196h enumC1196h) {
        int i10 = a.f34376b[enumC1196h.ordinal()];
        if (i10 == 1) {
            return this.f34362n.a() ? EnumC1196h.DATA_CACHE : r(EnumC1196h.DATA_CACHE);
        }
        if (i10 == 2) {
            return this.f34369u ? EnumC1196h.FINISHED : EnumC1196h.SOURCE;
        }
        if (i10 == 3 || i10 == 4) {
            return EnumC1196h.FINISHED;
        }
        if (i10 == 5) {
            return this.f34362n.b() ? EnumC1196h.RESOURCE_CACHE : r(EnumC1196h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC1196h);
    }

    private C2.g s(C2.a aVar) {
        C2.g gVar = this.f34363o;
        boolean z10 = aVar == C2.a.RESOURCE_DISK_CACHE || this.f34349a.x();
        C2.f fVar = com.bumptech.glide.load.resource.bitmap.l.f34548j;
        Boolean bool = (Boolean) gVar.c(fVar);
        if (bool != null && (!bool.booleanValue() || z10)) {
            return gVar;
        }
        C2.g gVar2 = new C2.g();
        gVar2.d(this.f34363o);
        gVar2.e(fVar, Boolean.valueOf(z10));
        return gVar2;
    }

    private int t() {
        return this.f34358j.ordinal();
    }

    private void y(String str, long j10) {
        z(str, j10, null);
    }

    private void z(String str, long j10, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(W2.g.a(j10));
        sb2.append(", load key: ");
        sb2.append(this.f34359k);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(", thread: ");
        sb2.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb2.toString());
    }

    E2.c I(C2.a aVar, E2.c cVar) {
        E2.c cVarB;
        C2.k kVar;
        C2.c cVarB2;
        C2.e dVar;
        Class<?> cls = cVar.get().getClass();
        C2.j jVarN = null;
        if (aVar != C2.a.RESOURCE_DISK_CACHE) {
            C2.k kVarS = this.f34349a.s(cls);
            kVar = kVarS;
            cVarB = kVarS.b(this.f34356h, cVar, this.f34360l, this.f34361m);
        } else {
            cVarB = cVar;
            kVar = null;
        }
        if (!cVar.equals(cVarB)) {
            cVar.c();
        }
        if (this.f34349a.w(cVarB)) {
            jVarN = this.f34349a.n(cVarB);
            cVarB2 = jVarN.b(this.f34363o);
        } else {
            cVarB2 = C2.c.NONE;
        }
        C2.j jVar = jVarN;
        if (!this.f34362n.d(!this.f34349a.y(this.f34372x), aVar, cVarB2)) {
            return cVarB;
        }
        if (jVar == null) {
            throw new Registry.NoResultEncoderAvailableException(cVarB.get().getClass());
        }
        int i10 = a.f34377c[cVarB2.ordinal()];
        if (i10 == 1) {
            dVar = new com.bumptech.glide.load.engine.d(this.f34372x, this.f34357i);
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + cVarB2);
            }
            dVar = new t(this.f34349a.b(), this.f34372x, this.f34357i, this.f34360l, this.f34361m, kVar, cls, this.f34363o);
        }
        r rVarF = r.f(cVarB);
        this.f34354f.d(dVar, jVar, rVarF);
        return rVarF;
    }

    void J(boolean z10) {
        if (this.f34355g.d(z10)) {
            K();
        }
    }

    boolean W() {
        EnumC1196h enumC1196hR = r(EnumC1196h.INITIALIZE);
        return enumC1196hR == EnumC1196h.RESOURCE_CACHE || enumC1196hR == EnumC1196h.DATA_CACHE;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void a(C2.e eVar, Object obj, com.bumptech.glide.load.data.d dVar, C2.a aVar, C2.e eVar2) {
        this.f34372x = eVar;
        this.f34374z = obj;
        this.f34344B = dVar;
        this.f34343A = aVar;
        this.f34373y = eVar2;
        this.f34348F = eVar != this.f34349a.c().get(0);
        if (Thread.currentThread() != this.f34371w) {
            M(g.DECODE_DATA);
            return;
        }
        X2.b.a("DecodeJob.decodeFromRetrievedData");
        try {
            n();
        } finally {
            X2.b.e();
        }
    }

    @Override // X2.a.f
    public X2.c b() {
        return this.f34351c;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void c(C2.e eVar, Exception exc, com.bumptech.glide.load.data.d dVar, C2.a aVar) {
        dVar.b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.o(eVar, aVar, dVar.a());
        this.f34350b.add(glideException);
        if (Thread.currentThread() != this.f34371w) {
            M(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            N();
        }
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void d() {
        M(g.SWITCH_TO_SOURCE_SERVICE);
    }

    public void g() {
        this.f34347E = true;
        com.bumptech.glide.load.engine.f fVar = this.f34345C;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(h hVar) {
        int iT = t() - hVar.t();
        return iT == 0 ? this.f34365q - hVar.f34365q : iT;
    }

    @Override // java.lang.Runnable
    public void run() {
        X2.b.c("DecodeJob#run(reason=%s, model=%s)", this.f34367s, this.f34370v);
        com.bumptech.glide.load.data.d dVar = this.f34344B;
        try {
            try {
                if (this.f34347E) {
                    D();
                    if (dVar != null) {
                        dVar.b();
                    }
                    X2.b.e();
                    return;
                }
                T();
                if (dVar != null) {
                    dVar.b();
                }
                X2.b.e();
            } catch (com.bumptech.glide.load.engine.b e10) {
                throw e10;
            } catch (Throwable th2) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f34347E + ", stage: " + this.f34366r, th2);
                }
                if (this.f34366r != EnumC1196h.ENCODE) {
                    this.f34350b.add(th2);
                    D();
                }
                if (!this.f34347E) {
                    throw th2;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            if (dVar != null) {
                dVar.b();
            }
            X2.b.e();
            throw th3;
        }
    }

    h v(com.bumptech.glide.d dVar, Object obj, m mVar, C2.e eVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.g gVar, E2.a aVar, Map map, boolean z10, boolean z11, boolean z12, C2.g gVar2, b bVar, int i12) {
        this.f34349a.v(dVar, obj, eVar, i10, i11, aVar, cls, cls2, gVar, gVar2, map, z10, z11, this.f34352d);
        this.f34356h = dVar;
        this.f34357i = eVar;
        this.f34358j = gVar;
        this.f34359k = mVar;
        this.f34360l = i10;
        this.f34361m = i11;
        this.f34362n = aVar;
        this.f34369u = z12;
        this.f34363o = gVar2;
        this.f34364p = bVar;
        this.f34365q = i12;
        this.f34367s = g.INITIALIZE;
        this.f34370v = obj;
        return this;
    }
}
