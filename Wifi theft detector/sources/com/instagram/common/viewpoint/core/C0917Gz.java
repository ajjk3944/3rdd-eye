package com.instagram.common.viewpoint.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* renamed from: com.facebook.ads.redexgen.X.Gz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0917Gz {
    public static final C0917Gz A03 = new C0917Gz(-3, C.TIME_UNSET, -1);
    public final int A00;
    public final long A01;
    public final long A02;

    public C0917Gz(int i10, long j10, long j11) {
        this.A00 = i10;
        this.A02 = j10;
        this.A01 = j11;
    }

    public static C0917Gz A03(long j10) {
        return new C0917Gz(0, C.TIME_UNSET, j10);
    }

    public static C0917Gz A04(long j10, long j11) {
        return new C0917Gz(-1, j10, j11);
    }

    public static C0917Gz A05(long j10, long j11) {
        return new C0917Gz(-2, j10, j11);
    }
}
