package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xz1 implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f18595a;

    public xz1(yz1 yz1Var, b bVar) {
        this.f18595a = bVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z3) {
        this.f18595a.h();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z3) {
        this.f18595a.h();
    }
}
