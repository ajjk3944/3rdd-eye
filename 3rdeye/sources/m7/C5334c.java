package m7;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.l;

/* compiled from: TypefaceSpan.kt */
/* renamed from: m7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5334c extends MetricAffectingSpan {

    /* renamed from: b, reason: collision with root package name */
    public final Typeface f44085b;

    public C5334c(Typeface typeface) {
        this.f44085b = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        l.f(ds, "ds");
        ds.setTypeface(this.f44085b);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint paint) {
        l.f(paint, "paint");
        paint.setTypeface(this.f44085b);
    }
}
