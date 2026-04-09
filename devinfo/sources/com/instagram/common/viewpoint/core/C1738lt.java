package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.facebook.ads.redexgen.X.lt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1738lt extends AbstractC0592Jb {
    public static byte[] A05;
    public static String[] A06 = {"uV3egKqPt", "vbtXlOI", "gip2ILD7nBGTUOP5yb7zSULibNYEk", "ypzju5tbq0Qdtgd67o3qNaulkzBfCJSX", "gCa1Tkio4U0hXnRqOcWVPONwWAtrpMS5", "m", "OXoEHzgO5FTzqO33f", "i"};
    public int A00;
    public C0547Hh A01;
    public C0549Hj A02;
    public C0593Jc A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C0593Jc A02(C02434v c02434v) throws IOException {
        if (this.A02 == null) {
            this.A02 = AbstractC0550Hk.A06(c02434v);
            return null;
        }
        if (this.A01 == null) {
            this.A01 = AbstractC0550Hk.A04(c02434v);
            return null;
        }
        C0549Hj c0549Hj = this.A02;
        C0547Hh c0547Hh = this.A01;
        byte[] bArr = new byte[c02434v.A0A()];
        System.arraycopy(c02434v.A0l(), 0, bArr, 0, c02434v.A0A());
        return new C0593Jc(c0549Hj, c0547Hh, bArr, AbstractC0550Hk.A0D(c02434v, c0549Hj.A05), AbstractC0550Hk.A00(r6.length - 1));
    }

    public static String A03(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{-108, -88, -105, -100, -94, 98, -87, -94, -91, -107, -100, -90};
    }

    static {
        A04();
    }

    public static int A00(byte b10, int i4, int i10) {
        return (b10 >> i10) & (255 >>> (8 - i4));
    }

    public static int A01(byte b10, C0593Jc c0593Jc) {
        if (!c0593Jc.A04[A00(b10, c0593Jc.A00, 1)].A03) {
            int modeNumber = c0593Jc.A02.A03;
            return modeNumber;
        }
        int modeNumber2 = c0593Jc.A02.A04;
        return modeNumber2;
    }

    public static void A05(C02434v c02434v, long j) {
        if (c02434v.A08() < c02434v.A0A() + 4) {
            c02434v.A0i(Arrays.copyOf(c02434v.A0l(), c02434v.A0A() + 4));
        } else {
            c02434v.A0e(c02434v.A0A() + 4);
        }
        byte[] bArrA0l = c02434v.A0l();
        bArrA0l[c02434v.A0A() - 4] = (byte) (j & 255);
        bArrA0l[c02434v.A0A() - 3] = (byte) ((j >>> 8) & 255);
        bArrA0l[c02434v.A0A() - 2] = (byte) ((j >>> 16) & 255);
        bArrA0l[c02434v.A0A() - 1] = (byte) (255 & (j >>> 24));
    }

    public static boolean A06(C02434v c02434v) {
        try {
            return AbstractC0550Hk.A0C(1, c02434v, true);
        } catch (C3K unused) {
            return false;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0592Jb
    public final long A09(C02434v c02434v) {
        int i4 = 0;
        if ((c02434v.A0l()[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = c02434v.A0l()[0];
        if (A06[4].charAt(1) != 'C') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[0] = "17tCp0Qcd";
        strArr[6] = "uqZ30DdcDRhFwj0kQ";
        int samplesInPacket = A01(b10, (C0593Jc) AbstractC02203y.A02(this.A03));
        if (this.A04) {
            int packetBlockSize = this.A00;
            i4 = (packetBlockSize + samplesInPacket) / 4;
        }
        A05(c02434v, i4);
        this.A04 = true;
        this.A00 = samplesInPacket;
        return i4;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0592Jb
    public final void A0A(long j) {
        super.A0A(j);
        this.A04 = j != 0;
        this.A00 = this.A02 != null ? this.A02.A03 : 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0592Jb
    public final void A0B(boolean z3) {
        super.A0B(z3);
        if (z3) {
            this.A03 = null;
            this.A02 = null;
            this.A01 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0592Jb
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0C(C02434v c02434v, long j, C0591Ja c0591Ja) throws IOException {
        if (this.A03 != null) {
            AbstractC02203y.A01(c0591Ja.A00);
            return false;
        }
        this.A03 = A02(c02434v);
        if (this.A03 == null) {
            return true;
        }
        C0593Jc c0593Jc = this.A03;
        C0549Hj c0549Hj = c0593Jc.A02;
        ArrayList<byte[]> codecInitializationData = new ArrayList<>();
        codecInitializationData.add(c0549Hj.A09);
        codecInitializationData.add(c0593Jc.A03);
        c0591Ja.A00 = new C01872p().A11(A03(0, 12, 22)).A0a(c0549Hj.A02).A0j(c0549Hj.A00).A0b(c0549Hj.A05).A0m(c0549Hj.A06).A12(codecInitializationData).A0v(AbstractC0550Hk.A02(MetaExoPlayerCustomizedCollections.A02(c0593Jc.A01.A02))).A14();
        return true;
    }
}
