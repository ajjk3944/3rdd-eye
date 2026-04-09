package s3;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f21863a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f21864b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21865c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21866d;

    public d(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.f(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
        }
        this.f21863a = textPaint;
        this.f21864b = textDirectionHeuristic;
        this.f21865c = i10;
        this.f21866d = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f21865c != dVar.f21865c || this.f21866d != dVar.f21866d) {
            return false;
        }
        TextPaint textPaint = this.f21863a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = dVar.f21863a;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            if (textPaint2.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
            return false;
        }
        return this.f21864b == dVar.f21864b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f21863a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f21864b, Integer.valueOf(this.f21865c), Integer.valueOf(this.f21866d));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f21863a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        int i10 = Build.VERSION.SDK_INT;
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb2.append(", textLocale=" + textPaint.getTextLocales());
        sb2.append(", typeface=" + textPaint.getTypeface());
        if (i10 >= 26) {
            sb2.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb2.append(", textDir=" + this.f21864b);
        sb2.append(", breakStrategy=" + this.f21865c);
        sb2.append(", hyphenationFrequency=" + this.f21866d);
        sb2.append("}");
        return sb2.toString();
    }

    public d(PrecomputedText.Params params) {
        this.f21863a = params.getTextPaint();
        this.f21864b = params.getTextDirection();
        this.f21865c = params.getBreakStrategy();
        this.f21866d = params.getHyphenationFrequency();
    }
}
