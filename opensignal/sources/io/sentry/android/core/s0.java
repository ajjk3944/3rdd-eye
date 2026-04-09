package io.sentry.android.core;

import io.sentry.f2;
import io.sentry.k6;
import io.sentry.n6;
import io.sentry.o6;
import io.sentry.t4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p.v2;

/* loaded from: classes.dex */
public final class s0 implements io.sentry.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final v2 f11770a;

    /* renamed from: d, reason: collision with root package name */
    public final SentryAndroidOptions f11771d;

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.util.a f11772g = new io.sentry.util.a();

    public s0(SentryAndroidOptions sentryAndroidOptions, v2 v2Var) {
        ir.f0.T(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f11771d = sentryAndroidOptions;
        this.f11770a = v2Var;
    }

    public static void a(io.sentry.android.core.performance.f fVar, io.sentry.protocol.a0 a0Var) {
        n6 n6Var;
        if (fVar.f11726a != io.sentry.android.core.performance.e.COLD) {
            return;
        }
        io.sentry.protocol.c cVar = a0Var.f12269d;
        ArrayList arrayList = a0Var.O;
        k6 k6VarH = cVar.h();
        if (k6VarH == null) {
            return;
        }
        io.sentry.protocol.t tVar = k6VarH.f12412a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                n6Var = null;
                break;
            }
            io.sentry.protocol.w wVar = (io.sentry.protocol.w) it.next();
            if (wVar.f12650y.contentEquals("app.start.cold")) {
                n6Var = wVar.f12648r;
                break;
            }
        }
        io.sentry.android.core.performance.g gVar = new io.sentry.android.core.performance.g();
        io.sentry.android.core.performance.g gVar2 = fVar.f11728g;
        long j = gVar2.f11733d;
        long j7 = gVar2.f11734g;
        long j10 = io.sentry.android.core.performance.f.K;
        gVar.f11732a = "Process Initialization";
        gVar.f11733d = j;
        gVar.f11734g = j7;
        gVar.f11735r = j10;
        if (gVar.b() && Math.abs(gVar.a()) <= 10000) {
            arrayList.add(e(gVar, n6Var, tVar, "process.load"));
        }
        ArrayList arrayList2 = new ArrayList(fVar.f11731y.values());
        Collections.sort(arrayList2);
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(e((io.sentry.android.core.performance.g) it2.next(), n6Var, tVar, "contentprovider.load"));
            }
        }
        io.sentry.android.core.performance.g gVar3 = fVar.f11730x;
        if (gVar3.f11735r != 0) {
            arrayList.add(e(gVar3, n6Var, tVar, "application.load"));
        }
    }

    public static boolean c(io.sentry.protocol.a0 a0Var) {
        Iterator it = a0Var.O.iterator();
        while (it.hasNext()) {
            io.sentry.protocol.w wVar = (io.sentry.protocol.w) it.next();
            if (wVar.f12650y.contentEquals("app.start.cold") || wVar.f12650y.contentEquals("app.start.warm")) {
                return true;
            }
        }
        k6 k6VarH = a0Var.f12269d.h();
        if (k6VarH == null) {
            return false;
        }
        String str = k6VarH.f12416x;
        return str.equals("app.start.cold") || str.equals("app.start.warm");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(io.sentry.protocol.a0 r11) {
        /*
            java.util.ArrayList r11 = r11.O
            java.util.Iterator r0 = r11.iterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r0.next()
            io.sentry.protocol.w r3 = (io.sentry.protocol.w) r3
            java.lang.String r4 = "ui.load.initial_display"
            java.lang.String r5 = r3.f12650y
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L20
            r1 = r3
            goto L2b
        L20:
            java.lang.String r4 = "ui.load.full_display"
            java.lang.String r5 = r3.f12650y
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L2b
            r2 = r3
        L2b:
            if (r1 == 0) goto L8
            if (r2 == 0) goto L8
        L2f:
            if (r1 != 0) goto L35
            if (r2 != 0) goto L35
            goto Lc7
        L35:
            java.util.Iterator r11 = r11.iterator()
        L39:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lc7
            java.lang.Object r0 = r11.next()
            io.sentry.protocol.w r0 = (io.sentry.protocol.w) r0
            if (r0 == r1) goto L39
            if (r0 != r2) goto L4a
            goto L39
        L4a:
            java.util.Map r3 = r0.G
            java.lang.Double r4 = r0.f12645a
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L65
            java.lang.String r7 = "thread.name"
            java.lang.Object r3 = r3.get(r7)
            if (r3 == 0) goto L65
            java.lang.String r7 = "main"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L63
            goto L65
        L63:
            r3 = r5
            goto L66
        L65:
            r3 = r6
        L66:
            if (r1 == 0) goto L86
            double r7 = r4.doubleValue()
            java.lang.Double r9 = r1.f12645a
            double r9 = r9.doubleValue()
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 < 0) goto L86
            java.lang.Double r9 = r1.f12646d
            if (r9 == 0) goto L82
            double r9 = r9.doubleValue()
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 > 0) goto L86
        L82:
            if (r3 == 0) goto L86
            r3 = r6
            goto L87
        L86:
            r3 = r5
        L87:
            if (r2 == 0) goto La4
            double r7 = r4.doubleValue()
            java.lang.Double r4 = r2.f12645a
            double r9 = r4.doubleValue()
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 < 0) goto La4
            java.lang.Double r4 = r2.f12646d
            if (r4 == 0) goto La3
            double r9 = r4.doubleValue()
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 > 0) goto La4
        La3:
            r5 = r6
        La4:
            if (r3 != 0) goto La8
            if (r5 == 0) goto L39
        La8:
            java.util.Map r4 = r0.G
            if (r4 != 0) goto Lb3
            java.util.concurrent.ConcurrentHashMap r4 = new java.util.concurrent.ConcurrentHashMap
            r4.<init>()
            r0.G = r4
        Lb3:
            if (r3 == 0) goto Lbc
            java.lang.String r0 = "ui.contributes_to_ttid"
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r4.put(r0, r3)
        Lbc:
            if (r5 == 0) goto L39
            java.lang.String r0 = "ui.contributes_to_ttfd"
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r4.put(r0, r3)
            goto L39
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.s0.d(io.sentry.protocol.a0):void");
    }

    public static io.sentry.protocol.w e(io.sentry.android.core.performance.g gVar, n6 n6Var, io.sentry.protocol.t tVar, String str) {
        long jA;
        HashMap map = new HashMap(2);
        map.put("thread.id", Long.valueOf(io.sentry.android.core.internal.util.e.f11648b));
        map.put("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        map.put("ui.contributes_to_ttid", bool);
        map.put("ui.contributes_to_ttfd", bool);
        Double dValueOf = Double.valueOf(gVar.f11733d / 1000.0d);
        if (gVar.b()) {
            jA = gVar.a() + gVar.f11733d;
        } else {
            jA = 0;
        }
        return new io.sentry.protocol.w(dValueOf, Double.valueOf(jA / 1000.0d), tVar, new n6(), n6Var, str, gVar.f11732a, o6.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), map);
    }

    @Override // io.sentry.c0
    public final t4 f(t4 t4Var, io.sentry.h0 h0Var) {
        return t4Var;
    }

    @Override // io.sentry.c0
    public final io.sentry.protocol.a0 h(io.sentry.protocol.a0 a0Var, io.sentry.h0 h0Var) {
        Map map;
        SentryAndroidOptions sentryAndroidOptions = this.f11771d;
        io.sentry.q qVarA = this.f11772g.a();
        try {
            if (!sentryAndroidOptions.isTracingEnabled()) {
                qVarA.close();
                return a0Var;
            }
            io.sentry.android.core.performance.f fVarB = io.sentry.android.core.performance.f.b();
            boolean zC = c(a0Var);
            HashMap map2 = a0Var.P;
            io.sentry.protocol.c cVar = a0Var.f12269d;
            if (zC) {
                if (fVarB.H && fVarB.f11727d) {
                    long jA = fVarB.a(sentryAndroidOptions).a();
                    if (jA != 0) {
                        map2.put(fVarB.f11726a == io.sentry.android.core.performance.e.COLD ? "app_start_cold" : "app_start_warm", new io.sentry.protocol.j(f2.MILLISECOND.apiName(), Float.valueOf(jA)));
                        a(fVarB, a0Var);
                        fVarB.H = false;
                        fVarB.f11731y.clear();
                        fVarB.B.clear();
                    }
                }
                io.sentry.protocol.a aVarD = cVar.d();
                if (aVarD == null) {
                    aVarD = new io.sentry.protocol.a();
                    cVar.l(aVarD);
                }
                aVarD.F = fVarB.f11726a == io.sentry.android.core.performance.e.COLD ? "cold" : "warm";
            }
            d(a0Var);
            io.sentry.protocol.t tVar = a0Var.f12268a;
            k6 k6VarH = cVar.h();
            if (tVar != null && k6VarH != null && k6VarH.f12416x.contentEquals("ui.load")) {
                v2 v2Var = this.f11770a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) v2Var.f20203r;
                io.sentry.q qVarA2 = ((io.sentry.util.a) v2Var.B).a();
                try {
                    if (v2Var.f()) {
                        Map map3 = (Map) concurrentHashMap.get(tVar);
                        concurrentHashMap.remove(tVar);
                        qVarA2.close();
                        map = map3;
                    } else {
                        qVarA2.close();
                        map = null;
                    }
                    if (map != null) {
                        map2.putAll(map);
                    }
                } finally {
                }
            }
            qVarA.close();
            return a0Var;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
