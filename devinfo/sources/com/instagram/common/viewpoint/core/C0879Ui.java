package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Ui, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0879Ui {
    public final int A00;
    public final C0876Uf A01;

    public C0879Ui(int i4, C0876Uf c0876Uf) {
        this.A00 = i4;
        this.A01 = c0876Uf;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() throws IOException {
        return this.A01.A05();
    }

    public final UW A02(int i4, byte[] bArr, int i10, int[] iArr, int i11) throws IOException {
        return this.A01.A06(i4, bArr, i10, iArr, i11);
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
