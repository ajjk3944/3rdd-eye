package com.facebook.ads.androidx.media3.common;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.instagram.common.viewpoint.core.AR;
import com.instagram.common.viewpoint.core.AS;
import com.instagram.common.viewpoint.core.AbstractC02203y;
import com.instagram.common.viewpoint.core.AnonymousClass22;
import com.instagram.common.viewpoint.core.AnonymousClass23;
import com.instagram.common.viewpoint.core.AnonymousClass24;
import com.instagram.common.viewpoint.core.AnonymousClass43;
import com.instagram.common.viewpoint.core.BP;
import com.instagram.common.viewpoint.core.C1961pj;
import com.instagram.common.viewpoint.core.C1963pl;
import com.instagram.common.viewpoint.core.C2K;
import com.instagram.common.viewpoint.core.C5C;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class Timeline implements AnonymousClass24 {
    public static String[] A00 = {"u1TV1j0aFj13GJQ9ixTagHG8KyMgbnog", "4GMeFBxldVuonExwkIPaDDi9I59L728Z", "hqD1wOYcZTmehOTQOtlNc0UQ2KV4ETaI", "yejsGunEYiKaKfUzobCfCtheJf3zEEcL", "wYd9LRHFlTpJXE3VqmNr3ySXFdmyeGzN", "VCegaKN739XbWKUaP5Uwy30Zmvr6QTeK", "Cr3igiuAIuu", "x89DN52UD2fFRZn9rQXfWzGYhaiJYHE1"};
    public static final Timeline A02 = new AS();
    public static final String A05 = C5C.A0h(0);
    public static final String A03 = C5C.A0h(1);
    public static final String A04 = C5C.A0h(2);
    public static final AnonymousClass23<Timeline> A01 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pq
        @Override // com.instagram.common.viewpoint.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return Timeline.A02(bundle);
        }
    };

    public abstract int A06();

    public abstract int A07();

    public abstract int A0A(Object obj);

    public abstract C1963pl A0I(int i4, C1963pl c1963pl, boolean z3);

    public abstract C1961pj A0L(int i4, C1961pj c1961pj, long j);

    public abstract Object A0M(int i4);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Period> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Window> */
    public static AR A02(Bundle bundle) {
        BP bpA04 = A04(C1961pj.A0J, AnonymousClass43.A00(bundle, A05));
        BP bpA042 = A04(C1963pl.A08, AnonymousClass43.A00(bundle, A03));
        int[] intArray = bundle.getIntArray(A04);
        if (intArray == null) {
            intArray = A05(bpA04.size());
        }
        return new AR(bpA04, bpA042, intArray);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.23 != com.facebook.ads.androidx.media3.common.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.24> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<T extends com.facebook.ads.redexgen.X.24> */
    public static <T extends AnonymousClass24> BP<T> A04(AnonymousClass23<T> anonymousClass23, IBinder iBinder) {
        if (iBinder == null) {
            return BP.A03();
        }
        C2K c2k = new C2K();
        BP<Bundle> bpA00 = AnonymousClass22.A00(iBinder);
        for (int i4 = 0; i4 < bpA00.size(); i4++) {
            c2k.A04(anonymousClass23.A6f(bpA00.get(i4)));
        }
        return c2k.A05();
    }

    public static int[] A05(int i4) {
        int[] iArr = new int[i4];
        for (int i10 = 0; i10 < i4; i10++) {
            iArr[i10] = i10;
            int i11 = A00[1].charAt(20);
            if (i11 == 50) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[2] = "bm1hpxiL8T70YPoy7qoC4X3DFFhRRvrI";
            strArr[4] = "ZU2doOYnXTdq2XyitRV5O0BVNSu1NLTL";
        }
        return iArr;
    }

    public int A08(int i4, int i10, boolean z3) {
        switch (i10) {
            case 0:
                if (i4 == A0C(z3)) {
                    return -1;
                }
                return i4 + 1;
            case 1:
                return i4;
            case 2:
                int iA0C = A0C(z3);
                String[] strArr = A00;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    throw new RuntimeException();
                }
                A00[1] = "R0HEAX03GiDQUcMP0CiDD2yYG3qNGv8H";
                if (i4 == iA0C) {
                    return A0B(z3);
                }
                return i4 + 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final int A09(int i4, C1963pl c1963pl, C1961pj c1961pj, int i10, boolean z3) {
        int i11 = A0H(i4, c1963pl).A00;
        int windowIndex = A0K(i11, c1961pj).A01;
        if (windowIndex == i4) {
            int nextWindowIndex = A08(i11, i10, z3);
            if (nextWindowIndex == -1) {
                return -1;
            }
            int windowIndex2 = A0K(nextWindowIndex, c1961pj).A00;
            return windowIndex2;
        }
        int windowIndex3 = i4 + 1;
        return windowIndex3;
    }

    public int A0B(boolean z3) {
        return A0N() ? -1 : 0;
    }

    public int A0C(boolean z3) {
        if (A0N()) {
            return -1;
        }
        return A07() - 1;
    }

    @Deprecated
    public final Pair<Object, Long> A0D(C1961pj c1961pj, C1963pl c1963pl, int i4, long j) {
        return A0E(c1961pj, c1963pl, i4, j);
    }

    public final Pair<Object, Long> A0E(C1961pj c1961pj, C1963pl c1963pl, int i4, long j) {
        return (Pair) AbstractC02203y.A01(A0G(c1961pj, c1963pl, i4, j, 0L));
    }

    @Deprecated
    public final Pair<Object, Long> A0F(C1961pj c1961pj, C1963pl c1963pl, int i4, long j, long j8) {
        return A0G(c1961pj, c1963pl, i4, j, j8);
    }

    public final Pair<Object, Long> A0G(C1961pj c1961pj, C1963pl c1963pl, int i4, long j, long j8) {
        AbstractC02203y.A00(i4, 0, A07());
        A0L(i4, c1961pj, j8);
        if (j == -9223372036854775807L) {
            j = c1961pj.A05();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i10 = c1961pj.A00;
        A0H(i10, c1963pl);
        while (i10 < c1961pj.A01 && c1963pl.A02 != j && A0H(i10 + 1, c1963pl).A02 <= j) {
            i10++;
        }
        A0I(i10, c1963pl, true);
        long jMin = j - c1963pl.A02;
        if (c1963pl.A01 != -9223372036854775807L) {
            long j9 = c1963pl.A01;
            if (A00[1].charAt(20) == '2') {
                throw new RuntimeException();
            }
            A00[1] = "slEcDLMOMSnRw8lzrIQwxe9jf9tcgTic";
            jMin = Math.min(jMin, j9 - 1);
        }
        return Pair.create(AbstractC02203y.A01(c1963pl.A04), Long.valueOf(Math.max(0L, jMin)));
    }

    public final C1963pl A0H(int i4, C1963pl c1963pl) {
        return A0I(i4, c1963pl, false);
    }

    public C1963pl A0J(Object obj, C1963pl c1963pl) {
        return A0I(A0A(obj), c1963pl, true);
    }

    public final C1961pj A0K(int i4, C1961pj c1961pj) {
        return A0L(i4, c1961pj, 0L);
    }

    public final boolean A0N() {
        return A07() == 0;
    }

    public final boolean A0O(int i4, C1963pl c1963pl, C1961pj c1961pj, int i10, boolean z3) {
        return A09(i4, c1963pl, c1961pj, i10, z3) == -1;
    }

    public final boolean equals(Object obj) {
        int iA0C;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) obj;
        if (timeline.A07() != A07() || timeline.A06() != A06()) {
            return false;
        }
        C1961pj c1961pj = new C1961pj();
        C1963pl c1963pl = new C1963pl();
        C1961pj window = new C1961pj();
        C1963pl otherPeriod = new C1963pl();
        for (int i4 = 0; i4 < A07(); i4++) {
            if (!A0K(i4, c1961pj).equals(timeline.A0K(i4, window))) {
                return false;
            }
        }
        for (int i10 = 0; i10 < A06(); i10++) {
            boolean zEquals = A0I(i10, c1963pl, true).equals(timeline.A0I(i10, otherPeriod, true));
            if (A00[6].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[7] = "LCXdoHEXleHtD1UyLVprjOGqC7qnADXU";
            strArr[0] = "np8LEsRhRemsbbWWIjAQc1GjKbBRdfRS";
            if (!zEquals) {
                return false;
            }
        }
        int iA0B = A0B(true);
        if (iA0B != timeline.A0B(true) || (iA0C = A0C(true)) != timeline.A0C(true)) {
            return false;
        }
        while (iA0B != iA0C) {
            int iA08 = A08(iA0B, 0, true);
            if (iA08 != timeline.A08(iA0B, 0, true)) {
                return false;
            }
            iA0B = iA08;
        }
        return true;
    }

    public final int hashCode() {
        C1961pj c1961pj = new C1961pj();
        C1963pl c1963pl = new C1963pl();
        int result = 7 * 31;
        int i4 = result + A07();
        for (int i10 = 0; i10 < A07(); i10++) {
            C1961pj window = A0K(i10, c1961pj);
            i4 = (i4 * 31) + window.hashCode();
        }
        int result2 = i4 * 31;
        int i11 = result2 + A06();
        for (int i12 = 0; i12 < A06(); i12++) {
            i11 = (i11 * 31) + A0I(i12, c1963pl, true).hashCode();
        }
        int iA0B = A0B(true);
        while (iA0B != -1) {
            int windowIndex = i11 * 31;
            i11 = windowIndex + iA0B;
            iA0B = A08(iA0B, 0, true);
        }
        return i11;
    }
}
