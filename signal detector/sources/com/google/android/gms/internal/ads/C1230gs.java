package com.google.android.gms.internal.ads;

import android.os.Bundle;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.gs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1230gs implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final int f14386a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14387b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14388c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14389d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14390e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14391f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14392g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14393h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f14394j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f14395k;

    public C1230gs(int i, boolean z6, boolean z7, int i3, int i6, int i7, int i8, int i9, float f2, boolean z8, boolean z9) {
        this.f14386a = i;
        this.f14387b = z6;
        this.f14388c = z7;
        this.f14389d = i3;
        this.f14390e = i6;
        this.f14391f = i7;
        this.f14392g = i8;
        this.f14393h = i9;
        this.i = f2;
        this.f14394j = z8;
        this.f14395k = z9;
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final void b(Object obj) {
        Bundle bundle = ((C0797Wj) obj).f12308a;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.jc)).booleanValue()) {
            bundle.putInt("muv_min", this.f14390e);
            bundle.putInt("muv_max", this.f14391f);
        }
        bundle.putFloat("android_app_volume", this.i);
        bundle.putBoolean("android_app_muted", this.f14394j);
        if (this.f14395k) {
            return;
        }
        bundle.putInt("am", this.f14386a);
        bundle.putBoolean("ma", this.f14387b);
        bundle.putBoolean("sp", this.f14388c);
        bundle.putInt("muv", this.f14389d);
        bundle.putInt("rm", this.f14392g);
        bundle.putInt("riv", this.f14393h);
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* synthetic */ void d(Object obj) {
    }
}
