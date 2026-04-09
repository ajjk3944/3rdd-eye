package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import f4.InterfaceFutureC2326a;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import q2.C2841s;
import t2.C2909E;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.Yj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0831Yj {

    /* renamed from: a, reason: collision with root package name */
    public final Mu f12663a;

    /* renamed from: b, reason: collision with root package name */
    public final C2951a f12664b;

    /* renamed from: c, reason: collision with root package name */
    public final ApplicationInfo f12665c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12666d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f12667e;

    /* renamed from: f, reason: collision with root package name */
    public final PackageInfo f12668f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1692pN f12669g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12670h;
    public final Ps i;

    /* renamed from: j, reason: collision with root package name */
    public final C2909E f12671j;

    /* renamed from: k, reason: collision with root package name */
    public final C0960bu f12672k;

    /* renamed from: l, reason: collision with root package name */
    public final int f12673l;

    /* renamed from: m, reason: collision with root package name */
    public final C1060dl f12674m;

    public C0831Yj(Mu mu, C2951a c2951a, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, InterfaceC1692pN interfaceC1692pN, C2909E c2909e, String str2, Ps ps, C0960bu c0960bu, C1060dl c1060dl, int i) {
        this.f12663a = mu;
        this.f12664b = c2951a;
        this.f12665c = applicationInfo;
        this.f12666d = str;
        this.f12667e = arrayList;
        this.f12668f = packageInfo;
        this.f12669g = interfaceC1692pN;
        this.f12670h = str2;
        this.i = ps;
        this.f12671j = c2909e;
        this.f12672k = c0960bu;
        this.f12674m = c1060dl;
        this.f12673l = i;
    }

    public final Ju a(Bundle bundle) {
        this.f12674m.a();
        Mu mu = this.f12663a;
        Objects.requireNonNull(mu);
        return new C1677p8(mu, Ku.SIGNALS, null, Mu.f9922d, Collections.EMPTY_LIST, this.i.a(new C0797Wj(new Bundle(), new Bundle()), bundle, this.f12673l == 2)).u();
    }

    public final Ju b() {
        Bundle bundle = new Bundle();
        int i = 0;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8565B2)).booleanValue()) {
            Bundle bundle2 = this.f12672k.f13497t;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        Ju juA = a(bundle);
        InterfaceFutureC2326a[] interfaceFutureC2326aArr = {juA, (InterfaceFutureC2326a) this.f12669g.c()};
        Mu mu = this.f12663a;
        mu.getClass();
        List listAsList = Arrays.asList(interfaceFutureC2326aArr);
        CallableC0814Xj callableC0814Xj = new CallableC0814Xj(this, juA, bundle, i);
        JB jb = LB.f9635b;
        listAsList.getClass();
        LB lbM = LB.m(listAsList);
        B9 b9 = B9.f7310f;
        C0623Mf c0623Mf = AbstractC0640Nf.f10011g;
        C2005vD c2005vD = new C2005vD(lbM, true, false);
        c2005vD.f17236D = new C1951uD(c2005vD, b9, c0623Mf);
        c2005vD.v();
        ID id = mu.f9923a;
        C2005vD c2005vD2 = new C2005vD(lbM, true, false);
        c2005vD2.f17236D = new C1951uD(c2005vD2, callableC0814Xj, id);
        c2005vD2.v();
        return new C1677p8(mu, Ku.REQUEST_PARCEL, null, c2005vD, listAsList, c2005vD2).u();
    }
}
