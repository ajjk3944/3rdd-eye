package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.9h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C03539h extends AbstractC1807nD {
    public static byte[] A07;
    public static String[] A08 = {"yr7s5jzv1addyUjDczkFmKgb3TbXTjPI", "k5bxDF12X7IfueMvpCyLhsS14secbcRr", "A1nn9z9SPvnfAziOnMuSk0GZzxZ0jVfY", "Bn8GSVMc2Ww3cTp6j1ZQIVGuo4fvIYJ3", "KOSGSA", "kbDMqlVGuQuF7sZpY9G1V32bVqx23m", "bfxskyCfRQ3e5JfVyMYK1TBq", "KPf5jweXKATwb3ocWNu711OjnnCWcsTU"};
    public static final AbstractC1998qK<Integer> A09;
    public static final AbstractC1998qK<Integer> A0A;
    public C2002qQ A00;
    public C03549i A01;
    public C0468Ef A02;
    public final Context A03;
    public final InterfaceC0475Em A04;
    public final Object A05;
    public final boolean A06;

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        if (r18.A01.A0A == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
    
        if (r7.isEmpty() != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d5, code lost:
    
        if (r7.size() != r10.A01) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d7, code lost:
    
        r6.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:
    
        if (com.instagram.common.viewpoint.core.C03539h.A08[1].charAt(16) == 'p') goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e9, code lost:
    
        com.instagram.common.viewpoint.core.C03539h.A08[4] = "67hsDi";
        r6.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f3, code lost:
    
        r14.addAll(r6);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fa, code lost:
    
        com.instagram.common.viewpoint.core.C03539h.A08[4] = "yJ8LwG";
        r6.add(r7);
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("D25277746")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <T extends com.instagram.common.viewpoint.core.AbstractC0470Eh<T>> android.util.Pair<com.instagram.common.viewpoint.core.C0474El, java.lang.Integer> A0A(int r19, com.instagram.common.viewpoint.core.C0477Eo r20, int[][][] r21, com.instagram.common.viewpoint.core.InterfaceC0469Eg<T> r22, java.util.Comparator<java.util.List<T>> r23) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C03539h.A0A(int, com.facebook.ads.redexgen.X.Eo, int[][][], com.facebook.ads.redexgen.X.Eg, java.util.Comparator):android.util.Pair");
    }

    public static String A0J(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i4, i4 + i10);
        int i12 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A08[5].length() == 27) {
                throw new RuntimeException();
            }
            A08[4] = "58VoVy";
            if (i12 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 10);
            i12++;
        }
    }

    public static void A0M() {
        A07 = new byte[]{91, 92, -112, 127, -124, -118, 59, 126, -125, 124, -119, -119, -128, -121, 59, 126, -118, -112, -119, -113, 59, 126, -118, -119, -114, -113, -115, 124, -124, -119, -113, -114, 59, 126, 124, -119, -119, -118, -113, 59, 125, -128, 59, 124, -117, -117, -121, -124, -128, 127, 59, -110, -124, -113, -125, -118, -112, -113, 59, -115, -128, -127, -128, -115, -128, -119, 126, -128, 59, -113, -118, 59, 94, -118, -119, -113, -128, -109, -113, 73, 59, 93, -112, -124, -121, 127, 59, -113, -125, -128, 59, -113, -115, 124, 126, -122, 59, -114, -128, -121, -128, 126, -113, -118, -115, 59, -124, -119, -114, -113, 124, -119, 126, -128, 59, -110, -124, -113, -125, 59, -118, -119, -128, 59, -118, -127, 59, -113, -125, -128, 59, -119, -118, -119, 72, 127, -128, -117, -115, -128, 126, 124, -113, -128, 127, 59, 126, -118, -119, -114, -113, -115, -112, 126, -113, -118, -115, -114, 59, -113, -125, 124, -113, 59, -113, 124, -122, -128, 59, 124, 59, 94, -118, -119, -113, -128, -109, -113, 59, 124, -115, -126, -112, -120, -128, -119, -113, 73, -103, -70, -69, -74, -54, -63, -55, -87, -57, -74, -72, -64, -88, -70, -63, -70, -72, -55, -60, -57, -57, -37, -54, -49, -43, -107, -57, -55, -103, -83, -63, -80, -75, -69, 123, -83, -81, -128, -49, -29, -46, -41, -35, -99, -45, -49, -47, -95, -70, -50, -67, -62, -56, -120, -66, -70, -68, -116, -122, -61, -56, -68, -54, -61, -71, -119, 124, 119, 120, -126, 66, 116, -119, 67, 68, -98, -111, -116, -115, -105, 87, -119, -98, -117, -33, -46, -51, -50, -40, -104, -51, -40, -43, -53, -30, -106, -33, -46, -36, -46, -40, -41, -92, -105, -110, -109, -99, 93, -106, -109, -92, -111, -11, -24, -29, -28, -18, -82, -9, -84, -11, -19, -29, -83, -18, -19, -79, -83, -11, -17, -72};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0N(C1826nW c1826nW, C1955pc c1955pc, Map<Integer, C1957pe> map) {
        C1957pe c1957pe;
        for (int i4 = 0; i4 < c1826nW.A01; i4++) {
            C1957pe c1957pe2 = c1955pc.A0G.get(c1826nW.A05(i4));
            if (c1957pe2 != null && ((c1957pe = map.get(Integer.valueOf(c1957pe2.A01()))) == null || (c1957pe.A01.isEmpty() && !c1957pe2.A01.isEmpty()))) {
                map.put(Integer.valueOf(c1957pe2.A01()), c1957pe2);
            }
        }
    }

    static {
        A0M();
        A09 = AbstractC1998qK.A04(new Comparator() { // from class: com.facebook.ads.redexgen.X.EZ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C03539h.A05((Integer) obj, (Integer) obj2);
            }
        });
        A0A = AbstractC1998qK.A04(new Comparator() { // from class: com.facebook.ads.redexgen.X.Ea
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C03539h.A06((Integer) obj, (Integer) obj2);
            }
        });
    }

    @Deprecated
    public C03539h() {
        this(C03549i.A0J, new C1821nR());
    }

    @MetaExoPlayerCustomization(type = {"NEW_CONSTRUCTOR"}, value = "Backward Compatible Constructor")
    public C03539h(InterfaceC0475Em interfaceC0475Em) {
        this(C03549i.A0J, interfaceC0475Em);
    }

    @Deprecated
    public C03539h(C1955pc c1955pc, InterfaceC0475Em interfaceC0475Em) {
        this(c1955pc, interfaceC0475Em, null);
    }

    public C03539h(C1955pc c1955pc, InterfaceC0475Em interfaceC0475Em, Context context) {
        this.A05 = new Object();
        this.A03 = context != null ? context.getApplicationContext() : null;
        this.A04 = interfaceC0475Em;
        if (c1955pc instanceof C03549i) {
            this.A01 = (C03549i) c1955pc;
        } else {
            C03549i defaultParameters = context == null ? C03549i.A0J : C03549i.A02(context);
            this.A01 = defaultParameters.A0P().A0u(c1955pc).A0p();
        }
        this.A00 = C2002qQ.A07;
        this.A06 = context != null && C5C.A18(context);
        if (!this.A06 && context != null && C5C.A02 >= 32) {
            this.A02 = C0468Ef.A00(context);
        }
        if (this.A01.A08 && context == null) {
            AbstractC02284g.A07(A0J(188, 20, 75), A0J(1, 187, 17));
        }
    }

    public static int A00(int i4, int i10) {
        if (i4 != 0 && i4 == i10) {
            return Integer.MAX_VALUE;
        }
        return Integer.bitCount(i4 & i10);
    }

    public static int A02(C1996qI c1996qI, String str, boolean z3) {
        String strA0K;
        if (TextUtils.isEmpty(str)) {
            String strA0K2 = A0K(str);
            strA0K = A0K(c1996qI.A0V);
            if (strA0K != null) {
            }
            if (z3) {
                return 0;
            }
        }
        String str2 = c1996qI.A0V;
        String[] strArr = A08;
        if (strArr[6].length() != strArr[3].length()) {
            A08[7] = "utaRfuDCbQDIc6IM3a2tNPgwwhECnGgZ";
            if (str.equals(str2)) {
                if (A08[4].length() != 6) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[6] = "bdPum8qTTDlHeCQDHcvgSGFt";
                strArr2[3] = "zx28NE7Z14W3AzzAuoWnzSjL1M2eUdTs";
                return 4;
            }
            String strA0K22 = A0K(str);
            strA0K = A0K(c1996qI.A0V);
            if (strA0K != null || strA0K22 == null) {
                return (z3 && strA0K == null) ? 1 : 0;
            }
            if (strA0K.startsWith(strA0K22) || strA0K22.startsWith(strA0K)) {
                return 3;
            }
            String strA0J = A0J(0, 1, 36);
            String str3 = C5C.A1P(strA0K, strA0J)[0];
            String formatMainLanguage = C5C.A1P(strA0K22, strA0J)[0];
            String[] strArr3 = A08;
            String str4 = strArr3[6];
            String formatLanguage = strArr3[3];
            if (str4.length() != formatLanguage.length()) {
                A08[4] = "rXSrCW";
                if (!str3.equals(formatMainLanguage)) {
                    return 0;
                }
                return 2;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x000e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A03(com.instagram.common.viewpoint.core.C1959pg r8, int r9, int r10, boolean r11) {
        /*
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r9 == r0) goto L7
            if (r10 != r0) goto L8
        L7:
            return r0
        L8:
            r5 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
        Lc:
            int r0 = r8.A01
            if (r4 >= r0) goto L44
            com.facebook.ads.redexgen.X.qI r7 = r8.A08(r4)
            int r0 = r7.A0L
            if (r0 <= 0) goto L41
            int r0 = r7.A0A
            if (r0 <= 0) goto L41
            int r1 = r7.A0L
            int r0 = r7.A0A
            android.graphics.Point r6 = A09(r11, r9, r10, r1, r0)
            int r3 = r7.A0L
            int r0 = r7.A0A
            int r3 = r3 * r0
            int r1 = r7.A0L
            int r0 = r6.x
            float r0 = (float) r0
            r2 = 1065017672(0x3f7ae148, float:0.98)
            float r0 = r0 * r2
            int r0 = (int) r0
            if (r1 < r0) goto L41
            int r1 = r7.A0A
            int r0 = r6.y
            float r0 = (float) r0
            float r0 = r0 * r2
            int r0 = (int) r0
            if (r1 < r0) goto L41
            if (r3 >= r5) goto L41
            r5 = r3
        L41:
            int r4 = r4 + 1
            goto Lc
        L44:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C03539h.A03(com.facebook.ads.redexgen.X.pg, int, int, boolean):int");
    }

    public static /* synthetic */ int A05(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        if (A08[4].length() != 6) {
            throw new RuntimeException();
        }
        A08[1] = "gB7bm57sTKDjvfC8pNahT9wGVNX6TDKL";
        return iIntValue - iIntValue2;
    }

    public static /* synthetic */ int A06(Integer num, Integer num2) {
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A07(java.lang.String r9) {
        /*
            r8 = 0
            if (r9 != 0) goto L4
            return r8
        L4:
            int r0 = r9.hashCode()
            r7 = 1
            r6 = 2
            r5 = 3
            r4 = 4
            switch(r0) {
                case -1851077871: goto L75;
                case -1662735862: goto L4a;
                case -1662541442: goto L38;
                case 1331836730: goto L26;
                case 1599127257: goto L14;
                default: goto Lf;
            }
        Lf:
            r0 = -1
        L10:
            switch(r0) {
                case 0: goto L8b;
                case 1: goto L8a;
                case 2: goto L89;
                case 3: goto L88;
                case 4: goto L87;
                default: goto L13;
            }
        L13:
            return r8
        L14:
            r2 = 300(0x12c, float:4.2E-43)
            r1 = 19
            r0 = 117(0x75, float:1.64E-43)
            java.lang.String r0 = A0J(r2, r1, r0)
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto Lf
            r0 = 3
            goto L10
        L26:
            r2 = 263(0x107, float:3.69E-43)
            r1 = 9
            r0 = 30
            java.lang.String r0 = A0J(r2, r1, r0)
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto Lf
            r0 = 4
            goto L10
        L38:
            r2 = 290(0x122, float:4.06E-43)
            r1 = 10
            r0 = 36
            java.lang.String r0 = A0J(r2, r1, r0)
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto Lf
            r0 = 2
            goto L10
        L4a:
            r3 = 253(0xfd, float:3.55E-43)
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C03539h.A08
            r0 = 6
            r1 = r2[r0]
            r0 = 3
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L8d
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C03539h.A08
            java.lang.String r1 = "cKYBOGEqW486lDdcpu93NQ9TicEen6vk"
            r0 = 1
            r2[r0] = r1
            r1 = 10
            r0 = 9
            java.lang.String r0 = A0J(r3, r1, r0)
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        L75:
            r2 = 272(0x110, float:3.81E-43)
            r1 = 18
            r0 = 95
            java.lang.String r0 = A0J(r2, r1, r0)
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto Lf
            r0 = 0
            goto L10
        L87:
            return r7
        L88:
            return r6
        L89:
            return r5
        L8a:
            return r4
        L8b:
            r0 = 5
            return r0
        L8d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C03539h.A07(java.lang.String):int");
    }

    @MetaExoPlayerCustomization("Made public in D13395849")
    public static Point A09(boolean z3, int tempViewportWidth, int i4, int i10, int i11) {
        if (z3) {
            if ((i10 > i11) != (tempViewportWidth > i4)) {
                tempViewportWidth = i4;
                i4 = tempViewportWidth;
            }
        }
        if (i10 * i4 >= i11 * tempViewportWidth) {
            return new Point(tempViewportWidth, C5C.A05(tempViewportWidth * i11, i10));
        }
        return new Point(C5C.A05(i4 * i10, i11), i4);
    }

    private final Pair<C0474El, Integer> A0B(C0477Eo c0477Eo, int[][][] iArr, final C03549i c03549i, final String str) throws AD {
        return A0A(3, c0477Eo, iArr, new InterfaceC0469Eg() { // from class: com.facebook.ads.redexgen.X.nN
            @Override // com.instagram.common.viewpoint.core.InterfaceC0469Eg
            public final List A5F(int i4, C1959pg c1959pg, int[] iArr2) {
                return C1810nG.A02(i4, c1959pg, c03549i, iArr2, str);
            }
        }, new Comparator() { // from class: com.facebook.ads.redexgen.X.EY
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C1810nG.A01((List) obj, (List) obj2);
            }
        });
    }

    private final Pair<C0474El, Integer> A0C(C0477Eo c0477Eo, int[][][] iArr, int[] iArr2, final C03549i c03549i) throws AD {
        final boolean z3 = false;
        int i4 = 0;
        while (true) {
            if (i4 < c0477Eo.A02()) {
                if (2 == c0477Eo.A03(i4) && c0477Eo.A07(i4).A01 > 0) {
                    z3 = true;
                    break;
                }
                i4++;
            } else {
                break;
            }
        }
        return A0A(1, c0477Eo, iArr, new InterfaceC0469Eg() { // from class: com.facebook.ads.redexgen.X.nO
            @Override // com.instagram.common.viewpoint.core.InterfaceC0469Eg
            public final List A5F(int i10, C1959pg c1959pg, int[] iArr3) {
                return this.A01.A0e(c03549i, z3, i10, c1959pg, iArr3);
            }
        }, new Comparator() { // from class: com.facebook.ads.redexgen.X.EX
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C1816nM.A02((List) obj, (List) obj2);
            }
        });
    }

    private final Pair<C0474El, Integer> A0D(C0477Eo c0477Eo, int[][][] iArr, final int[] iArr2, final C03549i c03549i, final String str) throws AD {
        return A0A(2, c0477Eo, iArr, new InterfaceC0469Eg() { // from class: com.facebook.ads.redexgen.X.nQ
            @Override // com.instagram.common.viewpoint.core.InterfaceC0469Eg
            public final List A5F(int i4, C1959pg c1959pg, int[] iArr3) {
                return C1809nF.A06(i4, c1959pg, c03549i, iArr3, str, iArr2[i4]);
            }
        }, new Comparator() { // from class: com.facebook.ads.redexgen.X.EW
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C1809nF.A05((List) obj, (List) obj2);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.instagram.common.viewpoint.core.C0474El A0E(int r13, com.instagram.common.viewpoint.core.C1826nW r14, int[][] r15, com.instagram.common.viewpoint.core.C03549i r16) throws com.instagram.common.viewpoint.core.AD {
        /*
            r12 = this;
            r7 = 0
            r11 = 0
            r6 = 0
            r5 = 0
        L4:
            int r0 = r14.A01
            if (r5 >= r0) goto L8c
            com.facebook.ads.redexgen.X.pg r4 = r14.A05(r5)
            r10 = r15[r5]
            r3 = 0
        Lf:
            int r8 = r4.A01
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C03539h.A08
            r0 = 7
            r1 = r1[r0]
            r0 = 4
            char r1 = r1.charAt(r0)
            r0 = 114(0x72, float:1.6E-43)
            if (r1 == r0) goto L86
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C03539h.A08
            java.lang.String r1 = "eXe48tlcaaFOVphj3tBJsJZ33XViaUIe"
            r0 = 7
            r2[r0] = r1
            if (r3 >= r8) goto L7d
            r8 = r10[r3]
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C03539h.A08
            r0 = 7
            r1 = r1[r0]
            r0 = 4
            char r1 = r1.charAt(r0)
            r0 = 114(0x72, float:1.6E-43)
            if (r1 == r0) goto L80
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C03539h.A08
            java.lang.String r1 = "FFBXZuvHsKfXoft1igGzNsuMgLJqlaBK"
            r0 = 7
            r2[r0] = r1
            r0 = r16
            boolean r0 = r0.A0B
            boolean r0 = A0S(r8, r0)
            if (r0 == 0) goto L7a
            com.facebook.ads.redexgen.X.qI r1 = r4.A08(r3)
            com.facebook.ads.redexgen.X.Ec r8 = new com.facebook.ads.redexgen.X.Ec
            r0 = r10[r3]
            r8.<init>(r1, r0)
            if (r6 == 0) goto L77
            int r9 = r8.compareTo(r6)
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C03539h.A08
            r0 = 0
            r1 = r2[r0]
            r0 = 2
            r2 = r2[r0]
            r0 = 9
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L86
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C03539h.A08
            java.lang.String r1 = "us6BKPnONaHSk6j2pgBHNNPTLKUclzqr"
            r0 = 1
            r2[r0] = r1
            if (r9 <= 0) goto L7a
        L77:
            r7 = r4
            r11 = r3
            r6 = r8
        L7a:
            int r3 = r3 + 1
            goto Lf
        L7d:
            int r5 = r5 + 1
            goto L4
        L80:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L86:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L8c:
            if (r7 != 0) goto L90
            r1 = 0
        L8f:
            return r1
        L90:
            int[] r0 = new int[]{r11}
            com.facebook.ads.redexgen.X.El r1 = new com.facebook.ads.redexgen.X.El
            r1.<init>(r7, r0)
            goto L8f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C03539h.A0E(int, com.facebook.ads.redexgen.X.nW, int[][], com.facebook.ads.redexgen.X.9i):com.facebook.ads.redexgen.X.El");
    }

    public static String A0K(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, A0J(250, 3, 75))) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L() {
        boolean z3;
        synchronized (this.A05) {
            z3 = this.A01.A08 && !this.A06 && C5C.A02 >= 32 && this.A02 != null && this.A02.A06();
        }
        if (z3) {
            A01();
        }
    }

    public static void A0P(C0477Eo c0477Eo, C1955pc c1955pc, C0474El[] c0474ElArr) {
        C0474El c0474El;
        int iA02 = c0477Eo.A02();
        HashMap map = new HashMap();
        for (int i4 = 0; i4 < iA02; i4++) {
            A0N(c0477Eo.A07(i4), c1955pc, map);
        }
        A0N(c0477Eo.A06(), c1955pc, map);
        for (int i10 = 0; i10 < iA02; i10++) {
            int rendererCount = c0477Eo.A03(i10);
            C1957pe c1957pe = (C1957pe) map.get(Integer.valueOf(rendererCount));
            if (c1957pe != null) {
                boolean zIsEmpty = c1957pe.A01.isEmpty();
                if (A08[7].charAt(4) == 'r') {
                    throw new RuntimeException();
                }
                A08[4] = "YbaSeo";
                if (!zIsEmpty && c0477Eo.A07(i10).A04(c1957pe.A00) != -1) {
                    c0474El = new C0474El(c1957pe.A00, AbstractC0380As.A0B(c1957pe.A01));
                } else {
                    c0474El = null;
                }
                c0474ElArr[i10] = c0474El;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0Q(com.instagram.common.viewpoint.core.C0477Eo r8, com.instagram.common.viewpoint.core.C03549i r9, com.instagram.common.viewpoint.core.C0474El[] r10) {
        /*
            int r5 = r8.A02()
            r4 = 0
        L5:
            if (r4 >= r5) goto L71
            com.facebook.ads.redexgen.X.nW r3 = r8.A07(r4)
            boolean r0 = r9.A0S(r4, r3)
            if (r0 != 0) goto L14
        L11:
            int r4 = r4 + 1
            goto L5
        L14:
            com.facebook.ads.redexgen.X.nH r6 = r9.A0Q(r4, r3)
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C03539h.A08
            r0 = 6
            r1 = r2[r0]
            r0 = 3
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L6b
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C03539h.A08
            java.lang.String r1 = "K8f1XF422sl3cXXm"
            r0 = 5
            r2[r0] = r1
            if (r6 == 0) goto L63
            int[] r0 = r6.A03
            int r7 = r0.length
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C03539h.A08
            r0 = 6
            r1 = r2[r0]
            r0 = 3
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L65
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C03539h.A08
            java.lang.String r1 = "KnBpd5"
            r0 = 4
            r2[r0] = r1
            if (r7 == 0) goto L63
            int r0 = r6.A00
            com.facebook.ads.redexgen.X.pg r3 = r3.A05(r0)
            int[] r2 = r6.A03
            int r1 = r6.A02
            com.facebook.ads.redexgen.X.El r0 = new com.facebook.ads.redexgen.X.El
            r0.<init>(r3, r2, r1)
        L60:
            r10[r4] = r0
            goto L11
        L63:
            r0 = 0
            goto L60
        L65:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L6b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C03539h.A0Q(com.facebook.ads.redexgen.X.Eo, com.facebook.ads.redexgen.X.9i, com.facebook.ads.redexgen.X.El[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (r4 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r4 != 2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r3 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (A0W(r12[r7], r11.A07(r7), r3) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r4 != 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r9 == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        if (r8 == (-1)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r4 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0R(com.instagram.common.viewpoint.core.C0477Eo r11, int[][][] r12, com.instagram.common.viewpoint.core.C03187s[] r13, com.instagram.common.viewpoint.core.InterfaceC1808nE[] r14) {
        /*
            r9 = -1
            r8 = -1
            r10 = 1
            r7 = 0
        L4:
            int r3 = r11.A02()
            r6 = -1
            r5 = 1
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C03539h.A08
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 6
            if (r1 == r0) goto L1c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L1c:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C03539h.A08
            java.lang.String r1 = "NZY9D9dgjYLNZ0XYpF4W2GrX5uVEwVhV"
            r0 = 1
            r2[r0] = r1
            if (r7 >= r3) goto L5e
            int r4 = r11.A03(r7)
            r3 = r14[r7]
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C03539h.A08
            r0 = 0
            r1 = r2[r0]
            r0 = 2
            r2 = r2[r0]
            r0 = 9
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L76
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C03539h.A08
            java.lang.String r1 = "nPMicF"
            r0 = 4
            r2[r0] = r1
            if (r4 == r5) goto L4b
        L48:
            r0 = 2
            if (r4 != r0) goto L88
        L4b:
            if (r3 == 0) goto L88
            r1 = r12[r7]
            com.facebook.ads.redexgen.X.nW r0 = r11.A07(r7)
            boolean r0 = A0W(r1, r0, r3)
            if (r0 == 0) goto L88
            if (r4 != r5) goto L72
            if (r9 == r6) goto L85
            r10 = 0
        L5e:
            if (r9 == r6) goto L70
            if (r8 == r6) goto L70
            r0 = 1
        L63:
            r10 = r10 & r0
            if (r10 == 0) goto L6f
            com.facebook.ads.redexgen.X.7s r0 = new com.facebook.ads.redexgen.X.7s
            r0.<init>(r5)
            r13[r9] = r0
            r13[r8] = r0
        L6f:
            return
        L70:
            r0 = 0
            goto L63
        L72:
            if (r8 == r6) goto L87
            r10 = 0
            goto L5e
        L76:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C03539h.A08
            java.lang.String r1 = "5F5ko3NIDU1YMXmZZUDVXdSE"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "1c60xx4jFCOb1nSxKeVAoj10cRAS07b7"
            r0 = 3
            r2[r0] = r1
            if (r4 == r5) goto L4b
            goto L48
        L85:
            r9 = r7
            goto L88
        L87:
            r8 = r7
        L88:
            int r7 = r7 + 1
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C03539h.A0R(com.facebook.ads.redexgen.X.Eo, int[][][], com.facebook.ads.redexgen.X.7s[], com.facebook.ads.redexgen.X.nE[]):void");
    }

    @MetaExoPlayerCustomization("Made public for customization on DashManifestHelper")
    public static boolean A0S(int i4, boolean z3) {
        int iA03 = AbstractC03087i.A03(i4);
        return iA03 == 4 || (z3 && iA03 == 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0T(C1996qI c1996qI) {
        boolean z3;
        synchronized (this.A05) {
            z3 = !this.A01.A08 || this.A06 || c1996qI.A06 <= 2 || (A0U(c1996qI) && (C5C.A02 < 32 || this.A02 == null || !this.A02.A06())) || (C5C.A02 >= 32 && this.A02 != null && this.A02.A06() && this.A02.A04() && this.A02.A05() && this.A02.A07(this.A00, c1996qI));
        }
        return z3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0U(com.instagram.common.viewpoint.core.C1996qI r6) {
        /*
            java.lang.String r0 = r6.A0W
            r5 = 0
            if (r0 != 0) goto L6
            return r5
        L6:
            java.lang.String r3 = r6.A0W
            int r0 = r3.hashCode()
            r4 = 1
            switch(r0) {
                case -2123537834: goto L4b;
                case 187078296: goto L39;
                case 187078297: goto L27;
                case 1504578661: goto L15;
                default: goto L10;
            }
        L10:
            r0 = -1
        L11:
            switch(r0) {
                case 0: goto L5d;
                case 1: goto L5d;
                case 2: goto L5d;
                case 3: goto L5d;
                default: goto L14;
            }
        L14:
            return r5
        L15:
            r2 = 226(0xe2, float:3.17E-43)
            r1 = 10
            r0 = 100
            java.lang.String r0 = A0J(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L27:
            r2 = 217(0xd9, float:3.04E-43)
            r1 = 9
            r0 = 66
            java.lang.String r0 = A0J(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L10
            r0 = 3
            goto L11
        L39:
            r2 = 208(0xd0, float:2.91E-43)
            r1 = 9
            r0 = 92
            java.lang.String r0 = A0J(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L10
            r0 = 0
            goto L11
        L4b:
            r2 = 236(0xec, float:3.31E-43)
            r1 = 14
            r0 = 79
            java.lang.String r0 = A0J(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L10
            r0 = 2
            goto L11
        L5d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C03539h.A0U(com.facebook.ads.redexgen.X.qI):boolean");
    }

    public static boolean A0W(int[][] iArr, C1826nW c1826nW, InterfaceC1808nE interfaceC1808nE) {
        if (interfaceC1808nE == null) {
            return false;
        }
        int iA04 = c1826nW.A04(interfaceC1808nE.A9L());
        for (int i4 = 0; i4 < interfaceC1808nE.length(); i4++) {
            int trackGroupIndex = AbstractC03087i.A05(iArr[iA04][interfaceC1808nE.A8H(i4)]);
            if (trackGroupIndex != 32) {
                return false;
            }
        }
        return true;
    }

    private final C0474El[] A0X(C0477Eo c0477Eo, int[][][] iArr, int[] iArr2, C03549i c03549i) throws AD {
        String str;
        int iA02 = c0477Eo.A02();
        C0474El[] c0474ElArr = new C0474El[iA02];
        Pair<C0474El, Integer> pairA0C = A0C(c0477Eo, iArr, iArr2, c03549i);
        if (pairA0C != null) {
            Object obj = pairA0C.second;
            String[] strArr = A08;
            String str2 = strArr[0];
            String str3 = strArr[2];
            int iCharAt = str2.charAt(9);
            int rendererCount = str3.charAt(9);
            if (iCharAt == rendererCount) {
                throw new RuntimeException();
            }
            A08[7] = "yBKbxgl1qoYBYNtasAVV61g1RQWhRN9O";
            c0474ElArr[((Integer) obj).intValue()] = (C0474El) pairA0C.first;
        }
        if (pairA0C == null) {
            str = null;
        } else {
            C1959pg c1959pg = ((C0474El) pairA0C.first).A01;
            int rendererCount2 = ((C0474El) pairA0C.first).A02[0];
            str = c1959pg.A08(rendererCount2).A0V;
        }
        Pair<C0474El, Integer> pairA0D = A0D(c0477Eo, iArr, iArr2, c03549i, str);
        if (pairA0D != null) {
            c0474ElArr[((Integer) pairA0D.second).intValue()] = (C0474El) pairA0D.first;
        }
        Pair<C0474El, Integer> pairA0B = A0B(c0477Eo, iArr, c03549i, str);
        if (pairA0B != null) {
            c0474ElArr[((Integer) pairA0B.second).intValue()] = (C0474El) pairA0B.first;
        }
        for (int i4 = 0; i4 < iA02; i4++) {
            int i10 = c0477Eo.A03(i4);
            if (i10 != 2 && i10 != 1) {
                String[] strArr2 = A08;
                String str4 = strArr2[0];
                String str5 = strArr2[2];
                int iCharAt2 = str4.charAt(9);
                int rendererCount3 = str5.charAt(9);
                if (iCharAt2 == rendererCount3) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A08;
                strArr3[6] = "1xsmyE1OdjkvrsbXr4cEFZBV";
                strArr3[3] = "D4xPicyrc2caIP01Cw6NBhV2pRXBVsmG";
                if (i10 != 3) {
                    c0474ElArr[i4] = A0E(i10, c0477Eo.A07(i4), iArr[i4], c03549i);
                }
            }
        }
        return c0474ElArr;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0485Ew
    public final boolean A0Y() {
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1807nD
    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "final removed in D35162315")
    public final Pair<C03187s[], InterfaceC1808nE[]> A0d(C0477Eo c0477Eo, int[][][] iArr, int[] iArr2, C1844no c1844no, Timeline timeline) throws Throwable {
        C03549i c03549i;
        synchronized (this.A05) {
            try {
                c03549i = this.A01;
                if (c03549i.A08 && C5C.A02 >= 32 && this.A02 != null) {
                    this.A02.A03(this, (Looper) AbstractC02203y.A02(Looper.myLooper()));
                }
            } catch (Throwable th2) {
                th = th2;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        }
        int iA02 = c0477Eo.A02();
        C0474El[] c0474ElArrA0X = A0X(c0477Eo, iArr, iArr2, c03549i);
        A0P(c0477Eo, c03549i, c0474ElArrA0X);
        A0Q(c0477Eo, c03549i, c0474ElArrA0X);
        for (int rendererCount = 0; rendererCount < iA02; rendererCount++) {
            int iA03 = c0477Eo.A03(rendererCount);
            if (c03549i.A0R(rendererCount) || c03549i.A0H.contains(Integer.valueOf(iA03))) {
                c0474ElArrA0X[rendererCount] = null;
            }
        }
        InterfaceC1808nE[] interfaceC1808nEArrA5b = this.A04.A5b(c0474ElArrA0X, A00(), c1844no, timeline);
        C03187s[] c03187sArr = new C03187s[iA02];
        for (int i4 = 0; i4 < iA02; i4++) {
            c03187sArr[i4] = !(c03549i.A0R(i4) || c03549i.A0H.contains(Integer.valueOf(c0477Eo.A03(i4)))) && (c0477Eo.A03(i4) == -2 || interfaceC1808nEArrA5b[i4] != null) ? C03187s.A01 : null;
        }
        if (c03549i.A0D) {
            A0R(c0477Eo, iArr, c03187sArr, interfaceC1808nEArrA5b);
        }
        return Pair.create(c03187sArr, interfaceC1808nEArrA5b);
    }

    public final /* synthetic */ BP A0e(C03549i c03549i, boolean z3, int i4, C1959pg c1959pg, int[] iArr) {
        return C1816nM.A03(i4, c1959pg, c03549i, iArr, z3, new InterfaceC1667kj() { // from class: com.facebook.ads.redexgen.X.nP
            @Override // com.instagram.common.viewpoint.core.InterfaceC1667kj
            public final boolean A4C(Object obj) {
                return this.A00.A0T((C1996qI) obj);
            }
        });
    }
}
