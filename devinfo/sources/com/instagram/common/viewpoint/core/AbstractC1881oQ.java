package com.instagram.common.viewpoint.core;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.facebook.ads.redexgen.X.oQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1881oQ implements InterfaceC02063k {
    public boolean A04;
    public ByteBuffer A02 = InterfaceC02063k.A00;
    public ByteBuffer A03 = InterfaceC02063k.A00;
    public C02043i A00 = C02043i.A05;
    public C02043i A01 = C02043i.A05;
    public C02043i A05 = C02043i.A05;
    public C02043i A06 = C02043i.A05;

    public abstract C02043i A09(C02043i c02043i) throws C02053j;

    public final ByteBuffer A00(int i4) {
        if (this.A02.capacity() < i4) {
            this.A02 = ByteBuffer.allocateDirect(i4).order(ByteOrder.nativeOrder());
        } else {
            this.A02.clear();
        }
        this.A03 = this.A02;
        return this.A02;
    }

    public final boolean A01() {
        return this.A03.hasRemaining();
    }

    public void A0A() {
    }

    public void A0B() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02063k
    public final C02043i A57(C02043i c02043i) throws C02053j {
        this.A00 = c02043i;
        this.A01 = A09(c02043i);
        return AAL() ? this.A01 : C02043i.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02063k
    public ByteBuffer A8d() {
        ByteBuffer byteBuffer = this.A03;
        ByteBuffer outputBuffer = InterfaceC02063k.A00;
        this.A03 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02063k
    public boolean AAL() {
        return this.A01 != C02043i.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02063k
    public boolean AAP() {
        return this.A04 && this.A03 == InterfaceC02063k.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02063k
    public final void AHG() {
        this.A04 = true;
        A0B();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02063k
    public final void flush() {
        this.A03 = InterfaceC02063k.A00;
        this.A04 = false;
        this.A05 = this.A00;
        this.A06 = this.A01;
        A0A();
    }
}
