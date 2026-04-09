package com.instagram.common.viewpoint.core;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Jm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0603Jm {
    public static String[] A08 = {"QrT", "qnQt5WyeAQ09x35f49C3fjiJNyL2Wwm", "MYPg", "kl", "gHVF4DBtkYKODoSVDn", "z4XgsVt0P4PakGRoUHMjSa47eQapG64R", "b9pv7rqD0c4j71TLmNGUCRckoksDVk", "PMM3oo9z0bIH04LH4O"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final List<C0602Jl> A06 = new ArrayList();
    public final List<SpannableString> A07 = new ArrayList();
    public final StringBuilder A05 = new StringBuilder();

    public C0603Jm(int i4, int i10) {
        A0C(i4);
        this.A01 = i10;
    }

    private SpannableString A04() {
        int i4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A05);
        int nextColor = spannableStringBuilder.length();
        int color = -1;
        int colorStartPosition = -1;
        int italicStartPosition = 0;
        int underlineStartPosition = -1;
        int style = 0;
        int i10 = -1;
        for (int length = 0; length < this.A06.size(); length++) {
            C0602Jl c0602Jl = this.A06.get(length);
            boolean z3 = c0602Jl.A02;
            int i11 = c0602Jl.A01;
            if (i11 != 8) {
                style = i11 == 7 ? 1 : 0;
                if (i11 != 7) {
                    i10 = C1X.A0Q[i11];
                }
            }
            int i12 = c0602Jl.A00;
            if (length + 1 < this.A06.size()) {
                i4 = this.A06.get(length + 1).A00;
            } else {
                i4 = nextColor;
            }
            if (i12 != i4) {
                if (color != -1 && !z3) {
                    A06(spannableStringBuilder, color, i12);
                    color = -1;
                } else if (color == -1 && z3) {
                    color = i12;
                }
                if (colorStartPosition != -1 && style == 0) {
                    A05(spannableStringBuilder, colorStartPosition, i12);
                    colorStartPosition = -1;
                } else if (colorStartPosition == -1 && style != 0) {
                    colorStartPosition = i12;
                }
                if (i10 != underlineStartPosition) {
                    A07(spannableStringBuilder, italicStartPosition, i12, underlineStartPosition);
                    underlineStartPosition = i10;
                    italicStartPosition = i12;
                }
            }
        }
        if (color != -1 && color != nextColor) {
            A06(spannableStringBuilder, color, nextColor);
        }
        if (colorStartPosition != -1 && colorStartPosition != nextColor) {
            A05(spannableStringBuilder, colorStartPosition, nextColor);
        }
        if (italicStartPosition != nextColor) {
            A07(spannableStringBuilder, italicStartPosition, nextColor, underlineStartPosition);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public static void A05(SpannableStringBuilder spannableStringBuilder, int i4, int i10) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i4, i10, 33);
    }

    public static void A06(SpannableStringBuilder spannableStringBuilder, int i4, int i10) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i4, i10, 33);
    }

    public static void A07(SpannableStringBuilder spannableStringBuilder, int i4, int i10, int i11) {
        if (i11 == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), i4, i10, 33);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0013 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.instagram.common.viewpoint.core.C1946pT A08(int r10) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0603Jm.A08(int):com.facebook.ads.redexgen.X.pT");
    }

    public final void A09() {
        int length = this.A05.length();
        if (length > 0) {
            int length2 = length - 1;
            this.A05.delete(length2, length);
            int length3 = this.A06.size();
            for (int i4 = length3 - 1; i4 >= 0; i4--) {
                C0602Jl c0602Jl = this.A06.get(i4);
                String[] strArr = A08;
                String str = strArr[2];
                String str2 = strArr[6];
                int i10 = str.length();
                int length4 = str2.length();
                if (i10 == length4) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[7] = "VxqvNxDPFU2KcS189G";
                strArr2[1] = "CD1791pAkSaTS5HjwfKDVAxBa1qJnUw";
                int length5 = c0602Jl.A00;
                if (length5 == length) {
                    int length6 = c0602Jl.A00;
                    c0602Jl.A00 = length6 - 1;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0022 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0A() {
        /*
            r3 = this;
            java.util.List<android.text.SpannableString> r1 = r3.A07
            android.text.SpannableString r0 = r3.A04()
            r1.add(r0)
            java.lang.StringBuilder r0 = r3.A05
            r2 = 0
            r0.setLength(r2)
            java.util.List<com.facebook.ads.redexgen.X.Jl> r0 = r3.A06
            r0.clear()
            int r1 = r3.A01
            int r0 = r3.A03
            int r1 = java.lang.Math.min(r1, r0)
        L1c:
            java.util.List<android.text.SpannableString> r0 = r3.A07
            int r0 = r0.size()
            if (r0 < r1) goto L2a
            java.util.List<android.text.SpannableString> r0 = r3.A07
            r0.remove(r2)
            goto L1c
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0603Jm.A0A():void");
    }

    public final void A0B(char c9) {
        if (this.A05.length() < 32) {
            this.A05.append(c9);
        }
    }

    public final void A0C(int i4) {
        this.A00 = i4;
        this.A06.clear();
        this.A07.clear();
        this.A05.setLength(0);
        this.A03 = 15;
        this.A02 = 0;
        this.A04 = 0;
    }

    public final void A0D(int i4) {
        this.A00 = i4;
    }

    public final void A0E(int i4) {
        this.A01 = i4;
    }

    public final void A0F(int i4, boolean z3) {
        this.A06.add(new C0602Jl(i4, z3, this.A05.length()));
    }

    public final boolean A0G() {
        return this.A06.isEmpty() && this.A07.isEmpty() && this.A05.length() == 0;
    }
}
