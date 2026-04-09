package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.facebook.ads.redexgen.X.lv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2118lv extends AbstractC0970Jb {
    public static byte[] A01;
    public static String[] A02 = {"llfHvvp5w7AsdcfCf5e", "amqCmPcUyTwYr5NdTloeCtiw", "0NAIhycYLxj75", "dj34azdkZPKXRKaV6TbpL4Sg", "ijcAEj6S85lKiCQyoflHjypUMqTEGqRn", "eY0hdp8", "jqGnWXF3Z8AkxtecEpgwxV1mUEmkJWKs", "4zwbE0EN4gXO5y3Vp0p"};
    public static final byte[] A03;
    public static final byte[] A04;
    public boolean A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 125);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-1, 19, 2, 7, 13, -51, 13, 14, 19, 17};
    }

    static {
        A01();
        A04 = new byte[]{79, 112, 117, 115, 72, 101, 97, 100};
        A03 = new byte[]{79, 112, 117, 115, 84, 97, 103, 115};
    }

    public static boolean A02(C06214v c06214v) {
        return A03(c06214v, A04);
    }

    public static boolean A03(C06214v c06214v, byte[] bArr) {
        if (c06214v.A07() < bArr.length) {
            return false;
        }
        int iA09 = c06214v.A09();
        int startPosition = bArr.length;
        byte[] header = new byte[startPosition];
        int startPosition2 = bArr.length;
        c06214v.A0k(header, 0, startPosition2);
        c06214v.A0f(iA09);
        return Arrays.equals(header, bArr);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0970Jb
    public final long A09(C06214v c06214v) {
        return A06(HT.A05(c06214v.A0l()));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0970Jb
    public final void A0B(boolean z10) {
        super.A0B(z10);
        if (z10) {
            this.A00 = false;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0970Jb
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    @MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
    public final boolean A0C(C06214v c06214v, long j10, C0969Ja c0969Ja) throws C3K {
        if (A03(c06214v, A04)) {
            byte[] headerBytes = Arrays.copyOf(c06214v.A0l(), c06214v.A0A());
            int iA01 = HT.A01(headerBytes);
            List<byte[]> listA06 = HT.A06(headerBytes);
            if (c0969Ja.A00 != null) {
                return true;
            }
            c0969Ja.A00 = new C05652p().A11(A00(0, 10, 33)).A0b(iA01).A0m(48000).A12(listA06).A14();
            return true;
        }
        if (A03(c06214v, A03)) {
            AbstractC05983y.A02(c0969Ja.A00);
            if (this.A00) {
                return true;
            }
            this.A00 = true;
            c06214v.A0g(A03.length);
            C0925Hh commentHeader = AbstractC0928Hk.A05(c06214v, false, false);
            Metadata metadataA02 = AbstractC0928Hk.A02(MetaExoPlayerCustomizedCollections.A02(commentHeader.A02));
            if (metadataA02 == null) {
                return true;
            }
            C05652p c05652pA07 = c0969Ja.A00.A07();
            String[] strArr = A02;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "80vtnZ0VGuLh5BtNytGnkcmL";
            strArr2[1] = "kfnMkjsOg47yHVBMKsSTRfGb";
            c0969Ja.A00 = c05652pA07.A0v(metadataA02.A04(c0969Ja.A00.A0P)).A14();
            return true;
        }
        AbstractC05983y.A02(c0969Ja.A00);
        return false;
    }
}
