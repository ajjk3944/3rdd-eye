package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d80 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10363a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10364b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10365c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10366d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10367e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f10368f;
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f10369h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f10370i;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f10371k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f10372l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f10373m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f10374n;

    /* renamed from: o, reason: collision with root package name */
    public Object f10375o;

    public d80() {
        this.f10363a = new HashSet();
        this.f10364b = new HashSet();
        this.f10365c = new HashSet();
        this.f10366d = new HashSet();
        this.f10367e = new HashSet();
        this.f10368f = new HashSet();
        this.g = new HashSet();
        this.f10369h = new HashSet();
        this.f10370i = new HashSet();
        this.j = new HashSet();
        this.f10371k = new HashSet();
        this.f10372l = new HashSet();
        this.f10373m = new HashSet();
        this.f10374n = new HashSet();
    }

    public void a(i60 i60Var, Executor executor) {
        ((HashSet) this.f10370i).add(new q80(i60Var, executor));
    }

    public void b(qa.d dVar, Executor executor) {
        ((HashSet) this.f10371k).add(new q80(dVar, executor));
    }

    public void c(t80 t80Var, Executor executor) {
        ((HashSet) this.f10366d).add(new q80(t80Var, executor));
    }

    public void d(n70 n70Var, Executor executor) {
        ((HashSet) this.f10364b).add(new q80(n70Var, executor));
    }

    public d80(ExecutorService executorService, Context context, sx0 sx0Var) {
        this.f10363a = this;
        gs1 gs1VarB = gs1.b(context);
        this.f10364b = gs1VarB;
        es1 es1VarB = es1.b(a80.K);
        this.f10365c = es1VarB;
        gs1 gs1VarB2 = gs1.b(executorService);
        this.f10366d = gs1VarB2;
        es1 es1VarB2 = es1.b(new up0(gs1VarB, es1VarB, gs1VarB2));
        int i4 = 2;
        es1 es1VarB3 = es1.b(new wv(gs1VarB, gs1VarB2, i4));
        es1 es1VarB4 = es1.b(new wv(gs1VarB, gs1VarB2, 3));
        es1 es1VarB5 = es1.b(new s00(es1.b(gs1VarB2), es1VarB, 17));
        es1 es1VarB6 = es1.b(nn1.f14360y);
        gs1 gs1VarB3 = gs1.b(sx0Var);
        this.f10367e = gs1VarB3;
        int i10 = 1;
        es1 es1VarB7 = es1.b(new up0(i10, es1VarB5, es1VarB6, gs1VarB3));
        this.f10368f = es1VarB7;
        es1 es1VarB8 = es1.b(new wv(gs1VarB2, gs1VarB3, i10));
        this.g = es1VarB8;
        es1 es1VarB9 = es1.b(new g40((Object) gs1VarB, es1VarB7, (Object) gs1VarB2, (Object) es1VarB8, (Object) gs1VarB3, 19));
        this.f10369h = es1VarB9;
        int i11 = ks1.f13231c;
        ArrayList arrayList = new ArrayList(4);
        List list = Collections.EMPTY_LIST;
        arrayList.add(es1VarB2);
        arrayList.add(es1VarB3);
        arrayList.add(es1VarB4);
        arrayList.add(es1VarB9);
        ks1 ks1Var = new ks1(arrayList, list);
        es1 es1VarB10 = es1.b(new m20(23, new tx0(0, this)));
        es1 es1VarB11 = es1.b(new m20(24, new tx0(i10, this)));
        es1 es1VarB12 = es1.b(new m20(25, new tx0(i4, this)));
        es1 es1VarB13 = es1.b(new s00(es1VarB, es1VarB9, 18));
        this.f10370i = es1VarB13;
        es1 es1VarB14 = es1.b(new g40(gs1VarB3, es1.b(new g40(es1VarB10, (js1) es1VarB11, (js1) es1VarB12, (Object) gs1VarB2, es1VarB13, 20)), es1VarB9, gs1VarB2, es1VarB13, 21));
        es1 es1VarB15 = es1.b(new ee0(gs1VarB2, 5));
        this.j = es1VarB15;
        es1 es1VarB16 = es1.b(new k01(gs1VarB, es1VarB13, gs1VarB3, es1VarB15));
        es1 es1VarB17 = es1.b(new k01(2, es1VarB13, es1VarB15, gs1VarB, gs1VarB3));
        ArrayList arrayList2 = new ArrayList(3);
        List list2 = Collections.EMPTY_LIST;
        arrayList2.add(es1VarB14);
        arrayList2.add(es1VarB16);
        arrayList2.add(es1VarB17);
        es1 es1VarB18 = es1.b(new el((js1) ks1Var, (js1) new ks1(arrayList2, list2), (fs1) gs1VarB2, es1VarB13, 17));
        es1 es1VarB19 = es1.b(jz.B);
        es1 es1VarB20 = es1.b(new xe0(es1VarB, 15));
        ArrayList arrayList3 = new ArrayList(7);
        List list3 = Collections.EMPTY_LIST;
        arrayList3.add(es1VarB19);
        arrayList3.add(es1VarB2);
        arrayList3.add(es1VarB3);
        arrayList3.add(es1VarB20);
        arrayList3.add(es1VarB4);
        arrayList3.add(es1VarB16);
        arrayList3.add(es1VarB17);
        es1 es1VarB21 = es1.b(new qm0(es1VarB19, new ks1(arrayList3, list3), 16));
        this.f10371k = es1VarB21;
        es1 es1VarB22 = es1.b(new xe0(es1VarB13, 14));
        this.f10372l = es1VarB22;
        this.f10373m = es1.b(new k50(es1VarB18, es1VarB14, es1VarB21, es1VarB13, es1VarB7, es1.b(new k01(0, es1VarB13, es1VarB22, gs1VarB, gs1VarB3)), gs1VarB3, 8));
        this.f10374n = es1.b(new ee0(gs1VarB, 4));
        this.f10375o = es1.b(new ee0(gs1VarB2, 6));
    }
}
