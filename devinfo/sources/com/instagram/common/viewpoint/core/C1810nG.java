package com.instagram.common.viewpoint.core;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1810nG extends AbstractC0470Eh<C1810nG> implements Comparable<C1810nG> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(List<C1810nG> list, List<C1810nG> list2) {
        return list.get(0).compareTo(list2.get(0));
    }

    public C1810nG(int i4, C1959pg c1959pg, int i10, C03549i c03549i, int i11, String str) {
        List<String> listA03;
        super(i4, c1959pg, i10);
        int i12 = 0;
        this.A08 = C03539h.A0S(i11, false);
        int i13 = super.A02.A0H & (~((C1955pc) c03549i).A00);
        this.A06 = (i13 & 1) != 0;
        this.A07 = (i13 & 2) != 0;
        int i14 = Integer.MAX_VALUE;
        int bestLanguageScore = 0;
        if (c03549i.A0K.isEmpty()) {
            listA03 = MetaExoPlayerCustomizedCollections.A03("");
        } else {
            listA03 = c03549i.A0K;
        }
        int bestLanguageIndex = 0;
        while (true) {
            if (bestLanguageIndex >= listA03.size()) {
                break;
            }
            int iA02 = C03539h.A02(super.A02, listA03.get(bestLanguageIndex), c03549i.A0P);
            if (iA02 > 0) {
                i14 = bestLanguageIndex;
                bestLanguageScore = iA02;
                break;
            }
            bestLanguageIndex++;
        }
        this.A00 = i14;
        this.A01 = bestLanguageScore;
        this.A02 = C03539h.A00(super.A02.A0E, ((C1955pc) c03549i).A0C);
        this.A05 = (super.A02.A0E & 1088) != 0;
        this.A03 = C03539h.A02(super.A02, str, C03539h.A0K(str) == null);
        boolean z3 = this.A01 > 0 || (c03549i.A0K.isEmpty() && this.A02 > 0) || this.A06 || (this.A07 && this.A03 > 0);
        if (C03539h.A0S(i11, c03549i.A0B) && z3) {
            i12 = 1;
        }
        this.A04 = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1810nG c1810nG) {
        AbstractC1848ns abstractC1848nsA06 = AbstractC1848ns.A01().A09(this.A08, c1810nG.A08).A08(Integer.valueOf(this.A00), Integer.valueOf(c1810nG.A00), AbstractC1998qK.A03().A06()).A06(this.A01, c1810nG.A01).A06(this.A02, c1810nG.A02).A09(this.A06, c1810nG.A06).A08(Boolean.valueOf(this.A07), Boolean.valueOf(c1810nG.A07), this.A01 == 0 ? AbstractC1998qK.A03() : AbstractC1998qK.A03().A06()).A06(this.A03, c1810nG.A03);
        if (this.A02 == 0) {
            abstractC1848nsA06 = abstractC1848nsA06.A0A(this.A05, c1810nG.A05);
        }
        return abstractC1848nsA06.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TextTrackInfo> */
    public static BP<C1810nG> A02(int i4, C1959pg c1959pg, C03549i c03549i, int[] iArr, String str) {
        C2K c2kA01 = BP.A01();
        for (int i10 = 0; i10 < c1959pg.A01; i10++) {
            c2kA01.A04(new C1810nG(i4, c1959pg, i10, c03549i, iArr[i10], str));
        }
        return c2kA01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC0470Eh
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C1810nG c1810nG) {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0470Eh
    public final int A08() {
        return this.A04;
    }
}
