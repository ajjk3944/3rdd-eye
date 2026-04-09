package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import q2.C2841s;

/* loaded from: classes.dex */
public final class Is implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9172a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9173b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9174c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9175d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9176e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9177f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9178g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9179h;

    public Is(boolean z6, boolean z7, String str, boolean z8, int i, int i3, int i6, String str2) {
        this.f9172a = z6;
        this.f9173b = z7;
        this.f9174c = str;
        this.f9175d = z8;
        this.f9176e = i;
        this.f9177f = i3;
        this.f9178g = i6;
        this.f9179h = str2;
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final void b(Object obj) {
        Bundle bundle = ((C0797Wj) obj).f12308a;
        bundle.putString("js", this.f9174c);
        bundle.putBoolean("is_nonagon", true);
        E9 e9 = H9.f8840u4;
        C2841s c2841s = C2841s.f23267e;
        bundle.putString("extra_caps", (String) c2841s.f23270c.a(e9));
        bundle.putInt("target_api", this.f9176e);
        bundle.putInt("dv", this.f9177f);
        bundle.putInt("lv", this.f9178g);
        if (((Boolean) c2841s.f23270c.a(H9.J6)).booleanValue()) {
            String str = this.f9179h;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("ev", str);
            }
        }
        Bundle bundleA = AbstractC0582Jp.a("sdk_env", bundle);
        bundleA.putBoolean("mf", ((Boolean) AbstractC1372ja.f14956g.v()).booleanValue());
        bundleA.putBoolean("instant_app", this.f9172a);
        bundleA.putBoolean("lite", this.f9173b);
        bundleA.putBoolean("is_privileged_process", this.f9175d);
        bundle.putBundle("sdk_env", bundleA);
        Bundle bundleA2 = AbstractC0582Jp.a("build_meta", bundleA);
        bundleA2.putString("cl", "839961582");
        bundleA2.putString("rapid_rc", "dev");
        bundleA2.putString("rapid_rollup", "HEAD");
        bundleA.putBundle("build_meta", bundleA2);
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Bundle bundle = ((C0797Wj) obj).f12309b;
        bundle.putString("js", this.f9174c);
        bundle.putInt("target_api", this.f9176e);
    }
}
