package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.jg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3645jg extends GQ {
    public C3645jg(C4R c4r, long j4, long j10) {
        super(new C3744lU(), new C3646jh(c4r), j4, 0L, j4 + 1, 0L, j10, 188L, 1000);
    }

    public static int A00(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }
}
