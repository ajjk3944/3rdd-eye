package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public abstract class j extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    private final p f31037b;

    /* renamed from: a, reason: collision with root package name */
    private final Paint.FontMetricsInt f31036a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    private short f31038c = -1;

    /* renamed from: d, reason: collision with root package name */
    private short f31039d = -1;

    /* renamed from: e, reason: collision with root package name */
    private float f31040e = 1.0f;

    j(p pVar) {
        E1.h.h(pVar, "rasterizer cannot be null");
        this.f31037b = pVar;
    }

    public final p a() {
        return this.f31037b;
    }

    final int b() {
        return this.f31038c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f31036a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f31036a;
        this.f31040e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f31037b.e();
        this.f31039d = (short) (this.f31037b.e() * this.f31040e);
        short sI = (short) (this.f31037b.i() * this.f31040e);
        this.f31038c = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f31036a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}
