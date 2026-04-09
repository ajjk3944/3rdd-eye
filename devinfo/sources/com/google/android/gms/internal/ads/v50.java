package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v50 {

    /* renamed from: a, reason: collision with root package name */
    public final sr0 f17520a;

    /* renamed from: b, reason: collision with root package name */
    public final za.a f17521b;

    /* renamed from: c, reason: collision with root package name */
    public final ApplicationInfo f17522c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17523d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f17524e;

    /* renamed from: f, reason: collision with root package name */
    public final PackageInfo f17525f;
    public final cs1 g;

    /* renamed from: h, reason: collision with root package name */
    public final String f17526h;

    /* renamed from: i, reason: collision with root package name */
    public final tn0 f17527i;
    public final ya.c0 j;

    /* renamed from: k, reason: collision with root package name */
    public final hq0 f17528k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17529l;

    /* renamed from: m, reason: collision with root package name */
    public final z70 f17530m;

    public v50(sr0 sr0Var, za.a aVar, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, cs1 cs1Var, ya.c0 c0Var, String str2, tn0 tn0Var, hq0 hq0Var, z70 z70Var, int i4) {
        this.f17520a = sr0Var;
        this.f17521b = aVar;
        this.f17522c = applicationInfo;
        this.f17523d = str;
        this.f17524e = arrayList;
        this.f17525f = packageInfo;
        this.g = cs1Var;
        this.f17526h = str2;
        this.f17527i = tn0Var;
        this.j = c0Var;
        this.f17528k = hq0Var;
        this.f17530m = z70Var;
        this.f17529l = i4;
    }

    public final pr0 a(Bundle bundle) {
        this.f17530m.a();
        sr0 sr0Var = this.f17520a;
        Objects.requireNonNull(sr0Var);
        return new ai(sr0Var, qr0.SIGNALS, null, sr0.f16524d, Collections.EMPTY_LIST, this.f17527i.a(new t50(new Bundle(), new Bundle()), bundle, this.f17529l == 2)).t();
    }

    public final pr0 b() {
        Bundle bundle = new Bundle();
        int i4 = 0;
        if (((Boolean) va.s.f36163e.f36166c.a(sk.B2)).booleanValue()) {
            Bundle bundle2 = this.f17528k.f11958t;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        pr0 pr0VarA = a(bundle);
        vd.b[] bVarArr = {pr0VarA, (vd.b) this.g.a()};
        sr0 sr0Var = this.f17520a;
        sr0Var.getClass();
        List listAsList = Arrays.asList(bVarArr);
        u50 u50Var = new u50(this, pr0VarA, bundle, i4);
        v41 v41Var = x41.f18307b;
        listAsList.getClass();
        x41 x41VarQ = x41.q(listAsList);
        mk mkVar = mk.f13919e;
        ex exVar = fx.g;
        j81 j81Var = new j81(x41VarQ, true, false);
        j81Var.f12674p = new i81(j81Var, mkVar, exVar);
        j81Var.w();
        w81 w81Var = sr0Var.f16525a;
        j81 j81Var2 = new j81(x41VarQ, true, false);
        j81Var2.f12674p = new i81(j81Var2, u50Var, w81Var);
        j81Var2.w();
        return new ai(sr0Var, qr0.REQUEST_PARCEL, null, j81Var, listAsList, j81Var2).t();
    }
}
