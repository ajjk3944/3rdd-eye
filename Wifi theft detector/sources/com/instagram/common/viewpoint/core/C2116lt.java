package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.facebook.ads.redexgen.X.lt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2116lt extends AbstractC0970Jb {
    public static byte[] A05;
    public static String[] A06 = {"uV3egKqPt", "vbtXlOI", "gip2ILD7nBGTUOP5yb7zSULibNYEk", "ypzju5tbq0Qdtgd67o3qNaulkzBfCJSX", "gCa1Tkio4U0hXnRqOcWVPONwWAtrpMS5", "m", "OXoEHzgO5FTzqO33f", "i"};
    public int A00;
    public C0925Hh A01;
    public C0927Hj A02;
    public C0971Jc A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C0971Jc A02(C06214v c06214v) throws IOException {
        if (this.A02 == null) {
            this.A02 = AbstractC0928Hk.A06(c06214v);
            return null;
        }
        if (this.A01 == null) {
            this.A01 = AbstractC0928Hk.A04(c06214v);
            return null;
        }
        C0927Hj c0927Hj = this.A02;
        C0925Hh c0925Hh = this.A01;
        byte[] bArr = new byte[c06214v.A0A()];
        System.arraycopy(c06214v.A0l(), 0, bArr, 0, c06214v.A0A());
        return new C0971Jc(c0927Hj, c0925Hh, bArr, AbstractC0928Hk.A0D(c06214v, c0927Hj.A05), AbstractC0928Hk.A00(r6.length - 1));
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{-108, -88, -105, -100, -94, 98, -87, -94, -91, -107, -100, -90};
    }

    static {
        A04();
    }

    public static int A00(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static int A01(byte b10, C0971Jc c0971Jc) {
        if (!c0971Jc.A04[A00(b10, c0971Jc.A00, 1)].A03) {
            int modeNumber = c0971Jc.A02.A03;
            return modeNumber;
        }
        int modeNumber2 = c0971Jc.A02.A04;
        return modeNumber2;
    }

    public static void A05(C06214v c06214v, long j10) {
        if (c06214v.A08() < c06214v.A0A() + 4) {
            c06214v.A0i(Arrays.copyOf(c06214v.A0l(), c06214v.A0A() + 4));
        } else {
            c06214v.A0e(c06214v.A0A() + 4);
        }
        byte[] bArrA0l = c06214v.A0l();
        bArrA0l[c06214v.A0A() - 4] = (byte) (j10 & 255);
        bArrA0l[c06214v.A0A() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrA0l[c06214v.A0A() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrA0l[c06214v.A0A() - 1] = (byte) (255 & (j10 >>> 24));
    }

    public static boolean A06(C06214v c06214v) {
        try {
            return AbstractC0928Hk.A0C(1, c06214v, true);
        } catch (C3K unused) {
            return false;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0970Jb
    public final long A09(C06214v c06214v) {
        int i10 = 0;
        if ((c06214v.A0l()[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = c06214v.A0l()[0];
        if (A06[4].charAt(1) != 'C') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[0] = "17tCp0Qcd";
        strArr[6] = "uqZ30DdcDRhFwj0kQ";
        int samplesInPacket = A01(b10, (C0971Jc) AbstractC05983y.A02(this.A03));
        if (this.A04) {
            int packetBlockSize = this.A00;
            i10 = (packetBlockSize + samplesInPacket) / 4;
        }
        A05(c06214v, i10);
        this.A04 = true;
        this.A00 = samplesInPacket;
        return i10;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0970Jb
    public final void A0A(long j10) {
        super.A0A(j10);
        this.A04 = j10 != 0;
        this.A00 = this.A02 != null ? this.A02.A03 : 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0970Jb
    public final void A0B(boolean z10) {
        super.A0B(z10);
        if (z10) {
            this.A03 = null;
            this.A02 = null;
            this.A01 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0970Jb
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0C(C06214v c06214v, long j10, C0969Ja c0969Ja) throws IOException {
        if (this.A03 != null) {
            AbstractC05983y.A01(c0969Ja.A00);
            return false;
        }
        this.A03 = A02(c06214v);
        if (this.A03 == null) {
            return true;
        }
        C0971Jc c0971Jc = this.A03;
        C0927Hj c0927Hj = c0971Jc.A02;
        ArrayList<byte[]> codecInitializationData = new ArrayList<>();
        codecInitializationData.add(c0927Hj.A09);
        codecInitializationData.add(c0971Jc.A03);
        c0969Ja.A00 = new C05652p().A11(A03(0, 12, 22)).A0a(c0927Hj.A02).A0j(c0927Hj.A00).A0b(c0927Hj.A05).A0m(c0927Hj.A06).A12(codecInitializationData).A0v(AbstractC0928Hk.A02(MetaExoPlayerCustomizedCollections.A02(c0971Jc.A01.A02))).A14();
        return true;
    }
}
