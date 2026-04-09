package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j61 extends m61 {
    public final char[] g;

    public j61(i61 i61Var) {
        super(i61Var, (Character) null);
        this.g = new char[512];
        mq0.m(i61Var.f12151b.length == 16);
        for (int i4 = 0; i4 < 256; i4++) {
            char[] cArr = this.g;
            char[] cArr2 = i61Var.f12151b;
            cArr[i4] = cArr2[i4 >>> 4];
            cArr[i4 | 256] = cArr2[i4 & 15];
        }
    }

    @Override // com.google.android.gms.internal.ads.m61
    public final void a(StringBuilder sb2, byte[] bArr, int i4) {
        mq0.h0(0, i4, bArr.length);
        for (int i10 = 0; i10 < i4; i10++) {
            int i11 = bArr[i10] & 255;
            char[] cArr = this.g;
            sb2.append(cArr[i11]);
            sb2.append(cArr[i11 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.m61
    public final int b(byte[] bArr, CharSequence charSequence) throws l61 {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            throw new l61(d.h.q(length, "Invalid input length ", new StringBuilder(String.valueOf(length).length() + 21)));
        }
        int i4 = 0;
        int i10 = 0;
        while (i4 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i4);
            i61 i61Var = this.f13780a;
            bArr[i10] = (byte) ((i61Var.a(cCharAt) << 4) | i61Var.a(charSequence.charAt(i4 + 1)));
            i4 += 2;
            i10++;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.m61
    public final m61 c(i61 i61Var, Character ch2) {
        return new j61(i61Var);
    }
}
