package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.fw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1180fw {

    /* renamed from: a, reason: collision with root package name */
    public final C2203yw f14175a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14176b;

    /* renamed from: c, reason: collision with root package name */
    public final Tv f14177c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14178d = "Ad overlay";

    public C1180fw(View view, Tv tv) {
        this.f14175a = new C2203yw(view);
        this.f14176b = view.getClass().getCanonicalName();
        this.f14177c = tv;
    }
}
