package u2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f35042a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35043b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f35044c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f35045d;

    /* renamed from: e, reason: collision with root package name */
    public final float f35046e;

    /* renamed from: f, reason: collision with root package name */
    public final int f35047f;
    public int g = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: h, reason: collision with root package name */
    public int f35048h = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: i, reason: collision with root package name */
    public int f35049i = LinearLayoutManager.INVALID_OFFSET;
    public int j = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: k, reason: collision with root package name */
    public int f35050k;

    /* renamed from: l, reason: collision with root package name */
    public int f35051l;

    public h(float f10, int i4, boolean z3, boolean z10, float f11, int i10) {
        this.f35042a = f10;
        this.f35043b = i4;
        this.f35044c = z3;
        this.f35045d = z10;
        this.f35046e = f11;
        this.f35047f = i10;
        if ((0.0f > f11 || f11 > 1.0f) && f11 != -1.0f) {
            x2.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i4, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        int i13 = fontMetricsInt.descent;
        int i14 = fontMetricsInt.ascent;
        if (i13 - i14 <= 0) {
            return;
        }
        boolean z3 = i4 == 0;
        boolean z10 = i10 == this.f35043b;
        int i15 = this.f35047f;
        boolean z11 = this.f35045d;
        boolean z12 = this.f35044c;
        if (z3 && z10 && z12 && z11 && i15 != 2) {
            return;
        }
        if (this.g == Integer.MIN_VALUE) {
            int i16 = i13 - i14;
            int iCeil = (int) Math.ceil(this.f35042a);
            int i17 = iCeil - i16;
            if (i15 != 1 || i17 > 0) {
                float fAbs = this.f35046e;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i17 <= 0 ? Math.ceil(i17 * fAbs) : Math.ceil((1.0f - fAbs) * i17));
                int i18 = fontMetricsInt.descent;
                int i19 = iCeil2 + i18;
                this.f35049i = i19;
                int i20 = i19 - iCeil;
                this.f35048h = i20;
                if (i15 == 0 || i17 >= 0) {
                    if (z12) {
                        i20 = fontMetricsInt.ascent;
                    }
                    this.g = i20;
                    if (z11) {
                        i19 = i18;
                    }
                    this.j = i19;
                    this.f35050k = fontMetricsInt.ascent - i20;
                    this.f35051l = i19 - i18;
                } else if (i15 == 2) {
                    this.g = z12 ? Math.max(fontMetricsInt.ascent, i20) : Math.min(fontMetricsInt.ascent, i20);
                    this.j = z11 ? Math.min(fontMetricsInt.descent, this.f35049i) : Math.max(fontMetricsInt.descent, this.f35049i);
                    this.f35050k = 0;
                    this.f35051l = 0;
                }
            } else {
                int i21 = fontMetricsInt.ascent;
                this.f35048h = i21;
                int i22 = fontMetricsInt.descent;
                this.f35049i = i22;
                this.g = i21;
                this.j = i22;
                this.f35050k = 0;
                this.f35051l = 0;
            }
        }
        fontMetricsInt.ascent = z3 ? this.g : this.f35048h;
        fontMetricsInt.descent = z10 ? this.j : this.f35049i;
    }
}
