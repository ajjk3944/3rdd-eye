package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.oG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3914oG<K0, V0> {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A03(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{97, 116, 108, 97, 95, 112, 97, 96, 71, 97, 117, 111};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oG != com.google.common.collect.MultimapBuilder<K0, V0> */
    public AbstractC3914oG() {
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oG != com.google.common.collect.MultimapBuilder<K0, V0> */
    public /* synthetic */ AbstractC3914oG(C2405Ab c2405Ab) {
        this();
    }

    public static AbstractC3913oF<Object> A00(int expectedKeys) {
        AbstractC3761ll.A00(expectedKeys, A03(0, 12, 125));
        return new C2405Ab(expectedKeys);
    }

    public static <K0> AbstractC3913oF<K0> A01(Comparator<K0> comparator) {
        AbstractC3614jA.A04(comparator);
        return new AZ(comparator);
    }

    public static AbstractC3913oF<Comparable> A02() {
        return A01(AbstractC3928oV.A03());
    }
}
