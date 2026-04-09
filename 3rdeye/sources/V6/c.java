package V6;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.text.style.ParagraphStyle;

/* compiled from: FontSizeSpan.kt */
/* loaded from: classes.dex */
public final class c extends MetricAffectingSpan implements ParagraphStyle {

    /* renamed from: b, reason: collision with root package name */
    public final int f12953b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12954c;

    public c(int i, int i10) {
        this.f12953b = i;
        this.f12954c = i10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint paint) {
        kotlin.jvm.internal.l.f(paint, "paint");
        paint.setTextSize(this.f12953b);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint paint) {
        kotlin.jvm.internal.l.f(paint, "paint");
        int i = this.f12953b;
        int i10 = this.f12954c;
        if (i10 == 0) {
            paint.setTextSize(i);
        } else if (i10 >= paint.getTextSize()) {
            paint.setTextScaleX(i / paint.getTextSize());
        } else {
            paint.setTextScaleX(i / i10);
            paint.setTextSize(i10);
        }
    }
}
