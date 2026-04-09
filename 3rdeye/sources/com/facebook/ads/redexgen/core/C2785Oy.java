package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Oy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2785Oy implements X5 {
    public int A00;
    public final X5 A01;
    public final X5 A02;

    public C2785Oy(X5 x52, int i, X5 x53) {
        this.A01 = x52;
        this.A00 = i;
        this.A02 = x53;
    }

    @Override // com.facebook.ads.redexgen.core.X5
    public final void AGO(String str) {
        if (this.A00 > 0) {
            this.A01.AGO(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.AGO(str);
    }

    @Override // com.facebook.ads.redexgen.core.X5
    public final void flush() {
        this.A02.flush();
    }
}
