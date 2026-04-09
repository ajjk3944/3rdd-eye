package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public abstract class i extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final TypefaceEmojiRasterizer f3040b;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f3039a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f3041c = -1;

    /* renamed from: d, reason: collision with root package name */
    public short f3042d = -1;

    /* renamed from: e, reason: collision with root package name */
    public float f3043e = 1.0f;

    public i(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        r0.i.h(typefaceEmojiRasterizer, "rasterizer cannot be null");
        this.f3040b = typefaceEmojiRasterizer;
    }

    public final TypefaceEmojiRasterizer a() {
        return this.f3040b;
    }

    public final int b() {
        return this.f3041c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f3039a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f3039a;
        this.f3043e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f3040b.e();
        this.f3042d = (short) (this.f3040b.e() * this.f3043e);
        short sI = (short) (this.f3040b.i() * this.f3043e);
        this.f3041c = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f3039a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}
