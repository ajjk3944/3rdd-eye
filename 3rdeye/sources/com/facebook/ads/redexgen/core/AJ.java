package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network.dex */
public final class AJ<T> extends AbstractC3928oV<T> implements Serializable {
    public static byte[] A01;
    public static String[] A02 = {"TYphIuCeMUBPtejfiFOUwjFxcT4QBTq", "8HYxpO9zw1uGMW", "bftleM0W", "QbbbyMJUXm1d4Xd", "2naIPdaT", "exbXjeCkSw", "w", "Nm7"};
    public static final long serialVersionUID = 0;
    public final AbstractC3928oV<? super T> A00;

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-30, 38, 25, 42, 25, 38, 39, 25, -36, -35};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AJ != com.google.common.collect.ReverseOrdering<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oV != com.google.common.collect.Ordering<? super T> */
    public AJ(AbstractC3928oV<? super T> forwardOrder) {
        this.A00 = (AbstractC3928oV) AbstractC3614jA.A04(forwardOrder);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AJ != com.google.common.collect.ReverseOrdering<T> */
    @Override // com.facebook.ads.redexgen.core.AbstractC3928oV
    public final <S extends T> AbstractC3928oV<S> A06() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AJ != com.google.common.collect.ReverseOrdering<T> */
    @Override // com.facebook.ads.redexgen.core.AbstractC3928oV, java.util.Comparator
    public final int compare(@ParametricNullness T a10, @ParametricNullness T b10) {
        return this.A00.compare(b10, a10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AJ != com.google.common.collect.ReverseOrdering<?> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AJ != com.google.common.collect.ReverseOrdering<T> */
    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object object) {
        if (object != this) {
            if (object instanceof AJ) {
                return this.A00.equals(((AJ) object).A00);
            }
            return false;
        }
        String[] strArr = A02;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[2] = "3jzErf5H";
        strArr2[4] = "YYoE6Ooa";
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AJ != com.google.common.collect.ReverseOrdering<T> */
    public final int hashCode() {
        return -this.A00.hashCode();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.AJ != com.google.common.collect.ReverseOrdering<T> */
    public final String toString() {
        return this.A00 + A00(0, 10, 125);
    }
}
