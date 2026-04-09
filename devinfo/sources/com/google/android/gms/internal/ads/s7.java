package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s7 implements s6 {

    /* renamed from: a, reason: collision with root package name */
    public final sk0 f15882a = new sk0();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15883b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15884c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15885d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15886e;

    /* renamed from: f, reason: collision with root package name */
    public final float f15887f;
    public final int g;

    public s7(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f15884c = 0;
            this.f15885d = -1;
            this.f15886e = "sans-serif";
            this.f15883b = false;
            this.f15887f = 0.85f;
            this.g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f15884c = bArr[24];
        this.f15885d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f15886e = true == "Serif".equals(new String(bArr, 43, bArr.length + (-43), StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i4 = bArr[25] * 20;
        this.g = i4;
        boolean z3 = (bArr[0] & 32) != 0;
        this.f15883b = z3;
        if (z3) {
            this.f15887f = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i4, 0.95f));
        } else {
            this.f15887f = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i4, int i10, int i11, int i12, int i13) {
        if (i4 != i10) {
            int i14 = i13 | 33;
            int i15 = i4 & 1;
            int i16 = i4 & 2;
            boolean z3 = true;
            if (i15 != 0) {
                if (i16 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i11, i12, i14);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i11, i12, i14);
                    z3 = false;
                }
            } else if (i16 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, i12, i14);
            } else {
                z3 = false;
            }
            if ((i4 & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, i14);
            } else {
                if (i15 != 0 || z3) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i11, i12, i14);
            }
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i4, int i10, int i11, int i12, int i13) {
        if (i4 != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i4 >>> 8) | ((i4 & 255) << 24)), i11, i12, i13 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.s6
    public final void d(byte[] bArr, int i4, int i10, ca.c cVar) {
        String strK;
        int i11;
        int i12;
        float f10;
        int i13;
        float fMax;
        int i14;
        int i15;
        float f11;
        int i16;
        int i17;
        int i18;
        sk0 sk0Var = this.f15882a;
        sk0Var.z(i4 + i10, bArr);
        sk0Var.E(i4);
        int i19 = 0;
        int i20 = 1;
        int i21 = 2;
        mq0.m(sk0Var.B() >= 2);
        int iL = sk0Var.L();
        if (iL == 0) {
            strK = "";
        } else {
            int i22 = sk0Var.f16447b;
            Charset charsetQ = sk0Var.q();
            int i23 = sk0Var.f16447b - i22;
            if (charsetQ == null) {
                charsetQ = StandardCharsets.UTF_8;
            }
            strK = sk0Var.k(iL - i23, charsetQ);
        }
        if (strK.isEmpty()) {
            v41 v41Var = x41.f18307b;
            cVar.mo160c(new n6(u51.f17096e, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strK);
        int length = spannableStringBuilder.length();
        int i24 = this.f15884c;
        a(spannableStringBuilder, i24, 0, 0, length, 16711680);
        int i25 = i24;
        int length2 = spannableStringBuilder.length();
        int i26 = this.f15885d;
        b(spannableStringBuilder, i26, -1, 0, length2, 16711680);
        int i27 = i26;
        int length3 = spannableStringBuilder.length();
        String str = this.f15886e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length3, 16711713);
        }
        float f12 = this.f15887f;
        while (sk0Var.B() >= 8) {
            int i28 = sk0Var.f16447b;
            int iB = sk0Var.b();
            int iB2 = sk0Var.b();
            if (iB2 == 1937013100) {
                mq0.m(sk0Var.B() >= i21 ? i20 : i19);
                int iL2 = sk0Var.L();
                int i29 = i19;
                while (i29 < iL2) {
                    mq0.m(sk0Var.B() >= 12 ? i20 : i19);
                    int iL3 = sk0Var.L();
                    int iL4 = sk0Var.L();
                    sk0Var.G(i21);
                    int i30 = iL2;
                    int iK = sk0Var.K();
                    sk0Var.G(i20);
                    int iB3 = sk0Var.b();
                    if (iL4 > spannableStringBuilder.length()) {
                        int length4 = spannableStringBuilder.length();
                        i14 = i25;
                        i15 = i27;
                        f11 = f12;
                        StringBuilder sb2 = new StringBuilder(r5.c.f(String.valueOf(iL4).length() + 44, 2, String.valueOf(length4)));
                        sb2.append("Truncating styl end (");
                        sb2.append(iL4);
                        sb2.append(") to cueText.length() (");
                        sb2.append(length4);
                        sb2.append(").");
                        ls.t("Tx3gParser", sb2.toString());
                        iL4 = spannableStringBuilder.length();
                    } else {
                        i14 = i25;
                        i15 = i27;
                        f11 = f12;
                    }
                    if (iL3 >= iL4) {
                        StringBuilder sb3 = new StringBuilder(r5.c.f(String.valueOf(iL3).length() + 36, 2, String.valueOf(iL4)));
                        sb3.append("Ignoring styl with start (");
                        sb3.append(iL3);
                        sb3.append(") >= end (");
                        sb3.append(iL4);
                        sb3.append(").");
                        ls.t("Tx3gParser", sb3.toString());
                        i17 = i29;
                        i16 = i30;
                        i18 = i15;
                    } else {
                        i16 = i30;
                        i17 = i29;
                        a(spannableStringBuilder, iK, i14, iL3, iL4, 0);
                        i18 = i15;
                        b(spannableStringBuilder, iB3, i18, iL3, iL4, 0);
                    }
                    iL2 = i16;
                    i27 = i18;
                    f12 = f11;
                    i25 = i14;
                    i20 = 1;
                    i21 = 2;
                    i29 = i17 + 1;
                    i19 = 0;
                }
                i11 = i25;
                i12 = i27;
                f10 = f12;
                i13 = i21;
            } else {
                i11 = i25;
                i12 = i27;
                f10 = f12;
                if (iB2 == 1952608120 && this.f15883b) {
                    i13 = 2;
                    mq0.m(sk0Var.B() >= 2);
                    float fL = sk0Var.L();
                    String str2 = bq0.f9768a;
                    fMax = Math.max(0.0f, Math.min(fL / this.g, 0.95f));
                    sk0Var.E(i28 + iB);
                    i21 = i13;
                    i27 = i12;
                    i19 = 0;
                    i20 = 1;
                    f12 = fMax;
                    i25 = i11;
                } else {
                    i13 = 2;
                }
            }
            fMax = f10;
            sk0Var.E(i28 + iB);
            i21 = i13;
            i27 = i12;
            i19 = 0;
            i20 = 1;
            f12 = fMax;
            i25 = i11;
        }
        cVar.mo160c(new n6(x41.l(new w40(spannableStringBuilder, null, null, null, f12, 0, 0, -3.4028235E38f, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, LinearLayoutManager.INVALID_OFFSET, 0.0f, 0)), -9223372036854775807L, -9223372036854775807L));
    }
}
