package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fm0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11209a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11210b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11211c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11212d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11213e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11214f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11215h;

    /* renamed from: i, reason: collision with root package name */
    public final float f11216i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f11217k;

    public fm0(int i4, boolean z3, boolean z10, int i10, int i11, int i12, int i13, int i14, float f10, boolean z11, boolean z12) {
        this.f11209a = i4;
        this.f11210b = z3;
        this.f11211c = z10;
        this.f11212d = i10;
        this.f11213e = i11;
        this.f11214f = i12;
        this.g = i13;
        this.f11215h = i14;
        this.f11216i = f10;
        this.j = z11;
        this.f11217k = z12;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void c(Object obj) {
        Bundle bundle = ((t50) obj).f16705a;
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16215lc)).booleanValue()) {
            bundle.putInt("muv_min", this.f11213e);
            bundle.putInt("muv_max", this.f11214f);
        }
        bundle.putFloat("android_app_volume", this.f11216i);
        bundle.putBoolean("android_app_muted", this.j);
        if (this.f11217k) {
            return;
        }
        bundle.putInt("am", this.f11209a);
        bundle.putBoolean("ma", this.f11210b);
        bundle.putBoolean("sp", this.f11211c);
        bundle.putInt("muv", this.f11212d);
        bundle.putInt("rm", this.g);
        bundle.putInt("riv", this.f11215h);
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* synthetic */ void h(Object obj) {
    }
}
