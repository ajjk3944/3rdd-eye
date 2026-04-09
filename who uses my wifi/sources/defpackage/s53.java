package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class s53 {
    public final Context a;
    public final Set b;
    public final Executor c;
    public final da3 d;
    public final mv2 e;
    public long f = 0;
    public int g = 0;

    public s53(Context context, ld2 ld2Var, Set set, da3 da3Var, mv2 mv2Var) {
        this.a = context;
        this.c = ld2Var;
        this.b = set;
        this.d = da3Var;
        this.e = mv2Var;
    }

    public final cq3 a(final Object obj, final Bundle bundle, final boolean z) {
        aa3 aa3VarL = aa3.l(this.a, 8);
        aa3VarL.a();
        Set<q53> set = this.b;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        iz1 iz1Var = mz1.yc;
        tw1 tw1Var = tw1.e;
        kz1 kz1Var = tw1Var.c;
        kz1 kz1Var2 = tw1Var.c;
        if (!((String) kz1Var.a(iz1Var)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) kz1Var2.a(iz1Var)).split(","));
        }
        List list = arrayList2;
        hg4 hg4Var = hg4.C;
        hg4Var.k.getClass();
        this.f = SystemClock.elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) kz1Var2.a(mz1.m2)).booleanValue() && bundle != null) {
            hg4Var.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (obj instanceof jm2) {
                bundle.putLong("client-signals-start", jCurrentTimeMillis);
            } else {
                bundle.putLong("gms-signals-start", jCurrentTimeMillis);
            }
        }
        for (q53 q53Var : set) {
            if (!list.contains(String.valueOf(q53Var.d()))) {
                hg4.C.k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                n70 n70VarA = q53Var.a();
                n70VarA.c(new ef2(this, jElapsedRealtime, q53Var, bundle2), md2.g);
                arrayList.add(n70VarA);
            }
        }
        xm3 xm3VarM = xm3.m(arrayList);
        Callable callable = new Callable() { // from class: r53
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle3;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    obj2 = obj;
                    if (!zHasNext) {
                        break;
                    }
                    n53 n53Var = (n53) ((n70) it.next()).get();
                    if (n53Var != null) {
                        n53Var.c(obj2);
                        if (z) {
                            n53Var.p(obj2);
                        }
                    }
                }
                if (((Boolean) tw1.e.c.a(mz1.m2)).booleanValue() && (bundle3 = bundle) != null) {
                    hg4.C.k.getClass();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    boolean z2 = obj2 instanceof jm2;
                    Bundle bundle4 = bundle2;
                    if (z2) {
                        bundle3.putLong("client-signals-end", jCurrentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                        return obj2;
                    }
                    bundle3.putLong("gms-signals-end", jCurrentTimeMillis2);
                    bundle3.putBundle("gms_sig_latency_key", bundle4);
                }
                return obj2;
            }
        };
        cq3 cq3Var = new cq3(xm3VarM, true, false);
        cq3Var.u = new bq3(cq3Var, callable, this.c);
        cq3Var.v();
        if (ea3.a()) {
            qb1.P(cq3Var, this.d, aa3VarL, false);
        }
        return cq3Var;
    }
}
