package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* renamed from: com.google.android.gms.internal.ads.bR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0939bR implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0911b f13381a;

    public C0939bR(A1.s sVar, C0911b c0911b) {
        this.f13381a = c0911b;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z6) {
        this.f13381a.h();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z6) {
        this.f13381a.h();
    }
}
