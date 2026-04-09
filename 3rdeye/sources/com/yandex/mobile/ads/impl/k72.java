package com.yandex.mobile.ads.impl;

import N7.G8;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.yandex.mobile.ads.impl.av;
import g0.C4356c;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class k72 extends jy1 {

    /* renamed from: m, reason: collision with root package name */
    private final uf1 f29549m = new uf1();

    /* renamed from: n, reason: collision with root package name */
    private final boolean f29550n;

    /* renamed from: o, reason: collision with root package name */
    private final int f29551o;

    /* renamed from: p, reason: collision with root package name */
    private final int f29552p;

    /* renamed from: q, reason: collision with root package name */
    private final String f29553q;

    /* renamed from: r, reason: collision with root package name */
    private final float f29554r;

    /* renamed from: s, reason: collision with root package name */
    private final int f29555s;

    public k72(List<byte[]> list) {
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f29551o = 0;
            this.f29552p = -1;
            this.f29553q = "sans-serif";
            this.f29550n = false;
            this.f29554r = 0.85f;
            this.f29555s = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f29551o = bArr[24];
        this.f29552p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f29553q = "Serif".equals(s82.a(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.f29555s = i;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f29550n = z10;
        if (z10) {
            this.f29554r = s82.a(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i);
        } else {
            this.f29554r = 0.85f;
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, int i, int i10, int i11, int i12, int i13) {
        if (i != i10) {
            int i14 = i13 | 33;
            boolean z10 = (i & 1) != 0;
            boolean z11 = (i & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i11, i12, i14);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i11, i12, i14);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, i12, i14);
            }
            boolean z12 = (i & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, i14);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i11, i12, i14);
        }
    }

    @Override // com.yandex.mobile.ads.impl.jy1
    public final b32 a(byte[] bArr, int i, boolean z10) throws d32 {
        String strA;
        char cF;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 1;
        int i15 = 8;
        this.f29549m.a(i, bArr);
        uf1 uf1Var = this.f29549m;
        int i16 = 2;
        if (uf1Var.a() >= 2) {
            int iZ = uf1Var.z();
            if (iZ == 0) {
                strA = "";
            } else if (uf1Var.a() >= 2 && ((cF = uf1Var.f()) == 65279 || cF == 65534)) {
                strA = uf1Var.a(iZ, fo.f27412e);
            } else {
                strA = uf1Var.a(iZ, fo.f27410c);
            }
            if (strA.isEmpty()) {
                return l72.f29914c;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strA);
            a(spannableStringBuilder, this.f29551o, 0, 0, spannableStringBuilder.length(), 16711680);
            int i17 = this.f29552p;
            int length = spannableStringBuilder.length();
            int i18 = 0;
            if (i17 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan((i17 >>> 8) | ((i17 & KotlinVersion.MAX_COMPONENT_VALUE) << 24)), 0, length, 16711713);
            }
            String str = this.f29553q;
            int length2 = spannableStringBuilder.length();
            if (str != "sans-serif") {
                spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
            }
            float fMax = this.f29554r;
            while (this.f29549m.a() >= i15) {
                int iD = this.f29549m.d();
                int iH = this.f29549m.h();
                int iH2 = this.f29549m.h();
                if (iH2 == 1937013100) {
                    if (this.f29549m.a() >= i16) {
                        int iZ2 = this.f29549m.z();
                        int i19 = i18;
                        while (i19 < iZ2) {
                            uf1 uf1Var2 = this.f29549m;
                            if (uf1Var2.a() >= 12) {
                                int iZ3 = uf1Var2.z();
                                int iZ4 = uf1Var2.z();
                                uf1Var2.f(i16);
                                int i20 = i19;
                                int iT = uf1Var2.t();
                                uf1Var2.f(i14);
                                int iH3 = uf1Var2.h();
                                int i21 = i14;
                                int i22 = i15;
                                if (iZ4 > spannableStringBuilder.length()) {
                                    StringBuilder sbJ = C4356c.j(iZ4, "Truncating styl end (", ") to cueText.length() (");
                                    sbJ.append(spannableStringBuilder.length());
                                    sbJ.append(").");
                                    rs0.d("Tx3gDecoder", sbJ.toString());
                                    iZ4 = spannableStringBuilder.length();
                                }
                                if (iZ3 >= iZ4) {
                                    rs0.d("Tx3gDecoder", G8.r("Ignoring styl with start (", iZ3, ") >= end (", iZ4, ")."));
                                    i13 = i20;
                                } else {
                                    i13 = i20;
                                    a(spannableStringBuilder, iT, this.f29551o, iZ3, iZ4, 0);
                                    if (iH3 != this.f29552p) {
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan((iH3 >>> 8) | ((iH3 & KotlinVersion.MAX_COMPONENT_VALUE) << 24)), iZ3, iZ4, 33);
                                    }
                                }
                                i19 = i13 + 1;
                                i14 = i21;
                                i15 = i22;
                                i16 = 2;
                            } else {
                                throw new d32("Unexpected subtitle format.");
                            }
                        }
                        i10 = i14;
                        i11 = i15;
                        i12 = i16;
                    } else {
                        throw new d32("Unexpected subtitle format.");
                    }
                } else {
                    i10 = i14;
                    i11 = i15;
                    if (iH2 == 1952608120 && this.f29550n) {
                        i12 = 2;
                        if (this.f29549m.a() >= 2) {
                            int i23 = s82.f32899a;
                            fMax = Math.max(0.0f, Math.min(this.f29549m.z() / this.f29555s, 0.95f));
                        } else {
                            throw new d32("Unexpected subtitle format.");
                        }
                    } else {
                        i12 = 2;
                    }
                }
                this.f29549m.e(iD + iH);
                i14 = i10;
                i16 = i12;
                i15 = i11;
                i18 = 0;
            }
            return new l72(new av.a().a(spannableStringBuilder).a(0, fMax).a(0).a());
        }
        throw new d32("Unexpected subtitle format.");
    }
}
