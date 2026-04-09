package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.js, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1390js implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final double f15006a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15007b;

    public C1390js(double d6, boolean z6) {
        this.f15006a = d6;
        this.f15007b = z6;
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = ((C0797Wj) obj).f12308a;
        Bundle bundleA = AbstractC0582Jp.a("device", bundle);
        bundle.putBundle("device", bundleA);
        Bundle bundleA2 = AbstractC0582Jp.a("battery", bundleA);
        bundleA.putBundle("battery", bundleA2);
        bundleA2.putBoolean("is_charging", this.f15007b);
        bundleA2.putDouble("battery_level", this.f15006a);
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* synthetic */ void d(Object obj) {
    }
}
