package com.instagram.common.viewpoint.core;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* renamed from: com.facebook.ads.redexgen.X.Ee, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0845Ee implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ C0846Ef A00;
    public final /* synthetic */ C07319h A01;

    public C0845Ee(C0846Ef c0846Ef, C07319h c07319h) {
        this.A00 = c0846Ef;
        this.A01 = c07319h;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        this.A01.A0L();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        this.A01.A0L();
    }
}
