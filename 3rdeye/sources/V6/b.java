package V6;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: FontFeatureSpan.kt */
/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: b, reason: collision with root package name */
    public final String f12952b;

    public b(String settings) {
        kotlin.jvm.internal.l.f(settings, "settings");
        this.f12952b = settings;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        kotlin.jvm.internal.l.f(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f12952b);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        kotlin.jvm.internal.l.f(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f12952b);
    }
}
