package com.facebook.ads.redexgen.core;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ln, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3763ln extends E5<C3763ln> implements Comparable<C3763ln> {
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
    public static int A01(List<C3763ln> list, List<C3763ln> list2) {
        return list.get(0).compareTo(list2.get(0));
    }

    public C3763ln(int i, C3915oH c3915oH, int i10, AnonymousClass93 anonymousClass93, int i11, String str) {
        List<String> listA03;
        super(i, c3915oH, i10);
        int i12 = 0;
        this.A08 = AnonymousClass92.A0S(i11, false);
        int i13 = super.A02.A0H & (~((C3908oA) anonymousClass93).A00);
        this.A06 = (i13 & 1) != 0;
        this.A07 = (i13 & 2) != 0;
        int i14 = Integer.MAX_VALUE;
        int bestLanguageScore = 0;
        if (anonymousClass93.A0K.isEmpty()) {
            listA03 = MetaExoPlayerCustomizedCollections.A03("");
        } else {
            listA03 = anonymousClass93.A0K;
        }
        int bestLanguageIndex = 0;
        while (true) {
            if (bestLanguageIndex >= listA03.size()) {
                break;
            }
            int iA02 = AnonymousClass92.A02(super.A02, listA03.get(bestLanguageIndex), anonymousClass93.A0P);
            if (iA02 > 0) {
                i14 = bestLanguageIndex;
                bestLanguageScore = iA02;
                break;
            }
            bestLanguageIndex++;
        }
        this.A00 = i14;
        this.A01 = bestLanguageScore;
        this.A02 = AnonymousClass92.A00(super.A02.A0E, ((C3908oA) anonymousClass93).A0C);
        this.A05 = (super.A02.A0E & 1088) != 0;
        this.A03 = AnonymousClass92.A02(super.A02, str, AnonymousClass92.A0K(str) == null);
        boolean z10 = this.A01 > 0 || (anonymousClass93.A0K.isEmpty() && this.A02 > 0) || this.A06 || (this.A07 && this.A03 > 0);
        if (AnonymousClass92.A0S(i11, anonymousClass93.A0B) && z10) {
            i12 = 1;
        }
        this.A04 = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3763ln c3763ln) {
        AbstractC3780m4 abstractC3780m4A06 = AbstractC3780m4.A01().A09(this.A08, c3763ln.A08).A08(Integer.valueOf(this.A00), Integer.valueOf(c3763ln.A00), AbstractC3928oV.A03().A06()).A06(this.A01, c3763ln.A01).A06(this.A02, c3763ln.A02).A09(this.A06, c3763ln.A06).A08(Boolean.valueOf(this.A07), Boolean.valueOf(c3763ln.A07), this.A01 == 0 ? AbstractC3928oV.A03() : AbstractC3928oV.A03().A06()).A06(this.A03, c3763ln.A03);
        if (this.A02 == 0) {
            abstractC3780m4A06 = abstractC3780m4A06.A0A(this.A05, c3763ln.A05);
        }
        return abstractC3780m4A06.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1h != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TextTrackInfo> */
    public static AbstractC2416Am<C3763ln> A02(int i, C3915oH c3915oH, AnonymousClass93 anonymousClass93, int[] iArr, String str) {
        C21921h c21921hA01 = AbstractC2416Am.A01();
        for (int i10 = 0; i10 < c3915oH.A01; i10++) {
            c21921hA01.A04(new C3763ln(i, c3915oH, i10, anonymousClass93, iArr[i10], str));
        }
        return c21921hA01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.E5
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C3763ln c3763ln) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.E5
    public final int A08() {
        return this.A04;
    }
}
