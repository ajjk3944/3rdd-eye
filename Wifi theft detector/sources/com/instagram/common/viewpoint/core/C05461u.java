package com.instagram.common.viewpoint.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.1u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05461u implements InterfaceC0752Al {
    public static byte[] A09;
    public static String[] A0A = {"5g", "bfnfjiUri9kvxuLEKnZU3kJc1ieY23zz", "NIX", "B1MUzprhDDigVQ4p3NlPN3VyWdkPEAJB", "UzK", "rOCmuOM4l5uJjn2akKGm2JxYL79BUlOr", "kAulvLpzcmVynuK8kNGYEaaJbNqcwElD", "7ScKsdjGN77oK2tO1d"};
    public static final String A0B;
    public long A00;
    public InterfaceC2420rK A01;
    public final InterfaceC2419rJ A02;
    public final C2412rB A03;
    public final C2412rB A04;
    public final List<Rect> A05;
    public final Map<String, C2411rA> A06;
    public final boolean A07;
    public final boolean A08;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0A;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "GBjOApmdB9meVYu3h8dWYwSrfWPE5QmB";
            strArr2[6] = "rSzbUr5mB5cqWCHa6t40U5C3uIAdU8ry";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 73);
            i13++;
        }
    }

    public static void A03() {
        A09 = new byte[]{20, 40, 41, 51, 96, 54, 41, 37, 55, 48, 47, 41, 46, 52, 96, 40, 33, 51, 96, 46, 47, 52, 96, 34, 37, 37, 46, 96, 45, 37, 33, 51, 53, 50, 37, 36, 96, 47, 50, 96, 41, 51, 96, 33, 96, 39, 50, 47, 53, 48, 96, 55, 40, 41, 35, 40, 96, 55, 41, 44, 44, 96, 46, 37, 54, 37, 50, 96, 50, 37, 52, 53, 50, 46, 96, 33, 96, 45, 37, 33, 51, 53, 50, 37, 45, 37, 46, 52, 96, 51, 41, 46, 35, 37, 96, 41, 52, 103, 51, 96, 45, 33, 36, 37, 96, 53, 48, 96, 47, 38, 96, 51, 53, 34, 54, 41, 37, 55, 51, 96, 52, 40, 33, 52, 96, 35, 47, 53, 44, 36, 96, 34, 37, 96, 47, 38, 38, 51, 35, 50, 37, 37, 46, 16, 27, 9, 45, 29, 31, 16, 61, 38, 63, 63, 115, 37, 58, 54, 36, 115, 35, 33, 60, 35, 54, 33, 39, 42, 115, 53, 60, 33, 115, 33, 54, 62, 60, 37, 54, 55, 115, 58, 39, 54, 62, 115, 30, 2, Flags.CD, 25, 63, 8, 29, 2, 31, 25};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0752Al
    public final void A6P(List<C2423rN<?, ?>> list) {
        if (list != null && !list.isEmpty()) {
            A06(list);
        }
        A05(this.A04);
        A04(this.A04);
        A05(this.A03);
        A04(this.A03);
        if (0 != 0) {
            new C2410r9(toString(), this, this.A05, this.A04.A00(), this.A03.A00());
            throw new NullPointerException(A02(143, 7, 55));
        }
    }

    static {
        A03();
        A0B = C05461u.class.getSimpleName();
    }

    public C05461u(InterfaceC2419rJ interfaceC2419rJ) {
        this(interfaceC2419rJ, false, false);
    }

    public C05461u(InterfaceC2419rJ interfaceC2419rJ, boolean z10, boolean z11) {
        this.A06 = new HashMap();
        this.A04 = new C2412rB();
        this.A03 = new C2412rB();
        this.A05 = new ArrayList(1);
        this.A02 = interfaceC2419rJ;
        this.A08 = z10;
        this.A07 = z11;
    }

    public static Rect A00(C2411rA c2411rA) {
        if (c2411rA == null || c2411rA.A02.top == Integer.MIN_VALUE || c2411rA.A02.left == Integer.MIN_VALUE || c2411rA.A02.right == Integer.MIN_VALUE || c2411rA.A02.bottom == Integer.MIN_VALUE) {
            throw new IllegalStateException(A02(0, 143, 9));
        }
        return c2411rA.A02;
    }

    private C2411rA A01(C2423rN c2423rN, Rect rect, Rect rect2) {
        C2411rA c2411rAA03 = this.A06.get(c2423rN.A02);
        if (this.A04.A06(c2423rN)) {
            if (c2411rAA03 != null) {
                c2411rAA03.A01 = EnumC2415rE.A04;
            } else {
                c2411rAA03 = C2411rA.A03(this.A00);
                this.A06.put(c2423rN.A02, c2411rAA03);
            }
        }
        if (c2411rAA03 != null) {
            c2411rAA03.A02.set(rect2);
            c2411rAA03.A03.add(new Rect(rect));
        }
        return c2411rAA03;
    }

    private void A04(C2412rB c2412rB) {
        for (C2423rN c2423rN : c2412rB.A01()) {
            C2411rA c2411rA = this.A06.get(c2423rN.A02);
            if (c2411rA == null) {
                if (0 != 0) {
                    String str = A02(150, 36, 26) + c2423rN.A02;
                    throw new NullPointerException(A02(186, 10, 36));
                }
            } else {
                c2411rA.A01 = EnumC2415rE.A03;
                c2411rA.A03.clear();
                if (A07(c2423rN)) {
                    c2423rN.A03(this);
                }
                if (this.A08) {
                    this.A06.remove(c2411rA);
                }
            }
        }
    }

    private void A05(C2412rB c2412rB) {
        for (C2423rN visible : c2412rB.A00()) {
            if (A07(visible)) {
                visible.A03(this);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0004 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A06(java.util.List<com.instagram.common.viewpoint.core.C2423rN<?, ?>> r7) {
        /*
            r6 = this;
            java.util.Iterator r5 = r7.iterator()
        L4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r3 = r5.next()
            com.facebook.ads.redexgen.X.rN r3 = (com.instagram.common.viewpoint.core.C2423rN) r3
            java.util.Map<java.lang.String, com.facebook.ads.redexgen.X.rA> r1 = r6.A06
            java.lang.String r0 = r3.A02
            java.lang.Object r0 = r1.get(r0)
            com.facebook.ads.redexgen.X.rA r0 = (com.instagram.common.viewpoint.core.C2411rA) r0
            if (r0 == 0) goto L4
            boolean r4 = r3.A04
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C05461u.A0A
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L30
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L30:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C05461u.A0A
            java.lang.String r1 = "nPwsVC"
            r0 = 7
            r2[r0] = r1
            if (r4 == 0) goto L4
            com.facebook.ads.redexgen.X.rE r4 = r3.A01
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C05461u.A0A
            r0 = 5
            r1 = r2[r0]
            r0 = 6
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L60
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C05461u.A0A
            java.lang.String r1 = "zj"
            r0 = 0
            r2[r0] = r1
            if (r4 == 0) goto L4
        L56:
            com.facebook.ads.redexgen.X.rE r1 = r3.A01
            com.facebook.ads.redexgen.X.rE r0 = com.instagram.common.viewpoint.core.EnumC2415rE.A03
            if (r1 == r0) goto L4
            r3.A03(r6)
            goto L4
        L60:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C05461u.A0A
            java.lang.String r1 = "4Gl"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "t26"
            r0 = 2
            r2[r0] = r1
            if (r4 == 0) goto L4
            goto L56
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C05461u.A06(java.util.List):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public static boolean A07(C2423rN<?, ?> c2423rN) {
        if (c2423rN.A04) {
            EnumC2424rO enumC2424rO = c2423rN.A00;
            EnumC2424rO enumC2424rO2 = EnumC2424rO.A04;
            String[] strArr = A0A;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A0A[7] = "iICfc1p4CYNR1vFaz";
            if (enumC2424rO == enumC2424rO2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0752Al
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A46(com.instagram.common.viewpoint.core.C2423rN r8, android.graphics.Rect r9, android.graphics.Rect r10, boolean r11) {
        /*
            r7 = this;
            r7.A01(r8, r9, r10)
            com.facebook.ads.redexgen.X.rN r4 = r8.A05
            com.facebook.ads.redexgen.X.rN r0 = com.instagram.common.viewpoint.core.C2423rN.A0B
            if (r4 == r0) goto Le5
            if (r4 == 0) goto Le5
            com.facebook.ads.redexgen.X.rB r0 = r7.A03
            boolean r2 = com.instagram.common.viewpoint.core.C2412rB.A07(r0, r4)
            java.util.Map<java.lang.String, com.facebook.ads.redexgen.X.rA> r1 = r7.A06
            java.lang.String r0 = r4.A02
            java.lang.Object r3 = r1.get(r0)
            com.facebook.ads.redexgen.X.rA r3 = (com.instagram.common.viewpoint.core.C2411rA) r3
            if (r2 == 0) goto L57
            if (r3 == 0) goto L40
            java.util.List r0 = com.instagram.common.viewpoint.core.C2411rA.A05(r3)
            r0.clear()
            boolean r0 = r7.A07
            if (r0 == 0) goto La1
            boolean r4 = r4.A04()
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C05461u.A0A
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L93
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L40:
            long r0 = r7.A00
            com.facebook.ads.redexgen.X.rA r3 = com.instagram.common.viewpoint.core.C2411rA.A04(r0)
            android.graphics.Rect r1 = com.instagram.common.viewpoint.core.C2411rA.A00(r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.set(r0, r0, r0, r0)
            java.util.Map<java.lang.String, com.facebook.ads.redexgen.X.rA> r1 = r7.A06
            java.lang.String r0 = r4.A02
            r1.put(r0, r3)
            goto Lbf
        L57:
            if (r11 == 0) goto Ld0
            if (r3 == 0) goto Ld0
            android.graphics.Rect r6 = com.instagram.common.viewpoint.core.C2411rA.A00(r3)
            int r1 = r10.left
            android.graphics.Rect r0 = com.instagram.common.viewpoint.core.C2411rA.A00(r3)
            int r0 = r0.left
            int r5 = java.lang.Math.min(r1, r0)
            int r1 = r10.top
            android.graphics.Rect r0 = com.instagram.common.viewpoint.core.C2411rA.A00(r3)
            int r0 = r0.top
            int r4 = java.lang.Math.min(r1, r0)
            int r1 = r10.right
            android.graphics.Rect r0 = com.instagram.common.viewpoint.core.C2411rA.A00(r3)
            int r0 = r0.right
            int r2 = java.lang.Math.max(r1, r0)
            int r1 = r10.bottom
            android.graphics.Rect r0 = com.instagram.common.viewpoint.core.C2411rA.A00(r3)
            int r0 = r0.bottom
            int r0 = java.lang.Math.max(r1, r0)
            r6.set(r5, r4, r2, r0)
            goto Ld0
        L93:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C05461u.A0A
            java.lang.String r1 = "H54AceamXdthsYm78mtSydojeY2Fx6Sn"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "PVfiJKIqQ6L9JP1UYx1CLIU2NiQOo1Yq"
            r0 = 6
            r2[r0] = r1
            if (r4 == 0) goto Lbf
        La1:
            com.facebook.ads.redexgen.X.rE r4 = com.instagram.common.viewpoint.core.EnumC2415rE.A04
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C05461u.A0A
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 26
            if (r1 == r0) goto Ld3
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C05461u.A0A
            java.lang.String r1 = "tsuWg7tiHeCbTZ79GKvfVJLQxaexBCGH"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "f1Y9d3aTAam6AIKjxx39fqUFlMtOCeIE"
            r0 = 6
            r2[r0] = r1
            com.instagram.common.viewpoint.core.C2411rA.A02(r3, r4)
        Lbf:
            if (r11 == 0) goto Ld0
            android.graphics.Rect r5 = com.instagram.common.viewpoint.core.C2411rA.A00(r3)
            int r4 = r10.left
            int r2 = r10.top
            int r1 = r10.right
            int r0 = r10.bottom
            r5.set(r4, r2, r1, r0)
        Ld0:
            if (r3 != 0) goto Ld9
            return
        Ld3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        Ld9:
            java.util.List r1 = com.instagram.common.viewpoint.core.C2411rA.A05(r3)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r9)
            r1.add(r0)
        Le5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C05461u.A46(com.facebook.ads.redexgen.X.rN, android.graphics.Rect, android.graphics.Rect, boolean):void");
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0752Al
    public final void A4h(long j10, List<Rect> list) {
        this.A00 = j10;
        this.A05.clear();
        Iterator<Rect> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A0A;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "xWg";
            strArr2[2] = "l5f";
            if (zHasNext) {
                this.A05.add(new Rect(it.next()));
            } else {
                Iterator it2 = this.A04.A01().iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    if (A0A[0].length() == 2) {
                        String[] strArr3 = A0A;
                        strArr3[3] = "KXc0LwnJCEJYYpq44EYPYXvj71LHxLBt";
                        strArr3[1] = "SZ9db6jeJg1WeryC8zmRUBHGUrGxU8hd";
                        if (!zHasNext2) {
                            break;
                        }
                        this.A06.remove(((C2423rN) it2.next()).A02);
                    } else {
                        if (!zHasNext2) {
                            break;
                        }
                        this.A06.remove(((C2423rN) it2.next()).A02);
                    }
                }
                Collection<C2423rN> collectionA01 = this.A03.A01();
                if (A0A[0].length() != 2) {
                    throw new RuntimeException();
                }
                A0A[0] = "Au";
                for (C2423rN viewpointData : collectionA01) {
                    this.A06.remove(viewpointData.A02);
                }
                Iterator<C2411rA> it3 = this.A06.values().iterator();
                while (it3.hasNext()) {
                    it3.next().A03.clear();
                }
                this.A04.A04();
                this.A03.A04();
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2414rD
    public final void A8D(C2423rN c2423rN, Rect rect) {
        if (!this.A06.containsKey(c2423rN.A02)) {
            return;
        }
        rect.setEmpty();
        for (Rect rect2 : this.A06.get(c2423rN.A02).A03) {
            if (A0A[7].length() == 26) {
                throw new RuntimeException();
            }
            A0A[7] = "8y";
            rect.union(rect2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2414rD
    public final EnumC2415rE A9U(C2423rN c2423rN) {
        if (!this.A06.containsKey(c2423rN.A02)) {
            return EnumC2415rE.A02;
        }
        EnumC2415rE enumC2415rE = this.A06.get(c2423rN.A02).A01;
        if (c2423rN.A04) {
            if (c2423rN.A00 == EnumC2424rO.A04) {
                EnumC2415rE viewState = EnumC2415rE.A03;
                return viewState;
            }
            EnumC2415rE viewState2 = EnumC2415rE.A04;
            if (enumC2415rE == viewState2 && !c2423rN.A04()) {
                EnumC2415rE viewState3 = EnumC2415rE.A02;
                return viewState3;
            }
        }
        return enumC2415rE;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2414rD
    public final void A9W(Rect rect) {
        rect.setEmpty();
        Iterator<Rect> it = this.A05.iterator();
        while (it.hasNext()) {
            rect.union(it.next());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2414rD
    public final float A9X(C2423rN c2423rN) {
        C2411rA c2411rA = this.A06.get(c2423rN.A02);
        if (c2411rA != null) {
            Rect rectA00 = A00(c2411rA);
            int iHeight = rectA00.height() * rectA00.width();
            int totalVisibleArea = 0;
            for (Rect rect : c2411rA.A03) {
                totalVisibleArea += rect.height() * rect.width();
            }
            return totalVisibleArea / iHeight;
        }
        return 0.0f;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0752Al
    public final void AJu(InterfaceC2420rK interfaceC2420rK) {
        this.A01 = interfaceC2420rK;
    }
}
