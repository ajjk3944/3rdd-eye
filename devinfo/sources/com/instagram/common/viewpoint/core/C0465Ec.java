package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ec, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0465Ec implements Comparable<C0465Ec> {
    public final boolean A00;
    public final boolean A01;

    public C0465Ec(C1996qI c1996qI, int i4) {
        this.A00 = (c1996qI.A0H & 1) != 0;
        this.A01 = C03539h.A0S(i4, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0465Ec c0465Ec) {
        return AbstractC1848ns.A01().A09(this.A01, c0465Ec.A01).A09(this.A00, c0465Ec.A00).A05();
    }
}
