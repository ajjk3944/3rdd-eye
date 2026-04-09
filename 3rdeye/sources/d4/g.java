package d4;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: StaticLayoutBuilderCompat.java */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f37500a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f37501b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37502c;

    /* renamed from: d, reason: collision with root package name */
    public int f37503d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f37508j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f37504e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f37505f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f37506g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public int f37507h = 1;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f37509k = null;

    /* compiled from: StaticLayoutBuilderCompat.java */
    public static class a extends Exception {
    }

    public g(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f37500a = charSequence;
        this.f37501b = textPaint;
        this.f37502c = i;
        this.f37503d = charSequence.length();
    }

    public final StaticLayout a() throws a {
        if (this.f37500a == null) {
            this.f37500a = "";
        }
        int iMax = Math.max(0, this.f37502c);
        CharSequence charSequenceEllipsize = this.f37500a;
        int i = this.f37505f;
        TextPaint textPaint = this.f37501b;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f37509k);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f37503d);
        this.f37503d = iMin;
        if (this.f37508j && this.f37505f == 1) {
            this.f37504e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f37504e);
        builderObtain.setIncludePad(this.i);
        builderObtain.setTextDirection(this.f37508j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f37509k;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f37505f);
        float f10 = this.f37506g;
        if (f10 != 1.0f) {
            builderObtain.setLineSpacing(0.0f, f10);
        }
        if (this.f37505f > 1) {
            builderObtain.setHyphenationFrequency(this.f37507h);
        }
        return builderObtain.build();
    }
}
