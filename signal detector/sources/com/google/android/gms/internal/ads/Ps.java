package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import f4.InterfaceFutureC2326a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import q2.C2841s;

/* loaded from: classes.dex */
public final class Ps {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10523a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f10524b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f10525c;

    /* renamed from: d, reason: collision with root package name */
    public final Xu f10526d;

    /* renamed from: e, reason: collision with root package name */
    public final C0784Vn f10527e;

    /* renamed from: f, reason: collision with root package name */
    public long f10528f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f10529g = 0;

    public Ps(Context context, C0623Mf c0623Mf, Set set, Xu xu, C0784Vn c0784Vn) {
        this.f10523a = context;
        this.f10525c = c0623Mf;
        this.f10524b = set;
        this.f10526d = xu;
        this.f10527e = c0784Vn;
    }

    public final C2005vD a(final Object obj, final Bundle bundle, final boolean z6) {
        Su suY = AbstractC1135f5.y(this.f10523a, 8);
        suY.a();
        Set<Ms> set = this.f10524b;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        E9 e9 = H9.Vc;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        if (!((String) g9.a(e9)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) g92.a(e9)).split(","));
        }
        List list = arrayList2;
        p2.j jVar = p2.j.f22785C;
        jVar.f22797k.getClass();
        this.f10528f = SystemClock.elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) g92.a(H9.f8565B2)).booleanValue() && bundle != null) {
            jVar.f22797k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (obj instanceof C0797Wj) {
                bundle.putLong("client-signals-start", jCurrentTimeMillis);
            } else {
                bundle.putLong("gms-signals-start", jCurrentTimeMillis);
            }
        }
        for (Ms ms : set) {
            if (!list.contains(String.valueOf(ms.c()))) {
                p2.j.f22785C.f22797k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                InterfaceFutureC2326a interfaceFutureC2326aA = ms.a();
                interfaceFutureC2326aA.a(new RunnableC0420Ag(this, jElapsedRealtime, ms, bundle2), AbstractC0640Nf.f10011g);
                arrayList.add(interfaceFutureC2326aA);
            }
        }
        LB lbM = LB.m(arrayList);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.Ns
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
                    Ls ls = (Ls) ((InterfaceFutureC2326a) it.next()).get();
                    if (ls != null) {
                        ls.b(obj2);
                        if (z6) {
                            ls.d(obj2);
                        }
                    }
                }
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8565B2)).booleanValue() && (bundle3 = bundle) != null) {
                    p2.j.f22785C.f22797k.getClass();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    boolean z7 = obj2 instanceof C0797Wj;
                    Bundle bundle4 = bundle2;
                    if (z7) {
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
        C2005vD c2005vD = new C2005vD(lbM, true, false);
        c2005vD.f17236D = new C1951uD(c2005vD, callable, this.f10525c);
        c2005vD.v();
        if (Yu.a()) {
            C1476lN.I(c2005vD, this.f10526d, suY, false);
        }
        return c2005vD;
    }
}
