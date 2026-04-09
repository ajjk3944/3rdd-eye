package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.facebook.ads.androidx.media3.common.Timeline;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.9m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C03569m extends Timeline {
    public static byte[] A0D;
    public static final C1985q7 A0E;
    public static final Object A0F;
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C1988qA A07;
    public final C1985q7 A08;
    public final Object A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i4, i4 + i10);
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
        A0E = new C01922u().A03(A00(0, 20, 44)).A00(Uri.EMPTY).A05();
    }

    public C03569m(long j, long j8, long j9, long j10, long j11, long j12, long j13, boolean z3, boolean z10, boolean z11, Object obj, C1985q7 c1985q7, C1988qA c1988qA) {
        this.A02 = j;
        this.A06 = j8;
        this.A00 = j9;
        this.A01 = j10;
        this.A04 = j11;
        this.A05 = j12;
        this.A03 = j13;
        this.A0B = z3;
        this.A0A = z10;
        this.A0C = z11;
        this.A09 = obj;
        this.A08 = (C1985q7) AbstractC02203y.A01(c1985q7);
        this.A07 = c1988qA;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C03569m(long j, long j8, long j9, long j10, boolean z3, boolean z10, boolean z11, Object obj, C1985q7 c1985q7) {
        C1988qA c1988qA;
        if (z11) {
            c1988qA = c1985q7.A02;
        } else {
            c1988qA = null;
        }
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j8, j9, j10, z3, z10, false, obj, c1985q7, c1988qA);
    }

    public C03569m(long j, boolean z3, boolean z10, boolean z11, Object obj, C1985q7 c1985q7) {
        this(j, j, 0L, 0L, z3, z10, z11, obj, c1985q7);
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
    public final C1963pl A0I(int i4, C1963pl c1963pl, boolean z3) {
        AbstractC02203y.A00(i4, 0, 1);
        return c1963pl.A0F(null, z3 ? A0F : null, 0, this.A01, -this.A05);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final C1961pj A0L(int i4, C1961pj c1961pj, long j) {
        AbstractC02203y.A00(i4, 0, 1);
        long j8 = this.A03;
        if (this.A0A && !this.A0C && j != 0) {
            if (this.A04 == -9223372036854775807L) {
                j8 = -9223372036854775807L;
            } else {
                j8 += j;
                if (j8 > this.A04) {
                    j8 = -9223372036854775807L;
                }
            }
        }
        return c1961pj.A07(C1961pj.A0K, this.A08, this.A09, this.A02, this.A06, -9223372036854775807L, this.A0B, this.A0A, null, j8, this.A04, 0, 0, this.A05);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final Object A0M(int i4) {
        AbstractC02203y.A00(i4, 0, 1);
        return A0F;
    }
}
