package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jd4 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final Context c;
    public final pv2 d;
    public final ExecutorService e;

    public jd4(Context context, pv2 pv2Var, ld2 ld2Var) {
        this.c = context;
        this.d = pv2Var;
        this.e = ld2Var;
    }

    public final synchronized void a(Object obj, wm0 wm0Var) {
        hg4.C.k.getClass();
        md2.f.execute(new gi(this, obj, new Pair(wm0Var, Long.valueOf(System.currentTimeMillis())), 27));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0001, B:5:0x0011, B:10:0x0027, B:12:0x002b, B:18:0x0035, B:20:0x0039, B:22:0x004a, B:26:0x0054, B:29:0x0073, B:30:0x0077, B:32:0x007d, B:21:0x0042, B:17:0x0032), top: B:38:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b(final boolean r10, defpackage.ge4 r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.HashMap r0 = r9.a     // Catch: java.lang.Throwable -> L30
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L30
            ge4 r2 = (defpackage.ge4) r2     // Catch: java.lang.Throwable -> L30
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            hg4 r5 = defpackage.hg4.C     // Catch: java.lang.Throwable -> L30
            ym r5 = r5.k     // Catch: java.lang.Throwable -> L30
            r5.getClass()     // Catch: java.lang.Throwable -> L30
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L30
            long r7 = r2.c     // Catch: java.lang.Throwable -> L30
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 > 0) goto L24
            r5 = r3
            goto L25
        L24:
            r5 = r4
        L25:
            if (r5 != 0) goto L32
            ug0 r2 = r2.a     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L32
            ug0 r2 = r11.a     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L35
            goto L32
        L30:
            r10 = move-exception
            goto L89
        L32:
            r0.put(r1, r11)     // Catch: java.lang.Throwable -> L30
        L35:
            ug0 r0 = r11.a     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L42
            so1 r0 = defpackage.x02.f     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r0.w()     // Catch: java.lang.Throwable -> L30
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L30
            goto L4a
        L42:
            so1 r0 = defpackage.x02.g     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r0.w()     // Catch: java.lang.Throwable -> L30
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L30
        L4a:
            long r5 = r0.longValue()     // Catch: java.lang.Throwable -> L30
            ug0 r0 = r11.a     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L53
            goto L54
        L53:
            r3 = r4
        L54:
            kd2 r0 = defpackage.md2.d     // Catch: java.lang.Throwable -> L30
            cb4 r2 = new cb4     // Catch: java.lang.Throwable -> L30
            r2.<init>()     // Catch: java.lang.Throwable -> L30
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L30
            r0.schedule(r2, r5, r10)     // Catch: java.lang.Throwable -> L30
            java.util.HashMap r10 = r9.b     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r10.get(r1)     // Catch: java.lang.Throwable -> L30
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L30
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30
            r2.<init>()     // Catch: java.lang.Throwable -> L30
            r10.put(r1, r2)     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L73
            goto L87
        L73:
            java.util.Iterator r10 = r0.iterator()     // Catch: java.lang.Throwable -> L30
        L77:
            boolean r0 = r10.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L87
            java.lang.Object r0 = r10.next()     // Catch: java.lang.Throwable -> L30
            android.util.Pair r0 = (android.util.Pair) r0     // Catch: java.lang.Throwable -> L30
            r9.e(r11, r0, r4)     // Catch: java.lang.Throwable -> L30
            goto L77
        L87:
            monitor-exit(r9)
            return
        L89:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L30
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd4.b(boolean, ge4):void");
    }

    public final void c(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        HashMap map = this.b;
        if (map.containsKey(boolValueOf)) {
            return;
        }
        map.put(boolValueOf, new ArrayList());
        this.e.submit(new n82(this, z, 3));
    }

    public final synchronized void d(boolean z, boolean z2) throws Throwable {
        Throwable th;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            bundle.putBoolean("accept_3p_cookie", z);
            HashMap map = this.a;
            Boolean boolValueOf = Boolean.valueOf(z);
            ge4 ge4Var = (ge4) map.get(boolValueOf);
            int i = 0;
            if (z2 && ge4Var != null) {
                try {
                    i = ge4Var.d + 1;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
            ge4 ge4Var2 = (ge4) map.get(boolValueOf);
            td4 td4Var = new td4(this, z, i, ge4Var2 == null ? null : Boolean.valueOf(ge4Var2.e.get()), this.d);
            b3 b3Var = new b3((a3) new a3(1).i1(bundle));
            if (((Boolean) tw1.e.c.a(mz1.Rb)).booleanValue()) {
                this.e.submit(new yi1(this, b3Var, td4Var, 6));
            } else {
                ug0.r(this.c, b3Var, td4Var);
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final void e(ge4 ge4Var, Pair pair, boolean z) {
        ge4Var.e.set(true);
        ug0 ug0Var = ge4Var.a;
        if (ug0Var != null) {
            ((wm0) pair.first).b(ug0Var);
        } else {
            ((wm0) pair.first).a(ge4Var.b);
        }
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        hg4.C.k.getClass();
        a30.B(this.d, "sgpcr", pair2, pair3, pair4, pair5, new Pair("lat_ms", Long.toString(System.currentTimeMillis() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z)), new Pair("sgpc_rs", Boolean.toString(ug0Var != null)));
    }
}
