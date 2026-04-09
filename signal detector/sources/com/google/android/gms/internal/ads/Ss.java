package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class Ss implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final String f11262a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11263b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11264c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11265d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11266e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11267f;

    public Ss(String str, int i, int i3, int i6, boolean z6, int i7) {
        this.f11262a = str;
        this.f11263b = i;
        this.f11264c = i3;
        this.f11265d = i6;
        this.f11266e = z6;
        this.f11267f = i7;
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = ((C0797Wj) obj).f12308a;
        AbstractC0582Jp.v(bundle, "carrier", this.f11262a, !TextUtils.isEmpty(r0));
        int i = this.f11263b;
        AbstractC0582Jp.J(bundle, "cnt", i, i != -2);
        bundle.putInt("gnt", this.f11264c);
        bundle.putInt("pt", this.f11265d);
        Bundle bundleA = AbstractC0582Jp.a("device", bundle);
        bundle.putBundle("device", bundleA);
        Bundle bundleA2 = AbstractC0582Jp.a("network", bundleA);
        bundleA.putBundle("network", bundleA2);
        bundleA2.putInt("active_network_state", this.f11267f);
        bundleA2.putBoolean("active_network_metered", this.f11266e);
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* synthetic */ void d(Object obj) {
    }
}
