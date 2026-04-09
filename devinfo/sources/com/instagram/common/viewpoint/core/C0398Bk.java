package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;

/* renamed from: com.facebook.ads.redexgen.X.Bk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0398Bk {
    public final C6 A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final DownloadRequest A07;

    public C0398Bk(DownloadRequest downloadRequest, int i4, long j, long j8, long j9, int i10, int i11) {
        this(downloadRequest, i4, j, j8, j9, i10, i11, new C6());
    }

    public C0398Bk(DownloadRequest downloadRequest, int i4, long j, long j8, long j9, int i10, int i11, C6 c62) {
        AbstractC02203y.A01(c62);
        AbstractC02203y.A07((i11 == 0) == (i4 != 4));
        if (i10 != 0) {
            AbstractC02203y.A07((i4 == 2 || i4 == 0) ? false : true);
        }
        this.A07 = downloadRequest;
        this.A02 = i4;
        this.A05 = j;
        this.A06 = j8;
        this.A04 = j9;
        this.A03 = i10;
        this.A01 = i11;
        this.A00 = c62;
    }

    public final float A00() {
        return this.A00.A00;
    }

    public final long A01() {
        return this.A00.A01;
    }

    public final boolean A02() {
        return this.A02 == 3 || this.A02 == 4;
    }
}
