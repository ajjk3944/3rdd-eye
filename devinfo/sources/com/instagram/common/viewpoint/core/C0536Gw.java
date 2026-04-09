package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Gw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0536Gw {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public final long A05;
    public final long A06;
    public final long A07;

    public C0536Gw(long j, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.A06 = j;
        this.A07 = j8;
        this.A03 = j9;
        this.A01 = j10;
        this.A02 = j11;
        this.A00 = j12;
        this.A05 = j13;
        this.A04 = A05(j8, j9, j10, j11, j12, j13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A00() {
        return this.A00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A01() {
        return this.A02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A02() {
        return this.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A03() {
        return this.A06;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A04() {
        return this.A07;
    }

    public static long A05(long j, long j8, long j9, long bytesToSkip, long confidenceInterval, long j10) {
        if (bytesToSkip + 1 >= confidenceInterval || j8 + 1 >= j9) {
            return bytesToSkip;
        }
        long j11 = (long) ((j - j8) * ((confidenceInterval - bytesToSkip) / (j9 - j8)));
        return C5C.A0T(((bytesToSkip + j11) - j10) - (j11 / 20), bytesToSkip, confidenceInterval - 1);
    }

    private void A0B() {
        this.A04 = A05(this.A07, this.A03, this.A01, this.A02, this.A00, this.A05);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(long j, long j8) {
        this.A01 = j;
        this.A00 = j8;
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(long j, long j8) {
        this.A03 = j;
        this.A02 = j8;
        A0B();
    }
}
