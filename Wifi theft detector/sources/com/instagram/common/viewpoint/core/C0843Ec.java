package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ec, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0843Ec implements Comparable<C0843Ec> {
    public final boolean A00;
    public final boolean A01;

    public C0843Ec(C2374qI c2374qI, int i10) {
        this.A00 = (c2374qI.A0H & 1) != 0;
        this.A01 = C07319h.A0S(i10, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0843Ec c0843Ec) {
        return AbstractC2226ns.A01().A09(this.A01, c0843Ec.A01).A09(this.A00, c0843Ec.A00).A05();
    }
}
