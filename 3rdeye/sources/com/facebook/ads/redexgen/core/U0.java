package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public class U0 {
    public final int A00;
    public final C2912Tx A01;

    public U0(int i, C2912Tx c2912Tx) {
        this.A00 = i;
        this.A01 = c2912Tx;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() throws IOException {
        return this.A01.A05();
    }

    public final C2903To A02(int i, byte[] bArr, int i10, int[] iArr, int i11) throws IOException {
        return this.A01.A06(i, bArr, i10, iArr, i11);
    }

    public final void A03() throws IOException {
        this.A01.A07();
    }

    public final void A04() throws IOException {
        this.A01.A08();
    }

    public final boolean A05(byte[] bArr) throws IOException {
        return this.A01.A09(bArr);
    }
}
