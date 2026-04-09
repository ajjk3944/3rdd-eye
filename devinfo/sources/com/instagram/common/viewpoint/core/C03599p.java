package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Handler;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.9p, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C03599p implements InterfaceC1845np, HA, FI<C1843nn>, FM, DP {
    public static byte[] A0e;
    public static String[] A0f = {"o2fAJH6DTExx5HfWJCXs", "", "TsjJo55j6Kq128TfeQrvBtnORCvXohBg", "QpymssT", "p1Azi7mByqrjPk9ZTQVOCdIp8WANOiZ", "P8K3es9juVbjT7QsA9zjw4fZ7CWDxkC3", "f2TCNbDOQ", "8xae32DDfRwM"};
    public static final C1996qI A0g;
    public static final Map<String, String> A0h;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public InterfaceC1846nq A06;
    public DK A07;
    public HY A08;
    public IcyHeaders A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public DJ[] A0K;
    public C1830na[] A0L;
    public final long A0M;
    public final Uri A0N;
    public final Handler A0O;
    public final AnonymousClass48 A0P;
    public final InterfaceC1932pF A0Q;
    public final A1 A0R;
    public final A6 A0S;
    public final D8 A0T;
    public final DD A0U;
    public final DI A0V;
    public final F0 A0W;
    public final FF A0X;
    public final C1801n7 A0Y;
    public final Runnable A0Z;
    public final Runnable A0a;
    public final String A0b;
    public final boolean A0c;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"})
    public final boolean A0d;

    public static String A0B(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0e, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0I() {
        A0e = new byte[]{-76, -81, -55, -33, -109, -77, -53, -38, -57, -86, -57, -38, -57, -29, 6, -8, -5, -4, 9, -47, -25, 9, 6, -2, 9, -4, 10, 10, 0, 13, -4, -28, -4, -5, 0, -8, -25, -4, 9, 0, 6, -5, -62, -27, -41, -38, -33, -28, -35, -106, -36, -33, -28, -33, -23, -34, -37, -38, -106, -40, -37, -36, -27, -24, -37, -106, -26, -24, -37, -26, -41, -24, -41, -22, -33, -27, -28, -106, -33, -23, -106, -39, -27, -29, -26, -30, -37, -22, -37, -92, -49, -14, -28, -25, -20, -15, -22, -93, -23, -20, -15, -20, -10, -21, -24, -25, -93, -27, -24, -23, -14, -11, -24, -93, -13, -11, -24, -13, -28, -11, -28, -9, -20, -14, -15, -93, -20, -10, -93, -26, -14, -16, -13, -17, -24, -9, -24, -79, -93, -40, -43, -52, -67, -93, -12, 3, 3, -1, -4, -10, -12, 7, -4, 2, 1, -62, 11, -64, -4, -10, 12, -6, -12, 10, 47, 54, 45, 45};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    @Override // com.instagram.common.viewpoint.core.InterfaceC1845np
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long AJ9(com.instagram.common.viewpoint.core.InterfaceC1808nE[] r15, boolean[] r16, com.instagram.common.viewpoint.core.DT[] r17, boolean[] r18, long r19) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C03599p.AJ9(com.facebook.ads.redexgen.X.nE[], boolean[], com.facebook.ads.redexgen.X.DT[], boolean[], long):long");
    }

    static {
        A0I();
        A0h = A0D();
        A0g = new C01872p().A0y(A0B(161, 3, 77)).A11(A0B(144, 17, 79)).A14();
    }

    public C03599p(Uri uri, InterfaceC1932pF interfaceC1932pF, DD dd2, A6 a62, A1 a12, FF ff2, D8 d82, DI di2, F0 f02, String str, int i4, InterfaceExecutorC0490Fb interfaceExecutorC0490Fb) {
        C1801n7 c1801n7;
        this.A0N = uri;
        this.A0Q = interfaceC1932pF;
        this.A0S = a62;
        this.A0R = a12;
        this.A0X = ff2;
        this.A0T = d82;
        this.A0V = di2;
        this.A0W = f02;
        this.A0b = str;
        this.A0M = i4;
        if (interfaceExecutorC0490Fb != null) {
            c1801n7 = new C1801n7(interfaceExecutorC0490Fb);
        } else {
            c1801n7 = new C1801n7(A0B(13, 29, 83));
        }
        this.A0Y = c1801n7;
        this.A0U = dd2;
        this.A0P = new AnonymousClass48();
        this.A0Z = new Runnable() { // from class: com.facebook.ads.redexgen.X.DG
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0F();
            }
        };
        this.A0a = new Runnable() { // from class: com.facebook.ads.redexgen.X.DH
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0b();
            }
        };
        this.A0O = C5C.A0Y();
        this.A0K = new DJ[0];
        this.A0L = new C1830na[0];
        this.A05 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        this.A00 = 1;
        this.A0d = MetaExoPlayerUpgradeConfig.A03(EnumC1596jX.A0e) || MetaExoPlayerUpgradeConfig.A03(EnumC1596jX.A1j);
        this.A0c = MetaExoPlayerUpgradeConfig.A03(EnumC1596jX.A0g);
    }

    private int A00() {
        int i4 = 0;
        for (C1830na c1830na : this.A0L) {
            int extractedSamplesCount = c1830na.A0P();
            i4 += extractedSamplesCount;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long A03(boolean r8) {
        /*
            r7 = this;
            r1 = -9223372036854775808
            r5 = 0
        L3:
            com.facebook.ads.redexgen.X.na[] r0 = r7.A0L
            int r0 = r0.length
            if (r5 >= r0) goto L4b
            if (r8 != 0) goto L36
            com.facebook.ads.redexgen.X.DK r0 = r7.A07
            java.lang.Object r6 = com.instagram.common.viewpoint.core.AbstractC02203y.A01(r0)
            java.lang.String[] r4 = com.instagram.common.viewpoint.core.C03599p.A0f
            r0 = 6
            r3 = r4[r0]
            r0 = 7
            r0 = r4[r0]
            int r3 = r3.length()
            int r0 = r0.length()
            if (r3 == r0) goto L45
            java.lang.String[] r4 = com.instagram.common.viewpoint.core.C03599p.A0f
            java.lang.String r3 = "FDopTuaFs"
            r0 = 6
            r4[r0] = r3
            java.lang.String r3 = "ze95XzERDUjm"
            r0 = 7
            r4[r0] = r3
            com.facebook.ads.redexgen.X.DK r6 = (com.instagram.common.viewpoint.core.DK) r6
            boolean[] r0 = r6.A01
            boolean r0 = r0[r5]
            if (r0 == 0) goto L42
        L36:
            com.facebook.ads.redexgen.X.na[] r0 = r7.A0L
            r0 = r0[r5]
            long r3 = r0.A0T()
            long r1 = java.lang.Math.max(r1, r3)
        L42:
            int r5 = r5 + 1
            goto L3
        L45:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L4b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C03599p.A03(boolean):long");
    }

    private C1830na A06(DJ dj2) {
        int length = this.A0L.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (dj2.equals(this.A0K[i4])) {
                return this.A0L[i4];
            }
        }
        C1830na c1830naA0B = C1830na.A0B(this.A0W, this.A0S, this.A0R);
        c1830naA0B.A0d(this);
        int trackCount = length + 1;
        DJ[] djArr = (DJ[]) Arrays.copyOf(this.A0K, trackCount);
        djArr[length] = dj2;
        this.A0K = (DJ[]) C5C.A1H(djArr);
        int trackCount2 = length + 1;
        C1830na[] c1830naArr = (C1830na[]) Arrays.copyOf(this.A0L, trackCount2);
        c1830naArr[length] = c1830naA0B;
        this.A0L = (C1830na[]) C5C.A1H(c1830naArr);
        return c1830naA0B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.FI
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final FJ AEf(C1843nn c1843nn, long j, long j8, IOException iOException, int i4) {
        FJ fjA01;
        AG ag2 = c1843nn.A08;
        Cq cq = new Cq(c1843nn.A05, c1843nn.A01, ag2.A01(), ag2.A02(), j, j8, ag2.A00());
        long jA8u = this.A0X.A8u(new FE(cq, new C0429Cs(1, -1, null, 0, null, C5C.A0P(c1843nn.A00), C5C.A0P(this.A03)), iOException, i4));
        if (jA8u == -9223372036854775807L) {
            fjA01 = C1801n7.A06;
        } else {
            int iA00 = A00();
            boolean z3 = iA00 > this.A02;
            if (A0U(c1843nn, iA00)) {
                fjA01 = C1801n7.A01(z3, jA8u);
            } else {
                fjA01 = C1801n7.A05;
            }
        }
        this.A0T.A07(cq, 1, -1, null, 0, null, c1843nn.A00, this.A03, iOException, !fjA01.A02());
        return fjA01;
    }

    public static Map<String, String> A0D() {
        HashMap map = new HashMap();
        map.put(A0B(1, 12, 34), A0B(0, 1, 63));
        Map<String, String> headers = Collections.unmodifiableMap(map);
        return headers;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private void A0E() {
        AbstractC02203y.A08(this.A0G);
        AbstractC02203y.A01(this.A07);
        AbstractC02203y.A01(this.A08);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F() {
        Metadata metadataA05;
        if (this.A0H || this.A0G) {
            return;
        }
        boolean z3 = this.A0I;
        String[] strArr = A0f;
        if (strArr[1].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[2] = "grMxxjGjFdBhxw9MDZtvFg4OZy35nlzN";
        strArr2[5] = "E38rNlujzeckGRbn7d7aukKxtTtuF9Uw";
        if (!z3 || this.A08 == null) {
            return;
        }
        for (C1830na c1830na : this.A0L) {
            if (c1830na.A0U() == null) {
                return;
            }
        }
        this.A0P.A02();
        int length = this.A0L.length;
        C1959pg[] c1959pgArr = new C1959pg[length];
        boolean[] zArr = new boolean[length];
        for (int i4 = 0; i4 < length; i4++) {
            C1996qI c1996qIA14 = (C1996qI) AbstractC02203y.A01(this.A0L[i4].A0U());
            String str = c1996qIA14.A0W;
            boolean zA0C = C3J.A0C(str);
            boolean z10 = zA0C || C3J.A0F(str);
            zArr[i4] = z10;
            this.A0A |= z10;
            IcyHeaders icyHeaders = this.A09;
            if (icyHeaders != null) {
                if (zA0C || this.A0K[i4].A01) {
                    Metadata metadata = c1996qIA14.A0P;
                    if (metadata == null) {
                        metadataA05 = new Metadata(icyHeaders);
                    } else {
                        metadataA05 = metadata.A05(icyHeaders);
                    }
                    C01872p c01872pA0v = c1996qIA14.A07().A0v(metadataA05);
                    if (A0f[0].length() != 20) {
                        throw new RuntimeException();
                    }
                    String[] strArr3 = A0f;
                    strArr3[2] = "WsODqr3j7Qd6qKAaI5Z8JETVOkriGcMH";
                    strArr3[5] = "rCf1buyjz0YjJBdswvkAeWhqIr4TjJn3";
                    c1996qIA14 = c01872pA0v.A14();
                }
                if (zA0C) {
                    int trackCount = c1996qIA14.A04;
                    if (trackCount == -1) {
                        int trackCount2 = c1996qIA14.A0D;
                        if (trackCount2 == -1) {
                            int trackCount3 = icyHeaders.A00;
                            if (trackCount3 != -1) {
                                C01872p c01872pA07 = c1996qIA14.A07();
                                int trackCount4 = icyHeaders.A00;
                                c1996qIA14 = c01872pA07.A0a(trackCount4).A14();
                            }
                        }
                    }
                }
            }
            c1959pgArr[i4] = new C1959pg(c1996qIA14);
        }
        this.A07 = new DK(new C1826nW(c1959pgArr), zArr);
        this.A0G = true;
        ((InterfaceC1846nq) AbstractC02203y.A01(this.A06)).AFS(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G() {
        this.A0O.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.DF
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0c();
            }
        });
    }

    private void A0H() {
        C1843nn c1843nn = new C1843nn(this, this.A0N, this.A0Q, this.A0U, this, this.A0P);
        if (this.A0G) {
            AbstractC02203y.A08(A0S());
            if (this.A03 != -9223372036854775807L && this.A05 >= this.A03) {
                this.A0D = true;
                this.A05 = -9223372036854775807L;
                return;
            }
            c1843nn.A04(((HY) AbstractC02203y.A01(this.A08)).A91(this.A05).A00.A00, this.A05);
            for (C1830na c1830na : this.A0L) {
                c1830na.A0b(this.A05);
            }
            this.A05 = -9223372036854775807L;
        }
        this.A02 = A00();
        this.A0T.A06(new Cq(c1843nn.A05, c1843nn.A01, this.A0Y.A08(c1843nn, this, this.A0X.A8Z(this.A00))), 1, -1, null, 0, null, c1843nn.A00, this.A03, 0);
    }

    private final void A0J() throws IOException {
        this.A0Y.A0B(this.A0X.A8Z(this.A00));
    }

    private void A0K(int i4) {
        A0E();
        boolean[] zArr = this.A07.A03;
        if (!zArr[i4]) {
            C1996qI c1996qIA08 = this.A07.A00.A05(i4).A08(0);
            this.A0T.A03(C3J.A01(c1996qIA08.A0W), c1996qIA08, 0, null, this.A04);
            zArr[i4] = true;
        }
    }

    private void A0L(int i4) {
        A0E();
        boolean[] zArr = this.A07.A02;
        if (this.A0F && zArr[i4]) {
            if (this.A0L[i4].A0g(false)) {
                return;
            }
            this.A05 = 0L;
            this.A0F = false;
            this.A0E = true;
            this.A04 = 0L;
            this.A02 = 0;
            for (C1830na c1830na : this.A0L) {
                c1830na.A0Z();
            }
            ((InterfaceC1846nq) AbstractC02203y.A01(this.A06)).ADV(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.FI
    /* renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public final void AEe(C1843nn c1843nn, long j, long j8) {
        long largestQueuedTimestampUs;
        if (this.A03 == -9223372036854775807L && this.A08 != null) {
            boolean zAAj = this.A08.AAj();
            long jA03 = A03(true);
            String[] strArr = A0f;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0f;
            strArr2[6] = "VBgm4XD5c";
            strArr2[7] = "eM9hzsMViOdm";
            if (jA03 == Long.MIN_VALUE) {
                largestQueuedTimestampUs = 0;
            } else {
                largestQueuedTimestampUs = 10000 + jA03;
            }
            this.A03 = largestQueuedTimestampUs;
            this.A0V.AG0(this.A03, zAAj, this.A0C);
        }
        AG ag2 = c1843nn.A08;
        this.A0T.A08(new Cq(c1843nn.A05, c1843nn.A01, ag2.A01(), ag2.A02(), j, j8, ag2.A00()), 1, -1, null, 0, null, c1843nn.A00, this.A03, c1843nn, null);
        this.A0D = true;
        ((InterfaceC1846nq) AbstractC02203y.A01(this.A06)).ADV(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.FI
    /* renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public final void AEi(C1843nn c1843nn, long j, long j8, int i4) {
        Cq cq;
        AG dataSource = c1843nn.A08;
        if (i4 == 0) {
            cq = new Cq(c1843nn.A05, c1843nn.A01, j);
        } else {
            cq = new Cq(c1843nn.A05, c1843nn.A01, dataSource.A01(), dataSource.A02(), j, j8, dataSource.A00());
        }
        this.A0T.A06(cq, 1, -1, null, 0, null, c1843nn.A00, this.A03, i4);
        String[] strArr = A0f;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[6] = "RSQzFltms";
        strArr2[7] = "MablvJN0SXK9";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.FI
    /* renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public final void AEc(C1843nn c1843nn, long j, long j8, boolean z3) {
        AG dataSource = c1843nn.A08;
        this.A0T.A05(new Cq(c1843nn.A05, c1843nn.A01, dataSource.A01(), dataSource.A02(), j, j8, dataSource.A00()), 1, -1, null, 0, null, c1843nn.A00, this.A03);
        if (!z3) {
            for (C1830na c1830na : this.A0L) {
                c1830na.A0Z();
            }
            if (this.A01 > 0) {
                ((InterfaceC1846nq) AbstractC02203y.A01(this.A06)).ADV(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0R, reason: merged with bridge method [inline-methods] */
    public void A0e(HY hy) {
        this.A08 = hy;
        this.A03 = hy.A7t();
        this.A0C = !this.A0B && hy.A7t() == -9223372036854775807L;
        this.A00 = this.A0C ? 7 : 1;
        this.A0V.AG0(this.A03, hy.AAj(), this.A0C);
        if (!this.A0G) {
            A0F();
        }
    }

    private boolean A0S() {
        return this.A05 != -9223372036854775807L;
    }

    private boolean A0T() {
        return this.A0E || A0S();
    }

    private boolean A0U(C1843nn c1843nn, int i4) {
        if (this.A0B || (this.A08 != null && this.A08.A7t() != -9223372036854775807L)) {
            this.A02 = i4;
            return true;
        }
        if (this.A0G && !A0T()) {
            this.A0F = true;
            return false;
        }
        this.A0E = this.A0G;
        this.A04 = 0L;
        this.A02 = 0;
        for (C1830na c1830na : this.A0L) {
            c1830na.A0Z();
        }
        c1843nn.A04(0L, 0L);
        return true;
    }

    private boolean A0V(boolean[] zArr, long j) {
        int length = this.A0L.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (!this.A0L[i4].A0f(j, false) && (zArr[i4] || !this.A0A)) {
                return false;
            }
        }
        return true;
    }

    public final int A0X(int i4, long j) {
        if (A0T()) {
            return 0;
        }
        A0K(i4);
        C1830na c1830na = this.A0L[i4];
        int iA0Q = c1830na.A0Q(j, this.A0D);
        c1830na.A0a(iA0Q);
        if (iA0Q == 0) {
            A0L(i4);
        }
        return iA0Q;
    }

    public final int A0Y(int i4, C02996z c02996z, C1917p0 c1917p0, int i10) {
        if (A0T()) {
            return -3;
        }
        A0K(i4);
        int result = this.A0L[i4].A0R(c02996z, c1917p0, i10, this.A0D);
        if (result == -3) {
            A0L(i4);
        }
        return result;
    }

    public final InterfaceC0543Hd A0Z() {
        return A06(new DJ(0, true));
    }

    public final void A0a() {
        if (this.A0G) {
            for (C1830na c1830na : this.A0L) {
                c1830na.A0X();
            }
        }
        this.A0Y.A0C(this);
        this.A0O.removeCallbacksAndMessages(null);
        this.A06 = null;
        this.A0H = true;
    }

    public final /* synthetic */ void A0b() {
        if (!this.A0H) {
            ((InterfaceC1846nq) AbstractC02203y.A01(this.A06)).ADV(this);
        }
    }

    public final /* synthetic */ void A0c() {
        this.A0B = true;
    }

    public final void A0d(int i4) throws IOException {
        this.A0L[i4].A0W();
        A0J();
    }

    public final boolean A0f(int i4) {
        return !A0T() && this.A0L[i4].A0g(this.A0D);
    }

    @Override // com.instagram.common.viewpoint.core.DX
    @MetaExoPlayerCustomization("Added in D19760981 for cancel request")
    public final void A4s(long j) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1845np
    public final boolean A5C(long j) {
        if (this.A0D || this.A0Y.A0D() || this.A0F) {
            return false;
        }
        if (this.A0G && this.A01 == 0) {
            return false;
        }
        boolean zA04 = this.A0P.A04();
        boolean continuedLoading = this.A0Y.A0E();
        if (!continuedLoading) {
            A0H();
            return true;
        }
        return zA04;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1845np
    public final void A60(long j, boolean z3) {
        A0E();
        if (A0S()) {
            return;
        }
        boolean[] zArr = this.A07.A01;
        int length = this.A0L.length;
        for (int i4 = 0; i4 < length; i4++) {
            C1830na[] c1830naArr = this.A0L;
            String[] strArr = A0f;
            String str = strArr[6];
            String str2 = strArr[7];
            int trackCount = str.length();
            if (trackCount == str2.length()) {
                throw new RuntimeException();
            }
            A0f[0] = "xFMIvf7swbs88yH1ASsn";
            c1830naArr[i4].A0c(j, z3, zArr[i4]);
        }
    }

    @Override // com.instagram.common.viewpoint.core.HA
    public final void A6O() {
        this.A0I = true;
        this.A0O.post(this.A0Z);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1845np
    public final long A6r(long j, C03207u c03207u) {
        A0E();
        if (!this.A08.AAj()) {
            return 0L;
        }
        HX hxA91 = this.A08.A91(j);
        long j8 = hxA91.A00.A01;
        String[] strArr = A0f;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[2] = "A6SKS5Ejxr3dBguC5asmpR7Eo1U8ekaX";
        strArr2[5] = "H67kjT3j1V6FB1MougrbLEHHMAKkStlF";
        return c03207u.A00(j, j8, hxA91.A01.A01);
    }

    @Override // com.instagram.common.viewpoint.core.DX
    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Added in D9949576 for unstall buffer")
    public final long A76(long j) {
        if (this.A0d && !this.A0G) {
            return 0L;
        }
        if (this.A0D) {
            return this.A03 - j;
        }
        return A78() - j;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    @Override // com.instagram.common.viewpoint.core.InterfaceC1845np
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long A78() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C03599p.A78():long");
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1845np
    public final long A8b() {
        return A78();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1845np
    public final C1826nW A9M() {
        A0E();
        return this.A07.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1845np
    public final void ACS() throws IOException {
        A0J();
        if (this.A0D && !this.A0G) {
            if (this.A0c) {
                throw C3K.A01(A0B(90, 54, 63) + (this.A0N != null ? this.A0N.toString() : A0B(164, 4, 125)), null);
            }
            throw C3K.A01(A0B(42, 48, 50), null);
        }
    }

    @Override // com.instagram.common.viewpoint.core.FM
    public final void AEj() {
        for (C1830na c1830na : this.A0L) {
            c1830na.A0Y();
        }
        this.A0U.AHb();
    }

    @Override // com.instagram.common.viewpoint.core.DP
    public final void AGL(C1996qI c1996qI) {
        this.A0O.post(this.A0Z);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1845np
    public final void AH5(InterfaceC1846nq interfaceC1846nq, long j) {
        this.A06 = interfaceC1846nq;
        this.A0P.A04();
        A0H();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1845np
    public final long AHQ() {
        if (!this.A0E) {
            return -9223372036854775807L;
        }
        boolean z3 = this.A0D;
        if (A0f[0].length() == 20) {
            String[] strArr = A0f;
            strArr[1] = "";
            strArr[4] = "OLDtf0M6xpFiQAaUF2mFzXoKXa03XjZ";
            if (z3 || A00() > this.A02) {
                this.A0E = false;
                long j = this.A04;
                if (A0f[0].length() == 20) {
                    String[] strArr2 = A0f;
                    strArr2[6] = "30bUCuPdV";
                    strArr2[7] = "qvk1tPvPLdJz";
                    return j;
                }
            } else {
                return -9223372036854775807L;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1845np
    public final void AHW(long j) {
    }

    @Override // com.instagram.common.viewpoint.core.HA
    public final void AJ7(final HY hy) {
        this.A0O.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.DE
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0e(hy);
            }
        });
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1845np
    public final long AJ8(@MetaExoPlayerCustomization long j, boolean z3) {
        A0E();
        boolean[] zArr = this.A07.A02;
        if (!this.A08.AAj()) {
            j = 0;
        }
        int i4 = 0;
        this.A0E = false;
        this.A04 = j;
        if (A0S()) {
            this.A05 = j;
            return j;
        }
        if (this.A00 != 7 && A0V(zArr, j)) {
            return j;
        }
        this.A0F = false;
        this.A05 = j;
        this.A0D = false;
        if (this.A0Y.A0E()) {
            C1830na[] c1830naArr = this.A0L;
            int length = c1830naArr.length;
            while (i4 < length) {
                c1830naArr[i4].A0V();
                String[] strArr = A0f;
                if (strArr[6].length() == strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0f;
                strArr2[2] = "OrOS7Vhjp4VBbz175mMxq2SuFvjpl5bQ";
                strArr2[5] = "EAKZg7yj0ctHJiN4FHg90oFZJxg2ecfG";
                i4++;
            }
            this.A0Y.A09();
            return j;
        }
        this.A0Y.A0A();
        C1830na[] c1830naArr2 = this.A0L;
        int length2 = c1830naArr2.length;
        while (i4 < length2) {
            c1830naArr2[i4].A0Z();
            String[] strArr3 = A0f;
            if (strArr3[2].charAt(7) != strArr3[5].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0f;
            strArr4[6] = "p5drqiHAR";
            strArr4[7] = "h8TdfbRbJweW";
            i4++;
        }
        return j;
    }

    @Override // com.instagram.common.viewpoint.core.DX
    @MetaExoPlayerCustomization("Added in D19875605 for error load during pause")
    public final void AJc(boolean z3) {
    }

    @Override // com.instagram.common.viewpoint.core.HA
    public final InterfaceC0543Hd AKS(int i4, int i10) {
        return A06(new DJ(i4, false));
    }

    @Override // com.instagram.common.viewpoint.core.DX
    @MetaExoPlayerCustomization("Added in D13267633 for lower priority during pause")
    public final void AKb(byte b10) {
    }
}
