package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2058wC extends C2166yC {
    public C2058wC(C1950uC c1950uC, Character ch) {
        super(c1950uC, ch);
        AbstractC0582Jp.m(c1950uC.f17069b.length == 64);
    }

    @Override // com.google.android.gms.internal.ads.C2166yC
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i3 = 0;
        AbstractC0582Jp.m0(0, i, bArr.length);
        for (int i6 = i; i6 >= 3; i6 -= 3) {
            int i7 = ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3] & 255) << 16) | (bArr[i3 + 2] & 255);
            char[] cArr = this.f17694a.f17069b;
            sb.append(cArr[i7 >>> 18]);
            sb.append(cArr[(i7 >>> 12) & 63]);
            sb.append(cArr[(i7 >>> 6) & 63]);
            sb.append(cArr[i7 & 63]);
            i3 += 3;
        }
        if (i3 < i) {
            d(sb, bArr, i3, i - i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.C2166yC
    public final int b(byte[] bArr, CharSequence charSequence) throws C2112xC {
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        C1950uC c1950uC = this.f17694a;
        if (!c1950uC.f17075h[length % c1950uC.f17072e]) {
            int length2 = charSequenceE.length();
            throw new C2112xC(A.f.i(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i = 0;
        int i3 = 0;
        while (i < charSequenceE.length()) {
            int i6 = i3 + 1;
            int iA = (c1950uC.a(charSequenceE.charAt(i + 1)) << 12) | (c1950uC.a(charSequenceE.charAt(i)) << 18);
            bArr[i3] = (byte) (iA >>> 16);
            int i7 = i + 2;
            if (i7 < charSequenceE.length()) {
                int i8 = i + 3;
                int iA2 = iA | (c1950uC.a(charSequenceE.charAt(i7)) << 6);
                int i9 = i3 + 2;
                bArr[i6] = (byte) ((iA2 >>> 8) & 255);
                if (i8 < charSequenceE.length()) {
                    i += 4;
                    i3 += 3;
                    bArr[i9] = (byte) ((iA2 | c1950uC.a(charSequenceE.charAt(i8))) & 255);
                } else {
                    i3 = i9;
                    i = i8;
                }
            } else {
                i = i7;
                i3 = i6;
            }
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.C2166yC
    public final C2166yC c(C1950uC c1950uC, Character ch) {
        return new C2058wC(c1950uC, ch);
    }

    public C2058wC(String str, String str2) {
        this(new C1950uC(str, str2.toCharArray()), (Character) '=');
    }
}
