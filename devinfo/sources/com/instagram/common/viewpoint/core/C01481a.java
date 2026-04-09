package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.1a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C01481a extends AbstractC03559j {
    public static byte[] A0H;
    public static String[] A0I = {"m5Q3aiQKICJZrVflAtkG72aHaW7D7vzV", "Te6TlfxhDkM1nSnzhWnFswazR8GhYsIL", "RAA", "kEgqAeLW1EWE377lDOv4M7tHjIvdZKXO", "06ys5nuQ5LNcvNVR71UhF3Tfl10HYLje", "yFo", "kDpjkJehLDjfyQcmHJ0GXPIrbeMaoLDA", "wnjbAtiJPFcw6YA"};
    public C9l A00;
    public float A01;
    public int A02;
    public int A03;
    public long A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final BP<EU> A0B;
    public final float A0C;
    public final int A0D;
    public final long A0E;
    public final AnonymousClass45 A0F;
    public final F6 A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C01481a(@MetaExoPlayerCustomization("Used for OculusAdaptiveTrackSelection") C1959pg c1959pg, @MetaExoPlayerCustomization("Used to retain old value for Oculus") int[] iArr, int i4, F6 f62, int i10, long j, long j8, long j9, int i11, int i12, float f10, float f11, long j10, List<EU> list, AnonymousClass45 anonymousClass45) {
        super(c1959pg, iArr, i4);
        if (j9 < j) {
            AbstractC02284g.A07(A03(0, 22, 43), A03(22, 90, 50));
            j9 = j;
        }
        this.A0G = f62;
        this.A0D = i10;
        this.A08 = j * 1000;
        this.A0E = j8 * 1000;
        this.A09 = 1000 * j9;
        this.A07 = i11;
        this.A06 = i12;
        this.A0C = f10;
        this.A05 = f11;
        this.A0B = BP.A05(list);
        this.A0A = j10;
        this.A0F = anonymousClass45;
        this.A01 = 1.0f;
        this.A02 = 0;
        this.A04 = -9223372036854775807L;
    }

    public static String A03(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 89);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0H = new byte[]{-59, -24, -27, -12, -8, -19, -6, -23, -40, -10, -27, -25, -17, -41, -23, -16, -23, -25, -8, -19, -13, -14, -52, -17, -11, 0, -2, -1, -12, -7, -14, -85, -8, -12, -7, -49, 0, -3, -20, -1, -12, -6, -7, -33, -6, -35, -16, -1, -20, -12, -7, -52, -15, -1, -16, -3, -49, -12, -2, -18, -20, -3, -17, -40, -2, -85, -1, -6, -85, -19, -16, -85, -20, -1, -85, -9, -16, -20, -2, -1, -85, -8, -12, -7, -49, 0, -3, -20, -1, -12, -6, -7, -47, -6, -3, -36, 0, -20, -9, -12, -1, 4, -44, -7, -18, -3, -16, -20, -2, -16, -40, -2};
    }

    static {
        A04();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint>> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<java.lang.Integer> */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.instagram.common.viewpoint.core.BP<com.instagram.common.viewpoint.core.BP<com.instagram.common.viewpoint.core.EU>> A00(com.instagram.common.viewpoint.core.C0474El[] r12) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C01481a.A00(com.facebook.ads.redexgen.X.El[]):com.facebook.ads.redexgen.X.BP");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.q3 != com.google.common.collect.Multimap<java.lang.Double, java.lang.Integer> */
    public static BP<Integer> A02(long[][] jArr) {
        InterfaceC1981q3 interfaceC1981q3A00 = AbstractC1983q5.A02().A03().A00();
        for (int i4 = 0; i4 < jArr.length; i4++) {
            if (jArr[i4].length > 1) {
                double[] logBitrates = new double[jArr[i4].length];
                int i10 = 0;
                while (true) {
                    double dLog = 0.0d;
                    if (i10 >= jArr[i4].length) {
                        break;
                    }
                    if (jArr[i4][i10] != -1) {
                        dLog = Math.log(jArr[i4][i10]);
                    }
                    logBitrates[i10] = dLog;
                    i10++;
                }
                double d10 = logBitrates[logBitrates.length - 1] - logBitrates[0];
                int i11 = 0;
                for (int i12 = 1; i11 < logBitrates.length - i12; i12 = 1) {
                    interfaceC1981q3A00.AHE(Double.valueOf(d10 == 0.0d ? 1.0d : (((logBitrates[i11] + logBitrates[i11 + 1]) * 0.5d) - logBitrates[0]) / d10), Integer.valueOf(i4));
                    i11++;
                }
            }
        }
        return BP.A05(interfaceC1981q3A00.values());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    public static void A05(List<C2K<EU>> list, long[] jArr) {
        long j = 0;
        int i4 = 0;
        while (true) {
            if (i4 < jArr.length) {
                long j8 = jArr[i4];
                String[] strArr = A0I;
                if (strArr[5].length() != strArr[2].length()) {
                    break;
                }
                A0I[0] = "hzQzkxJwAHZ0fRiIn7Pvrd3jIUiof14p";
                j += j8;
                i4++;
            } else {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    C2K<EU> c2k = list.get(i10);
                    if (A0I[0].charAt(10) != 'x') {
                        A0I[0] = "0V4VZlbFayh1Opq7Ah9Nva0ccysrREXP";
                        if (c2k != null) {
                            c2k.A04(new EU(j, jArr[i10]));
                        }
                    }
                }
                return;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e A[PHI: r5
  0x006e: PHI (r5v2 long[]) = (r5v0 long[]), (r5v3 long[]) binds: [B:21:0x007c, B:17:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long[][] A06(com.instagram.common.viewpoint.core.C0474El[] r10) {
        /*
            int r0 = r10.length
            long[][] r9 = new long[r0][]
            r8 = 0
        L4:
            int r0 = r10.length
            if (r8 >= r0) goto L8b
            r7 = r10[r8]
            if (r7 != 0) goto L13
            r0 = 0
            long[] r0 = new long[r0]
            r9[r8] = r0
        L10:
            int r8 = r8 + 1
            goto L4
        L13:
            int[] r0 = r7.A02
            int r0 = r0.length
            long[] r3 = new long[r0]
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C01481a.A0I
            r0 = 6
            r1 = r2[r0]
            r0 = 3
            r2 = r2[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L85
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C01481a.A0I
            java.lang.String r1 = "e4C"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "lZL"
            r0 = 2
            r2[r0] = r1
            r9[r8] = r3
            r6 = 0
        L3b:
            int[] r0 = r7.A02
            int r0 = r0.length
            if (r6 >= r0) goto L7f
            com.facebook.ads.redexgen.X.pg r1 = r7.A01
            int[] r0 = r7.A02
            r0 = r0[r6]
            com.facebook.ads.redexgen.X.qI r0 = r1.A08(r0)
            int r3 = r0.A05
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C01481a.A0I
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 11
            if (r1 == r0) goto L75
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C01481a.A0I
            java.lang.String r1 = "HL2"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "liv"
            r0 = 2
            r2[r0] = r1
            long r3 = (long) r3
            r5 = r9[r8]
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L70
        L6e:
            r3 = 0
        L70:
            r5[r6] = r3
            int r6 = r6 + 1
            goto L3b
        L75:
            long r3 = (long) r3
            r5 = r9[r8]
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L70
            goto L6e
        L7f:
            r0 = r9[r8]
            java.util.Arrays.sort(r0)
            goto L10
        L85:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L8b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C01481a.A06(com.facebook.ads.redexgen.X.El[]):long[][]");
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC03559j, com.instagram.common.viewpoint.core.InterfaceC1808nE
    public final void A5x() {
        this.A00 = null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC03559j, com.instagram.common.viewpoint.core.InterfaceC1808nE
    public final void A6K() {
        this.A04 = -9223372036854775807L;
        this.A00 = null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1808nE
    public final int A93() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC03559j, com.instagram.common.viewpoint.core.InterfaceC1808nE
    public final void AFJ(float f10) {
        this.A01 = f10;
    }
}
