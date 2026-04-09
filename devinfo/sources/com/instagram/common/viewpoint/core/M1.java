package com.instagram.common.viewpoint.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public final class M1 extends AbstractC0784Qq<C0504Fq> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC0977Yh A03;
    public C1381fp A04;
    public String A05;
    public List<C1274e5> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC1601jd A08;
    public final C0842Sx A09;
    public final C1436gi A0A;
    public final VA A0B;
    public final UK A0C;
    public final Y2 A0D;
    public final C6X A0E;
    public final DZ A0F;

    public M1(C1436gi c1436gi, List<C1274e5> list, AbstractC1601jd abstractC1601jd, VA va2, UK uk2, InterfaceC0977Yh interfaceC0977Yh, String str, C6X c6x, DZ dz) {
        this.A0A = c1436gi;
        this.A0B = va2;
        this.A0C = uk2;
        this.A09 = uk2.A14();
        this.A04 = uk2.A1G();
        this.A0D = uk2.A1E();
        this.A03 = interfaceC0977Yh;
        this.A08 = abstractC1601jd;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c6x;
        this.A0F = dz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC0784Qq
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0504Fq A0F(ViewGroup viewGroup, int i4) {
        return new C0504Fq(AbstractC1116bW.A00(new C1152c6(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0R(this.A0F).A0N(this.A0C).A0U(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC0784Qq
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(C0504Fq c0504Fq, int i4) {
        C1274e5 c1274e5 = this.A06.get(i4);
        c0504Fq.A0q(this.A04);
        c0504Fq.A0p(c1274e5, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0784Qq
    public final int A0B() {
        return this.A06.size();
    }

    public final void A0O(int i4, int i10, int i11) {
        boolean needsUpdate = i4 != this.A00;
        this.A00 = i4;
        this.A02 = i10;
        this.A01 = i11;
        if (needsUpdate) {
            A0G();
        }
    }

    public final void A0P(C1381fp c1381fp) {
        this.A04 = c1381fp;
    }
}
