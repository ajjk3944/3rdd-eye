package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Gl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0903Gl implements InterfaceC1348Ya {
    public final /* synthetic */ AbstractC0901Gj A00;

    public C0903Gl(AbstractC0901Gj abstractC0901Gj) {
        this.A00 = abstractC0901Gj;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1348Ya
    public final void ACl(AbstractC1349Yb abstractC1349Yb) {
        if (abstractC1349Yb.getToolbarActionMode() == 8) {
            this.A00.A0g();
            return;
        }
        this.A00.A07.A04(VH.A07, null);
        if (this.A00.A0l()) {
            return;
        }
        this.A00.A05.A0F().AB0();
        this.A00.A0A.A4j(this.A00.A0B.A7w());
    }
}
