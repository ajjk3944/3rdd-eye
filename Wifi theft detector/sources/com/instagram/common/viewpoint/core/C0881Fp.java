package com.instagram.common.viewpoint.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Fp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0881Fp extends AbstractC1162Qq<FY> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC1349Yb A04;
    public InterfaceC1355Yh A05;
    public String A06;
    public List<C1652e5> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC1979jd A0A;
    public final C1220Sx A0B;
    public final C1814gi A0C;
    public final VA A0D;
    public final Y2 A0E;
    public final C0890Fy A0F;
    public final C1759fp A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C0881Fp(C1814gi c1814gi, List<C1652e5> list, AbstractC1979jd abstractC1979jd, VA va, C1220Sx c1220Sx, C1759fp c1759fp, Y2 y22, InterfaceC1355Yh interfaceC1355Yh, String str, int i10, int i11, int i12, int i13, C0890Fy c0890Fy, AbstractC1349Yb abstractC1349Yb) {
        this.A0C = c1814gi;
        this.A0D = va;
        this.A0B = c1220Sx;
        this.A0G = c1759fp;
        this.A0E = y22;
        this.A05 = interfaceC1355Yh;
        this.A0A = abstractC1979jd;
        this.A07 = list;
        this.A00 = i10;
        this.A03 = i13;
        this.A06 = str;
        this.A01 = i12;
        this.A02 = i11;
        this.A0F = c0890Fy;
        this.A04 = abstractC1349Yb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1162Qq
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final FY A0F(ViewGroup viewGroup, int i10) {
        return new FY(AbstractC1584cy.A00(new C1530c6(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0P(this.A04).A0U(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1162Qq
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(FY fy, int i10) {
        fy.A0q(this.A07.get(i10), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i10 == 0) {
            fy.AJF();
            this.A08 = true;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1162Qq
    public final int A0B() {
        return this.A07.size();
    }
}
