package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1584jF implements SM {
    public final /* synthetic */ AbstractC1601jd A00;
    public final /* synthetic */ InterfaceC0713Nt A01;
    public final /* synthetic */ C0714Nu A02;
    public final /* synthetic */ C1436gi A03;
    public final /* synthetic */ boolean A04;

    public C1584jF(C0714Nu c0714Nu, C1436gi c1436gi, boolean z3, AbstractC1601jd abstractC1601jd, InterfaceC0713Nt interfaceC0713Nt) {
        this.A02 = c0714Nu;
        this.A03 = c1436gi;
        this.A04 = z3;
        this.A00 = abstractC1601jd;
        this.A01 = interfaceC0713Nt;
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACx() {
        if (C0886Up.A1q(this.A03) && this.A04) {
            this.A02.A02.add(AbstractC1221dD.A01(this.A03, this.A00, 1, new C1585jG(this)));
        } else {
            this.A01.ACp();
        }
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACy() {
        this.A01.ACo(AdError.CACHE_ERROR);
    }
}
