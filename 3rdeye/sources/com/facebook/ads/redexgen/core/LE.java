package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class LE extends QC<FD> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC3003Xn A03;
    public C3345eX A04;
    public String A05;
    public List<C3239cn> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC3547hy A08;
    public final SF A09;
    public final C3272dL A0A;
    public final US A0B;
    public final C2815Qc A0C;
    public final XH A0D;
    public final C23055s A0E;
    public final C2475Cw A0F;

    public LE(C3272dL c3272dL, List<C3239cn> list, AbstractC3547hy abstractC3547hy, US us, C2815Qc c2815Qc, InterfaceC3003Xn interfaceC3003Xn, String str, C23055s c23055s, C2475Cw c2475Cw) {
        this.A0A = c3272dL;
        this.A0B = us;
        this.A0C = c2815Qc;
        this.A09 = c2815Qc.A11();
        this.A04 = c2815Qc.A1B();
        this.A0D = c2815Qc.A1A();
        this.A03 = interfaceC3003Xn;
        this.A08 = abstractC3547hy;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c23055s;
        this.A0F = c2475Cw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final FD A0F(ViewGroup viewGroup, int i) {
        return new FD(AbstractC3073a6.A00(new C3109ah(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0T(this.A0F).A0O(this.A0C).A0W(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A21());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(FD fd, int i) {
        C3239cn c3239cn = this.A06.get(i);
        fd.A0q(this.A04);
        fd.A0p(c3239cn, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.core.QC
    public final int A0B() {
        return this.A06.size();
    }

    public final void A0O(int i, int i10, int i11) {
        boolean needsUpdate = i != this.A00;
        this.A00 = i;
        this.A02 = i10;
        this.A01 = i11;
        if (needsUpdate) {
            A0G();
        }
    }

    public final void A0P(C3345eX c3345eX) {
        this.A04 = c3345eX;
    }
}
