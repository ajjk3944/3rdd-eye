package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.io.Serializable;
import java.util.Arrays;

@ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network.dex */
public final class AK extends AbstractC3928oV<Comparable<?>> implements Serializable {
    public static byte[] A00;
    public static String[] A01 = {"VpDQNWoK0mmjrFci3J1ES8becoOn0yPT", "Vr", "", "dVgvDtkQ8cSY7jysLBul", "4dcdEYs2txrJkBrXjBMi1LqbKTa90ufq", "PVumC7zyVZC9p2BLxPfo", "qAFwV", ""};
    public static final AK A02;
    public static final long serialVersionUID = 0;

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{18, 47, 57, 56, 47, 52, 51, 58, 115, 51, 60, 41, 40, 47, 60, 49, 117, 116, 115, 47, 56, 43, 56, 47, 46, 56, 117, 116};
    }

    static {
        A02();
        A02 = new AK();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC3928oV, java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(Comparable<?> left, Comparable<?> right) {
        AbstractC3614jA.A04(left);
        if (left != right) {
            return right.compareTo(left);
        }
        String[] strArr = A01;
        if (strArr[6].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        A01[0] = "QsSMXmf1NPN173cjiLSi9PN2wuQJFCPh";
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3928oV
    public final <S extends Comparable<?>> AbstractC3928oV<S> A06() {
        return AbstractC3928oV.A03();
    }

    public final String toString() {
        return A01(0, 28, 44);
    }
}
