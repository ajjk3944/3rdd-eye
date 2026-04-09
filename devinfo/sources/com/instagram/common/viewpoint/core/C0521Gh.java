package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Gh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0521Gh implements InterfaceC1256dm {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0518Ge A01;

    public C0521Gh(C0518Ge c0518Ge, int i4) {
        this.A01 = c0518Ge;
        this.A00 = i4;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1256dm
    public final void ACQ() {
        this.A01.A0G();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1256dm
    public final void ADA() {
        this.A01.A0X(false, this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1256dm
    public final void ADc(int i4) {
        C0518Ge.A03(this.A01, i4);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1256dm
    public final void ADw(float f10) {
        if (!this.A01.A08) {
            this.A01.A0L(f10);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1256dm
    public final void AFw(boolean z3) {
        this.A01.A0W(z3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1256dm
    public final void AGQ(String str) {
        this.A01.A0D.A0F().A3a(str);
        if (this.A01.A0A.A2H() && this.A01.A00 < this.A01.A0A.A23()) {
            this.A01.A0D.A0F().AC2();
            this.A01.A0X(false, this.A00);
        } else {
            this.A01.A0I.A4j(this.A01.A0J.A81());
            this.A01.A0M(3);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1256dm
    public final void AKc() {
        this.A01.setUnskippableSecondsComplete(false);
        this.A01.A0H.setProgressImmediate(0.0f);
        this.A01.A0H.setToolbarActionMode(2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1256dm
    public final void AKd(float f10) {
        this.A01.A0H.setProgress(100.0f * f10);
    }
}
