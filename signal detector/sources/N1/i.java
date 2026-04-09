package n1;

import A2.C0117e;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.gms.internal.ads.C1347j2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Supplier;
import l1.C2641g;
import l1.InterfaceC2639e;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class i implements f, Runnable, Comparable, I1.b {

    /* renamed from: V, reason: collision with root package name */
    public static final C2641g f22202V = new C2641g("glide_thread_priority_override", null, C2641g.f21818e);

    /* renamed from: C, reason: collision with root package name */
    public l1.h f22203C;

    /* renamed from: D, reason: collision with root package name */
    public p f22204D;

    /* renamed from: E, reason: collision with root package name */
    public int f22205E;

    /* renamed from: F, reason: collision with root package name */
    public long f22206F;

    /* renamed from: G, reason: collision with root package name */
    public Object f22207G;

    /* renamed from: H, reason: collision with root package name */
    public C0117e f22208H;

    /* renamed from: I, reason: collision with root package name */
    public Supplier f22209I;

    /* renamed from: J, reason: collision with root package name */
    public Thread f22210J;

    /* renamed from: K, reason: collision with root package name */
    public InterfaceC2639e f22211K;

    /* renamed from: L, reason: collision with root package name */
    public InterfaceC2639e f22212L;
    public Object M;

    /* renamed from: N, reason: collision with root package name */
    public com.bumptech.glide.load.data.d f22213N;

    /* renamed from: O, reason: collision with root package name */
    public volatile g f22214O;

    /* renamed from: P, reason: collision with root package name */
    public volatile boolean f22215P;

    /* renamed from: Q, reason: collision with root package name */
    public volatile boolean f22216Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f22217R;

    /* renamed from: S, reason: collision with root package name */
    public int f22218S;

    /* renamed from: T, reason: collision with root package name */
    public int f22219T;

    /* renamed from: U, reason: collision with root package name */
    public int f22220U;

    /* renamed from: d, reason: collision with root package name */
    public final H1.h f22224d;

    /* renamed from: e, reason: collision with root package name */
    public final Q.b f22225e;

    /* renamed from: h, reason: collision with root package name */
    public com.bumptech.glide.f f22228h;
    public InterfaceC2639e i;

    /* renamed from: j, reason: collision with root package name */
    public com.bumptech.glide.h f22229j;

    /* renamed from: k, reason: collision with root package name */
    public r f22230k;

    /* renamed from: l, reason: collision with root package name */
    public int f22231l;

    /* renamed from: m, reason: collision with root package name */
    public int f22232m;

    /* renamed from: n, reason: collision with root package name */
    public k f22233n;

    /* renamed from: a, reason: collision with root package name */
    public final h f22221a = new h();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f22222b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final I1.d f22223c = new I1.d();

    /* renamed from: f, reason: collision with root package name */
    public final V2.e f22226f = new V2.e(28);

    /* renamed from: g, reason: collision with root package name */
    public final C1347j2 f22227g = new C1347j2();

    public i(H1.h hVar, V2.e eVar) {
        this.f22224d = hVar;
        this.f22225e = eVar;
    }

    @Override // n1.f
    public final void a(InterfaceC2639e interfaceC2639e, Exception exc, com.bumptech.glide.load.data.d dVar, int i) {
        dVar.b();
        v vVar = new v("Fetching data failed", Collections.singletonList(exc));
        Class clsA = dVar.a();
        vVar.f22298b = interfaceC2639e;
        vVar.f22299c = i;
        vVar.f22300d = clsA;
        this.f22222b.add(vVar);
        if (Thread.currentThread() != this.f22210J) {
            o(2);
        } else {
            q();
        }
    }

    public final z b(com.bumptech.glide.load.data.d dVar, Object obj, int i) {
        if (obj == null) {
            return null;
        }
        try {
            int i3 = H1.j.f1768b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            z zVarE = e(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                i("Decoded result " + zVarE, null, jElapsedRealtimeNanos);
            }
            return zVarE;
        } finally {
            dVar.b();
        }
    }

    @Override // n1.f
    public final void c(InterfaceC2639e interfaceC2639e, Object obj, com.bumptech.glide.load.data.d dVar, int i, InterfaceC2639e interfaceC2639e2) {
        this.f22211K = interfaceC2639e;
        this.M = obj;
        this.f22213N = dVar;
        this.f22220U = i;
        this.f22212L = interfaceC2639e2;
        this.f22217R = interfaceC2639e != this.f22221a.a().get(0);
        if (Thread.currentThread() != this.f22210J) {
            o(3);
        } else {
            f();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        int iOrdinal = this.f22229j.ordinal() - iVar.f22229j.ordinal();
        return iOrdinal == 0 ? this.f22205E - iVar.f22205E : iOrdinal;
    }

    @Override // I1.b
    public final I1.d d() {
        return this.f22223c;
    }

    public final z e(int i, Object obj) {
        Class<?> cls = obj.getClass();
        h hVar = this.f22221a;
        x xVarC = hVar.c(cls);
        l1.h hVar2 = this.f22203C;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z6 = i == 4 || hVar.f22201r;
            C2641g c2641g = u1.p.i;
            Boolean bool = (Boolean) hVar2.c(c2641g);
            if (bool == null || (bool.booleanValue() && !z6)) {
                hVar2 = new l1.h();
                H1.c cVar = this.f22203C.f21823b;
                H1.c cVar2 = hVar2.f21823b;
                cVar2.g(cVar);
                cVar2.put(c2641g, Boolean.valueOf(z6));
            }
        }
        l1.h hVar3 = hVar2;
        com.bumptech.glide.load.data.f fVarH = this.f22228h.b().h(obj);
        try {
            return xVarC.a(this.f22231l, this.f22232m, new L2.w(i, 15, this), fVarH, hVar3);
        } finally {
            fVarH.b();
        }
    }

    public final void f() throws SecurityException, IllegalArgumentException {
        z zVarB;
        boolean zA;
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            i("Retrieved data", "data: " + this.M + ", cache key: " + this.f22211K + ", fetcher: " + this.f22213N, this.f22206F);
        }
        y yVar = null;
        if (((Map) this.f22208H.f245b).containsKey(com.bumptech.glide.d.class) && (supplier = this.f22209I) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.f22209I.get()).intValue());
            } catch (IllegalArgumentException | SecurityException e6) {
                this.f22209I = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e6);
                }
            }
        }
        try {
            zVarB = b(this.f22213N, this.M, this.f22220U);
        } catch (v e7) {
            InterfaceC2639e interfaceC2639e = this.f22212L;
            int i = this.f22220U;
            e7.f22298b = interfaceC2639e;
            e7.f22299c = i;
            e7.f22300d = null;
            this.f22222b.add(e7);
            zVarB = null;
        }
        if (zVarB == null) {
            q();
            return;
        }
        int i3 = this.f22220U;
        boolean z6 = this.f22217R;
        if (zVarB instanceof w) {
            ((w) zVarB).a();
        }
        if (((y) this.f22226f.f3870d) != null) {
            yVar = (y) y.f22305e.h();
            yVar.f22309d = false;
            yVar.f22308c = true;
            yVar.f22307b = zVarB;
            zVarB = yVar;
        }
        j(zVarB, i3, z6);
        this.f22218S = 5;
        try {
            V2.e eVar = this.f22226f;
            if (((y) eVar.f3870d) != null) {
                H1.h hVar = this.f22224d;
                l1.h hVar2 = this.f22203C;
                eVar.getClass();
                try {
                    hVar.a().i((InterfaceC2639e) eVar.f3868b, new V2.e((l1.k) eVar.f3869c, (y) eVar.f3870d, hVar2, 27));
                    ((y) eVar.f3870d).a();
                } catch (Throwable th) {
                    ((y) eVar.f3870d).a();
                    throw th;
                }
            }
            C1347j2 c1347j2 = this.f22227g;
            synchronized (c1347j2) {
                c1347j2.f14863b = true;
                zA = c1347j2.a();
            }
            if (zA) {
                n();
            }
        } finally {
            if (yVar != null) {
                yVar.a();
            }
        }
    }

    public final g g() {
        int iC = AbstractC2984e.c(this.f22218S);
        h hVar = this.f22221a;
        if (iC == 1) {
            return new C2682A(hVar, this);
        }
        if (iC == 2) {
            return new d(hVar.a(), hVar, this);
        }
        if (iC == 3) {
            return new C(hVar, this);
        }
        if (iC == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(AbstractC1135f5.w(this.f22218S)));
    }

    public final int h(int i) {
        boolean z6;
        boolean z7;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            switch (this.f22233n.f22242a) {
                case 0:
                case 1:
                    z6 = false;
                    break;
                default:
                    z6 = true;
                    break;
            }
            if (z6) {
                return 2;
            }
            return h(2);
        }
        if (iC != 1) {
            if (iC == 2) {
                return 4;
            }
            if (iC == 3 || iC == 5) {
                return 6;
            }
            throw new IllegalArgumentException("Unrecognized stage: ".concat(AbstractC1135f5.w(i)));
        }
        switch (this.f22233n.f22242a) {
            case 0:
                z7 = false;
                break;
            case 1:
            default:
                z7 = true;
                break;
        }
        if (z7) {
            return 3;
        }
        return h(3);
    }

    public final void i(String str, String str2, long j6) {
        StringBuilder sbB = AbstractC2984e.b(str, " in ");
        sbB.append(H1.j.a(j6));
        sbB.append(", load key: ");
        sbB.append(this.f22230k);
        sbB.append(str2 != null ? ", ".concat(str2) : "");
        sbB.append(", thread: ");
        sbB.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbB.toString());
    }

    public final void j(z zVar, int i, boolean z6) throws SecurityException, IllegalArgumentException {
        if (((Map) this.f22208H.f245b).containsKey(com.bumptech.glide.d.class)) {
            p();
        }
        s();
        p pVar = this.f22204D;
        synchronized (pVar) {
            pVar.f22278n = zVar;
            pVar.f22258C = i;
            pVar.f22265J = z6;
        }
        pVar.h();
    }

    public final void k() throws SecurityException, IllegalArgumentException {
        if (((Map) this.f22208H.f245b).containsKey(com.bumptech.glide.d.class)) {
            p();
        }
        s();
        v vVar = new v("Failed to load resource", new ArrayList(this.f22222b));
        p pVar = this.f22204D;
        synchronized (pVar) {
            pVar.f22260E = vVar;
        }
        pVar.g();
        l();
    }

    public final void l() {
        boolean zA;
        C1347j2 c1347j2 = this.f22227g;
        synchronized (c1347j2) {
            c1347j2.f14864c = true;
            zA = c1347j2.a();
        }
        if (zA) {
            n();
        }
    }

    public final void m() {
        boolean zA;
        C1347j2 c1347j2 = this.f22227g;
        synchronized (c1347j2) {
            c1347j2.f14862a = true;
            zA = c1347j2.a();
        }
        if (zA) {
            n();
        }
    }

    public final void n() {
        C1347j2 c1347j2 = this.f22227g;
        synchronized (c1347j2) {
            c1347j2.f14863b = false;
            c1347j2.f14862a = false;
            c1347j2.f14864c = false;
        }
        V2.e eVar = this.f22226f;
        eVar.f3868b = null;
        eVar.f3869c = null;
        eVar.f3870d = null;
        h hVar = this.f22221a;
        hVar.f22187c = null;
        hVar.f22188d = null;
        hVar.f22197n = null;
        hVar.f22191g = null;
        hVar.f22194k = null;
        hVar.i = null;
        hVar.f22198o = null;
        hVar.f22193j = null;
        hVar.f22199p = null;
        hVar.f22185a.clear();
        hVar.f22195l = false;
        hVar.f22186b.clear();
        hVar.f22196m = false;
        this.f22215P = false;
        this.f22228h = null;
        this.i = null;
        this.f22203C = null;
        this.f22229j = null;
        this.f22230k = null;
        this.f22204D = null;
        this.f22218S = 0;
        this.f22214O = null;
        this.f22210J = null;
        this.f22211K = null;
        this.M = null;
        this.f22220U = 0;
        this.f22213N = null;
        this.f22206F = 0L;
        this.f22216Q = false;
        this.f22207G = null;
        this.f22222b.clear();
        this.f22225e.d(this);
    }

    public final void o(int i) {
        this.f22219T = i;
        p pVar = this.f22204D;
        (pVar.f22277m ? pVar.i : pVar.f22273h).execute(this);
    }

    public final void p() throws SecurityException, IllegalArgumentException {
        if (!((Map) this.f22208H.f245b).containsKey(com.bumptech.glide.d.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.f22209I;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e6) {
            this.f22209I = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e6);
            }
        }
    }

    public final void q() throws SecurityException, IllegalArgumentException {
        this.f22210J = Thread.currentThread();
        int i = H1.j.f1768b;
        this.f22206F = SystemClock.elapsedRealtimeNanos();
        boolean zB = false;
        while (!this.f22216Q && this.f22214O != null && !(zB = this.f22214O.b())) {
            this.f22218S = h(this.f22218S);
            this.f22214O = g();
            if (this.f22218S == 4) {
                o(2);
                return;
            }
        }
        if ((this.f22218S == 6 || this.f22216Q) && !zB) {
            k();
        }
    }

    public final void r() throws SecurityException, IllegalArgumentException {
        int iC = AbstractC2984e.c(this.f22219T);
        if (iC == 0) {
            this.f22218S = h(1);
            this.f22214O = g();
            q();
        } else if (iC == 1) {
            q();
        } else if (iC == 2) {
            f();
        } else {
            int i = this.f22219T;
            throw new IllegalStateException("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.d dVar = this.f22213N;
        try {
            try {
                if (this.f22216Q) {
                    k();
                    if (dVar != null) {
                        dVar.b();
                        return;
                    }
                    return;
                }
                r();
                if (dVar != null) {
                    dVar.b();
                }
            } catch (C2685c e6) {
                throw e6;
            } catch (Throwable th) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f22216Q + ", stage: " + AbstractC1135f5.w(this.f22218S), th);
                }
                if (this.f22218S != 5) {
                    this.f22222b.add(th);
                    k();
                }
                if (!this.f22216Q) {
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

    public final void s() {
        Throwable th;
        this.f22223c.a();
        if (!this.f22215P) {
            this.f22215P = true;
            return;
        }
        if (this.f22222b.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.f22222b;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }
}
