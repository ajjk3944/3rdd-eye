package com.google.android.gms.internal.ads;

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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tn0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16885a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f16886b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f16887c;

    /* renamed from: d, reason: collision with root package name */
    public final bs0 f16888d;

    /* renamed from: e, reason: collision with root package name */
    public final qd0 f16889e;

    /* renamed from: f, reason: collision with root package name */
    public long f16890f = 0;
    public int g = 0;

    public tn0(Context context, ex exVar, Set set, bs0 bs0Var, qd0 qd0Var) {
        this.f16885a = context;
        this.f16887c = exVar;
        this.f16886b = set;
        this.f16888d = bs0Var;
        this.f16889e = qd0Var;
    }

    public final j81 a(final Object obj, final Bundle bundle, final boolean z3) {
        yr0 yr0VarC = d7.C(8, this.f16885a);
        yr0VarC.b();
        Set<qn0> set = this.f16886b;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        pk pkVar = sk.Xc;
        va.s sVar = va.s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        if (!((String) rkVar.a(pkVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) rkVar2.a(pkVar)).split(","));
        }
        List list = arrayList2;
        ua.j jVar = ua.j.C;
        jVar.f35267k.getClass();
        this.f16890f = SystemClock.elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) rkVar2.a(sk.B2)).booleanValue() && bundle != null) {
            jVar.f35267k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (obj instanceof t50) {
                bundle.putLong("client-signals-start", jCurrentTimeMillis);
            } else {
                bundle.putLong("gms-signals-start", jCurrentTimeMillis);
            }
        }
        for (qn0 qn0Var : set) {
            if (!list.contains(String.valueOf(qn0Var.a()))) {
                ua.j.C.f35267k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                vd.b bVarB = qn0Var.b();
                bVarB.a(new sy(this, jElapsedRealtime, qn0Var, bundle2), fx.g);
                arrayList.add(bVarB);
            }
        }
        x41 x41VarQ = x41.q(arrayList);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.rn0
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
                    pn0 pn0Var = (pn0) ((vd.b) it.next()).get();
                    if (pn0Var != null) {
                        pn0Var.c(obj2);
                        if (z3) {
                            pn0Var.h(obj2);
                        }
                    }
                }
                if (((Boolean) va.s.f36163e.f36166c.a(sk.B2)).booleanValue() && (bundle3 = bundle) != null) {
                    ua.j.C.f35267k.getClass();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    boolean z10 = obj2 instanceof t50;
                    Bundle bundle4 = bundle2;
                    if (z10) {
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
        j81 j81Var = new j81(x41VarQ, true, false);
        j81Var.f12674p = new i81(j81Var, callable, this.f16887c);
        j81Var.w();
        if (cs0.a()) {
            yr1.H(j81Var, this.f16888d, yr0VarC, false);
        }
        return j81Var;
    }
}
