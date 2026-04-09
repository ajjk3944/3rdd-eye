package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
/* renamed from: com.facebook.ads.redexgen.X.kj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3710kj extends II {
    public static byte[] A03;
    public static String[] A04 = {"GA2pmS7X4ROGOgByNCdi18taC", "aAh4RNygY6pz4IdlAQ9iIXEvCFWWkzLF", "JuodTrkofMpjka010", "J1Lmlws0eqmUUC5GC3jhEdxTYojxk4jf", "6Ya7uqSvo", "3XyRCMiSsp8rG7f8J4q6xkUhsqnZzFaE", "VspF2Q", "vTSdivoAe22KROlTGGoK4NP8GmV"};
    public final long A00;
    public final List<C3710kj> A01;
    public final List<C3709ki> A02;

    public static String A04(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 84);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{68, 7, 11, 10, 16, 5, 13, 10, 1, 22, 23, 94, 68, 105, 37, 44, 40, 63, 44, 58, 115, 105};
    }

    static {
        A05();
    }

    public C3710kj(int i, long j4) {
        super(i);
        this.A00 = j4;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public final C3710kj A06(int i) {
        int size = this.A01.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3710kj c3710kj = this.A01.get(i10);
            int i11 = A04[7].length();
            if (i11 == 3) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[1] = "n49CDGF4gSULbNzRfDOXSmTNWTogkE10";
            strArr[3] = "P3Agw1JJwclCkyu9DcuVtuUqOjxfkaYK";
            C3710kj c3710kj2 = c3710kj;
            int childrenSize = ((II) c3710kj2).A00;
            if (childrenSize == i) {
                return c3710kj2;
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

    public final C3709ki A07(int i) {
        int size = this.A02.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3709ki c3709ki = this.A02.get(i10);
            String[] strArr = A04;
            String str = strArr[2];
            String str2 = strArr[0];
            int i11 = str.length();
            int childrenSize = str2.length();
            if (i11 == childrenSize) {
                throw new RuntimeException();
            }
            A04[5] = "r5cbbIuLaeCnR7fWkiITKmUfsEKVcSuB";
            int childrenSize2 = ((II) c3709ki).A00;
            if (childrenSize2 == i) {
                return c3709ki;
            }
        }
        return null;
    }

    public final void A08(C3710kj c3710kj) {
        this.A01.add(c3710kj);
    }

    public final void A09(C3709ki c3709ki) {
        this.A02.add(c3709ki);
    }

    @Override // com.facebook.ads.redexgen.core.II
    public final String toString() {
        return II.A02(super.A00) + A04(13, 9, 29) + Arrays.toString(this.A02.toArray()) + A04(0, 13, 48) + Arrays.toString(this.A01.toArray());
    }
}
