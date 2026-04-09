package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k61 extends m61 {
    public k61(i61 i61Var, Character ch2) {
        super(i61Var, ch2);
        mq0.m(i61Var.f12151b.length == 64);
    }

    @Override // com.google.android.gms.internal.ads.m61
    public final void a(StringBuilder sb2, byte[] bArr, int i4) {
        int i10 = 0;
        mq0.h0(0, i4, bArr.length);
        for (int i11 = i4; i11 >= 3; i11 -= 3) {
            int i12 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16) | (bArr[i10 + 2] & 255);
            char[] cArr = this.f13780a.f12151b;
            sb2.append(cArr[i12 >>> 18]);
            sb2.append(cArr[(i12 >>> 12) & 63]);
            sb2.append(cArr[(i12 >>> 6) & 63]);
            sb2.append(cArr[i12 & 63]);
            i10 += 3;
        }
        if (i10 < i4) {
            d(sb2, bArr, i10, i4 - i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.m61
    public final int b(byte[] bArr, CharSequence charSequence) throws l61 {
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        i61 i61Var = this.f13780a;
        if (!i61Var.f12156h[length % i61Var.f12154e]) {
            int length2 = charSequenceE.length();
            throw new l61(d.h.q(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i4 = 0;
        int i10 = 0;
        while (i4 < charSequenceE.length()) {
            int i11 = i10 + 1;
            int iA = (i61Var.a(charSequenceE.charAt(i4 + 1)) << 12) | (i61Var.a(charSequenceE.charAt(i4)) << 18);
            bArr[i10] = (byte) (iA >>> 16);
            int i12 = i4 + 2;
            if (i12 < charSequenceE.length()) {
                int i13 = i4 + 3;
                int iA2 = iA | (i61Var.a(charSequenceE.charAt(i12)) << 6);
                int i14 = i10 + 2;
                bArr[i11] = (byte) ((iA2 >>> 8) & 255);
                if (i13 < charSequenceE.length()) {
                    i4 += 4;
                    i10 += 3;
                    bArr[i14] = (byte) ((iA2 | i61Var.a(charSequenceE.charAt(i13))) & 255);
                } else {
                    i10 = i14;
                    i4 = i13;
                }
            } else {
                i4 = i12;
                i10 = i11;
            }
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.m61
    public final m61 c(i61 i61Var, Character ch2) {
        return new k61(i61Var, ch2);
    }

    public k61(String str, String str2) {
        this(new i61(str, str2.toCharArray()), (Character) '=');
    }
}
