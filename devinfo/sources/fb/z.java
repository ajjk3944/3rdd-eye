package fb;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.internal.ads.ex;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.ud0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f23995a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f23996b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Context f23997c;

    /* renamed from: d, reason: collision with root package name */
    public final ud0 f23998d;

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorService f23999e;

    public z(Context context, ud0 ud0Var, ex exVar) {
        this.f23997c = context;
        this.f23998d = ud0Var;
        this.f23999e = exVar;
    }

    public final synchronized void a(Object obj, ib.a aVar) throws Throwable {
        try {
            try {
                ua.j.C.f35267k.getClass();
                Pair pair = new Pair(aVar, Long.valueOf(System.currentTimeMillis()));
                fx.f11279f.execute(new b4.o(this, obj, pair, false, 14));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0001, B:5:0x0011, B:10:0x0027, B:12:0x002b, B:18:0x0035, B:20:0x0039, B:22:0x004a, B:26:0x0054, B:29:0x0074, B:30:0x0078, B:32:0x007e, B:21:0x0042, B:17:0x0032), top: B:38:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b(boolean r10, fb.b0 r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.HashMap r0 = r9.f23995a     // Catch: java.lang.Throwable -> L30
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L30
            fb.b0 r2 = (fb.b0) r2     // Catch: java.lang.Throwable -> L30
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            ua.j r5 = ua.j.C     // Catch: java.lang.Throwable -> L30
            tb.a r5 = r5.f35267k     // Catch: java.lang.Throwable -> L30
            r5.getClass()     // Catch: java.lang.Throwable -> L30
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L30
            long r7 = r2.f23878c     // Catch: java.lang.Throwable -> L30
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 > 0) goto L24
            r5 = r3
            goto L25
        L24:
            r5 = r4
        L25:
            if (r5 != 0) goto L32
            o7.d r2 = r2.f23876a     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L32
            o7.d r2 = r11.f23876a     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L35
            goto L32
        L30:
            r10 = move-exception
            goto L8a
        L32:
            r0.put(r1, r11)     // Catch: java.lang.Throwable -> L30
        L35:
            o7.d r0 = r11.f23876a     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L42
            com.google.android.gms.internal.ads.oa r0 = com.google.android.gms.internal.ads.zl.f19115f     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r0.u()     // Catch: java.lang.Throwable -> L30
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L30
            goto L4a
        L42:
            com.google.android.gms.internal.ads.oa r0 = com.google.android.gms.internal.ads.zl.g     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r0.u()     // Catch: java.lang.Throwable -> L30
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L30
        L4a:
            long r5 = r0.longValue()     // Catch: java.lang.Throwable -> L30
            o7.d r0 = r11.f23876a     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L53
            goto L54
        L53:
            r3 = r4
        L54:
            com.google.android.gms.internal.ads.dx r0 = com.google.android.gms.internal.ads.fx.f11277d     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.internal.ads.vq0 r2 = new com.google.android.gms.internal.ads.vq0     // Catch: java.lang.Throwable -> L30
            r7 = 1
            r2.<init>(r7, r9, r10, r3)     // Catch: java.lang.Throwable -> L30
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L30
            r0.schedule(r2, r5, r10)     // Catch: java.lang.Throwable -> L30
            java.util.HashMap r10 = r9.f23996b     // Catch: java.lang.Throwable -> L30
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
        throw new UnsupportedOperationException("Method not decompiled: fb.z.b(boolean, fb.b0):void");
    }

    public final void c(boolean z3) {
        Boolean boolValueOf = Boolean.valueOf(z3);
        HashMap map = this.f23996b;
        if (map.containsKey(boolValueOf)) {
            return;
        }
        map.put(boolValueOf, new ArrayList());
        this.f23999e.submit(new bi.a(5, this, z3));
    }

    public final synchronized void d(boolean z3, boolean z10) {
        Throwable th2;
        try {
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            bundle.putBoolean("accept_3p_cookie", z3);
            HashMap map = this.f23995a;
            Boolean boolValueOf = Boolean.valueOf(z3);
            b0 b0Var = (b0) map.get(boolValueOf);
            int i4 = 0;
            if (z10 && b0Var != null) {
                try {
                    i4 = b0Var.f23879d + 1;
                } catch (Throwable th4) {
                    th2 = th4;
                    throw th2;
                }
            }
            b0 b0Var2 = (b0) map.get(boolValueOf);
            a0 a0Var = new a0(this, z3, i4, b0Var2 == null ? null : Boolean.valueOf(b0Var2.f23880e.get()), this.f23998d);
            pa.g gVar = new pa.g((pa.f) new pa.f(7).l(bundle));
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16294qc)).booleanValue()) {
                this.f23999e.submit(new com.google.android.gms.internal.consent_sdk.i(this, gVar, a0Var, 3));
            } else {
                o7.d.m(this.f23997c, gVar, a0Var);
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public final void e(b0 b0Var, Pair pair, boolean z3) {
        b0Var.f23880e.set(true);
        o7.d dVar = b0Var.f23876a;
        if (dVar != null) {
            ((ib.a) pair.first).b(dVar);
        } else {
            ((ib.a) pair.first).a(b0Var.f23877b);
        }
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        ua.j.C.f35267k.getClass();
        u6.t.B(this.f23998d, "sgpcr", pair2, pair3, pair4, pair5, new Pair("lat_ms", Long.toString(System.currentTimeMillis() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z3)), new Pair("sgpc_rs", Boolean.toString(dVar != null)));
    }
}
