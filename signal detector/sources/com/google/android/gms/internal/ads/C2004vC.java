package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2004vC extends C2166yC {

    /* renamed from: g, reason: collision with root package name */
    public final char[] f17235g;

    public C2004vC(C1950uC c1950uC) {
        super(c1950uC, (Character) null);
        this.f17235g = new char[512];
        AbstractC0582Jp.m(c1950uC.f17069b.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr = this.f17235g;
            char[] cArr2 = c1950uC.f17069b;
            cArr[i] = cArr2[i >>> 4];
            cArr[i | 256] = cArr2[i & 15];
        }
    }

    @Override // com.google.android.gms.internal.ads.C2166yC
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        AbstractC0582Jp.m0(0, i, bArr.length);
        for (int i3 = 0; i3 < i; i3++) {
            int i6 = bArr[i3] & 255;
            char[] cArr = this.f17235g;
            sb.append(cArr[i6]);
            sb.append(cArr[i6 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.C2166yC
    public final int b(byte[] bArr, CharSequence charSequence) throws C2112xC {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            throw new C2112xC(A.f.i(length, "Invalid input length ", new StringBuilder(String.valueOf(length).length() + 21)));
        }
        int i = 0;
        int i3 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            C1950uC c1950uC = this.f17694a;
            bArr[i3] = (byte) ((c1950uC.a(cCharAt) << 4) | c1950uC.a(charSequence.charAt(i + 1)));
            i += 2;
            i3++;
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.C2166yC
    public final C2166yC c(C1950uC c1950uC, Character ch) {
        return new C2004vC(c1950uC);
    }
}
