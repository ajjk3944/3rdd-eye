package com.instagram.common.viewpoint.core;

import com.applovin.shadow.okio.Utf8;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
/* renamed from: com.facebook.ads.redexgen.X.mE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1759mE extends AbstractC0585Iu {
    public static byte[] A03;
    public static String[] A04 = {"GA2pmS7X4ROGOgByNCdi18taC", "aAh4RNygY6pz4IdlAQ9iIXEvCFWWkzLF", "JuodTrkofMpjka010", "J1Lmlws0eqmUUC5GC3jhEdxTYojxk4jf", "6Ya7uqSvo", "3XyRCMiSsp8rG7f8J4q6xkUhsqnZzFaE", "VspF2Q", "vTSdivoAe22KROlTGGoK4NP8GmV"};
    public final long A00;
    public final List<C1759mE> A01;
    public final List<C1758mD> A02;

    public static String A04(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 84);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{68, 7, 11, 10, 16, 5, 13, 10, 1, 22, 23, 94, 68, 105, 37, 44, 40, Utf8.REPLACEMENT_BYTE, 44, 58, 115, 105};
    }

    static {
        A05();
    }

    public C1759mE(int i4, long j) {
        super(i4);
        this.A00 = j;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public final C1759mE A06(int i4) {
        int size = this.A01.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1759mE c1759mE = this.A01.get(i10);
            int i11 = A04[7].length();
            if (i11 == 3) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[1] = "n49CDGF4gSULbNzRfDOXSmTNWTogkE10";
            strArr[3] = "P3Agw1JJwclCkyu9DcuVtuUqOjxfkaYK";
            C1759mE c1759mE2 = c1759mE;
            int childrenSize = ((AbstractC0585Iu) c1759mE2).A00;
            if (childrenSize == i4) {
                return c1759mE2;
            }
        }
        if (A04[4].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[1] = "eWhxbLiQvYVwUHrDqb1spRuVxj0ikF7I";
        strArr2[3] = "G0JrlMiW26lgTwAQcPtVzhOkcvjPkvCh";
        return null;
    }

    public final C1758mD A07(int i4) {
        int size = this.A02.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1758mD c1758mD = this.A02.get(i10);
            String[] strArr = A04;
            String str = strArr[2];
            String str2 = strArr[0];
            int i11 = str.length();
            int childrenSize = str2.length();
            if (i11 == childrenSize) {
                throw new RuntimeException();
            }
            A04[5] = "r5cbbIuLaeCnR7fWkiITKmUfsEKVcSuB";
            int childrenSize2 = ((AbstractC0585Iu) c1758mD).A00;
            if (childrenSize2 == i4) {
                return c1758mD;
            }
        }
        return null;
    }

    public final void A08(C1759mE c1759mE) {
        this.A01.add(c1759mE);
    }

    public final void A09(C1758mD c1758mD) {
        this.A02.add(c1758mD);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0585Iu
    public final String toString() {
        return AbstractC0585Iu.A02(super.A00) + A04(13, 9, 29) + Arrays.toString(this.A02.toArray()) + A04(0, 13, 48) + Arrays.toString(this.A01.toArray());
    }
}
