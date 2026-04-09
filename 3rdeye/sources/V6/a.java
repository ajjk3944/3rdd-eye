package V6;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.text.style.ParagraphStyle;

/* compiled from: BaselineShiftSpan.kt */
/* loaded from: classes.dex */
public final class a extends MetricAffectingSpan implements ParagraphStyle {

    /* renamed from: b, reason: collision with root package name */
    public final int f12950b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12951c;

    public a(int i, int i10) {
        this.f12950b = i;
        this.f12951c = i10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint paint) {
        kotlin.jvm.internal.l.f(paint, "paint");
        paint.baselineShift -= this.f12950b;
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint paint) {
        kotlin.jvm.internal.l.f(paint, "paint");
        if (this.f12951c == 0) {
            paint.baselineShift -= this.f12950b;
        }
    }
}
