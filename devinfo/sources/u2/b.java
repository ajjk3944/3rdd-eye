package u2;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35036a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f35037b;

    public /* synthetic */ b(int i4, Object obj) {
        this.f35036a = i4;
        this.f35037b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f35036a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f35037b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f35037b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f35036a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f35037b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f35037b);
                break;
        }
    }
}
