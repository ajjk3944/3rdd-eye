package j2;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13140a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f13141d;

    public /* synthetic */ b(int i10, Object obj) {
        this.f13140a = i10;
        this.f13141d = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f13140a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f13141d);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f13141d);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f13140a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f13141d);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f13141d);
                break;
        }
    }
}
