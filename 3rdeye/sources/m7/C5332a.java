package m7;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.l;

/* compiled from: LetterSpacingSpan.kt */
/* renamed from: m7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5332a extends MetricAffectingSpan {

    /* renamed from: b, reason: collision with root package name */
    public final float f44084b;

    public C5332a(float f10) {
        this.f44084b = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint paint) {
        l.f(paint, "paint");
        paint.setLetterSpacing(this.f44084b);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint paint) {
        l.f(paint, "paint");
        paint.setLetterSpacing(this.f44084b);
    }
}
