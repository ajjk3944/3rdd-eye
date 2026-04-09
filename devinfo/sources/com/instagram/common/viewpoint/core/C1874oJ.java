package com.instagram.common.viewpoint.core;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.facebook.ads.redexgen.X.oJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1874oJ implements InterfaceC02063k {
    public long A03;
    public long A04;
    public C9Y A09;
    public boolean A0D;
    public boolean A0E;
    public float A01 = 1.0f;
    public float A00 = 1.0f;
    public C02043i A07 = C02043i.A05;
    public C02043i A08 = C02043i.A05;
    public C02043i A05 = C02043i.A05;
    public C02043i A06 = C02043i.A05;
    public ByteBuffer A0A = InterfaceC02063k.A00;
    public ShortBuffer A0C = this.A0A.asShortBuffer();
    public ByteBuffer A0B = InterfaceC02063k.A00;
    public int A02 = -1;

    public final long A00(long j) {
        if (this.A04 >= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            long jA0I = this.A03 - ((C9Y) AbstractC02203y.A01(this.A09)).A0I();
            if (this.A06.A03 == this.A05.A03) {
                long processedInputBytes = C5C.A0U(j, jA0I, this.A04);
                return processedInputBytes;
            }
            long processedInputBytes2 = this.A06.A03;
            long j8 = jA0I * processedInputBytes2;
            long j9 = this.A04;
            long processedInputBytes3 = this.A05.A03;
            return C5C.A0U(j, j8, j9 * processedInputBytes3);
        }
        return (long) (this.A01 * j);
    }

    public final void A01(float f10) {
        if (this.A00 != f10) {
            this.A00 = f10;
            this.A0E = true;
        }
    }

    public final void A02(float f10) {
        if (this.A01 != f10) {
            this.A01 = f10;
            this.A0E = true;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02063k
    public final C02043i A57(C02043i c02043i) throws C02053j {
        int i4;
        if (c02043i.A02 == 2) {
            if (this.A02 == -1) {
                i4 = c02043i.A03;
            } else {
                i4 = this.A02;
            }
            this.A07 = c02043i;
            this.A08 = new C02043i(i4, c02043i.A01, 2);
            this.A0E = true;
            return this.A08;
        }
        throw new C02053j(c02043i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02063k
    public final ByteBuffer A8d() {
        int iA0H;
        C9Y c9y = this.A09;
        if (c9y != null && (iA0H = c9y.A0H()) > 0) {
            if (this.A0A.capacity() < iA0H) {
                this.A0A = ByteBuffer.allocateDirect(iA0H).order(ByteOrder.nativeOrder());
                this.A0C = this.A0A.asShortBuffer();
            } else {
                this.A0A.clear();
                this.A0C.clear();
            }
            c9y.A0L(this.A0C);
            this.A04 += iA0H;
            this.A0A.limit(iA0H);
            this.A0B = this.A0A;
        }
        ByteBuffer outputBuffer = this.A0B;
        this.A0B = InterfaceC02063k.A00;
        return outputBuffer;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02063k
    public final boolean AAL() {
        return this.A08.A03 != -1 && (Math.abs(this.A01 - 1.0f) >= 1.0E-4f || Math.abs(this.A00 - 1.0f) >= 1.0E-4f || this.A08.A03 != this.A07.A03);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02063k
    public final boolean AAP() {
        return this.A0D && (this.A09 == null || this.A09.A0H() == 0);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02063k
    public final void AHG() {
        if (this.A09 != null) {
            this.A09.A0K();
        }
        this.A0D = true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02063k
    public final void AHH(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        C9Y c9y = (C9Y) AbstractC02203y.A01(this.A09);
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        int iRemaining = byteBuffer.remaining();
        this.A03 += iRemaining;
        c9y.A0M(shortBufferAsShortBuffer);
        byteBuffer.position(byteBuffer.position() + iRemaining);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02063k
    public final void flush() {
        if (AAL()) {
            this.A05 = this.A07;
            this.A06 = this.A08;
            if (this.A0E) {
                this.A09 = new C9Y(this.A05.A03, this.A05.A01, this.A01, this.A00, this.A06.A03);
            } else if (this.A09 != null) {
                this.A09.A0J();
            }
        }
        this.A0B = InterfaceC02063k.A00;
        this.A03 = 0L;
        this.A04 = 0L;
        this.A0D = false;
    }
}
