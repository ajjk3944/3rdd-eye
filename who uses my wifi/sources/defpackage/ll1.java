package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ll1 implements kk1 {
    public final kz2 f = new kz2();
    public final boolean g;
    public final int h;
    public final int i;
    public final String j;
    public final float k;
    public final int l;

    public ll1(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.h = 0;
            this.i = -1;
            this.j = "sans-serif";
            this.g = false;
            this.k = 0.85f;
            this.l = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.h = bArr[24];
        this.i = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.j = true == "Serif".equals(new String(bArr, 43, bArr.length + (-43), StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.l = i;
        boolean z = (bArr[0] & 32) != 0;
        this.g = z;
        if (z) {
            this.k = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.k = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            boolean z = true;
            if (i7 != 0) {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                    z = false;
                }
            } else if (i8 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            } else {
                z = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            } else {
                if (i7 != 0 || z) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kk1
    public final void g(byte[] bArr, int i, int i2, lk1 lk1Var) {
        String strK;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        kz2 kz2Var = this.f;
        kz2Var.z(i + i2, bArr);
        kz2Var.E(i);
        int i11 = 0;
        int i12 = 1;
        int i13 = 2;
        zt0.D(kz2Var.B() >= 2);
        int iL = kz2Var.L();
        if (iL == 0) {
            strK = "";
        } else {
            int i14 = kz2Var.b;
            Charset charsetQ = kz2Var.q();
            int i15 = kz2Var.b - i14;
            if (charsetQ == null) {
                charsetQ = StandardCharsets.UTF_8;
            }
            strK = kz2Var.k(iL - i15, charsetQ);
        }
        if (strK.isEmpty()) {
            vm3 vm3Var = xm3.g;
            lk1Var.mo6c(new gk1(sn3.j, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strK);
        int length = spannableStringBuilder.length();
        int i16 = this.h;
        a(spannableStringBuilder, i16, 0, 0, length, 16711680);
        int i17 = i16;
        int length2 = spannableStringBuilder.length();
        int i18 = this.i;
        b(spannableStringBuilder, i18, -1, 0, length2, 16711680);
        int i19 = i18;
        int length3 = spannableStringBuilder.length();
        String str = this.j;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length3, 16711713);
        }
        float fMax = this.k;
        while (kz2Var.B() >= 8) {
            int i20 = kz2Var.b;
            int iB = kz2Var.b();
            int iB2 = kz2Var.b();
            if (iB2 == 1937013100) {
                zt0.D(kz2Var.B() >= i13 ? i12 : i11);
                int iL2 = kz2Var.L();
                int i21 = i11;
                while (i21 < iL2) {
                    zt0.D(kz2Var.B() >= 12 ? i12 : i11);
                    int iL3 = kz2Var.L();
                    int iL4 = kz2Var.L();
                    kz2Var.G(i13);
                    int i22 = iL2;
                    int iK = kz2Var.K();
                    kz2Var.G(i12);
                    int iB3 = kz2Var.b();
                    if (iL4 > spannableStringBuilder.length()) {
                        int length4 = spannableStringBuilder.length();
                        i6 = i17;
                        i7 = i19;
                        StringBuilder sb = new StringBuilder(ga1.i(String.valueOf(length4), String.valueOf(iL4).length() + 44, 2));
                        sb.append("Truncating styl end (");
                        sb.append(iL4);
                        sb.append(") to cueText.length() (");
                        sb.append(length4);
                        sb.append(").");
                        a30.x(sb.toString());
                        iL4 = spannableStringBuilder.length();
                    } else {
                        i6 = i17;
                        i7 = i19;
                    }
                    if (iL3 >= iL4) {
                        StringBuilder sb2 = new StringBuilder(ga1.i(String.valueOf(iL4), String.valueOf(iL3).length() + 36, 2));
                        sb2.append("Ignoring styl with start (");
                        sb2.append(iL3);
                        sb2.append(") >= end (");
                        sb2.append(iL4);
                        sb2.append(").");
                        a30.x(sb2.toString());
                        i9 = i21;
                        i8 = i22;
                        i10 = i7;
                    } else {
                        i8 = i22;
                        i9 = i21;
                        a(spannableStringBuilder, iK, i6, iL3, iL4, 0);
                        i10 = i7;
                        b(spannableStringBuilder, iB3, i10, iL3, iL4, 0);
                    }
                    iL2 = i8;
                    i19 = i10;
                    i17 = i6;
                    i12 = 1;
                    i13 = 2;
                    i21 = i9 + 1;
                    i11 = 0;
                }
                i3 = i17;
                i4 = i19;
                i5 = i13;
            } else {
                i3 = i17;
                i4 = i19;
                if (iB2 == 1952608120 && this.g) {
                    i5 = 2;
                    zt0.D(kz2Var.B() >= 2);
                    float fL = kz2Var.L();
                    String str2 = v23.a;
                    fMax = Math.max(0.0f, Math.min(fL / this.l, 0.95f));
                } else {
                    i5 = 2;
                }
            }
            kz2Var.E(i20 + iB);
            i13 = i5;
            i19 = i4;
            i17 = i3;
            i11 = 0;
            i12 = 1;
        }
        lk1Var.mo6c(new gk1(xm3.i(new fi2(spannableStringBuilder, null, null, null, fMax, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, 0.0f, 0)), -9223372036854775807L, -9223372036854775807L));
    }
}
