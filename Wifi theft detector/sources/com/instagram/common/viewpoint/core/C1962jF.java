package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1962jF implements SM {
    public final /* synthetic */ AbstractC1979jd A00;
    public final /* synthetic */ InterfaceC1091Nt A01;
    public final /* synthetic */ C1092Nu A02;
    public final /* synthetic */ C1814gi A03;
    public final /* synthetic */ boolean A04;

    public C1962jF(C1092Nu c1092Nu, C1814gi c1814gi, boolean z10, AbstractC1979jd abstractC1979jd, InterfaceC1091Nt interfaceC1091Nt) {
        this.A02 = c1092Nu;
        this.A03 = c1814gi;
        this.A04 = z10;
        this.A00 = abstractC1979jd;
        this.A01 = interfaceC1091Nt;
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACx() {
        if (C1264Up.A1q(this.A03) && this.A04) {
            this.A02.A02.add(AbstractC1599dD.A01(this.A03, this.A00, 1, new C1963jG(this)));
        } else {
            this.A01.ACp();
        }
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACy() {
        this.A01.ACo(AdError.CACHE_ERROR);
    }
}
