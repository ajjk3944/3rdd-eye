package O0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public class m extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    private final float f16759a;

    public m(float f10) {
        this.f16759a = f10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.f16759a + textPaint.getTextSkewX());
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.f16759a + textPaint.getTextSkewX());
    }
}
