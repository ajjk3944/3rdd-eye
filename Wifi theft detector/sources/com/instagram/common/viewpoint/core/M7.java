package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class M7 implements InterfaceC1453ar {
    public final /* synthetic */ M6 A00;

    public M7(M6 m62) {
        this.A00 = m62;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1453ar
    public final void ADB(boolean z10) {
        this.A00.A0D(z10);
        if (this.A00.A0B && this.A00.A00 != null) {
            this.A00.A00.setEnabled(z10);
            this.A00.A00.setAlpha(z10 ? 1.0f : 0.3f);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1453ar
    public final void ADx(boolean z10) {
        this.A00.A0D(z10);
        if (this.A00.A0B && this.A00.A02 != null) {
            this.A00.A02.setEnabled(z10);
            this.A00.A02.setAlpha(z10 ? 1.0f : 0.3f);
        }
    }
}
