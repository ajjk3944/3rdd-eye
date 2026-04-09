package com.instagram.common.viewpoint.core;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.facebook.ads.redexgen.X.oQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2259oQ implements InterfaceC05843k {
    public boolean A04;
    public ByteBuffer A02 = InterfaceC05843k.A00;
    public ByteBuffer A03 = InterfaceC05843k.A00;
    public C05823i A00 = C05823i.A05;
    public C05823i A01 = C05823i.A05;
    public C05823i A05 = C05823i.A05;
    public C05823i A06 = C05823i.A05;

    public abstract C05823i A09(C05823i c05823i) throws C05833j;

    public final ByteBuffer A00(int i10) {
        if (this.A02.capacity() < i10) {
            this.A02 = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
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

    @Override // com.instagram.common.viewpoint.core.InterfaceC05843k
    public final C05823i A57(C05823i c05823i) throws C05833j {
        this.A00 = c05823i;
        this.A01 = A09(c05823i);
        return AAL() ? this.A01 : C05823i.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC05843k
    public ByteBuffer A8d() {
        ByteBuffer byteBuffer = this.A03;
        ByteBuffer outputBuffer = InterfaceC05843k.A00;
        this.A03 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC05843k
    public boolean AAL() {
        return this.A01 != C05823i.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC05843k
    public boolean AAP() {
        return this.A04 && this.A03 == InterfaceC05843k.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC05843k
    public final void AHG() {
        this.A04 = true;
        A0B();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC05843k
    public final void flush() {
        this.A03 = InterfaceC05843k.A00;
        this.A04 = false;
        this.A05 = this.A00;
        this.A06 = this.A01;
        A0A();
    }
}
