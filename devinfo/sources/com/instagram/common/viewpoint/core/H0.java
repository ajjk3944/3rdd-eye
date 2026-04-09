package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class H0 implements XN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractRunnableC0923Wc A01;
    public final /* synthetic */ AbstractC0523Gj A02;
    public final /* synthetic */ DZ A03;

    public H0(AbstractC0523Gj abstractC0523Gj, int i4, DZ dz, AbstractRunnableC0923Wc abstractRunnableC0923Wc) {
        this.A02 = abstractC0523Gj;
        this.A00 = i4;
        this.A03 = dz;
        this.A01 = abstractRunnableC0923Wc;
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() throws Throwable {
        this.A01.run();
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f10) {
        this.A02.A09.setProgress(100.0f * (1.0f - (f10 / this.A00)));
        if (this.A03 != null) {
            DZ dz = this.A03;
            float percentage = this.A00;
            dz.A07((int) ((percentage - f10) * 1000.0f));
        }
    }
}
