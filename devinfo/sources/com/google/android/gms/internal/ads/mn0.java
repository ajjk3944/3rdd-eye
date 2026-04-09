package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mn0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13959a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13960b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13961c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13962d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13963e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13964f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final String f13965h;

    public mn0(boolean z3, boolean z10, String str, boolean z11, int i4, int i10, int i11, String str2) {
        this.f13959a = z3;
        this.f13960b = z10;
        this.f13961c = str;
        this.f13962d = z11;
        this.f13963e = i4;
        this.f13964f = i10;
        this.g = i11;
        this.f13965h = str2;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void c(Object obj) {
        Bundle bundle = ((t50) obj).f16705a;
        bundle.putString("js", this.f13961c);
        bundle.putBoolean("is_nonagon", true);
        pk pkVar = sk.u4;
        va.s sVar = va.s.f36163e;
        bundle.putString("extra_caps", (String) sVar.f36166c.a(pkVar));
        bundle.putInt("target_api", this.f13963e);
        bundle.putInt("dv", this.f13964f);
        bundle.putInt("lv", this.g);
        if (((Boolean) sVar.f36166c.a(sk.J6)).booleanValue()) {
            String str = this.f13965h;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("ev", str);
            }
        }
        Bundle bundleA = mq0.a(bundle, "sdk_env");
        bundleA.putBoolean("mf", ((Boolean) ul.g.u()).booleanValue());
        bundleA.putBoolean("instant_app", this.f13959a);
        bundleA.putBoolean("lite", this.f13960b);
        bundleA.putBoolean("is_privileged_process", this.f13962d);
        bundle.putBundle("sdk_env", bundleA);
        Bundle bundleA2 = mq0.a(bundleA, "build_meta");
        bundleA2.putString("cl", "839961582");
        bundleA2.putString("rapid_rc", "dev");
        bundleA2.putString("rapid_rollup", "HEAD");
        bundleA.putBundle("build_meta", bundleA2);
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        Bundle bundle = ((t50) obj).f16706b;
        bundle.putString("js", this.f13961c);
        bundle.putInt("target_api", this.f13963e);
    }
}
