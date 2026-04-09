package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ho3 extends jo3 {
    public ho3(fo3 fo3Var, Character ch) {
        super(fo3Var, ch);
        zt0.D(fo3Var.b.length == 64);
    }

    @Override // defpackage.jo3
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        zt0.g0(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16) | (bArr[i2 + 2] & 255);
            char[] cArr = this.a.b;
            sb.append(cArr[i4 >>> 18]);
            sb.append(cArr[(i4 >>> 12) & 63]);
            sb.append(cArr[(i4 >>> 6) & 63]);
            sb.append(cArr[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            d(sb, bArr, i2, i - i2);
        }
    }

    @Override // defpackage.jo3
    public final int b(byte[] bArr, CharSequence charSequence) throws io3 {
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        fo3 fo3Var = this.a;
        if (!fo3Var.h[length % fo3Var.e]) {
            int length2 = charSequenceE.length();
            throw new io3(ex0.j(new StringBuilder(String.valueOf(length2).length() + 21), "Invalid input length ", length2));
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceE.length()) {
            int i3 = i2 + 1;
            int iA = (fo3Var.a(charSequenceE.charAt(i + 1)) << 12) | (fo3Var.a(charSequenceE.charAt(i)) << 18);
            bArr[i2] = (byte) (iA >>> 16);
            int i4 = i + 2;
            if (i4 < charSequenceE.length()) {
                int i5 = i + 3;
                int iA2 = iA | (fo3Var.a(charSequenceE.charAt(i4)) << 6);
                int i6 = i2 + 2;
                bArr[i3] = (byte) ((iA2 >>> 8) & 255);
                if (i5 < charSequenceE.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iA2 | fo3Var.a(charSequenceE.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i = i4;
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // defpackage.jo3
    public final jo3 c(fo3 fo3Var, Character ch) {
        return new ho3(fo3Var, ch);
    }

    public ho3(String str, String str2) {
        this(new fo3(str, str2.toCharArray()), (Character) '=');
    }
}
