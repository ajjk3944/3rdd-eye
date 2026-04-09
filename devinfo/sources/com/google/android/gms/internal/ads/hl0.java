package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.view.ViewGroup;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hl0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11910a;

    /* renamed from: b, reason: collision with root package name */
    public final w81 f11911b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11912c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11913d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11914e;

    public hl0(Context context, w81 w81Var, hq0 hq0Var, za.a aVar) {
        this.f11910a = 5;
        this.f11912c = context;
        this.f11911b = w81Var;
        this.f11913d = hq0Var;
        this.f11914e = aVar;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int a() {
        switch (this.f11910a) {
            case 0:
                return 3;
            case 1:
                return 1;
            case 2:
                return 17;
            case 3:
                return 22;
            case 4:
                return 26;
            case 5:
                return 53;
            default:
                return 35;
        }
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final vd.b b() {
        tl0 tl0Var;
        switch (this.f11910a) {
            case 0:
                sk.a((Context) this.f11912c);
                return ((ex) this.f11911b).e(new qe(7, this));
            case 1:
                ul0 ul0Var = (ul0) this.f11914e;
                pk pkVar = sk.Sc;
                va.s sVar = va.s.f36163e;
                rk rkVar = sVar.f36166c;
                rk rkVar2 = sVar.f36166c;
                if (((Boolean) rkVar.a(pkVar)).booleanValue() && (tl0Var = ul0Var.f17256b) != null) {
                    return yo0.e(tl0Var);
                }
                if (yr1.k((String) rkVar2.a(sk.O1)) || (!((Boolean) rkVar2.a(pkVar)).booleanValue() && (ul0Var.f17255a.get() || !((re0) this.f11913d).f15618b))) {
                    return yo0.e(new tl0(0, new Bundle()));
                }
                ul0Var.f17255a.set(true);
                return ((ex) this.f11911b).e(new qe(9, this));
            case 2:
                return ((ex) this.f11911b).e(new qe(15, this));
            case 3:
                return ((ex) this.f11911b).e(new qe(19, this));
            case 4:
                return ((ex) this.f11911b).e(new qe(21, this));
            case 5:
                return ((ex) this.f11911b).e(new qe(23, this));
            default:
                return ((ex) this.f11911b).e(new qe(25, this));
        }
    }

    public hl0(w81 w81Var, ViewGroup viewGroup, Context context, Set set) {
        this.f11910a = 3;
        this.f11911b = w81Var;
        this.f11913d = set;
        this.f11914e = viewGroup;
        this.f11912c = context;
    }

    public hl0(w81 w81Var, hq0 hq0Var, PackageInfo packageInfo, ya.c0 c0Var) {
        this.f11910a = 4;
        this.f11911b = w81Var;
        this.f11913d = hq0Var;
        this.f11912c = packageInfo;
        this.f11914e = c0Var;
    }

    public /* synthetic */ hl0(w81 w81Var, Object obj, Object obj2, Object obj3, int i4) {
        this.f11910a = i4;
        this.f11911b = w81Var;
        this.f11912c = obj;
        this.f11913d = obj2;
        this.f11914e = obj3;
    }
}
