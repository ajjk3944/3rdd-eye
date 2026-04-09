package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mt0 {

    /* renamed from: c, reason: collision with root package name */
    public final rt0 f14008c;

    /* renamed from: d, reason: collision with root package name */
    public final kh0 f14009d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f14010e;

    /* renamed from: f, reason: collision with root package name */
    public volatile ConnectivityManager f14011f;

    /* renamed from: h, reason: collision with root package name */
    public final tb.a f14012h;

    /* renamed from: i, reason: collision with root package name */
    public AtomicInteger f14013i;
    public final AtomicBoolean g = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f14006a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f14007b = new ConcurrentHashMap();

    public mt0(rt0 rt0Var, kh0 kh0Var, Context context, tb.a aVar) {
        this.f14008c = rt0Var;
        this.f14009d = kh0Var;
        this.f14010e = context;
        this.f14012h = aVar;
    }

    public static String b(String str, pa.b bVar) {
        String strName = bVar == null ? "NULL" : bVar.name();
        return r5.c.m(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(strName).length()), str, "#", strName);
    }

    public final synchronized void a(ArrayList arrayList, va.p0 p0Var) {
        try {
            if (!this.g.getAndSet(true)) {
                if (this.f14011f == null) {
                    synchronized (this) {
                        if (this.f14011f == null) {
                            try {
                                this.f14011f = (ConnectivityManager) this.f14010e.getSystemService("connectivity");
                            } catch (ClassCastException e2) {
                                za.i.i("Failed to get connectivity manager", e2);
                            }
                        }
                    }
                }
                if (!tb.b.g() || this.f14011f == null) {
                    this.f14013i = new AtomicInteger(((Integer) va.s.f36163e.f36166c.a(sk.I)).intValue());
                } else {
                    try {
                        this.f14011f.registerDefaultNetworkCallback(new se(this));
                    } catch (RuntimeException e10) {
                        za.i.i("Failed to register network callback", e10);
                        this.f14013i = new AtomicInteger(((Integer) va.s.f36163e.f36166c.a(sk.I)).intValue());
                    }
                }
                ua.j.C.g.f(new zh(this));
            }
            ArrayList arrayListE = e(arrayList);
            EnumMap enumMap = new EnumMap(pa.b.class);
            int size = arrayListE.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayListE.get(i4);
                i4++;
                va.t2 t2Var = (va.t2) obj;
                String str = t2Var.f36170a;
                pa.b bVarA = pa.b.a(t2Var.f36171b);
                it0 it0VarA = this.f14008c.a(t2Var, p0Var);
                if (bVarA != null && it0VarA != null) {
                    AtomicInteger atomicInteger = this.f14013i;
                    if (atomicInteger != null) {
                        it0VarA.p(atomicInteger.get());
                    }
                    kh0 kh0Var = this.f14009d;
                    it0VarA.f12442r = kh0Var;
                    f(b(str, bVarA), it0VarA);
                    ac.k kVar = za.d.f38136b;
                    enumMap.put((EnumMap) bVarA, (pa.b) Integer.valueOf(((Integer) (enumMap.containsKey(bVarA) ? enumMap.get(bVarA) : 0)).intValue() + 1));
                    nt0 nt0Var = new nt0(new pq0(29, str, bVarA));
                    int i10 = t2Var.f36173d;
                    this.f14012h.getClass();
                    kh0Var.p(i10, System.currentTimeMillis(), nt0Var, "1");
                }
            }
            kh0 kh0Var2 = this.f14009d;
            this.f14012h.getClass();
            kh0Var2.x(enumMap, System.currentTimeMillis());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c(boolean z3) {
        synchronized (this) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16410y)).booleanValue()) {
                d(z3);
            }
        }
    }

    public final synchronized void d(boolean z3) {
        try {
            if (z3) {
                Iterator it = this.f14006a.values().iterator();
                while (it.hasNext()) {
                    ((it0) it.next()).n();
                }
            } else {
                Iterator it2 = this.f14006a.values().iterator();
                while (it2.hasNext()) {
                    ((it0) it2.next()).g.set(false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00fe A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0015, B:8:0x0034, B:10:0x003c, B:13:0x004b, B:14:0x0051, B:16:0x0059, B:18:0x0067, B:19:0x0076, B:20:0x007a, B:21:0x007e, B:22:0x0088, B:24:0x008e, B:26:0x00a0, B:27:0x00b5, B:28:0x00bf, B:30:0x00c5, B:32:0x00ee, B:35:0x0101, B:37:0x0107, B:34:0x00fe), top: B:43:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.ArrayList e(java.util.List r9) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mt0.e(java.util.List):java.util.ArrayList");
    }

    public final synchronized void f(String str, it0 it0Var) {
        it0Var.j();
        this.f14006a.put(str, it0Var);
    }

    public final synchronized boolean g(String str, pa.b bVar) {
        boolean z3;
        try {
            this.f14012h.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            it0 it0VarI = i(str, bVar);
            z3 = it0VarI != null && it0VarI.l();
            Long lValueOf = z3 ? Long.valueOf(System.currentTimeMillis()) : null;
            nt0 nt0Var = new nt0(new pq0(29, str, bVar));
            int iR = 0;
            kh0 kh0Var = this.f14009d;
            int i4 = it0VarI == null ? 0 : it0VarI.f12431e.f36173d;
            if (it0VarI != null) {
                iR = it0VarI.r();
            }
            kh0Var.z(i4, iR, jCurrentTimeMillis, lValueOf, it0VarI != null ? it0VarI.o() : null, nt0Var, "1");
        } catch (Throwable th2) {
            throw th2;
        }
        return z3;
    }

    public final synchronized Object h(Class cls, String str, pa.b bVar) {
        nt0 nt0Var = new nt0(new pq0(29, str, bVar));
        kh0 kh0Var = this.f14009d;
        this.f14012h.getClass();
        kh0Var.D("poll_ad", "ppac_ts", System.currentTimeMillis(), -1, -1, null, nt0Var, "1");
        it0 it0VarI = i(str, bVar);
        if (it0VarI == null) {
            return null;
        }
        try {
            String strO = it0VarI.o();
            Object objM = it0VarI.m();
            Object objCast = objM == null ? null : cls.cast(objM);
            if (objCast != null) {
                kh0Var.A(System.currentTimeMillis(), it0VarI.f12431e.f36173d, it0VarI.r(), strO, nt0Var, "1");
            }
            return objCast;
        } catch (ClassCastException e2) {
            ua.j.C.f35265h.f("PreloadAdManager.pollAd", e2);
            ya.a0.n("Unable to cast ad to the requested type:".concat(cls.getName()), e2);
            return null;
        }
    }

    public final synchronized it0 i(String str, pa.b bVar) {
        return (it0) this.f14006a.get(b(str, bVar));
    }
}
