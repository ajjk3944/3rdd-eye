package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2194nM extends AbstractC0848Eh<C2194nM> implements Comparable<C2194nM> {
    public static String[] A0I = {"kuPF6Ds61I7lkNvdz9bcVPsTInik8V3M", "Qk0zKRkYsaxRz9XBLHG1rmY7ne3qL", "U5xl3sY91uvZaW", "4oEkNGaUX02G9U6MTdWApFSB5pjWlUNx", "CFtCC3eFdvC", "EnNVjubCw6rdwWEp5vRTdV2Ipxq1ST06", "834ujo2VifTXBI2K", "5tr2zEJniV6LNy5ijK5ku"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final C07329i A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C2194nM(int i10, C2337pg c2337pg, int i11, C07329i c07329i, int i12, boolean z10, InterfaceC2045kj<C2374qI> interfaceC2045kj) {
        super(i10, c2337pg, i11);
        this.A0A = c07329i;
        this.A0B = C07319h.A0K(super.A02.A0V);
        this.A0F = C07319h.A0S(i12, false);
        int i13 = 0;
        int i14 = Integer.MAX_VALUE;
        int i15 = 0;
        while (true) {
            if (i15 >= c07329i.A0I.size()) {
                break;
            }
            int iA02 = C07319h.A02(super.A02, c07329i.A0I.get(i15), false);
            if (iA02 > 0) {
                i14 = i15;
                i13 = iA02;
                break;
            }
            i15++;
        }
        this.A04 = i14;
        this.A05 = i13;
        this.A07 = C07319h.A00(super.A02.A0E, ((C2333pc) c07329i).A0B);
        this.A0C = super.A02.A0E == 0 || (super.A02.A0E & 1) != 0;
        this.A0D = (super.A02.A0H & 1) != 0;
        this.A01 = super.A02.A06;
        this.A08 = super.A02.A0G;
        this.A00 = super.A02.A05;
        this.A0E = (super.A02.A05 == -1 || super.A02.A05 <= ((C2333pc) c07329i).A01) && (super.A02.A06 == -1 || super.A02.A06 <= ((C2333pc) c07329i).A02) && interfaceC2045kj.A4C(super.A02);
        String[] strArrA1L = C5C.A1L();
        int i16 = Integer.MAX_VALUE;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            if (i18 >= strArrA1L.length) {
                break;
            }
            int iA022 = C07319h.A02(super.A02, strArrA1L[i18], false);
            if (iA022 > 0) {
                i16 = i18;
                i17 = iA022;
                break;
            }
            i18++;
        }
        this.A02 = i16;
        this.A03 = i17;
        int i19 = Integer.MAX_VALUE;
        int i20 = 0;
        while (true) {
            if (i20 < c07329i.A0J.size()) {
                if (super.A02.A0W != null && super.A02.A0W.equals(c07329i.A0J.get(i20))) {
                    i19 = i20;
                    break;
                }
                i20++;
            } else {
                break;
            }
        }
        this.A06 = i19;
        this.A0H = AbstractC06867i.A02(i12) == 128;
        this.A0G = AbstractC06867i.A04(i12) == 64;
        this.A09 = A00(i12, z10);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A02(List<C2194nM> list, List<C2194nM> list2) {
        return ((C2194nM) Collections.max(list)).compareTo((C2194nM) Collections.max(list2));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static BP<C2194nM> A03(int i10, C2337pg c2337pg, C07329i c07329i, int[] iArr, boolean z10, InterfaceC2045kj<C2374qI> interfaceC2045kj) {
        C2K c2kA01 = BP.A01();
        for (int i11 = 0; i11 < c2337pg.A01; i11++) {
            c2kA01.A04(new C2194nM(i10, c2337pg, i11, c07329i, iArr[i11], z10, interfaceC2045kj));
        }
        return c2kA01.A05();
    }

    private int A00(int i10, boolean z10) {
        if (!C07319h.A0S(i10, this.A0A.A0B)) {
            return 0;
        }
        if (!this.A0E && !this.A0A.A09) {
            return 0;
        }
        if (C07319h.A0S(i10, false) && this.A0E && super.A02.A05 != -1 && !this.A0A.A0N && !this.A0A.A0O && (this.A0A.A04 || !z10)) {
            return 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<java.lang.Integer> */
    @Override // java.lang.Comparable
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2194nM c2194nM) {
        AbstractC2376qK abstractC2376qKA06;
        AbstractC2376qK abstractC2376qKA062 = (this.A0E && this.A0F) ? C07319h.A09 : C07319h.A09.A06();
        AbstractC2226ns abstractC2226nsA08 = AbstractC2226ns.A01().A09(this.A0F, c2194nM.A0F).A08(Integer.valueOf(this.A04), Integer.valueOf(c2194nM.A04), AbstractC2376qK.A03().A06()).A06(this.A05, c2194nM.A05).A06(this.A07, c2194nM.A07).A09(this.A0D, c2194nM.A0D).A09(this.A0C, c2194nM.A0C).A08(Integer.valueOf(this.A02), Integer.valueOf(c2194nM.A02), AbstractC2376qK.A03().A06()).A06(this.A03, c2194nM.A03).A09(this.A0E, c2194nM.A0E).A08(Integer.valueOf(this.A06), Integer.valueOf(c2194nM.A06), AbstractC2376qK.A03().A06());
        Integer numValueOf = Integer.valueOf(this.A00);
        Integer numValueOf2 = Integer.valueOf(c2194nM.A00);
        if (this.A0A.A0O) {
            abstractC2376qKA06 = C07319h.A09.A06();
        } else {
            abstractC2376qKA06 = C07319h.A0A;
        }
        AbstractC2226ns abstractC2226nsA082 = abstractC2226nsA08.A08(numValueOf, numValueOf2, abstractC2376qKA06).A09(this.A0H, c2194nM.A0H).A09(this.A0G, c2194nM.A0G).A08(Integer.valueOf(this.A01), Integer.valueOf(c2194nM.A01), abstractC2376qKA062).A08(Integer.valueOf(this.A08), Integer.valueOf(c2194nM.A08), abstractC2376qKA062);
        Integer numValueOf3 = Integer.valueOf(this.A00);
        Integer numValueOf4 = Integer.valueOf(c2194nM.A00);
        if (!C5C.A1E(this.A0B, c2194nM.A0B)) {
            abstractC2376qKA062 = C07319h.A0A;
        }
        return abstractC2226nsA082.A08(numValueOf3, numValueOf4, abstractC2376qKA062).A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    @Override // com.instagram.common.viewpoint.core.AbstractC0848Eh
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A09(com.instagram.common.viewpoint.core.C2194nM r6) {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.9i r0 = r5.A0A
            boolean r0 = r0.A00
            r3 = -1
            if (r0 != 0) goto L36
            com.facebook.ads.redexgen.X.qI r0 = r5.A02
            int r0 = r0.A06
            if (r0 == r3) goto L7a
            com.facebook.ads.redexgen.X.qI r0 = r5.A02
            int r4 = r0.A06
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C2194nM.A0I
            r0 = 5
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 5
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L7c
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C2194nM.A0I
            java.lang.String r1 = "4j0Ebeo7wJOJZxGoc5hIgJQJaA3nIP6d"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "7JU6hRyIHJ6Xx4Pnq3EsCWmSiYve8JpD"
            r0 = 0
            r2[r0] = r1
            com.facebook.ads.redexgen.X.qI r0 = r6.A02
            int r0 = r0.A06
            if (r4 != r0) goto L7a
        L36:
            com.facebook.ads.redexgen.X.9i r0 = r5.A0A
            boolean r0 = r0.A02
            if (r0 != 0) goto L50
            com.facebook.ads.redexgen.X.qI r0 = r5.A02
            java.lang.String r0 = r0.A0W
            if (r0 == 0) goto L7a
            com.facebook.ads.redexgen.X.qI r0 = r5.A02
            java.lang.String r1 = r0.A0W
            com.facebook.ads.redexgen.X.qI r0 = r6.A02
            java.lang.String r0 = r0.A0W
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L7a
        L50:
            com.facebook.ads.redexgen.X.9i r0 = r5.A0A
            boolean r0 = r0.A03
            if (r0 != 0) goto L66
            com.facebook.ads.redexgen.X.qI r0 = r5.A02
            int r0 = r0.A0G
            if (r0 == r3) goto L7a
            com.facebook.ads.redexgen.X.qI r0 = r5.A02
            int r1 = r0.A0G
            com.facebook.ads.redexgen.X.qI r0 = r6.A02
            int r0 = r0.A0G
            if (r1 != r0) goto L7a
        L66:
            com.facebook.ads.redexgen.X.9i r0 = r5.A0A
            boolean r0 = r0.A01
            if (r0 != 0) goto L78
            boolean r1 = r5.A0H
            boolean r0 = r6.A0H
            if (r1 != r0) goto L7a
            boolean r1 = r5.A0G
            boolean r0 = r6.A0G
            if (r1 != r0) goto L7a
        L78:
            r0 = 1
        L79:
            return r0
        L7a:
            r0 = 0
            goto L79
        L7c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C2194nM.A09(com.facebook.ads.redexgen.X.nM):boolean");
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0848Eh
    public final int A08() {
        return this.A09;
    }
}
