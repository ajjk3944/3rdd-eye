package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.ads.androidx.media3.common.Timeline;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.97, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass97 extends Timeline {
    public static byte[] A0D;
    public static final C3940oi A0E;
    public static final Object A0F;
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C3942ok A07;
    public final C3940oi A08;
    public final Object A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0D = new byte[]{-79, -57, -52, -59, -54, -61, -82, -61, -48, -57, -51, -62, -78, -57, -53, -61, -54, -57, -52, -61};
    }

    static {
        A01();
        A0F = new Object();
        A0E = new C2I().A03(A00(0, 20, 44)).A00(Uri.EMPTY).A05();
    }

    public AnonymousClass97(long j4, long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, boolean z12, Object obj, C3940oi c3940oi, C3942ok c3942ok) {
        this.A02 = j4;
        this.A06 = j10;
        this.A00 = j11;
        this.A01 = j12;
        this.A04 = j13;
        this.A05 = j14;
        this.A03 = j15;
        this.A0B = z10;
        this.A0A = z11;
        this.A0C = z12;
        this.A09 = obj;
        this.A08 = (C3940oi) C3M.A01(c3940oi);
        this.A07 = c3942ok;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AnonymousClass97(long j4, long j10, long j11, long j12, boolean z10, boolean z11, boolean z12, Object obj, C3940oi c3940oi) {
        C3942ok c3942ok;
        if (z12) {
            c3942ok = c3940oi.A02;
        } else {
            c3942ok = null;
        }
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j4, j10, j11, j12, z10, z11, false, obj, c3940oi, c3942ok);
    }

    public AnonymousClass97(long j4, boolean z10, boolean z11, boolean z12, Object obj, C3940oi c3940oi) {
        this(j4, j4, 0L, 0L, z10, z11, z12, obj, c3940oi);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A06() {
        return 1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A07() {
        return 1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0A(Object obj) {
        return A0F.equals(obj) ? 0 : -1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final C3920oN A0I(int i, C3920oN c3920oN, boolean z10) {
        C3M.A00(i, 0, 1);
        return c3920oN.A0F(null, z10 ? A0F : null, 0, this.A01, -this.A05);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final C3918oL A0L(int i, C3918oL c3918oL, long j4) {
        C3M.A00(i, 0, 1);
        long j10 = this.A03;
        if (this.A0A && !this.A0C && j4 != 0) {
            if (this.A04 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                j10 += j4;
                if (j10 > this.A04) {
                    j10 = -9223372036854775807L;
                }
            }
        }
        return c3918oL.A07(C3918oL.A0K, this.A08, this.A09, this.A02, this.A06, -9223372036854775807L, this.A0B, this.A0A, null, j10, this.A04, 0, 0, this.A05);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final Object A0M(int i) {
        C3M.A00(i, 0, 1);
        return A0F;
    }
}
