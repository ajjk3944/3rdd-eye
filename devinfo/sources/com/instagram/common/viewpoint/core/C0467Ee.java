package com.instagram.common.viewpoint.core;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* renamed from: com.facebook.ads.redexgen.X.Ee, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0467Ee implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ C0468Ef A00;
    public final /* synthetic */ C03539h A01;

    public C0467Ee(C0468Ef c0468Ef, C03539h c03539h) {
        this.A00 = c0468Ef;
        this.A01 = c03539h;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z3) {
        this.A01.A0L();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z3) {
        this.A01.A0L();
    }
}
