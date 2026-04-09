package j2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import br.l;

/* loaded from: classes.dex */
public final class i extends ReplacementSpan {

    /* renamed from: a, reason: collision with root package name */
    public Paint.FontMetricsInt f13152a;

    /* renamed from: d, reason: collision with root package name */
    public int f13153d;

    /* renamed from: g, reason: collision with root package name */
    public int f13154g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f13155r;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f13152a;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        l.l("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.f13155r) {
            m2.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f13154g;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        this.f13155r = true;
        paint.getTextSize();
        this.f13152a = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            m2.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.f13153d = (int) Math.ceil(0.0f);
        this.f13154g = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.f13155r) {
            m2.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f13153d;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }
}
