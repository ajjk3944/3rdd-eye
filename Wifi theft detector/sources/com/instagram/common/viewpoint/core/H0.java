package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class H0 implements XN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractRunnableC1301Wc A01;
    public final /* synthetic */ AbstractC0901Gj A02;
    public final /* synthetic */ DZ A03;

    public H0(AbstractC0901Gj abstractC0901Gj, int i10, DZ dz, AbstractRunnableC1301Wc abstractRunnableC1301Wc) {
        this.A02 = abstractC0901Gj;
        this.A00 = i10;
        this.A03 = dz;
        this.A01 = abstractRunnableC1301Wc;
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
