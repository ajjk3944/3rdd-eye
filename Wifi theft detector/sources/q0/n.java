package q0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class n implements Spannable {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextPaint f23959a;

        /* renamed from: b, reason: collision with root package name */
        public final TextDirectionHeuristic f23960b;

        /* renamed from: c, reason: collision with root package name */
        public final int f23961c;

        /* renamed from: d, reason: collision with root package name */
        public final int f23962d;

        /* renamed from: e, reason: collision with root package name */
        public final PrecomputedText.Params f23963e;

        /* renamed from: q0.n$a$a, reason: collision with other inner class name */
        public static class C0458a {

            /* renamed from: a, reason: collision with root package name */
            public final TextPaint f23964a;

            /* renamed from: c, reason: collision with root package name */
            public int f23966c = 1;

            /* renamed from: d, reason: collision with root package name */
            public int f23967d = 1;

            /* renamed from: b, reason: collision with root package name */
            public TextDirectionHeuristic f23965b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0458a(TextPaint textPaint) {
                this.f23964a = textPaint;
            }

            public a a() {
                return new a(this.f23964a, this.f23965b, this.f23966c, this.f23967d);
            }

            public C0458a b(int i10) {
                this.f23966c = i10;
                return this;
            }

            public C0458a c(int i10) {
                this.f23967d = i10;
                return this;
            }

            public C0458a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f23965b = textDirectionHeuristic;
                return this;
            }
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f23963e = d.a(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f23963e = null;
            }
            this.f23959a = textPaint;
            this.f23960b = textDirectionHeuristic;
            this.f23961c = i10;
            this.f23962d = i11;
        }

        public boolean a(a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            if (this.f23961c != aVar.b() || this.f23962d != aVar.c() || this.f23959a.getTextSize() != aVar.e().getTextSize() || this.f23959a.getTextScaleX() != aVar.e().getTextScaleX() || this.f23959a.getTextSkewX() != aVar.e().getTextSkewX() || this.f23959a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f23959a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f23959a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i10 >= 24) {
                if (!this.f23959a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (!this.f23959a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            return this.f23959a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f23959a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f23961c;
        }

        public int c() {
            return this.f23962d;
        }

        public TextDirectionHeuristic d() {
            return this.f23960b;
        }

        public TextPaint e() {
            return this.f23959a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f23960b == aVar.d();
        }

        public int hashCode() {
            return Build.VERSION.SDK_INT >= 24 ? r0.d.b(Float.valueOf(this.f23959a.getTextSize()), Float.valueOf(this.f23959a.getTextScaleX()), Float.valueOf(this.f23959a.getTextSkewX()), Float.valueOf(this.f23959a.getLetterSpacing()), Integer.valueOf(this.f23959a.getFlags()), this.f23959a.getTextLocales(), this.f23959a.getTypeface(), Boolean.valueOf(this.f23959a.isElegantTextHeight()), this.f23960b, Integer.valueOf(this.f23961c), Integer.valueOf(this.f23962d)) : r0.d.b(Float.valueOf(this.f23959a.getTextSize()), Float.valueOf(this.f23959a.getTextScaleX()), Float.valueOf(this.f23959a.getTextSkewX()), Float.valueOf(this.f23959a.getLetterSpacing()), Integer.valueOf(this.f23959a.getFlags()), this.f23959a.getTextLocale(), this.f23959a.getTypeface(), Boolean.valueOf(this.f23959a.isElegantTextHeight()), this.f23960b, Integer.valueOf(this.f23961c), Integer.valueOf(this.f23962d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f23959a.getTextSize());
            sb.append(", textScaleX=" + this.f23959a.getTextScaleX());
            sb.append(", textSkewX=" + this.f23959a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f23959a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f23959a.isElegantTextHeight());
            if (i10 >= 24) {
                sb.append(", textLocale=" + this.f23959a.getTextLocales());
            } else {
                sb.append(", textLocale=" + this.f23959a.getTextLocale());
            }
            sb.append(", typeface=" + this.f23959a.getTypeface());
            if (i10 >= 26) {
                sb.append(", variationSettings=" + this.f23959a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f23960b);
            sb.append(", breakStrategy=" + this.f23961c);
            sb.append(", hyphenationFrequency=" + this.f23962d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f23959a = params.getTextPaint();
            this.f23960b = params.getTextDirection();
            this.f23961c = params.getBreakStrategy();
            this.f23962d = params.getHyphenationFrequency();
            this.f23963e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
