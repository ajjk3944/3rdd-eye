package y;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import z.c;

/* loaded from: classes.dex */
public class a implements Spannable {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f3407e = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Spannable f3408b;

    /* renamed from: c, reason: collision with root package name */
    private final C0040a f3409c;

    /* renamed from: d, reason: collision with root package name */
    private final PrecomputedText f3410d;

    /* renamed from: y.a$a, reason: collision with other inner class name */
    public static final class C0040a {

        /* renamed from: a, reason: collision with root package name */
        private final TextPaint f3411a;

        /* renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f3412b;

        /* renamed from: c, reason: collision with root package name */
        private final int f3413c;

        /* renamed from: d, reason: collision with root package name */
        private final int f3414d;

        /* renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f3415e;

        /* renamed from: y.a$a$a, reason: collision with other inner class name */
        public static class C0041a {

            /* renamed from: a, reason: collision with root package name */
            private final TextPaint f3416a;

            /* renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f3417b;

            /* renamed from: c, reason: collision with root package name */
            private int f3418c;

            /* renamed from: d, reason: collision with root package name */
            private int f3419d;

            public C0041a(TextPaint textPaint) {
                this.f3416a = textPaint;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 23) {
                    this.f3418c = 1;
                    this.f3419d = 1;
                } else {
                    this.f3419d = 0;
                    this.f3418c = 0;
                }
                this.f3417b = i2 >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            public C0040a a() {
                return new C0040a(this.f3416a, this.f3417b, this.f3418c, this.f3419d);
            }

            public C0041a b(int i2) {
                this.f3418c = i2;
                return this;
            }

            public C0041a c(int i2) {
                this.f3419d = i2;
                return this;
            }

            public C0041a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f3417b = textDirectionHeuristic;
                return this;
            }
        }

        public C0040a(PrecomputedText.Params params) {
            this.f3411a = params.getTextPaint();
            this.f3412b = params.getTextDirection();
            this.f3413c = params.getBreakStrategy();
            this.f3414d = params.getHyphenationFrequency();
            this.f3415e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        @SuppressLint({"NewApi"})
        C0040a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
            this.f3415e = Build.VERSION.SDK_INT >= 29 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build() : null;
            this.f3411a = textPaint;
            this.f3412b = textDirectionHeuristic;
            this.f3413c = i2;
            this.f3414d = i3;
        }

        public boolean a(C0040a c0040a) {
            int i2 = Build.VERSION.SDK_INT;
            if ((i2 >= 23 && (this.f3413c != c0040a.b() || this.f3414d != c0040a.c())) || this.f3411a.getTextSize() != c0040a.e().getTextSize() || this.f3411a.getTextScaleX() != c0040a.e().getTextScaleX() || this.f3411a.getTextSkewX() != c0040a.e().getTextSkewX()) {
                return false;
            }
            if ((i2 >= 21 && (this.f3411a.getLetterSpacing() != c0040a.e().getLetterSpacing() || !TextUtils.equals(this.f3411a.getFontFeatureSettings(), c0040a.e().getFontFeatureSettings()))) || this.f3411a.getFlags() != c0040a.e().getFlags()) {
                return false;
            }
            if (i2 >= 24) {
                if (!this.f3411a.getTextLocales().equals(c0040a.e().getTextLocales())) {
                    return false;
                }
            } else if (i2 >= 17 && !this.f3411a.getTextLocale().equals(c0040a.e().getTextLocale())) {
                return false;
            }
            return this.f3411a.getTypeface() == null ? c0040a.e().getTypeface() == null : this.f3411a.getTypeface().equals(c0040a.e().getTypeface());
        }

        public int b() {
            return this.f3413c;
        }

        public int c() {
            return this.f3414d;
        }

        public TextDirectionHeuristic d() {
            return this.f3412b;
        }

        public TextPaint e() {
            return this.f3411a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0040a)) {
                return false;
            }
            C0040a c0040a = (C0040a) obj;
            if (a(c0040a)) {
                return Build.VERSION.SDK_INT < 18 || this.f3412b == c0040a.d();
            }
            return false;
        }

        public int hashCode() {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                return c.b(Float.valueOf(this.f3411a.getTextSize()), Float.valueOf(this.f3411a.getTextScaleX()), Float.valueOf(this.f3411a.getTextSkewX()), Float.valueOf(this.f3411a.getLetterSpacing()), Integer.valueOf(this.f3411a.getFlags()), this.f3411a.getTextLocales(), this.f3411a.getTypeface(), Boolean.valueOf(this.f3411a.isElegantTextHeight()), this.f3412b, Integer.valueOf(this.f3413c), Integer.valueOf(this.f3414d));
            }
            if (i2 >= 21) {
                return c.b(Float.valueOf(this.f3411a.getTextSize()), Float.valueOf(this.f3411a.getTextScaleX()), Float.valueOf(this.f3411a.getTextSkewX()), Float.valueOf(this.f3411a.getLetterSpacing()), Integer.valueOf(this.f3411a.getFlags()), this.f3411a.getTextLocale(), this.f3411a.getTypeface(), Boolean.valueOf(this.f3411a.isElegantTextHeight()), this.f3412b, Integer.valueOf(this.f3413c), Integer.valueOf(this.f3414d));
            }
            if (i2 < 18 && i2 < 17) {
                return c.b(Float.valueOf(this.f3411a.getTextSize()), Float.valueOf(this.f3411a.getTextScaleX()), Float.valueOf(this.f3411a.getTextSkewX()), Integer.valueOf(this.f3411a.getFlags()), this.f3411a.getTypeface(), this.f3412b, Integer.valueOf(this.f3413c), Integer.valueOf(this.f3414d));
            }
            return c.b(Float.valueOf(this.f3411a.getTextSize()), Float.valueOf(this.f3411a.getTextScaleX()), Float.valueOf(this.f3411a.getTextSkewX()), Integer.valueOf(this.f3411a.getFlags()), this.f3411a.getTextLocale(), this.f3411a.getTypeface(), this.f3412b, Integer.valueOf(this.f3413c), Integer.valueOf(this.f3414d));
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00df  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 325
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: y.a.C0040a.toString():java.lang.String");
        }
    }

    public C0040a a() {
        return this.f3409c;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f3408b;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i2) {
        return this.f3408b.charAt(i2);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f3408b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f3408b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f3408b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f3410d.getSpans(i2, i3, cls) : (T[]) this.f3408b.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f3408b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f3408b.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3410d.removeSpan(obj);
        } else {
            this.f3408b.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3410d.setSpan(obj, i2, i3, i4);
        } else {
            this.f3408b.setSpan(obj, i2, i3, i4);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i2, int i3) {
        return this.f3408b.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f3408b.toString();
    }
}
