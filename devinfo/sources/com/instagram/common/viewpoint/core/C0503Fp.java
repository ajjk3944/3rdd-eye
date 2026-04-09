package com.instagram.common.viewpoint.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Fp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0503Fp extends AbstractC0784Qq<FY> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC0971Yb A04;
    public InterfaceC0977Yh A05;
    public String A06;
    public List<C1274e5> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC1601jd A0A;
    public final C0842Sx A0B;
    public final C1436gi A0C;
    public final VA A0D;
    public final Y2 A0E;
    public final C0512Fy A0F;
    public final C1381fp A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C0503Fp(C1436gi c1436gi, List<C1274e5> list, AbstractC1601jd abstractC1601jd, VA va2, C0842Sx c0842Sx, C1381fp c1381fp, Y2 y22, InterfaceC0977Yh interfaceC0977Yh, String str, int i4, int i10, int i11, int i12, C0512Fy c0512Fy, AbstractC0971Yb abstractC0971Yb) {
        this.A0C = c1436gi;
        this.A0D = va2;
        this.A0B = c0842Sx;
        this.A0G = c1381fp;
        this.A0E = y22;
        this.A05 = interfaceC0977Yh;
        this.A0A = abstractC1601jd;
        this.A07 = list;
        this.A00 = i4;
        this.A03 = i12;
        this.A06 = str;
        this.A01 = i11;
        this.A02 = i10;
        this.A0F = c0512Fy;
        this.A04 = abstractC0971Yb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC0784Qq
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final FY A0F(ViewGroup viewGroup, int i4) {
        return new FY(AbstractC1206cy.A00(new C1152c6(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0P(this.A04).A0U(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC0784Qq
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(FY fy, int i4) {
        fy.A0q(this.A07.get(i4), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i4 == 0) {
            fy.AJF();
            this.A08 = true;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0784Qq
    public final int A0B() {
        return this.A07.size();
    }
}
