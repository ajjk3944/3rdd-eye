package j2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13138a;

    /* renamed from: d, reason: collision with root package name */
    public final float f13139d;

    public /* synthetic */ a(int i10, float f10) {
        this.f13138a = i10;
        this.f13139d = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f13138a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f13139d);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f13139d);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f13138a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f13139d);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f13139d);
                break;
        }
    }
}
