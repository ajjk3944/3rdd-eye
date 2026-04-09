package com.instagram.common.viewpoint.core;

import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.9x, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C9x extends AbstractC1881oQ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public byte[] A06 = C5C.A07;

    @Override // com.instagram.common.viewpoint.core.AbstractC1881oQ
    public final C02043i A09(C02043i c02043i) throws C02053j {
        if (c02043i.A02 == 2) {
            this.A05 = true;
            return (this.A03 == 0 && this.A02 == 0) ? C02043i.A05 : c02043i;
        }
        throw new C02053j(c02043i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1881oQ
    public final void A0A() {
        if (this.A05) {
            this.A05 = false;
            this.A06 = new byte[this.A02 * super.A05.A00];
            this.A01 = this.A03 * super.A05.A00;
        }
        this.A00 = 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1881oQ
    public final void A0B() {
        if (this.A05) {
            if (this.A00 > 0) {
                this.A04 += this.A00 / super.A05.A00;
            }
            this.A00 = 0;
        }
    }

    public final long A0C() {
        return this.A04;
    }

    public final void A0D() {
        this.A04 = 0L;
    }

    public final void A0E(int i4, int i10) {
        this.A03 = i4;
        this.A02 = i10;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1881oQ, com.instagram.common.viewpoint.core.InterfaceC02063k
    public final ByteBuffer A8d() {
        if (super.AAP() && this.A00 > 0) {
            A00(this.A00).put(this.A06, 0, this.A00).flip();
            this.A00 = 0;
        }
        return super.A8d();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1881oQ, com.instagram.common.viewpoint.core.InterfaceC02063k
    public final boolean AAP() {
        return super.AAP() && this.A00 == 0;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02063k
    public final void AHH(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int remaining = byteBuffer.limit();
        int i4 = remaining - iPosition;
        if (i4 == 0) {
            return;
        }
        int position = this.A01;
        int iMin = Math.min(i4, position);
        long j = this.A04;
        int position2 = super.A05.A00;
        this.A04 = j + (iMin / position2);
        int position3 = this.A01;
        this.A01 = position3 - iMin;
        byteBuffer.position(iPosition + iMin);
        int position4 = this.A01;
        if (position4 > 0) {
            return;
        }
        int endBufferBytesToOutput = i4 - iMin;
        int limit = this.A00;
        int position5 = this.A06.length;
        int limit2 = (limit + endBufferBytesToOutput) - position5;
        ByteBuffer buffer = A00(limit2);
        int position6 = this.A00;
        int trimBytes = C5C.A07(limit2, 0, position6);
        buffer.put(this.A06, 0, trimBytes);
        int limit3 = C5C.A07(limit2 - trimBytes, 0, endBufferBytesToOutput);
        int position7 = byteBuffer.position();
        byteBuffer.limit(position7 + limit3);
        buffer.put(byteBuffer);
        byteBuffer.limit(remaining);
        int endBufferBytesToOutput2 = endBufferBytesToOutput - limit3;
        int position8 = this.A00;
        this.A00 = position8 - trimBytes;
        byte[] bArr = this.A06;
        byte[] bArr2 = this.A06;
        int position9 = this.A00;
        System.arraycopy(bArr, trimBytes, bArr2, 0, position9);
        byte[] bArr3 = this.A06;
        int position10 = this.A00;
        byteBuffer.get(bArr3, position10, endBufferBytesToOutput2);
        int position11 = this.A00;
        this.A00 = position11 + endBufferBytesToOutput2;
        buffer.flip();
    }
}
