package P;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f3112a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f3113b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3114c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3115d;

    public d(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            D3.g.i(textPaint).setBreakStrategy(i).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
        }
        this.f3112a = textPaint;
        this.f3113b = textDirectionHeuristic;
        this.f3114c = i;
        this.f3115d = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i = Build.VERSION.SDK_INT;
        if (this.f3114c != dVar.f3114c || this.f3115d != dVar.f3115d) {
            return false;
        }
        TextPaint textPaint = this.f3112a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = dVar.f3112a;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags()) {
            return false;
        }
        if (i >= 24) {
            if (!textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
                return false;
            }
        } else if (!textPaint.getTextLocale().equals(textPaint2.getTextLocale())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            if (textPaint2.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
            return false;
        }
        return this.f3113b == dVar.f3113b;
    }

    public final int hashCode() {
        int i = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = this.f3113b;
        int i3 = this.f3115d;
        int i6 = this.f3114c;
        TextPaint textPaint = this.f3112a;
        return i >= 24 ? Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i6), Integer.valueOf(i3)) : Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i6), Integer.valueOf(i3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f3112a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i >= 24) {
            sb.append(", textLocale=" + textPaint.getTextLocales());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f3113b);
        sb.append(", breakStrategy=" + this.f3114c);
        sb.append(", hyphenationFrequency=" + this.f3115d);
        sb.append("}");
        return sb.toString();
    }

    public d(PrecomputedText.Params params) {
        this.f3112a = params.getTextPaint();
        this.f3113b = params.getTextDirection();
        this.f3114c = params.getBreakStrategy();
        this.f3115d = params.getHyphenationFrequency();
    }
}
