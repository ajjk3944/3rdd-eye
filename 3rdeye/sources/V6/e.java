package V6;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;
import y9.q;

/* compiled from: LineHeightWithTopOffsetSpan.kt */
/* loaded from: classes.dex */
public final class e implements LineHeightSpan {

    /* renamed from: b, reason: collision with root package name */
    public final int f12966b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12967c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12968d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12969e;

    /* renamed from: f, reason: collision with root package name */
    public int f12970f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public int f12971g = Integer.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public int f12972h = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;

    public e(int i, int i10, int i11) {
        this.f12966b = i;
        this.f12967c = i10;
        this.f12968d = i11;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i10, int i11, int i12, Paint.FontMetricsInt fm) {
        int i13;
        kotlin.jvm.internal.l.f(fm, "fm");
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned == null) {
            return;
        }
        int spanStart = spanned.getSpanStart(this);
        if (i > spanned.getSpanEnd(this) || spanStart > i10) {
            return;
        }
        if (this.f12969e) {
            fm.top = this.f12970f;
            fm.ascent = this.f12971g;
            fm.descent = this.f12972h;
            fm.bottom = this.i;
        } else {
            this.f12969e = true;
            this.f12970f = fm.top;
            this.f12971g = fm.ascent;
            this.f12972h = fm.descent;
            this.i = fm.bottom;
        }
        Object[] spans = spanned.getSpans(i, i10, e.class);
        int iMax = this.f12967c;
        for (Object obj : spans) {
            iMax = Math.max(iMax, ((e) obj).f12967c);
        }
        if (iMax > 0) {
            int i14 = fm.descent;
            int i15 = fm.ascent;
            int i16 = i14 - i15;
            int i17 = fm.top - i15;
            int i18 = fm.bottom - i14;
            if (i16 >= 0) {
                int i19 = iMax - i16;
                if (i19 < 0) {
                    int i20 = i15 - (i19 / 2);
                    if (i20 > 0) {
                        i20 = 0;
                    }
                    fm.ascent = i20;
                    int i21 = i20 + iMax;
                    if (i21 < 0) {
                        i21 = 0;
                    }
                    fm.descent = i21;
                } else {
                    int i22 = (i19 / 2) + i14;
                    if (i22 < 0) {
                        i22 = 0;
                    }
                    fm.descent = i22;
                    int i23 = i22 - iMax;
                    if (i23 > 0) {
                        i23 = 0;
                    }
                    fm.ascent = i23;
                }
                fm.top = fm.ascent + i17;
                fm.bottom = fm.descent + i18;
            }
        }
        int i24 = this.f12968d;
        if (i24 == spanStart && i <= i24 && i24 <= i10 && (i13 = this.f12966b) > 0) {
            fm.top -= i13;
            fm.ascent -= i13;
        }
        if (q.b0(charSequence.subSequence(i, i10).toString(), "\n", false)) {
            this.f12969e = false;
        }
    }
}
