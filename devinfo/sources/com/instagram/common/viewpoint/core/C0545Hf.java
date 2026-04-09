package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Hf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0545Hf {
    public int A00;
    public int A01;
    public final int A02;
    public final byte[] A03;

    public C0545Hf(byte[] bArr) {
        this.A03 = bArr;
        this.A02 = bArr.length;
    }

    private void A00() {
        AbstractC02203y.A08(this.A01 >= 0 && (this.A01 < this.A02 || (this.A01 == this.A02 && this.A00 == 0)));
    }

    public final int A01() {
        return (this.A01 * 8) + this.A00;
    }

    public final int A02(int i4) {
        int bitsRead = this.A01;
        int tempByteOffset = Math.min(i4, 8 - this.A00);
        int i10 = bitsRead + 1;
        int tempByteOffset2 = this.A03[bitsRead];
        int tempByteOffset3 = ((tempByteOffset2 & 255) >> this.A00) & (255 >> (8 - tempByteOffset));
        while (tempByteOffset < i4) {
            int returnValue = this.A03[i10];
            tempByteOffset3 |= (returnValue & 255) << tempByteOffset;
            tempByteOffset += 8;
            i10++;
        }
        int returnValue2 = (-1) >>> (32 - i4);
        int tempByteOffset4 = tempByteOffset3 & returnValue2;
        A03(i4);
        return tempByteOffset4;
    }

    public final void A03(int i4) {
        int i10 = i4 / 8;
        int numBytes = this.A01;
        this.A01 = numBytes + i10;
        int numBytes2 = i10 * 8;
        this.A00 += i4 - numBytes2;
        if (this.A00 > 7) {
            int numBytes3 = this.A01;
            this.A01 = numBytes3 + 1;
            int numBytes4 = this.A00;
            this.A00 = numBytes4 - 8;
        }
        A00();
    }

    public final boolean A04() {
        boolean returnValue = (((this.A03[this.A01] & 255) >> this.A00) & 1) == 1;
        A03(1);
        return returnValue;
    }
}
