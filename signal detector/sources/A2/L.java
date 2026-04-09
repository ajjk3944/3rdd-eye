package A2;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.internal.ads.AbstractC0640Nf;
import com.google.android.gms.internal.ads.C0623Mf;
import com.google.android.gms.internal.ads.C0852Zn;
import com.google.android.gms.internal.ads.H9;
import j2.C2550f;
import j2.C2551g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import q2.C2841s;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f182a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f183b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Context f184c;

    /* renamed from: d, reason: collision with root package name */
    public final C0852Zn f185d;

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorService f186e;

    public L(Context context, C0852Zn c0852Zn, C0623Mf c0623Mf) {
        this.f184c = context;
        this.f185d = c0852Zn;
        this.f186e = c0623Mf;
    }

    public final synchronized void a(Object obj, D2.a aVar) {
        p2.j.f22785C.f22797k.getClass();
        AbstractC0640Nf.f10010f.execute(new C(this, obj, new Pair(aVar, Long.valueOf(System.currentTimeMillis())), 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0001, B:5:0x0011, B:10:0x0027, B:12:0x002b, B:18:0x0035, B:20:0x0039, B:22:0x004a, B:26:0x0054, B:29:0x0074, B:30:0x0078, B:32:0x007e, B:21:0x0042, B:17:0x0032), top: B:38:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b(boolean r10, A2.N r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.HashMap r0 = r9.f182a     // Catch: java.lang.Throwable -> L30
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L30
            A2.N r2 = (A2.N) r2     // Catch: java.lang.Throwable -> L30
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            p2.j r5 = p2.j.f22785C     // Catch: java.lang.Throwable -> L30
            Q2.a r5 = r5.f22797k     // Catch: java.lang.Throwable -> L30
            r5.getClass()     // Catch: java.lang.Throwable -> L30
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L30
            long r7 = r2.f195c     // Catch: java.lang.Throwable -> L30
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 > 0) goto L24
            r5 = r3
            goto L25
        L24:
            r5 = r4
        L25:
            if (r5 != 0) goto L32
            A2.e r2 = r2.f193a     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L32
            A2.e r2 = r11.f193a     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L35
            goto L32
        L30:
            r10 = move-exception
            goto L8a
        L32:
            r0.put(r1, r11)     // Catch: java.lang.Throwable -> L30
        L35:
            A2.e r0 = r11.f193a     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L42
            com.google.android.gms.internal.ads.J4 r0 = com.google.android.gms.internal.ads.AbstractC1642oa.f15960f     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r0.v()     // Catch: java.lang.Throwable -> L30
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L30
            goto L4a
        L42:
            com.google.android.gms.internal.ads.J4 r0 = com.google.android.gms.internal.ads.AbstractC1642oa.f15961g     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r0.v()     // Catch: java.lang.Throwable -> L30
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L30
        L4a:
            long r5 = r0.longValue()     // Catch: java.lang.Throwable -> L30
            A2.e r0 = r11.f193a     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L53
            goto L54
        L53:
            r3 = r4
        L54:
            com.google.android.gms.internal.ads.Lf r0 = com.google.android.gms.internal.ads.AbstractC0640Nf.f10008d     // Catch: java.lang.Throwable -> L30
            A2.K r2 = new A2.K     // Catch: java.lang.Throwable -> L30
            r7 = 0
            r2.<init>(r9, r10, r3, r7)     // Catch: java.lang.Throwable -> L30
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L30
            r0.schedule(r2, r5, r10)     // Catch: java.lang.Throwable -> L30
            java.util.HashMap r10 = r9.f183b     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r10.get(r1)     // Catch: java.lang.Throwable -> L30
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L30
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30
            r2.<init>()     // Catch: java.lang.Throwable -> L30
            r10.put(r1, r2)     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L74
            goto L88
        L74:
            java.util.Iterator r10 = r0.iterator()     // Catch: java.lang.Throwable -> L30
        L78:
            boolean r0 = r10.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L88
            java.lang.Object r0 = r10.next()     // Catch: java.lang.Throwable -> L30
            android.util.Pair r0 = (android.util.Pair) r0     // Catch: java.lang.Throwable -> L30
            r9.e(r11, r0, r4)     // Catch: java.lang.Throwable -> L30
            goto L78
        L88:
            monitor-exit(r9)
            return
        L8a:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L30
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.L.b(boolean, A2.N):void");
    }

    public final void c(boolean z6) {
        Boolean boolValueOf = Boolean.valueOf(z6);
        HashMap map = this.f183b;
        if (map.containsKey(boolValueOf)) {
            return;
        }
        map.put(boolValueOf, new ArrayList());
        this.f186e.submit(new A1.q(this, z6, 2));
    }

    public final synchronized void d(boolean z6, boolean z7) {
        Throwable th;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            bundle.putBoolean("accept_3p_cookie", z6);
            HashMap map = this.f182a;
            Boolean boolValueOf = Boolean.valueOf(z6);
            N n6 = (N) map.get(boolValueOf);
            int i = 0;
            if (z7 && n6 != null) {
                try {
                    i = n6.f196d + 1;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
            N n7 = (N) map.get(boolValueOf);
            M m6 = new M(this, z6, i, n7 == null ? null : Boolean.valueOf(n7.f197e.get()), this.f185d);
            C2551g c2551g = new C2551g((C2550f) new C2550f(1).b(bundle));
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.oc)).booleanValue()) {
                this.f186e.submit(new CallableC0119g(this, c2551g, m6, 2));
            } else {
                C0117e.t(this.f184c, c2551g, m6);
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final void e(N n6, Pair pair, boolean z6) {
        n6.f197e.set(true);
        C0117e c0117e = n6.f193a;
        if (c0117e != null) {
            ((D2.a) pair.first).b(c0117e);
        } else {
            ((D2.a) pair.first).a(n6.f194b);
        }
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        p2.j.f22785C.f22797k.getClass();
        I5.b.D(this.f185d, "sgpcr", pair2, pair3, pair4, pair5, new Pair("lat_ms", Long.toString(System.currentTimeMillis() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z6)), new Pair("sgpc_rs", Boolean.toString(c0117e != null)));
    }
}
