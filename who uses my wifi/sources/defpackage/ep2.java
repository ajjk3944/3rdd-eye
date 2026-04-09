package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ep2 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public Object o;

    public ep2() {
        this.a = new HashSet();
        this.b = new HashSet();
        this.c = new HashSet();
        this.d = new HashSet();
        this.e = new HashSet();
        this.f = new HashSet();
        this.g = new HashSet();
        this.h = new HashSet();
        this.i = new HashSet();
        this.j = new HashSet();
        this.k = new HashSet();
        this.l = new HashSet();
        this.m = new HashSet();
        this.n = new HashSet();
    }

    public void a(wm2 wm2Var, Executor executor) {
        ((HashSet) this.i).add(new up2(wm2Var, executor));
    }

    public void b(b8 b8Var, Executor executor) {
        ((HashSet) this.k).add(new up2(b8Var, executor));
    }

    public void c(xp2 xp2Var, Executor executor) {
        ((HashSet) this.d).add(new up2(xp2Var, executor));
    }

    public void d(jo2 jo2Var, Executor executor) {
        ((HashSet) this.b).add(new up2(jo2Var, executor));
    }

    public ep2(ExecutorService executorService, Context context, vf3 vf3Var) {
        this.a = this;
        da4 da4VarA = da4.a(context);
        this.b = da4VarA;
        ba4 ba4VarA = ba4.a(yb.q);
        this.c = ba4VarA;
        da4 da4VarA2 = da4.a(executorService);
        this.d = da4VarA2;
        ba4 ba4VarA2 = ba4.a(new wb2(da4VarA, ba4VarA, da4VarA2));
        int i = 2;
        ba4 ba4VarA3 = ba4.a(new ub2(da4VarA, da4VarA2, i));
        ba4 ba4VarA4 = ba4.a(new ub2(da4VarA, da4VarA2, 3));
        ba4 ba4VarA5 = ba4.a(um.s);
        this.e = ba4VarA5;
        da4 da4VarA3 = da4.a(vf3Var);
        this.f = da4VarA3;
        int i2 = 1;
        ba4 ba4VarA6 = ba4.a(new ub2(da4VarA2, da4VarA3, i2));
        this.g = ba4VarA6;
        ba4 ba4VarA7 = ba4.a(new ic2(da4VarA, ba4VarA5, da4VarA2, ba4VarA6, da4VarA3));
        this.h = ba4VarA7;
        int i3 = ha4.c;
        ArrayList arrayList = new ArrayList(4);
        List list = Collections.EMPTY_LIST;
        arrayList.add(ba4VarA2);
        arrayList.add(ba4VarA3);
        arrayList.add(ba4VarA4);
        arrayList.add(ba4VarA7);
        ha4 ha4Var = new ha4(arrayList, list);
        ba4 ba4VarA8 = ba4.a(new u12(24, new wf3(0, this)));
        ba4 ba4VarA9 = ba4.a(new u12(25, new wf3(i2, this)));
        ba4 ba4VarA10 = ba4.a(new u12(26, new wf3(i, this)));
        ba4 ba4VarA11 = ba4.a(new bh2(ba4VarA, ba4VarA7, 17));
        this.i = ba4VarA11;
        ba4 ba4VarA12 = ba4.a(new ic2(da4VarA3, ba4.a(new ic2(ba4VarA8, ba4VarA9, ba4VarA10, da4VarA2, ba4VarA11)), ba4VarA7, da4VarA2, ba4VarA11));
        ba4 ba4VarA13 = ba4.a(new aw2(da4VarA2, 5));
        this.j = ba4VarA13;
        ba4 ba4VarA14 = ba4.a(new wi3(da4VarA, ba4VarA11, da4VarA3, ba4VarA13));
        ba4 ba4VarA15 = ba4.a(new wi3(2, ba4VarA11, ba4VarA13, da4VarA, da4VarA3));
        ArrayList arrayList2 = new ArrayList(3);
        List list2 = Collections.EMPTY_LIST;
        arrayList2.add(ba4VarA12);
        arrayList2.add(ba4VarA14);
        arrayList2.add(ba4VarA15);
        ba4 ba4VarA16 = ba4.a(new e02((ga4) ha4Var, (ga4) new ha4(arrayList2, list2), (ca4) da4VarA2, ba4VarA11, 15));
        ba4 ba4VarA17 = ba4.a(qb1.u);
        ba4 ba4VarA18 = ba4.a(new sw2(ba4VarA, 14));
        ArrayList arrayList3 = new ArrayList(7);
        List list3 = Collections.EMPTY_LIST;
        arrayList3.add(ba4VarA17);
        arrayList3.add(ba4VarA2);
        arrayList3.add(ba4VarA3);
        arrayList3.add(ba4VarA18);
        arrayList3.add(ba4VarA4);
        arrayList3.add(ba4VarA14);
        arrayList3.add(ba4VarA15);
        ba4 ba4VarA19 = ba4.a(new k43(ba4VarA17, new ha4(arrayList3, list3), 16));
        this.k = ba4VarA19;
        ba4 ba4VarA20 = ba4.a(new sw2(ba4VarA11, 13));
        this.l = ba4VarA20;
        this.m = ba4.a(new ar2(ba4VarA16, ba4VarA12, ba4VarA19, ba4VarA11, ba4.a(new wi3(0, ba4VarA11, ba4VarA20, da4VarA, da4VarA3)), da4VarA3));
        this.n = ba4.a(new aw2(da4VarA, 4));
        this.o = ba4.a(new aw2(da4VarA2, 6));
    }
}
