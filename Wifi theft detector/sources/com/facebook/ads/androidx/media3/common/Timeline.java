package com.facebook.ads.androidx.media3.common;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.instagram.common.viewpoint.core.AR;
import com.instagram.common.viewpoint.core.AS;
import com.instagram.common.viewpoint.core.AbstractC05983y;
import com.instagram.common.viewpoint.core.AnonymousClass22;
import com.instagram.common.viewpoint.core.AnonymousClass23;
import com.instagram.common.viewpoint.core.AnonymousClass24;
import com.instagram.common.viewpoint.core.AnonymousClass43;
import com.instagram.common.viewpoint.core.BP;
import com.instagram.common.viewpoint.core.C2339pj;
import com.instagram.common.viewpoint.core.C2341pl;
import com.instagram.common.viewpoint.core.C2K;
import com.instagram.common.viewpoint.core.C5C;
import com.mbridge.msdk.playercommon.exoplayer2.C;

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

    public abstract C2341pl A0I(int i10, C2341pl c2341pl, boolean z10);

    public abstract C2339pj A0L(int i10, C2339pj c2339pj, long j10);

    public abstract Object A0M(int i10);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Period> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Window> */
    public static AR A02(Bundle bundle) {
        BP bpA04 = A04(C2339pj.A0J, AnonymousClass43.A00(bundle, A05));
        BP bpA042 = A04(C2341pl.A08, AnonymousClass43.A00(bundle, A03));
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
        for (int i10 = 0; i10 < bpA00.size(); i10++) {
            c2k.A04(anonymousClass23.A6f(bpA00.get(i10)));
        }
        return c2k.A05();
    }

    public static int[] A05(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
            int i12 = A00[1].charAt(20);
            if (i12 == 50) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[2] = "bm1hpxiL8T70YPoy7qoC4X3DFFhRRvrI";
            strArr[4] = "ZU2doOYnXTdq2XyitRV5O0BVNSu1NLTL";
        }
        return iArr;
    }

    public int A08(int i10, int i11, boolean z10) {
        switch (i11) {
            case 0:
                if (i10 == A0C(z10)) {
                    return -1;
                }
                return i10 + 1;
            case 1:
                return i10;
            case 2:
                int iA0C = A0C(z10);
                String[] strArr = A00;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    throw new RuntimeException();
                }
                A00[1] = "R0HEAX03GiDQUcMP0CiDD2yYG3qNGv8H";
                if (i10 == iA0C) {
                    return A0B(z10);
                }
                return i10 + 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final int A09(int i10, C2341pl c2341pl, C2339pj c2339pj, int i11, boolean z10) {
        int i12 = A0H(i10, c2341pl).A00;
        int windowIndex = A0K(i12, c2339pj).A01;
        if (windowIndex == i10) {
            int nextWindowIndex = A08(i12, i11, z10);
            if (nextWindowIndex == -1) {
                return -1;
            }
            int windowIndex2 = A0K(nextWindowIndex, c2339pj).A00;
            return windowIndex2;
        }
        int windowIndex3 = i10 + 1;
        return windowIndex3;
    }

    public int A0B(boolean z10) {
        return A0N() ? -1 : 0;
    }

    public int A0C(boolean z10) {
        if (A0N()) {
            return -1;
        }
        return A07() - 1;
    }

    @Deprecated
    public final Pair<Object, Long> A0D(C2339pj c2339pj, C2341pl c2341pl, int i10, long j10) {
        return A0E(c2339pj, c2341pl, i10, j10);
    }

    public final Pair<Object, Long> A0E(C2339pj c2339pj, C2341pl c2341pl, int i10, long j10) {
        return (Pair) AbstractC05983y.A01(A0G(c2339pj, c2341pl, i10, j10, 0L));
    }

    @Deprecated
    public final Pair<Object, Long> A0F(C2339pj c2339pj, C2341pl c2341pl, int i10, long j10, long j11) {
        return A0G(c2339pj, c2341pl, i10, j10, j11);
    }

    public final Pair<Object, Long> A0G(C2339pj c2339pj, C2341pl c2341pl, int i10, long j10, long j11) {
        AbstractC05983y.A00(i10, 0, A07());
        A0L(i10, c2339pj, j11);
        if (j10 == C.TIME_UNSET) {
            j10 = c2339pj.A05();
            if (j10 == C.TIME_UNSET) {
                return null;
            }
        }
        int i11 = c2339pj.A00;
        A0H(i11, c2341pl);
        while (i11 < c2339pj.A01 && c2341pl.A02 != j10 && A0H(i11 + 1, c2341pl).A02 <= j10) {
            i11++;
        }
        A0I(i11, c2341pl, true);
        long jMin = j10 - c2341pl.A02;
        if (c2341pl.A01 != C.TIME_UNSET) {
            long j12 = c2341pl.A01;
            if (A00[1].charAt(20) == '2') {
                throw new RuntimeException();
            }
            A00[1] = "slEcDLMOMSnRw8lzrIQwxe9jf9tcgTic";
            jMin = Math.min(jMin, j12 - 1);
        }
        return Pair.create(AbstractC05983y.A01(c2341pl.A04), Long.valueOf(Math.max(0L, jMin)));
    }

    public final C2341pl A0H(int i10, C2341pl c2341pl) {
        return A0I(i10, c2341pl, false);
    }

    public C2341pl A0J(Object obj, C2341pl c2341pl) {
        return A0I(A0A(obj), c2341pl, true);
    }

    public final C2339pj A0K(int i10, C2339pj c2339pj) {
        return A0L(i10, c2339pj, 0L);
    }

    public final boolean A0N() {
        return A07() == 0;
    }

    public final boolean A0O(int i10, C2341pl c2341pl, C2339pj c2339pj, int i11, boolean z10) {
        return A09(i10, c2341pl, c2339pj, i11, z10) == -1;
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
        C2339pj c2339pj = new C2339pj();
        C2341pl c2341pl = new C2341pl();
        C2339pj window = new C2339pj();
        C2341pl otherPeriod = new C2341pl();
        for (int i10 = 0; i10 < A07(); i10++) {
            if (!A0K(i10, c2339pj).equals(timeline.A0K(i10, window))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < A06(); i11++) {
            boolean zEquals = A0I(i11, c2341pl, true).equals(timeline.A0I(i11, otherPeriod, true));
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
        C2339pj c2339pj = new C2339pj();
        C2341pl c2341pl = new C2341pl();
        int result = 7 * 31;
        int i10 = result + A07();
        for (int i11 = 0; i11 < A07(); i11++) {
            C2339pj window = A0K(i11, c2339pj);
            i10 = (i10 * 31) + window.hashCode();
        }
        int result2 = i10 * 31;
        int i12 = result2 + A06();
        for (int i13 = 0; i13 < A06(); i13++) {
            i12 = (i12 * 31) + A0I(i13, c2341pl, true).hashCode();
        }
        int iA0B = A0B(true);
        while (iA0B != -1) {
            int windowIndex = i12 * 31;
            i12 = windowIndex + iA0B;
            iA0B = A08(iA0B, 0, true);
        }
        return i12;
    }
}
