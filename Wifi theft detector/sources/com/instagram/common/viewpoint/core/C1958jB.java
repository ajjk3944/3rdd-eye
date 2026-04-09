package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1958jB implements SM {
    public final /* synthetic */ C1092Nu A00;

    public C1958jB(C1092Nu c1092Nu) {
        this.A00 = c1092Nu;
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACx() {
        this.A00.A04.ACp();
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACy() {
        this.A00.A04.ACo(AdError.CACHE_ERROR);
    }
}
