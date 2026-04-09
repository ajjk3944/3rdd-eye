package u2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35034a;

    /* renamed from: b, reason: collision with root package name */
    public final float f35035b;

    public /* synthetic */ a(int i4, float f10) {
        this.f35034a = i4;
        this.f35035b = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f35034a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f35035b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f35035b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f35034a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f35035b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f35035b);
                break;
        }
    }
}
