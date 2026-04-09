package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Lf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2691Lf implements InterfaceC3001Xl {
    public static String[] A01 = {"dAENZa04S5kpLZ1505OVGzU", "BCWAX", "x4EBtM5L1", "d5mzvX7vdf5oGTbdkf23a85QS6J33UuP", "T3xMk8xyeuXfnP2cHDF22zgmf4sSWk7a", "D6RnJQb1nSkQk7teZoJG77p", "lMrZ8D5HcAsH09zpnUIM78ubrFXrhoz6", "r7D6OIPJDO7XxyVdFUwVLtQI1zZlrgYr"};
    public final /* synthetic */ C2688Lc A00;

    public C2691Lf(C2688Lc c2688Lc) {
        this.A00 = c2688Lc;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3001Xl
    public final void ACC(AbstractC3002Xm abstractC3002Xm) {
        if (this.A00.A0W() && !this.A00.A0V.get()) {
            this.A00.A0T.A07(this.A00);
            return;
        }
        C2688Lc c2688Lc = this.A00;
        if (A01[4].charAt(5) == '8') {
            A01[1] = "011C";
            if (!c2688Lc.A0X || this.A00.A0V.get() || !this.A00.A0V()) {
                this.A00.A0N.A04(UZ.A07, null);
                if (this.A00.A0J.A0P()) {
                    this.A00.A0L.A0F().ADk();
                }
                InterfaceC3003Xn interfaceC3003Xn = this.A00.A0Q;
                C2688Lc c2688Lc2 = this.A00;
                if (A01[2].length() == 9) {
                    A01[6] = "SsRiNY9tvP3hEWy4eyTF9NsffnrPtCfL";
                    interfaceC3003Xn.A4b(c2688Lc2.A0R.A7o());
                    return;
                }
            } else {
                this.A00.A0a.setToolbarActionMode(0);
                this.A00.A0L();
                return;
            }
        }
        throw new RuntimeException();
    }
}
