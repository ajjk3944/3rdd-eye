package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class go3 extends jo3 {
    public final char[] g;

    public go3(fo3 fo3Var) {
        super(fo3Var, (Character) null);
        this.g = new char[512];
        zt0.D(fo3Var.b.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr = this.g;
            char[] cArr2 = fo3Var.b;
            cArr[i] = cArr2[i >>> 4];
            cArr[i | 256] = cArr2[i & 15];
        }
    }

    @Override // defpackage.jo3
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        zt0.g0(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.g;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }

    @Override // defpackage.jo3
    public final int b(byte[] bArr, CharSequence charSequence) throws io3 {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            throw new io3(ex0.j(new StringBuilder(String.valueOf(length).length() + 21), "Invalid input length ", length));
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            fo3 fo3Var = this.a;
            bArr[i2] = (byte) ((fo3Var.a(cCharAt) << 4) | fo3Var.a(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // defpackage.jo3
    public final jo3 c(fo3 fo3Var, Character ch) {
        return new go3(fo3Var);
    }
}
