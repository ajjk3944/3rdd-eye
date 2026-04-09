package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.ColorInfo;

/* renamed from: com.facebook.ads.redexgen.X.2a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C01742a {
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public C01742a() {
        this.A01 = -1;
        this.A00 = -1;
        this.A02 = -1;
    }

    public C01742a(ColorInfo colorInfo) {
        this.A01 = colorInfo.A02;
        this.A00 = colorInfo.A01;
        this.A02 = colorInfo.A03;
        this.A03 = colorInfo.A04;
    }

    public final C01742a A00(int i4) {
        this.A00 = i4;
        return this;
    }

    public final C01742a A01(int i4) {
        this.A01 = i4;
        return this;
    }

    public final C01742a A02(int i4) {
        this.A02 = i4;
        return this;
    }

    public final ColorInfo A03() {
        return new ColorInfo(this.A01, this.A00, this.A02, this.A03);
    }
}
