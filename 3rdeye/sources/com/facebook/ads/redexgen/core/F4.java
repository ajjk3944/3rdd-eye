package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class F4 extends QC<C2526Ev> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC3002Xm A04;
    public InterfaceC3003Xn A05;
    public String A06;
    public List<C3239cn> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC3547hy A0A;
    public final SF A0B;
    public final C3272dL A0C;
    public final US A0D;
    public final XH A0E;
    public final FH A0F;
    public final C3345eX A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public F4(C3272dL c3272dL, List<C3239cn> list, AbstractC3547hy abstractC3547hy, US us, SF sf, C3345eX c3345eX, XH xh, InterfaceC3003Xn interfaceC3003Xn, String str, int i, int i10, int i11, int i12, FH fh, AbstractC3002Xm abstractC3002Xm) {
        this.A0C = c3272dL;
        this.A0D = us;
        this.A0B = sf;
        this.A0G = c3345eX;
        this.A0E = xh;
        this.A05 = interfaceC3003Xn;
        this.A0A = abstractC3547hy;
        this.A07 = list;
        this.A00 = i;
        this.A03 = i12;
        this.A06 = str;
        this.A01 = i11;
        this.A02 = i10;
        this.A0F = fh;
        this.A04 = abstractC3002Xm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C2526Ev A0F(ViewGroup viewGroup, int i) {
        return new C2526Ev(AbstractC3169bf.A00(new C3109ah(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0R(this.A04).A0W(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A21());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(C2526Ev c2526Ev, int i) {
        c2526Ev.A0q(this.A07.get(i), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i == 0) {
            c2526Ev.AIV();
            this.A08 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.QC
    public final int A0B() {
        return this.A07.size();
    }
}
