package com.instagram.common.viewpoint.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.q5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1983q5<K0, V0> {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A03(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{97, 116, 108, 97, 95, 112, 97, 96, 71, 97, 117, 111};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.q5 != com.google.common.collect.MultimapBuilder<K0, V0> */
    public AbstractC1983q5() {
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.q5 != com.google.common.collect.MultimapBuilder<K0, V0> */
    public /* synthetic */ AbstractC1983q5(BG bg2) {
        this();
    }

    public static AbstractC1982q4<Object> A00(int expectedKeys) {
        AbstractC1813nJ.A00(expectedKeys, A03(0, 12, 125));
        return new BG(expectedKeys);
    }

    public static <K0> AbstractC1982q4<K0> A01(Comparator<K0> comparator) {
        AbstractC1666ki.A04(comparator);
        return new BF(comparator);
    }

    public static AbstractC1982q4<Comparable> A02() {
        return A01(AbstractC1998qK.A03());
    }
}
