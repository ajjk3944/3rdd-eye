package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ty1 extends wx1 {

    /* renamed from: r, reason: collision with root package name */
    public static final h5 f16996r;

    /* renamed from: k, reason: collision with root package name */
    public final qx1[] f16997k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f16998l;

    /* renamed from: m, reason: collision with root package name */
    public final uh[] f16999m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f17000n;

    /* renamed from: o, reason: collision with root package name */
    public int f17001o = -1;

    /* renamed from: p, reason: collision with root package name */
    public long[][] f17002p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.datastore.preferences.protobuf.l f17003q;

    static {
        v41 v41Var = x41.f18307b;
        u51 u51Var = u51.f17096e;
        List list = Collections.EMPTY_LIST;
        w3 w3Var = w3.f17852a;
        f16996r = new h5("MergingMediaSource", new g0(), null, new a2(), j7.B);
    }

    public ty1(uu1 uu1Var, qx1... qx1VarArr) {
        this.f16997k = qx1VarArr;
        this.f17000n = new ArrayList(Arrays.asList(qx1VarArr));
        this.f16998l = new ArrayList(qx1VarArr.length);
        int i4 = 0;
        while (true) {
            int length = qx1VarArr.length;
            if (i4 >= length) {
                this.f16999m = new uh[length];
                this.f17002p = new long[0][];
                new HashMap();
                mq0.m(new m41(0).isEmpty());
                return;
            }
            this.f16998l.add(new ArrayList());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.qx1
    public final void a(h5 h5Var) {
        this.f16997k[0].a(h5Var);
    }

    @Override // com.google.android.gms.internal.ads.qx1
    public final void b(iy1 iy1Var) {
        qy1 qy1Var = (qy1) iy1Var;
        int i4 = 0;
        while (true) {
            qx1[] qx1VarArr = this.f16997k;
            if (i4 >= qx1VarArr.length) {
                return;
            }
            List list = (List) this.f16998l.get(i4);
            iy1[] iy1VarArr = qy1Var.f15483a;
            boolean[] zArr = qy1Var.f15484b;
            iy1 iy1Var2 = zArr[i4] ? ((nz1) iy1VarArr[i4]).f14490a : iy1VarArr[i4];
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (((sy1) list.get(i10)).f16594b.equals(iy1Var2)) {
                    list.remove(i10);
                    break;
                }
                i10++;
            }
            qx1 qx1Var = qx1VarArr[i4];
            iy1[] iy1VarArr2 = qy1Var.f15483a;
            qx1Var.b(zArr[i4] ? ((nz1) iy1VarArr2[i4]).f14490a : iy1VarArr2[i4]);
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.qx1
    public final iy1 c(jy1 jy1Var, i iVar, long j) {
        qx1[] qx1VarArr = this.f16997k;
        int length = qx1VarArr.length;
        iy1[] iy1VarArr = new iy1[length];
        uh[] uhVarArr = this.f16999m;
        int iE = uhVarArr[0].e(jy1Var.f12875a);
        for (int i4 = 0; i4 < length; i4++) {
            jy1 jy1VarA = jy1Var.a(uhVarArr[i4].f(iE));
            iy1VarArr[i4] = qx1VarArr[i4].c(jy1VarA, iVar, j - this.f17002p[iE][i4]);
            ((List) this.f16998l.get(i4)).add(new sy1(jy1VarA, iy1VarArr[i4]));
        }
        return new qy1(this.f17002p[iE], iy1VarArr);
    }

    @Override // com.google.android.gms.internal.ads.qx1
    public final h5 f() {
        qx1[] qx1VarArr = this.f16997k;
        return qx1VarArr.length > 0 ? qx1VarArr[0].f() : f16996r;
    }

    @Override // com.google.android.gms.internal.ads.qx1
    public final void h(hm1 hm1Var) {
        this.j = hm1Var;
        this.f18235i = bq0.n();
        int i4 = 0;
        while (true) {
            qx1[] qx1VarArr = this.f16997k;
            if (i4 >= qx1VarArr.length) {
                return;
            }
            t(Integer.valueOf(i4), qx1VarArr[i4]);
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.wx1, com.google.android.gms.internal.ads.qx1
    public final void j() {
        super.j();
        Arrays.fill(this.f16999m, (Object) null);
        this.f17001o = -1;
        this.f17003q = null;
        ArrayList arrayList = this.f17000n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f16997k);
    }

    @Override // com.google.android.gms.internal.ads.wx1, com.google.android.gms.internal.ads.qx1
    public final void r() throws androidx.datastore.preferences.protobuf.l {
        androidx.datastore.preferences.protobuf.l lVar = this.f17003q;
        if (lVar != null) {
            throw lVar;
        }
        super.r();
    }

    @Override // com.google.android.gms.internal.ads.wx1
    public final void s(Object obj, qx1 qx1Var, uh uhVar) {
        int iC;
        Integer num = (Integer) obj;
        if (this.f17003q != null) {
            return;
        }
        if (this.f17001o == -1) {
            iC = uhVar.c();
            this.f17001o = iC;
        } else {
            int iC2 = uhVar.c();
            int i4 = this.f17001o;
            if (iC2 != i4) {
                this.f17003q = new androidx.datastore.preferences.protobuf.l();
                return;
            }
            iC = i4;
        }
        int length = this.f17002p.length;
        uh[] uhVarArr = this.f16999m;
        if (length == 0) {
            this.f17002p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iC, uhVarArr.length);
        }
        ArrayList arrayList = this.f17000n;
        arrayList.remove(qx1Var);
        uhVarArr[num.intValue()] = uhVar;
        if (arrayList.isEmpty()) {
            k(uhVarArr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.wx1
    public final /* synthetic */ jy1 v(Object obj, jy1 jy1Var) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f16998l;
        List list = (List) arrayList.get(iIntValue);
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (((sy1) list.get(i4)).f16593a.equals(jy1Var)) {
                return ((sy1) ((List) arrayList.get(0)).get(i4)).f16593a;
            }
        }
        return null;
    }
}
