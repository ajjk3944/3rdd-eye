package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import q2.C2841s;

/* loaded from: classes.dex */
public final class Rs implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11058a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11059b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11060c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11061d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11062e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11063f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11064g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11065h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f11066j;

    /* renamed from: k, reason: collision with root package name */
    public final String f11067k;

    /* renamed from: l, reason: collision with root package name */
    public final String f11068l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f11069m;

    /* renamed from: n, reason: collision with root package name */
    public final long f11070n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f11071o;

    /* renamed from: p, reason: collision with root package name */
    public final String f11072p;

    /* renamed from: q, reason: collision with root package name */
    public final int f11073q;

    /* renamed from: r, reason: collision with root package name */
    public final String f11074r;

    public Rs(boolean z6, boolean z7, String str, boolean z8, boolean z9, boolean z10, String str2, ArrayList arrayList, String str3, String str4, boolean z11, long j6, boolean z12, String str5, int i, String str6, String str7, String str8) {
        String str9 = Build.FINGERPRINT;
        String str10 = Build.MODEL;
        this.f11058a = z6;
        this.f11059b = z7;
        this.f11060c = str;
        this.f11061d = z8;
        this.f11062e = z9;
        this.f11063f = z10;
        this.f11064g = str2;
        this.f11065h = str6;
        this.f11066j = arrayList;
        this.f11067k = str3;
        this.f11068l = str4;
        this.f11069m = z11;
        this.f11070n = j6;
        this.f11071o = z12;
        this.f11072p = str5;
        this.f11073q = i;
        this.f11074r = str8;
        this.i = str7;
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final void b(Object obj) {
        String str;
        Bundle bundle = ((C0797Wj) obj).f12308a;
        bundle.putBoolean("cog", this.f11058a);
        bundle.putBoolean("coh", this.f11059b);
        bundle.putString("gl", this.f11060c);
        bundle.putBoolean("simulator", this.f11061d);
        bundle.putBoolean("is_latchsky", this.f11062e);
        bundle.putInt("build_api_level", this.f11073q);
        E9 e9 = H9.mc;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        if (!((Boolean) g9.a(e9)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f11063f);
        }
        bundle.putString("hl", this.f11064g);
        if (((Boolean) g92.a(H9.He)).booleanValue() || ((Boolean) g92.a(H9.Ie)).booleanValue()) {
            bundle.putString("dlc", this.f11065h);
        }
        ArrayList<String> arrayList = this.f11066j;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        String str2 = this.i;
        if (str2 != null) {
            bundle.putString("dgl", str2);
        }
        bundle.putString("mv", this.f11067k);
        bundle.putString("submodel", Build.MODEL);
        Bundle bundleA = AbstractC0582Jp.a("device", bundle);
        bundle.putBundle("device", bundleA);
        bundleA.putString("build", Build.FINGERPRINT);
        bundleA.putLong("remaining_data_partition_space", this.f11070n);
        Bundle bundleA2 = AbstractC0582Jp.a("browser", bundleA);
        bundleA.putBundle("browser", bundleA2);
        bundleA2.putBoolean("is_browser_custom_tabs_capable", this.f11069m);
        String str3 = this.f11068l;
        if (!TextUtils.isEmpty(str3)) {
            Bundle bundleA3 = AbstractC0582Jp.a("play_store", bundleA);
            bundleA.putBundle("play_store", bundleA3);
            bundleA3.putString("package_version", str3);
        }
        if (((Boolean) g92.a(H9.Cc)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f11071o);
        }
        String str4 = this.f11072p;
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("v_unity", str4);
        }
        if (((Boolean) g92.a(H9.wc)).booleanValue()) {
            AbstractC0582Jp.N(bundle, "gotmt_l", true, ((Boolean) g92.a(H9.tc)).booleanValue());
            AbstractC0582Jp.N(bundle, "gotmt_i", true, ((Boolean) g92.a(H9.sc)).booleanValue());
        }
        if (!((Boolean) g92.a(H9.yf)).booleanValue() || (str = this.f11074r) == null) {
            return;
        }
        bundle.putString("sdk_i_s", str);
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Bundle bundle = ((C0797Wj) obj).f12309b;
        bundle.putBoolean("simulator", this.f11061d);
        bundle.putInt("build_api_level", this.f11073q);
        ArrayList<String> arrayList = this.f11066j;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        bundle.putString("submodel", Build.MODEL);
    }
}
