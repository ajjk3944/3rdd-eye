package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;

/* loaded from: assets/audience_network.dex */
public final class B8 {
    public final BU A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final DownloadRequest A07;

    public B8(DownloadRequest downloadRequest, int i, long j4, long j10, long j11, int i10, int i11) {
        this(downloadRequest, i, j4, j10, j11, i10, i11, new BU());
    }

    public B8(DownloadRequest downloadRequest, int i, long j4, long j10, long j11, int i10, int i11, BU bu) {
        C3M.A01(bu);
        C3M.A07((i11 == 0) == (i != 4));
        if (i10 != 0) {
            C3M.A07((i == 2 || i == 0) ? false : true);
        }
        this.A07 = downloadRequest;
        this.A02 = i;
        this.A05 = j4;
        this.A06 = j10;
        this.A04 = j11;
        this.A03 = i10;
        this.A01 = i11;
        this.A00 = bu;
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
