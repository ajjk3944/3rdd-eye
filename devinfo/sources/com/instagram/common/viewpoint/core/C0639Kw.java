package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Kw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0639Kw {
    public static final byte[] A04 = {0, 0, 1};
    public int A00;
    public int A01;
    public byte[] A02;
    public boolean A03;

    public C0639Kw(int i4) {
        this.A02 = new byte[i4];
    }

    public final void A00() {
        this.A03 = false;
        this.A00 = 0;
        this.A01 = 0;
    }

    public final void A01(byte[] bArr, int i4, int i10) {
        if (!this.A03) {
            return;
        }
        int i11 = i10 - i4;
        int length = this.A02.length;
        int readLength = this.A00;
        if (length < readLength + i11) {
            byte[] bArr2 = this.A02;
            int readLength2 = this.A00;
            this.A02 = Arrays.copyOf(bArr2, (readLength2 + i11) * 2);
        }
        byte[] bArr3 = this.A02;
        int readLength3 = this.A00;
        System.arraycopy(bArr, i4, bArr3, readLength3, i11);
        int readLength4 = this.A00;
        this.A00 = readLength4 + i11;
    }

    public final boolean A02(int i4, int i10) {
        if (this.A03) {
            this.A00 -= i10;
            if (this.A01 == 0 && i4 == 181) {
                this.A01 = this.A00;
            } else {
                this.A03 = false;
                return true;
            }
        } else if (i4 == 179) {
            this.A03 = true;
        }
        A01(A04, 0, A04.length);
        return false;
    }
}
