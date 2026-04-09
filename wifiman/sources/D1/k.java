package D1;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class k implements Spannable {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final TextPaint f2793a;

        /* renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f2794b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2795c;

        /* renamed from: d, reason: collision with root package name */
        private final int f2796d;

        /* renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f2797e;

        /* renamed from: D1.k$a$a, reason: collision with other inner class name */
        public static class C0140a {

            /* renamed from: a, reason: collision with root package name */
            private final TextPaint f2798a;

            /* renamed from: c, reason: collision with root package name */
            private int f2800c = 1;

            /* renamed from: d, reason: collision with root package name */
            private int f2801d = 1;

            /* renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f2799b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0140a(TextPaint textPaint) {
                this.f2798a = textPaint;
            }

            public a a() {
                return new a(this.f2798a, this.f2799b, this.f2800c, this.f2801d);
            }

            public C0140a b(int i10) {
                this.f2800c = i10;
                return this;
            }

            public C0140a c(int i10) {
                this.f2801d = i10;
                return this;
            }

            public C0140a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f2799b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f2797e = j.a(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f2797e = null;
            }
            this.f2793a = textPaint;
            this.f2794b = textDirectionHeuristic;
            this.f2795c = i10;
            this.f2796d = i11;
        }

        public boolean a(a aVar) {
            if (this.f2795c == aVar.b() && this.f2796d == aVar.c() && this.f2793a.getTextSize() == aVar.e().getTextSize() && this.f2793a.getTextScaleX() == aVar.e().getTextScaleX() && this.f2793a.getTextSkewX() == aVar.e().getTextSkewX() && this.f2793a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f2793a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.f2793a.getFlags() == aVar.e().getFlags() && this.f2793a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.f2793a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f2793a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f2795c;
        }

        public int c() {
            return this.f2796d;
        }

        public TextDirectionHeuristic d() {
            return this.f2794b;
        }

        public TextPaint e() {
            return this.f2793a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f2794b == aVar.d();
        }

        public int hashCode() {
            return E1.d.b(Float.valueOf(this.f2793a.getTextSize()), Float.valueOf(this.f2793a.getTextScaleX()), Float.valueOf(this.f2793a.getTextSkewX()), Float.valueOf(this.f2793a.getLetterSpacing()), Integer.valueOf(this.f2793a.getFlags()), this.f2793a.getTextLocales(), this.f2793a.getTypeface(), Boolean.valueOf(this.f2793a.isElegantTextHeight()), this.f2794b, Integer.valueOf(this.f2795c), Integer.valueOf(this.f2796d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f2793a.getTextSize());
            sb2.append(", textScaleX=" + this.f2793a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f2793a.getTextSkewX());
            sb2.append(", letterSpacing=" + this.f2793a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f2793a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f2793a.getTextLocales());
            sb2.append(", typeface=" + this.f2793a.getTypeface());
            sb2.append(", variationSettings=" + this.f2793a.getFontVariationSettings());
            sb2.append(", textDir=" + this.f2794b);
            sb2.append(", breakStrategy=" + this.f2795c);
            sb2.append(", hyphenationFrequency=" + this.f2796d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f2793a = params.getTextPaint();
            this.f2794b = params.getTextDirection();
            this.f2795c = params.getBreakStrategy();
            this.f2796d = params.getHyphenationFrequency();
            this.f2797e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
