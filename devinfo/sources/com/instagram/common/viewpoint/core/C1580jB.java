package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1580jB implements SM {
    public final /* synthetic */ C0714Nu A00;

    public C1580jB(C0714Nu c0714Nu) {
        this.A00 = c0714Nu;
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
