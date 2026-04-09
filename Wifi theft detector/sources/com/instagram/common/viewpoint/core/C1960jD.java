package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1960jD implements InterfaceC1212Sp {
    public final /* synthetic */ AbstractC1979jd A00;
    public final /* synthetic */ InterfaceC1091Nt A01;
    public final /* synthetic */ C1092Nu A02;
    public final /* synthetic */ C1814gi A03;
    public final /* synthetic */ boolean A04;

    public C1960jD(C1092Nu c1092Nu, C1814gi c1814gi, boolean z10, AbstractC1979jd abstractC1979jd, InterfaceC1091Nt interfaceC1091Nt) {
        this.A02 = c1092Nu;
        this.A03 = c1814gi;
        this.A04 = z10;
        this.A00 = abstractC1979jd;
        this.A01 = interfaceC1091Nt;
    }

    private void A00(boolean z10) {
        if (z10) {
            if (C1264Up.A1q(this.A03) && this.A04) {
                this.A02.A02.add(AbstractC1599dD.A01(this.A03, this.A00, 1, new C1961jE(this)));
                return;
            } else {
                this.A01.ACp();
                return;
            }
        }
        this.A01.ACo(AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1212Sp
    public final void ADL() {
        A00(false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1212Sp
    public final void ADT() {
        A00(true);
    }
}
