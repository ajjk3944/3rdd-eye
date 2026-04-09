package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.f0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1708f0 implements InterfaceC1225Tc {
    public final T8 A00;

    public C1708f0(T8 t82) {
        this.A00 = t82;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1225Tc
    public final void A4I(Throwable th) {
        TX.A0E(th);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1225Tc
    public final void AA3(String str) {
        VL.A08(this.A00, str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1225Tc
    public final void AA4(String str) {
        VL.A09(this.A00, str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1225Tc
    public final void ABC(String str, int i10, C1227Te c1227Te) {
        TX.A06(this.A00, str, i10, c1227Te);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1225Tc
    public final void ABD(String str, int i10, C1227Te c1227Te) {
        TX.A06(this.A00, str, i10, c1227Te);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1225Tc
    public final void ABo(long j10, long j11, long j12, long j13, int i10, Exception exc) {
        AbstractC1231Ti.A03(this.A00, j10, j11, j12, j13, i10, exc);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1225Tc
    public final void ABz(String str, int i10, C1227Te c1227Te) {
        TX.A07(this.A00, str, i10, c1227Te);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1225Tc
    public final void ACA(String str, int i10, C1227Te c1227Te) {
        TX.A08(this.A00, str, i10, c1227Te);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1225Tc
    public final void ACP() {
        this.A00.A04().ACP();
    }
}
