package com.instagram.common.viewpoint.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.Map;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.qN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1999qN {
    public static <K, V> Map<K, V> A00(int expectedSize) {
        return C1837nh.A0B(expectedSize);
    }

    public static <T> T[] A01(T[] tArr, int i4) {
        if (tArr.length != 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 0);
        }
        return (T[]) Arrays.copyOf(tArr, i4);
    }

    public static <T> T[] A02(Object[] objArr, int i4, int i10, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i4, i10, tArr.getClass());
    }
}
