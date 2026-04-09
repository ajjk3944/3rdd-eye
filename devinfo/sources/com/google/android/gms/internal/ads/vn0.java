package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vn0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17660a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17661b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17662c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17663d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17664e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17665f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final String f17666h;

    /* renamed from: i, reason: collision with root package name */
    public final String f17667i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final String f17668k;

    /* renamed from: l, reason: collision with root package name */
    public final String f17669l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f17670m;

    /* renamed from: n, reason: collision with root package name */
    public final long f17671n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f17672o;

    /* renamed from: p, reason: collision with root package name */
    public final String f17673p;

    /* renamed from: q, reason: collision with root package name */
    public final int f17674q;

    /* renamed from: r, reason: collision with root package name */
    public final String f17675r;

    public vn0(boolean z3, boolean z10, String str, boolean z11, boolean z12, boolean z13, String str2, ArrayList arrayList, String str3, String str4, boolean z14, long j, boolean z15, String str5, int i4, String str6, String str7, String str8) {
        String str9 = Build.FINGERPRINT;
        String str10 = Build.MODEL;
        this.f17660a = z3;
        this.f17661b = z10;
        this.f17662c = str;
        this.f17663d = z11;
        this.f17664e = z12;
        this.f17665f = z13;
        this.g = str2;
        this.f17666h = str6;
        this.j = arrayList;
        this.f17668k = str3;
        this.f17669l = str4;
        this.f17670m = z14;
        this.f17671n = j;
        this.f17672o = z15;
        this.f17673p = str5;
        this.f17674q = i4;
        this.f17675r = str8;
        this.f17667i = str7;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void c(Object obj) {
        String str;
        Bundle bundle = ((t50) obj).f16705a;
        bundle.putBoolean("cog", this.f17660a);
        bundle.putBoolean("coh", this.f17661b);
        bundle.putString("gl", this.f17662c);
        bundle.putBoolean("simulator", this.f17663d);
        bundle.putBoolean("is_latchsky", this.f17664e);
        bundle.putInt("build_api_level", this.f17674q);
        pk pkVar = sk.f16262oc;
        va.s sVar = va.s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        if (!((Boolean) rkVar.a(pkVar)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f17665f);
        }
        bundle.putString("hl", this.g);
        if (((Boolean) rkVar2.a(sk.Je)).booleanValue() || ((Boolean) rkVar2.a(sk.Ke)).booleanValue()) {
            bundle.putString("dlc", this.f17666h);
        }
        ArrayList<String> arrayList = this.j;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        String str2 = this.f17667i;
        if (str2 != null) {
            bundle.putString("dgl", str2);
        }
        bundle.putString("mv", this.f17668k);
        bundle.putString("submodel", Build.MODEL);
        Bundle bundleA = mq0.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        bundleA.putString("build", Build.FINGERPRINT);
        bundleA.putLong("remaining_data_partition_space", this.f17671n);
        Bundle bundleA2 = mq0.a(bundleA, "browser");
        bundleA.putBundle("browser", bundleA2);
        bundleA2.putBoolean("is_browser_custom_tabs_capable", this.f17670m);
        String str3 = this.f17669l;
        if (!TextUtils.isEmpty(str3)) {
            Bundle bundleA3 = mq0.a(bundleA, "play_store");
            bundleA.putBundle("play_store", bundleA3);
            bundleA3.putString("package_version", str3);
        }
        if (((Boolean) rkVar2.a(sk.Ec)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f17672o);
        }
        String str4 = this.f17673p;
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("v_unity", str4);
        }
        if (((Boolean) rkVar2.a(sk.f16423yc)).booleanValue()) {
            mq0.M(bundle, "gotmt_l", true, ((Boolean) rkVar2.a(sk.f16373vc)).booleanValue());
            mq0.M(bundle, "gotmt_i", true, ((Boolean) rkVar2.a(sk.f16356uc)).booleanValue());
        }
        if (!((Boolean) rkVar2.a(sk.Af)).booleanValue() || (str = this.f17675r) == null) {
            return;
        }
        bundle.putString("sdk_i_s", str);
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        Bundle bundle = ((t50) obj).f16706b;
        bundle.putBoolean("simulator", this.f17663d);
        bundle.putInt("build_api_level", this.f17674q);
        ArrayList<String> arrayList = this.j;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        bundle.putString("submodel", Build.MODEL);
    }
}
