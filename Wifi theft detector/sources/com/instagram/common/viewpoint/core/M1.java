package com.instagram.common.viewpoint.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public final class M1 extends AbstractC1162Qq<C0882Fq> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC1355Yh A03;
    public C1759fp A04;
    public String A05;
    public List<C1652e5> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC1979jd A08;
    public final C1220Sx A09;
    public final C1814gi A0A;
    public final VA A0B;
    public final UK A0C;
    public final Y2 A0D;
    public final C6X A0E;
    public final DZ A0F;

    public M1(C1814gi c1814gi, List<C1652e5> list, AbstractC1979jd abstractC1979jd, VA va, UK uk, InterfaceC1355Yh interfaceC1355Yh, String str, C6X c6x, DZ dz) {
        this.A0A = c1814gi;
        this.A0B = va;
        this.A0C = uk;
        this.A09 = uk.A14();
        this.A04 = uk.A1G();
        this.A0D = uk.A1E();
        this.A03 = interfaceC1355Yh;
        this.A08 = abstractC1979jd;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c6x;
        this.A0F = dz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1162Qq
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0882Fq A0F(ViewGroup viewGroup, int i10) {
        return new C0882Fq(AbstractC1494bW.A00(new C1530c6(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0R(this.A0F).A0N(this.A0C).A0U(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1162Qq
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(C0882Fq c0882Fq, int i10) {
        C1652e5 c1652e5 = this.A06.get(i10);
        c0882Fq.A0q(this.A04);
        c0882Fq.A0p(c1652e5, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1162Qq
    public final int A0B() {
        return this.A06.size();
    }

    public final void A0O(int i10, int i11, int i12) {
        boolean needsUpdate = i10 != this.A00;
        this.A00 = i10;
        this.A02 = i11;
        this.A01 = i12;
        if (needsUpdate) {
            A0G();
        }
    }

    public final void A0P(C1759fp c1759fp) {
        this.A04 = c1759fp;
    }
}
