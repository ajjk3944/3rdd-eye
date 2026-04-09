package com.facebook.ads.androidx.media3.common;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.ads.redexgen.core.AbstractC22614a;
import com.facebook.ads.redexgen.core.AbstractC2416Am;
import com.facebook.ads.redexgen.core.C1Q;
import com.facebook.ads.redexgen.core.C1R;
import com.facebook.ads.redexgen.core.C1S;
import com.facebook.ads.redexgen.core.C21921h;
import com.facebook.ads.redexgen.core.C23909m;
import com.facebook.ads.redexgen.core.C3918oL;
import com.facebook.ads.redexgen.core.C3920oN;
import com.facebook.ads.redexgen.core.C3M;
import com.facebook.ads.redexgen.core.C3R;
import com.google.common.collect.ImmutableList;

/* loaded from: assets/audience_network.dex */
public abstract class Timeline implements C1S {
    public static String[] A00 = {"u1TV1j0aFj13GJQ9ixTagHG8KyMgbnog", "4GMeFBxldVuonExwkIPaDDi9I59L728Z", "hqD1wOYcZTmehOTQOtlNc0UQ2KV4ETaI", "yejsGunEYiKaKfUzobCfCtheJf3zEEcL", "wYd9LRHFlTpJXE3VqmNr3ySXFdmyeGzN", "VCegaKN739XbWKUaP5Uwy30Zmvr6QTeK", "Cr3igiuAIuu", "x89DN52UD2fFRZn9rQXfWzGYhaiJYHE1"};
    public static final Timeline A02 = new Timeline() { // from class: com.facebook.ads.redexgen.X.9n
        @Override // com.facebook.ads.androidx.media3.common.Timeline
        public final int A06() {
            return 0;
        }

        @Override // com.facebook.ads.androidx.media3.common.Timeline
        public final int A07() {
            return 0;
        }

        @Override // com.facebook.ads.androidx.media3.common.Timeline
        public final int A0A(Object obj) {
            return -1;
        }

        @Override // com.facebook.ads.androidx.media3.common.Timeline
        public final C3920oN A0I(int i, C3920oN c3920oN, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.facebook.ads.androidx.media3.common.Timeline
        public final C3918oL A0L(int i, C3918oL c3918oL, long j4) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.facebook.ads.androidx.media3.common.Timeline
        public final Object A0M(int i) {
            throw new IndexOutOfBoundsException();
        }
    };
    public static final String A05 = AbstractC22614a.A0h(0);
    public static final String A03 = AbstractC22614a.A0h(1);
    public static final String A04 = AbstractC22614a.A0h(2);
    public static final C1R<Timeline> A01 = new C1R() { // from class: com.facebook.ads.redexgen.X.oP
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return Timeline.A02(bundle);
        }
    };

    public abstract int A06();

    public abstract int A07();

    public abstract int A0A(Object obj);

    public abstract C3920oN A0I(int i, C3920oN c3920oN, boolean z10);

    public abstract C3918oL A0L(int i, C3918oL c3918oL, long j4);

    public abstract Object A0M(int i);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Period> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Window> */
    public static C23909m A02(Bundle bundle) {
        final AbstractC2416Am abstractC2416AmA04 = A04(C3918oL.A0J, C3R.A00(bundle, A05));
        final AbstractC2416Am abstractC2416AmA042 = A04(C3920oN.A08, C3R.A00(bundle, A03));
        final int[] intArray = bundle.getIntArray(A04);
        if (intArray == null) {
            intArray = A05(abstractC2416AmA04.size());
        }
        ImmutableList<Window> windows = new Timeline(abstractC2416AmA04, abstractC2416AmA042, intArray) { // from class: com.facebook.ads.redexgen.X.9m
            public static String[] A04 = {"nDkuZZEFG4iGMwbsGEvKBo4ueCI7wxif", "OM6NJOBBZMKrUazjZz4CdR8Ljfz9nzwy", "h9AdYD37MAF4FmuzDOyGIvEw", "VkmtOVI9Gbc78hEhNGIz4LiMtzYnUrU2", "bkWqGplua99PBwc9ED6yZtwvDtuw6KwN", "305DBImSoaz5MlD7g6qLfpiwFg5d3Fl", "QtOjLPNYFNek9UnmHWOFtbeX9w", "y2avdvKeY0dhYPEmFhuJXZmeyR2ks2D4"};
            public final AbstractC2416Am<C3920oN> A00;
            public final AbstractC2416Am<C3918oL> A01;
            public final int[] A02;
            public final int[] A03;

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Period> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Window> */
            /* JADX WARN: Incorrect condition in loop: B:7:0x001b */
            {
                /*
                    r3 = this;
                    r3.<init>()
                    int r1 = r4.size()
                    int r0 = r6.length
                    if (r1 != r0) goto L26
                    r0 = 1
                Lb:
                    com.facebook.ads.redexgen.core.C3M.A07(r0)
                    r3.A01 = r4
                    r3.A00 = r5
                    r3.A02 = r6
                    int r0 = r6.length
                    int[] r0 = new int[r0]
                    r3.A03 = r0
                    r2 = 0
                L1a:
                    int r0 = r6.length
                    if (r2 >= r0) goto L28
                    int[] r1 = r3.A03
                    r0 = r6[r2]
                    r1[r0] = r2
                    int r2 = r2 + 1
                    goto L1a
                L26:
                    r0 = 0
                    goto Lb
                L28:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C23909m.<init>(com.facebook.ads.redexgen.X.Am, com.facebook.ads.redexgen.X.Am, int[]):void");
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final int A06() {
                return this.A00.size();
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final int A07() {
                return this.A01.size();
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final int A08(int i, int i10, boolean z10) {
                if (i10 == 1) {
                    return i;
                }
                if (i == A0C(z10)) {
                    if (i10 == 2) {
                        return A0B(z10);
                    }
                    return -1;
                }
                if (z10) {
                    return this.A02[this.A03[i] + 1];
                }
                return i + 1;
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final int A0A(Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final int A0B(boolean z10) {
                if (A0N()) {
                    return -1;
                }
                if (!z10) {
                    return 0;
                }
                int[] iArr = this.A02;
                if (A04[1].charAt(22) == 'H') {
                    throw new RuntimeException();
                }
                A04[7] = "6ncpOYdEr0xsUZdZBYFnYejLEosAstPL";
                return iArr[0];
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final int A0C(boolean z10) {
                if (A0N()) {
                    return -1;
                }
                if (z10) {
                    return this.A02[A07() - 1];
                }
                return A07() - 1;
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final C3920oN A0I(int i, C3920oN p10, boolean z10) {
                C3920oN p11 = this.A00.get(i);
                p10.A0G(p11.A03, p11.A04, p11.A00, p11.A01, p11.A02, p11.A06, p11.A05);
                return p10;
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final C3918oL A0L(int i, C3918oL c3918oL, long j4) {
                C3918oL c3918oL2 = this.A01.get(i);
                c3918oL.A07(c3918oL2.A0C, c3918oL2.A09, c3918oL2.A0A, c3918oL2.A06, c3918oL2.A07, c3918oL2.A04, c3918oL2.A0G, c3918oL2.A0D, c3918oL2.A08, c3918oL2.A02, c3918oL2.A03, c3918oL2.A00, c3918oL2.A01, c3918oL2.A05);
                c3918oL.A0F = c3918oL2.A0F;
                return c3918oL;
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final Object A0M(int i) {
                throw new UnsupportedOperationException();
            }
        };
        return windows;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1R != com.facebook.ads.androidx.media3.common.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.1S> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1h != com.google.common.collect.ImmutableList$Builder<T extends com.facebook.ads.redexgen.X.1S> */
    public static <T extends C1S> AbstractC2416Am<T> A04(C1R<T> c1r, IBinder iBinder) {
        if (iBinder == null) {
            return AbstractC2416Am.A03();
        }
        C21921h c21921h = new C21921h();
        AbstractC2416Am<Bundle> abstractC2416AmA00 = C1Q.A00(iBinder);
        for (int i = 0; i < abstractC2416AmA00.size(); i++) {
            c21921h.A04(c1r.A6X(abstractC2416AmA00.get(i)));
        }
        return c21921h.A05();
    }

    public static int[] A05(int i) {
        int[] iArr = new int[i];
        for (int i10 = 0; i10 < i; i10++) {
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

    public int A08(int i, int i10, boolean z10) {
        switch (i10) {
            case 0:
                if (i == A0C(z10)) {
                    return -1;
                }
                return i + 1;
            case 1:
                return i;
            case 2:
                int iA0C = A0C(z10);
                String[] strArr = A00;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    throw new RuntimeException();
                }
                A00[1] = "R0HEAX03GiDQUcMP0CiDD2yYG3qNGv8H";
                if (i == iA0C) {
                    return A0B(z10);
                }
                return i + 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final int A09(int i, C3920oN c3920oN, C3918oL c3918oL, int i10, boolean z10) {
        int i11 = A0H(i, c3920oN).A00;
        int windowIndex = A0K(i11, c3918oL).A01;
        if (windowIndex == i) {
            int nextWindowIndex = A08(i11, i10, z10);
            if (nextWindowIndex == -1) {
                return -1;
            }
            int windowIndex2 = A0K(nextWindowIndex, c3918oL).A00;
            return windowIndex2;
        }
        int windowIndex3 = i + 1;
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
    public final Pair<Object, Long> A0D(C3918oL c3918oL, C3920oN c3920oN, int i, long j4) {
        return A0E(c3918oL, c3920oN, i, j4);
    }

    public final Pair<Object, Long> A0E(C3918oL c3918oL, C3920oN c3920oN, int i, long j4) {
        return (Pair) C3M.A01(A0G(c3918oL, c3920oN, i, j4, 0L));
    }

    @Deprecated
    public final Pair<Object, Long> A0F(C3918oL c3918oL, C3920oN c3920oN, int i, long j4, long j10) {
        return A0G(c3918oL, c3920oN, i, j4, j10);
    }

    public final Pair<Object, Long> A0G(C3918oL c3918oL, C3920oN c3920oN, int i, long j4, long j10) {
        C3M.A00(i, 0, A07());
        A0L(i, c3918oL, j10);
        if (j4 == -9223372036854775807L) {
            j4 = c3918oL.A05();
            if (j4 == -9223372036854775807L) {
                return null;
            }
        }
        int i10 = c3918oL.A00;
        A0H(i10, c3920oN);
        while (i10 < c3918oL.A01 && c3920oN.A02 != j4 && A0H(i10 + 1, c3920oN).A02 <= j4) {
            i10++;
        }
        A0I(i10, c3920oN, true);
        long jMin = j4 - c3920oN.A02;
        if (c3920oN.A01 != -9223372036854775807L) {
            long j11 = c3920oN.A01;
            if (A00[1].charAt(20) == '2') {
                throw new RuntimeException();
            }
            A00[1] = "slEcDLMOMSnRw8lzrIQwxe9jf9tcgTic";
            jMin = Math.min(jMin, j11 - 1);
        }
        return Pair.create(C3M.A01(c3920oN.A04), Long.valueOf(Math.max(0L, jMin)));
    }

    public final C3920oN A0H(int i, C3920oN c3920oN) {
        return A0I(i, c3920oN, false);
    }

    public C3920oN A0J(Object obj, C3920oN c3920oN) {
        return A0I(A0A(obj), c3920oN, true);
    }

    public final C3918oL A0K(int i, C3918oL c3918oL) {
        return A0L(i, c3918oL, 0L);
    }

    public final boolean A0N() {
        return A07() == 0;
    }

    public final boolean A0O(int i, C3920oN c3920oN, C3918oL c3918oL, int i10, boolean z10) {
        return A09(i, c3920oN, c3918oL, i10, z10) == -1;
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
        C3918oL c3918oL = new C3918oL();
        C3920oN c3920oN = new C3920oN();
        C3918oL window = new C3918oL();
        C3920oN otherPeriod = new C3920oN();
        for (int i = 0; i < A07(); i++) {
            if (!A0K(i, c3918oL).equals(timeline.A0K(i, window))) {
                return false;
            }
        }
        for (int i10 = 0; i10 < A06(); i10++) {
            boolean zEquals = A0I(i10, c3920oN, true).equals(timeline.A0I(i10, otherPeriod, true));
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
        C3918oL c3918oL = new C3918oL();
        C3920oN c3920oN = new C3920oN();
        int result = 7 * 31;
        int i = result + A07();
        for (int i10 = 0; i10 < A07(); i10++) {
            C3918oL window = A0K(i10, c3918oL);
            i = (i * 31) + window.hashCode();
        }
        int result2 = i * 31;
        int i11 = result2 + A06();
        for (int i12 = 0; i12 < A06(); i12++) {
            i11 = (i11 * 31) + A0I(i12, c3920oN, true).hashCode();
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
