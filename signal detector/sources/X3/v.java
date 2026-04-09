package x3;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f24164a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f24165b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24166c;

    /* renamed from: d, reason: collision with root package name */
    public int f24167d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f24173k;

    /* renamed from: m, reason: collision with root package name */
    public w f24175m;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f24168e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f24169f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f24170g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f24171h = 1.0f;
    public int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f24172j = true;

    /* renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f24174l = null;

    public v(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f24164a = charSequence;
        this.f24165b = textPaint;
        this.f24166c = i;
        this.f24167d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f24164a == null) {
            this.f24164a = "";
        }
        int iMax = Math.max(0, this.f24166c);
        CharSequence charSequenceEllipsize = this.f24164a;
        int i = this.f24169f;
        TextPaint textPaint = this.f24165b;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f24174l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f24167d);
        this.f24167d = iMin;
        if (this.f24173k && this.f24169f == 1) {
            this.f24168e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f24168e);
        builderObtain.setIncludePad(this.f24172j);
        builderObtain.setTextDirection(this.f24173k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f24174l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f24169f);
        float f2 = this.f24170g;
        if (f2 != 0.0f || this.f24171h != 1.0f) {
            builderObtain.setLineSpacing(f2, this.f24171h);
        }
        if (this.f24169f > 1) {
            builderObtain.setHyphenationFrequency(this.i);
        }
        w wVar = this.f24175m;
        if (wVar != null) {
            builderObtain.setBreakStrategy(((TextInputLayout) ((F4.c) wVar).f1455b).f18506I.getBreakStrategy());
        }
        return builderObtain.build();
    }
}
