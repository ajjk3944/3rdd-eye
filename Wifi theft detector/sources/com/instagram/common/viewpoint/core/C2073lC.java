package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.lC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2073lC extends H2 {
    public C2073lC(AnonymousClass53 anonymousClass53, long j10, long j11) {
        super(new C2171mz(), new C2074lD(anonymousClass53), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    public static int A00(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8) | (bArr[i10 + 3] & 255);
    }
}
