package N2;

import N2.h;
import N2.m;
import N7.G8;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import i3.C4455a;
import i3.d;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: DecodeJob.java */
/* loaded from: classes.dex */
public final class j<R> implements h.a, Runnable, Comparable<j<?>>, C4455a.d {

    /* renamed from: A, reason: collision with root package name */
    public L2.a f4504A;

    /* renamed from: B, reason: collision with root package name */
    public com.bumptech.glide.load.data.d<?> f4505B;

    /* renamed from: C, reason: collision with root package name */
    public volatile h f4506C;

    /* renamed from: D, reason: collision with root package name */
    public volatile boolean f4507D;

    /* renamed from: E, reason: collision with root package name */
    public volatile boolean f4508E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4509F;

    /* renamed from: e, reason: collision with root package name */
    public final m.c f4513e;

    /* renamed from: f, reason: collision with root package name */
    public final C4455a.c f4514f;
    public com.bumptech.glide.e i;

    /* renamed from: j, reason: collision with root package name */
    public L2.f f4517j;

    /* renamed from: k, reason: collision with root package name */
    public com.bumptech.glide.h f4518k;

    /* renamed from: l, reason: collision with root package name */
    public o f4519l;

    /* renamed from: m, reason: collision with root package name */
    public int f4520m;

    /* renamed from: n, reason: collision with root package name */
    public int f4521n;

    /* renamed from: o, reason: collision with root package name */
    public l f4522o;

    /* renamed from: p, reason: collision with root package name */
    public L2.h f4523p;

    /* renamed from: q, reason: collision with root package name */
    public n f4524q;

    /* renamed from: r, reason: collision with root package name */
    public int f4525r;

    /* renamed from: s, reason: collision with root package name */
    public f f4526s;

    /* renamed from: t, reason: collision with root package name */
    public e f4527t;

    /* renamed from: u, reason: collision with root package name */
    public long f4528u;

    /* renamed from: v, reason: collision with root package name */
    public Object f4529v;

    /* renamed from: w, reason: collision with root package name */
    public Thread f4530w;

    /* renamed from: x, reason: collision with root package name */
    public L2.f f4531x;

    /* renamed from: y, reason: collision with root package name */
    public L2.f f4532y;

    /* renamed from: z, reason: collision with root package name */
    public Object f4533z;

    /* renamed from: b, reason: collision with root package name */
    public final i<R> f4510b = new i<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4511c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final d.a f4512d = new d.a();

    /* renamed from: g, reason: collision with root package name */
    public final c<?> f4515g = new c<>();

    /* renamed from: h, reason: collision with root package name */
    public final d f4516h = new d();

    /* compiled from: DecodeJob.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4534a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f4535b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f4536c;

        static {
            int[] iArr = new int[L2.c.values().length];
            f4536c = iArr;
            try {
                iArr[L2.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4536c[L2.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[f.values().length];
            f4535b = iArr2;
            try {
                iArr2[f.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4535b[f.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4535b[f.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4535b[f.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4535b[f.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[e.values().length];
            f4534a = iArr3;
            try {
                iArr3[e.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4534a[e.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4534a[e.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: DecodeJob.java */
    public final class b<Z> {

        /* renamed from: a, reason: collision with root package name */
        public final L2.a f4537a;

        public b(L2.a aVar) {
            this.f4537a = aVar;
        }
    }

    /* compiled from: DecodeJob.java */
    public static class c<Z> {

        /* renamed from: a, reason: collision with root package name */
        public L2.f f4539a;

        /* renamed from: b, reason: collision with root package name */
        public L2.k<Z> f4540b;

        /* renamed from: c, reason: collision with root package name */
        public t<Z> f4541c;
    }

    /* compiled from: DecodeJob.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f4542a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f4543b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f4544c;

        public final boolean a() {
            return (this.f4544c || this.f4543b) && this.f4542a;
        }
    }

    /* compiled from: DecodeJob.java */
    public enum e {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* compiled from: DecodeJob.java */
    public enum f {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public j(m.c cVar, C4455a.c cVar2) {
        this.f4513e = cVar;
        this.f4514f = cVar2;
    }

    @Override // N2.h.a
    public final void a(L2.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, L2.a aVar) {
        dVar.b();
        q qVar = new q("Fetching data failed", Collections.singletonList(exc));
        Class<?> clsA = dVar.a();
        qVar.f4624c = fVar;
        qVar.f4625d = aVar;
        qVar.f4626e = clsA;
        this.f4511c.add(qVar);
        if (Thread.currentThread() != this.f4530w) {
            o(e.SWITCH_TO_SOURCE_SERVICE);
        } else {
            p();
        }
    }

    @Override // i3.C4455a.d
    public final d.a b() {
        return this.f4512d;
    }

    @Override // N2.h.a
    public final void c(L2.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, L2.a aVar, L2.f fVar2) {
        this.f4531x = fVar;
        this.f4533z = obj;
        this.f4505B = dVar;
        this.f4504A = aVar;
        this.f4532y = fVar2;
        this.f4509F = fVar != this.f4510b.a().get(0);
        if (Thread.currentThread() != this.f4530w) {
            o(e.DECODE_DATA);
        } else {
            f();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(j<?> jVar) {
        j<?> jVar2 = jVar;
        int iOrdinal = this.f4518k.ordinal() - jVar2.f4518k.ordinal();
        return iOrdinal == 0 ? this.f4525r - jVar2.f4525r : iOrdinal;
    }

    public final <Data> u<R> d(com.bumptech.glide.load.data.d<?> dVar, Data data, L2.a aVar) throws q {
        if (data == null) {
            return null;
        }
        try {
            int i = h3.h.f38207b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            u<R> uVarE = e(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                i("Decoded result " + uVarE, null, jElapsedRealtimeNanos);
            }
            return uVarE;
        } finally {
            dVar.b();
        }
    }

    public final <Data> u<R> e(Data data, L2.a aVar) throws q {
        Class<?> cls = data.getClass();
        i<R> iVar = this.f4510b;
        s<Data, ?, R> sVarC = iVar.c(cls);
        L2.h hVar = this.f4523p;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z10 = aVar == L2.a.RESOURCE_DISK_CACHE || iVar.f4503r;
            L2.g<Boolean> gVar = U2.m.i;
            Boolean bool = (Boolean) hVar.c(gVar);
            if (bool == null || (bool.booleanValue() && !z10)) {
                hVar = new L2.h();
                h3.b bVar = this.f4523p.f4033b;
                h3.b bVar2 = hVar.f4033b;
                bVar2.h(bVar);
                bVar2.put(gVar, Boolean.valueOf(z10));
            }
        }
        L2.h hVar2 = hVar;
        com.bumptech.glide.load.data.e eVarH = this.i.b().h(data);
        try {
            return sVarC.a(this.f4520m, this.f4521n, hVar2, new b(aVar), eVarH);
        } finally {
            eVarH.b();
        }
    }

    public final void f() {
        t tVarD;
        if (Log.isLoggable("DecodeJob", 2)) {
            i("Retrieved data", "data: " + this.f4533z + ", cache key: " + this.f4531x + ", fetcher: " + this.f4505B, this.f4528u);
        }
        t tVar = null;
        try {
            tVarD = d(this.f4505B, this.f4533z, this.f4504A);
        } catch (q e4) {
            L2.f fVar = this.f4532y;
            L2.a aVar = this.f4504A;
            e4.f4624c = fVar;
            e4.f4625d = aVar;
            e4.f4626e = null;
            this.f4511c.add(e4);
            tVarD = null;
        }
        if (tVarD == null) {
            p();
            return;
        }
        L2.a aVar2 = this.f4504A;
        boolean z10 = this.f4509F;
        if (tVarD instanceof r) {
            ((r) tVarD).initialize();
        }
        boolean z11 = true;
        if (this.f4515g.f4541c != null) {
            tVar = (t) t.f4633f.a();
            tVar.f4637e = false;
            tVar.f4636d = true;
            tVar.f4635c = tVarD;
            tVarD = tVar;
        }
        r();
        n nVar = this.f4524q;
        synchronized (nVar) {
            nVar.f4591o = tVarD;
            nVar.f4592p = aVar2;
            nVar.f4599w = z10;
        }
        nVar.h();
        this.f4526s = f.ENCODE;
        try {
            c<?> cVar = this.f4515g;
            if (cVar.f4541c == null) {
                z11 = false;
            }
            if (z11) {
                m.c cVar2 = this.f4513e;
                L2.h hVar = this.f4523p;
                cVar.getClass();
                try {
                    cVar2.a().f(cVar.f4539a, new g(cVar.f4540b, cVar.f4541c, hVar));
                    cVar.f4541c.d();
                } catch (Throwable th) {
                    cVar.f4541c.d();
                    throw th;
                }
            }
            k();
        } finally {
            if (tVar != null) {
                tVar.d();
            }
        }
    }

    public final h g() {
        int i = a.f4535b[this.f4526s.ordinal()];
        i<R> iVar = this.f4510b;
        if (i == 1) {
            return new v(iVar, this);
        }
        if (i == 2) {
            return new N2.e(iVar.a(), iVar, this);
        }
        if (i == 3) {
            return new z(iVar, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f4526s);
    }

    public final f h(f fVar) {
        int i = a.f4535b[fVar.ordinal()];
        if (i == 1) {
            return this.f4522o.a() ? f.DATA_CACHE : h(f.DATA_CACHE);
        }
        if (i == 2) {
            return f.SOURCE;
        }
        if (i == 3 || i == 4) {
            return f.FINISHED;
        }
        if (i == 5) {
            return this.f4522o.b() ? f.RESOURCE_CACHE : h(f.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + fVar);
    }

    public final void i(String str, String str2, long j4) {
        StringBuilder sbV = G8.v(str, " in ");
        sbV.append(h3.h.a(j4));
        sbV.append(", load key: ");
        sbV.append(this.f4519l);
        sbV.append(str2 != null ? ", ".concat(str2) : "");
        sbV.append(", thread: ");
        sbV.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbV.toString());
    }

    public final void j() {
        r();
        q qVar = new q("Failed to load resource", new ArrayList(this.f4511c));
        n nVar = this.f4524q;
        synchronized (nVar) {
            nVar.f4594r = qVar;
        }
        nVar.g();
        l();
    }

    public final void k() {
        boolean zA;
        d dVar = this.f4516h;
        synchronized (dVar) {
            dVar.f4543b = true;
            zA = dVar.a();
        }
        if (zA) {
            n();
        }
    }

    public final void l() {
        boolean zA;
        d dVar = this.f4516h;
        synchronized (dVar) {
            dVar.f4544c = true;
            zA = dVar.a();
        }
        if (zA) {
            n();
        }
    }

    public final void m() {
        boolean zA;
        d dVar = this.f4516h;
        synchronized (dVar) {
            dVar.f4542a = true;
            zA = dVar.a();
        }
        if (zA) {
            n();
        }
    }

    public final void n() {
        d dVar = this.f4516h;
        synchronized (dVar) {
            dVar.f4543b = false;
            dVar.f4542a = false;
            dVar.f4544c = false;
        }
        c<?> cVar = this.f4515g;
        cVar.f4539a = null;
        cVar.f4540b = null;
        cVar.f4541c = null;
        i<R> iVar = this.f4510b;
        iVar.f4489c = null;
        iVar.f4490d = null;
        iVar.f4499n = null;
        iVar.f4493g = null;
        iVar.f4496k = null;
        iVar.i = null;
        iVar.f4500o = null;
        iVar.f4495j = null;
        iVar.f4501p = null;
        iVar.f4487a.clear();
        iVar.f4497l = false;
        iVar.f4488b.clear();
        iVar.f4498m = false;
        this.f4507D = false;
        this.i = null;
        this.f4517j = null;
        this.f4523p = null;
        this.f4518k = null;
        this.f4519l = null;
        this.f4524q = null;
        this.f4526s = null;
        this.f4506C = null;
        this.f4530w = null;
        this.f4531x = null;
        this.f4533z = null;
        this.f4504A = null;
        this.f4505B = null;
        this.f4528u = 0L;
        this.f4508E = false;
        this.f4529v = null;
        this.f4511c.clear();
        this.f4514f.b(this);
    }

    public final void o(e eVar) {
        this.f4527t = eVar;
        n nVar = this.f4524q;
        (nVar.f4590n ? nVar.f4586j : nVar.i).execute(this);
    }

    public final void p() {
        this.f4530w = Thread.currentThread();
        int i = h3.h.f38207b;
        this.f4528u = SystemClock.elapsedRealtimeNanos();
        boolean zB = false;
        while (!this.f4508E && this.f4506C != null && !(zB = this.f4506C.b())) {
            this.f4526s = h(this.f4526s);
            this.f4506C = g();
            if (this.f4526s == f.SOURCE) {
                o(e.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f4526s == f.FINISHED || this.f4508E) && !zB) {
            j();
        }
    }

    public final void q() {
        int i = a.f4534a[this.f4527t.ordinal()];
        if (i == 1) {
            this.f4526s = h(f.INITIALIZE);
            this.f4506C = g();
            p();
        } else if (i == 2) {
            p();
        } else if (i == 3) {
            f();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f4527t);
        }
    }

    public final void r() {
        Throwable th;
        this.f4512d.a();
        if (!this.f4507D) {
            this.f4507D = true;
            return;
        }
        if (this.f4511c.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.f4511c;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.d<?> dVar = this.f4505B;
        try {
            try {
                try {
                    if (this.f4508E) {
                        j();
                        if (dVar != null) {
                            dVar.b();
                            return;
                        }
                        return;
                    }
                    q();
                    if (dVar != null) {
                        dVar.b();
                    }
                } catch (N2.d e4) {
                    throw e4;
                }
            } catch (Throwable th) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f4508E + ", stage: " + this.f4526s, th);
                }
                if (this.f4526s != f.ENCODE) {
                    this.f4511c.add(th);
                    j();
                }
                if (!this.f4508E) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (dVar != null) {
                dVar.b();
            }
            throw th2;
        }
    }
}
