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
import o4.AbstractC2763b;

/* renamed from: com.google.android.gms.internal.ads.r3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1779r3 implements S2 {

    /* renamed from: a, reason: collision with root package name */
    public final C2036vr f16456a = new C2036vr();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16457b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16458c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16459d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16460e;

    /* renamed from: f, reason: collision with root package name */
    public final float f16461f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16462g;

    public C1779r3(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f16458c = 0;
            this.f16459d = -1;
            this.f16460e = "sans-serif";
            this.f16457b = false;
            this.f16461f = 0.85f;
            this.f16462g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f16458c = bArr[24];
        this.f16459d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f16460e = true == "Serif".equals(new String(bArr, 43, bArr.length + (-43), StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.f16462g = i;
        boolean z6 = (bArr[0] & 32) != 0;
        this.f16457b = z6;
        if (z6) {
            this.f16461f = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.f16461f = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i3, int i6, int i7, int i8) {
        if (i != i3) {
            int i9 = i8 | 33;
            int i10 = i & 1;
            int i11 = i & 2;
            boolean z6 = true;
            if (i10 != 0) {
                if (i11 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i6, i7, i9);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i6, i7, i9);
                    z6 = false;
                }
            } else if (i11 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i6, i7, i9);
            } else {
                z6 = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i6, i7, i9);
            } else {
                if (i10 != 0 || z6) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i6, i7, i9);
            }
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i3, int i6, int i7, int i8) {
        if (i != i3) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i6, i7, i8 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.S2
    public final void h(byte[] bArr, int i, int i3, T2 t22) {
        String strK;
        int i6;
        int i7;
        float f2;
        int i8;
        float fMax;
        int i9;
        int i10;
        float f5;
        int i11;
        int i12;
        int i13;
        C2036vr c2036vr = this.f16456a;
        c2036vr.z(i + i3, bArr);
        c2036vr.E(i);
        int i14 = 0;
        int i15 = 1;
        int i16 = 2;
        AbstractC0582Jp.m(c2036vr.B() >= 2);
        int iL = c2036vr.L();
        if (iL == 0) {
            strK = "";
        } else {
            int i17 = c2036vr.f17355b;
            Charset charsetQ = c2036vr.q();
            int i18 = c2036vr.f17355b - i17;
            if (charsetQ == null) {
                charsetQ = StandardCharsets.UTF_8;
            }
            strK = c2036vr.k(iL - i18, charsetQ);
        }
        if (strK.isEmpty()) {
            JB jb = LB.f9635b;
            t22.mo4b(new N2(C1197gC.f14227e, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strK);
        int length = spannableStringBuilder.length();
        int i19 = this.f16458c;
        a(spannableStringBuilder, i19, 0, 0, length, 16711680);
        int i20 = i19;
        int length2 = spannableStringBuilder.length();
        int i21 = this.f16459d;
        b(spannableStringBuilder, i21, -1, 0, length2, 16711680);
        int i22 = i21;
        int length3 = spannableStringBuilder.length();
        String str = this.f16460e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length3, 16711713);
        }
        float f6 = this.f16461f;
        while (c2036vr.B() >= 8) {
            int i23 = c2036vr.f17355b;
            int iB = c2036vr.b();
            int iB2 = c2036vr.b();
            if (iB2 == 1937013100) {
                AbstractC0582Jp.m(c2036vr.B() >= i16 ? i15 : i14);
                int iL2 = c2036vr.L();
                int i24 = i14;
                while (i24 < iL2) {
                    AbstractC0582Jp.m(c2036vr.B() >= 12 ? i15 : i14);
                    int iL3 = c2036vr.L();
                    int iL4 = c2036vr.L();
                    c2036vr.G(i16);
                    int i25 = iL2;
                    int iK = c2036vr.K();
                    c2036vr.G(i15);
                    int iB3 = c2036vr.b();
                    if (iL4 > spannableStringBuilder.length()) {
                        int length4 = spannableStringBuilder.length();
                        i9 = i20;
                        i10 = i22;
                        f5 = f6;
                        StringBuilder sb = new StringBuilder(AbstractC2763b.b(String.valueOf(iL4).length() + 44, 2, String.valueOf(length4)));
                        sb.append("Truncating styl end (");
                        sb.append(iL4);
                        sb.append(") to cueText.length() (");
                        sb.append(length4);
                        sb.append(").");
                        AbstractC2022vd.v("Tx3gParser", sb.toString());
                        iL4 = spannableStringBuilder.length();
                    } else {
                        i9 = i20;
                        i10 = i22;
                        f5 = f6;
                    }
                    if (iL3 >= iL4) {
                        StringBuilder sb2 = new StringBuilder(AbstractC2763b.b(String.valueOf(iL3).length() + 36, 2, String.valueOf(iL4)));
                        sb2.append("Ignoring styl with start (");
                        sb2.append(iL3);
                        sb2.append(") >= end (");
                        sb2.append(iL4);
                        sb2.append(").");
                        AbstractC2022vd.v("Tx3gParser", sb2.toString());
                        i12 = i24;
                        i11 = i25;
                        i13 = i10;
                    } else {
                        i11 = i25;
                        i12 = i24;
                        a(spannableStringBuilder, iK, i9, iL3, iL4, 0);
                        i13 = i10;
                        b(spannableStringBuilder, iB3, i13, iL3, iL4, 0);
                    }
                    iL2 = i11;
                    i22 = i13;
                    f6 = f5;
                    i20 = i9;
                    i15 = 1;
                    i16 = 2;
                    i24 = i12 + 1;
                    i14 = 0;
                }
                i6 = i20;
                i7 = i22;
                f2 = f6;
                i8 = i16;
            } else {
                i6 = i20;
                i7 = i22;
                f2 = f6;
                if (iB2 == 1952608120 && this.f16457b) {
                    i8 = 2;
                    AbstractC0582Jp.m(c2036vr.B() >= 2);
                    float fL = c2036vr.L();
                    String str2 = Vt.f12096a;
                    fMax = Math.max(0.0f, Math.min(fL / this.f16462g, 0.95f));
                    c2036vr.E(i23 + iB);
                    i16 = i8;
                    i22 = i7;
                    i14 = 0;
                    i15 = 1;
                    f6 = fMax;
                    i20 = i6;
                } else {
                    i8 = 2;
                }
            }
            fMax = f2;
            c2036vr.E(i23 + iB);
            i16 = i8;
            i22 = i7;
            i14 = 0;
            i15 = 1;
            f6 = fMax;
            i20 = i6;
        }
        t22.mo4b(new N2(LB.i(new C2244zj(spannableStringBuilder, null, null, null, f6, 0, 0, -3.4028235E38f, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, LinearLayoutManager.INVALID_OFFSET, 0.0f, 0)), -9223372036854775807L, -9223372036854775807L));
    }
}
