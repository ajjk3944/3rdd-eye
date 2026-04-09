package com.instagram.common.viewpoint.core;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.8P, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C8P extends AbstractC1916oz implements InterfaceC0600Jj {
    public long A00;
    public InterfaceC0600Jj A01;

    @Override // com.instagram.common.viewpoint.core.AbstractC1916oz
    public abstract void A0B();

    @Override // com.instagram.common.viewpoint.core.AbstractC02685u
    public final void A0A() {
        super.A0A();
        this.A01 = null;
    }

    public final void A0C(long j, InterfaceC0600Jj interfaceC0600Jj, long j8) {
        super.A01 = j;
        this.A01 = interfaceC0600Jj;
        if (j8 == Long.MAX_VALUE) {
            j8 = super.A01;
        }
        this.A00 = j8;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0600Jj
    public final List<C1946pT> A7X(long j) {
        return ((InterfaceC0600Jj) AbstractC02203y.A01(this.A01)).A7X(j - this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0600Jj
    public final long A83(int i4) {
        return ((InterfaceC0600Jj) AbstractC02203y.A01(this.A01)).A83(i4) + this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0600Jj
    public final int A84() {
        return ((InterfaceC0600Jj) AbstractC02203y.A01(this.A01)).A84();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0600Jj
    public final int A8a(long j) {
        return ((InterfaceC0600Jj) AbstractC02203y.A01(this.A01)).A8a(j - this.A00);
    }
}
