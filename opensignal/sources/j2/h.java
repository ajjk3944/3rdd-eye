package j2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes.dex */
public final class h implements LineHeightSpan {
    public int B = Integer.MIN_VALUE;
    public int D = Integer.MIN_VALUE;
    public int E = Integer.MIN_VALUE;
    public int F = Integer.MIN_VALUE;
    public int G;
    public int H;

    /* renamed from: a, reason: collision with root package name */
    public final float f13146a;

    /* renamed from: d, reason: collision with root package name */
    public final int f13147d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13148g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f13149r;

    /* renamed from: x, reason: collision with root package name */
    public final float f13150x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f13151y;

    public h(float f10, int i10, boolean z10, boolean z11, float f11, boolean z12) {
        this.f13146a = f10;
        this.f13147d = i10;
        this.f13148g = z10;
        this.f13149r = z11;
        this.f13150x = f11;
        this.f13151y = z12;
        if ((0.0f > f11 || f11 > 1.0f) && f11 != -1.0f) {
            m2.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int i14 = fontMetricsInt.descent;
        int i15 = fontMetricsInt.ascent;
        if (i14 - i15 <= 0) {
            return;
        }
        boolean z10 = i10 == 0;
        boolean z11 = i11 == this.f13147d;
        boolean z12 = this.f13149r;
        boolean z13 = this.f13148g;
        if (z10 && z11 && z13 && z12) {
            return;
        }
        if (this.B == Integer.MIN_VALUE) {
            int i16 = i14 - i15;
            int iCeil = (int) Math.ceil(this.f13146a);
            int i17 = iCeil - i16;
            if (!this.f13151y || i17 > 0) {
                float fAbs = this.f13150x;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i17 <= 0 ? Math.ceil(i17 * fAbs) : Math.ceil((1.0f - fAbs) * i17));
                int i18 = fontMetricsInt.descent;
                int i19 = iCeil2 + i18;
                this.E = i19;
                int i20 = i19 - iCeil;
                this.D = i20;
                if (z13) {
                    i20 = fontMetricsInt.ascent;
                }
                this.B = i20;
                if (z12) {
                    i19 = i18;
                }
                this.F = i19;
                this.G = fontMetricsInt.ascent - i20;
                this.H = i19 - i18;
            } else {
                int i21 = fontMetricsInt.ascent;
                this.D = i21;
                int i22 = fontMetricsInt.descent;
                this.E = i22;
                this.B = i21;
                this.F = i22;
                this.G = 0;
                this.H = 0;
            }
        }
        fontMetricsInt.ascent = z10 ? this.B : this.D;
        fontMetricsInt.descent = z11 ? this.F : this.E;
    }
}
