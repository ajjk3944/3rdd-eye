package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.Comparator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rz1 extends b02 implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final int f15797e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15798f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final wz1 f15799h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f15800i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f15801k;

    /* renamed from: l, reason: collision with root package name */
    public final int f15802l;

    /* renamed from: m, reason: collision with root package name */
    public final int f15803m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f15804n;

    /* renamed from: o, reason: collision with root package name */
    public final int f15805o;

    /* renamed from: p, reason: collision with root package name */
    public final int f15806p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f15807q;

    /* renamed from: r, reason: collision with root package name */
    public final int f15808r;

    /* renamed from: s, reason: collision with root package name */
    public final int f15809s;

    /* renamed from: t, reason: collision with root package name */
    public final int f15810t;

    /* renamed from: u, reason: collision with root package name */
    public final int f15811u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f15812v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f15813w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f15814x;

    public rz1(int i4, ii iiVar, int i10, wz1 wz1Var, int i11, boolean z3, sz1 sz1Var) {
        int i12;
        int iF;
        int iHashCode;
        int iF2;
        boolean z10;
        super(i4, iiVar, i10);
        this.f15799h = wz1Var;
        boolean z11 = wz1Var.f18251z;
        x41 x41Var = wz1Var.f11232p;
        x41 x41Var2 = wz1Var.f11228l;
        int i13 = 1;
        int i14 = true != z11 ? 16 : 24;
        this.g = b.e(this.f9532d.f14045d);
        this.f15800i = d7.B(i11, false);
        int i15 = 0;
        while (true) {
            i12 = Integer.MAX_VALUE;
            if (i15 >= x41Var2.size()) {
                iF = 0;
                i15 = Integer.MAX_VALUE;
                break;
            } else {
                iF = b.f(this.f9532d, (String) x41Var2.get(i15), false);
                if (iF > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.f15801k = i15;
        this.j = iF;
        int i16 = this.f9532d.f14047f;
        this.f15802l = (i16 == 0 || i16 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        this.f15803m = b.g(this.f9532d, wz1Var.f11229m);
        mx1 mx1Var = this.f9532d;
        int i17 = mx1Var.f14047f;
        this.f15804n = i17 == 0 || (i17 & 1) != 0;
        this.f15807q = 1 == (mx1Var.f14046e & 1);
        String str = mx1Var.f14052m;
        this.f15814x = str != null && ((iHashCode = str.hashCode()) == -2123537834 ? str.equals("audio/eac3-joc") : !(iHashCode == 187078297 ? !str.equals("audio/ac4") : !(iHashCode == 1504698186 && str.equals("audio/iamf"))));
        int i18 = mx1Var.E;
        this.f15808r = i18;
        this.f15809s = mx1Var.F;
        int i19 = mx1Var.f14049i;
        this.f15810t = i19;
        this.f15798f = (i19 == -1 || i19 <= wz1Var.f11231o) && (i18 == -1 || i18 <= wz1Var.f11230n) && sz1Var.c(mx1Var);
        String str2 = bq0.f9768a;
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrSplit = Build.VERSION.SDK_INT >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i20 = 0; i20 < strArrSplit.length; i20++) {
            strArrSplit[i20] = bq0.o(strArrSplit[i20]);
        }
        int i21 = 0;
        while (true) {
            if (i21 >= strArrSplit.length) {
                iF2 = 0;
                i21 = Integer.MAX_VALUE;
                break;
            } else {
                iF2 = b.f(this.f9532d, strArrSplit[i21], false);
                if (iF2 > 0) {
                    break;
                } else {
                    i21++;
                }
            }
        }
        this.f15805o = i21;
        this.f15806p = iF2;
        int i22 = 0;
        while (true) {
            if (i22 >= x41Var.size()) {
                break;
            }
            String str3 = this.f9532d.f14052m;
            if (str3 != null && str3.equals(x41Var.get(i22))) {
                i12 = i22;
                break;
            }
            i22++;
        }
        this.f15811u = i12;
        this.f15812v = (i11 & 384) == 128;
        this.f15813w = (i11 & 64) == 64;
        wz1 wz1Var2 = this.f15799h;
        if (d7.B(i11, wz1Var2.B) && ((z10 = this.f15798f) || wz1Var2.f18250y)) {
            wz1Var2.f11233q.getClass();
            if (d7.B(i11, false) && z10 && this.f9532d.f14049i != -1 && ((wz1Var2.C || !z3) && (i14 & i11) != 0)) {
                i13 = 2;
            }
        } else {
            i13 = 0;
        }
        this.f15797e = i13;
    }

    @Override // com.google.android.gms.internal.ads.b02
    public final int a() {
        return this.f15797e;
    }

    @Override // com.google.android.gms.internal.ads.b02
    public final /* bridge */ /* synthetic */ boolean b(b02 b02Var) {
        String str;
        int i4;
        rz1 rz1Var = (rz1) b02Var;
        this.f15799h.getClass();
        mx1 mx1Var = this.f9532d;
        int i10 = mx1Var.E;
        if (i10 == -1) {
            return false;
        }
        mx1 mx1Var2 = rz1Var.f9532d;
        return i10 == mx1Var2.E && (str = mx1Var.f14052m) != null && TextUtils.equals(str, mx1Var2.f14052m) && (i4 = mx1Var.F) != -1 && i4 == mx1Var2.F && this.f15812v == rz1Var.f15812v && this.f15813w == rz1Var.f15813w;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(rz1 rz1Var) {
        boolean z3 = this.f15800i;
        boolean z10 = this.f15798f;
        Comparator b61Var = (z10 && z3) ? b.f9505k : new b61();
        q41 q41VarD = q41.f15203a.d(z3, rz1Var.f15800i);
        Integer numValueOf = Integer.valueOf(this.f15801k);
        Integer numValueOf2 = Integer.valueOf(rz1Var.f15801k);
        r51 r51Var = r51.f15552c;
        q41 q41VarA = q41VarD.a(numValueOf, numValueOf2, r51Var).b(this.j, rz1Var.j).b(this.f15802l, rz1Var.f15802l).a(Integer.valueOf(this.f15803m), Integer.valueOf(rz1Var.f15803m), r51Var).d(this.f15807q, rz1Var.f15807q).d(this.f15804n, rz1Var.f15804n).a(Integer.valueOf(this.f15805o), Integer.valueOf(rz1Var.f15805o), r51Var).b(this.f15806p, rz1Var.f15806p).d(z10, rz1Var.f15798f).a(Integer.valueOf(this.f15811u), Integer.valueOf(rz1Var.f15811u), r51Var);
        this.f15799h.getClass();
        q41 q41VarA2 = q41VarA.d(this.f15812v, rz1Var.f15812v).d(this.f15813w, rz1Var.f15813w).d(this.f15814x, rz1Var.f15814x).a(Integer.valueOf(this.f15808r), Integer.valueOf(rz1Var.f15808r), b61Var).a(Integer.valueOf(this.f15809s), Integer.valueOf(rz1Var.f15809s), b61Var);
        if (Objects.equals(this.g, rz1Var.g)) {
            q41VarA2 = q41VarA2.a(Integer.valueOf(this.f15810t), Integer.valueOf(rz1Var.f15810t), b61Var);
        }
        return q41VarA2.e();
    }
}
