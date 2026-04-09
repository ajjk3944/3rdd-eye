package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class s13 implements yp3 {
    public final u93 a;
    public final vm2 b;
    public final db3 c;
    public final eb3 d;
    public final Executor e;
    public final ScheduledExecutorService f;
    public final gl2 g;
    public final o13 h;
    public final e03 i;
    public final Context j;
    public final da3 k;
    public final h2 l;
    public final jv2 m;

    public s13(Context context, u93 u93Var, o13 o13Var, vm2 vm2Var, db3 db3Var, eb3 eb3Var, gl2 gl2Var, ld2 ld2Var, ScheduledExecutorService scheduledExecutorService, e03 e03Var, da3 da3Var, h2 h2Var, jv2 jv2Var) {
        this.j = context;
        this.a = u93Var;
        this.h = o13Var;
        this.b = vm2Var;
        this.c = db3Var;
        this.d = eb3Var;
        this.g = gl2Var;
        this.e = ld2Var;
        this.f = scheduledExecutorService;
        this.i = e03Var;
        this.k = da3Var;
        this.l = h2Var;
        this.m = jv2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(defpackage.h83 r6) {
        /*
            iz1 r0 = defpackage.mz1.X5
            tw1 r1 = defpackage.tw1.e
            kz1 r2 = r1.c
            java.lang.Object r0 = r2.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r2 = "No fill."
            r3 = 1
            if (r3 == r0) goto L18
            java.lang.String r0 = "No ad config."
            goto L19
        L18:
            r0 = r2
        L19:
            p21 r6 = r6.b
            java.lang.Object r6 = r6.g
            c83 r6 = (defpackage.c83) r6
            int r3 = r6.f
            if (r3 == 0) goto L5b
            r4 = 200(0xc8, float:2.8E-43)
            r5 = 300(0x12c, float:4.2E-43)
            if (r3 < r4) goto L3c
            if (r3 >= r5) goto L3c
            iz1 r3 = defpackage.mz1.W5
            kz1 r1 = r1.c
            java.lang.Object r1 = r1.a(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L5b
            goto L5c
        L3c:
            if (r3 < r5) goto L45
            r0 = 400(0x190, float:5.6E-43)
            if (r3 >= r0) goto L45
            java.lang.String r2 = "No location header to follow redirect or too many redirects."
            goto L5c
        L45:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 35
            r1.<init>(r0)
            java.lang.String r0 = "Received error HTTP response code: "
            java.lang.String r2 = defpackage.ex0.j(r1, r0, r3)
            goto L5c
        L5b:
            r2 = r0
        L5c:
            ls3 r6 = r6.j
            if (r6 == 0) goto L63
            java.lang.String r6 = r6.b
            return r6
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s13.a(h83):java.lang.String");
    }

    @Override // defpackage.yp3
    public final n70 c(Object obj) {
        n70 n70VarA;
        int i;
        Bundle bundle;
        s13 s13Var = this;
        h83 h83Var = (h83) obj;
        iz1 iz1Var = mz1.m2;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue() && (bundle = (Bundle) h83Var.b.i) != null) {
            s13Var.m.e.putAll(bundle);
        }
        if (((Boolean) tw1Var.c.a(mz1.n2)).booleanValue()) {
            ga1.n(hg4.C.k, s13Var.m.e, "rendering-start");
        }
        String strA = a(h83Var);
        e03 e03Var = s13Var.i;
        p21 p21Var = h83Var.b;
        c83 c83Var = (c83) p21Var.g;
        e03Var.d = c83Var;
        if (((Boolean) tw1Var.c.a(mz1.W8)).booleanValue() && (i = c83Var.f) != 0 && (i < 200 || i >= 300)) {
            return pu1.B(new r13(strA, 3));
        }
        String str = c83Var.q;
        if (!((Boolean) tw1Var.c.a(mz1.V3)).booleanValue() || TextUtils.isEmpty(str)) {
            for (a83 a83Var : (List) p21Var.f) {
                e03Var.b(a83Var, e03Var.a.size());
                Iterator it = a83Var.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        e03Var.c(a83Var, 0L, zt0.Q(1, null, null), false);
                        break;
                    }
                    zz2 zz2VarA = s13Var.g.a((String) it.next(), a83Var.b);
                    if (zz2VarA == null || !zz2VarA.a(h83Var, a83Var)) {
                    }
                }
            }
        } else {
            List list = (List) p21Var.f;
            synchronized (e03Var) {
                Map map = e03Var.b;
                if (map.containsKey(str)) {
                    qh4 qh4Var = (qh4) map.get(str);
                    List list2 = e03Var.a;
                    int iIndexOf = list2.indexOf(qh4Var);
                    try {
                        list2.remove(iIndexOf);
                    } catch (IndexOutOfBoundsException e) {
                        hg4.C.h.d("AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry", e);
                    }
                    e03Var.b.remove(str);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        e03Var.b((a83) it2.next(), iIndexOf);
                        iIndexOf++;
                    }
                }
            }
        }
        vm2 vm2Var = s13Var.b;
        kj2 kj2Var = new kj2(h83Var, s13Var.d, s13Var.c);
        Executor executor = s13Var.e;
        vm2Var.L1(kj2Var, executor);
        if (c83Var.r > 1) {
            h2 h2Var = s13Var.l;
            synchronized (h2Var) {
                try {
                    if (!((AtomicBoolean) h2Var.g).getAndSet(true)) {
                        List list3 = (List) h83Var.b.f;
                        if (list3.isEmpty()) {
                            ((wq3) h2Var.f).e(new r13(a(h83Var), 3));
                        } else {
                            h2Var.i = h83Var;
                            o13 o13Var = (o13) h2Var.d;
                            h2Var.h = new h13(h83Var, o13Var, (wq3) h2Var.f);
                            o13Var.a(list3);
                            for (a83 a83VarA = ((h13) h2Var.h).a(); a83VarA != null; a83VarA = ((h13) h2Var.h).a()) {
                                h2Var.q(a83VarA);
                            }
                        }
                    }
                    n70VarA = (wq3) h2Var.f;
                } finally {
                }
            }
        } else {
            String strA2 = a(h83Var);
            u93 u93Var = s13Var.a;
            s93 s93Var = s93.q;
            Objects.requireNonNull(u93Var);
            n70VarA = new bu1(u93Var, s93Var, null, u93.d, Collections.EMPTY_LIST, pu1.B(new r13(strA2, 3))).A();
            o13 o13Var2 = s13Var.h;
            synchronized (o13Var2) {
                o13Var2.a.getClass();
                o13Var2.i = SystemClock.elapsedRealtime();
            }
            int i2 = 0;
            for (a83 a83Var2 : (List) p21Var.f) {
                Iterator it3 = a83Var2.a.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    String str2 = (String) it3.next();
                    zz2 zz2VarA2 = s13Var.g.a(str2, a83Var2.b);
                    if (zz2VarA2 != null && zz2VarA2.a(h83Var, a83Var2)) {
                        bu1 bu1VarA = u93Var.a(n70VarA, s93.r);
                        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(str2).length());
                        sb.append("render-config-");
                        sb.append(i2);
                        sb.append("-");
                        sb.append(str2);
                        String string = sb.toString();
                        n70 n70Var = (n70) bu1VarA.i;
                        List list4 = (List) bu1VarA.j;
                        n70 n70Var2 = (n70) bu1VarA.k;
                        u93 u93Var2 = (u93) bu1VarA.l;
                        Object obj2 = bu1VarA.g;
                        Objects.requireNonNull(u93Var2);
                        n70VarA = new bu1(u93Var2, obj2, string, n70Var, list4, pu1.L(n70Var2, Throwable.class, new k62(s13Var, a83Var2, h83Var, zz2VarA2, 5), u93Var2.a)).A();
                        break;
                    }
                    s13Var = this;
                }
                i2++;
                s13Var = this;
            }
            n70VarA.c(new bs2(11, o13Var2), executor);
        }
        return n70VarA;
    }
}
