package xd;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f25277a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f25278b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25279c;

    /* renamed from: d, reason: collision with root package name */
    public int f25280d;
    public boolean k;

    /* renamed from: m, reason: collision with root package name */
    public io.sentry.android.replay.capture.e f25287m;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f25281e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f25282f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f25283g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f25284h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f25285i = 1;
    public boolean j = true;

    /* renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f25286l = null;

    public f(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f25277a = charSequence;
        this.f25278b = textPaint;
        this.f25279c = i10;
        this.f25280d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f25277a == null) {
            this.f25277a = "";
        }
        int iMax = Math.max(0, this.f25279c);
        CharSequence charSequenceEllipsize = this.f25277a;
        int i10 = this.f25282f;
        TextPaint textPaint = this.f25278b;
        if (i10 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f25286l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f25280d);
        this.f25280d = iMin;
        if (this.k && this.f25282f == 1) {
            this.f25281e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f25281e);
        builderObtain.setIncludePad(this.j);
        builderObtain.setTextDirection(this.k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f25286l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f25282f);
        float f10 = this.f25283g;
        if (f10 != 0.0f || this.f25284h != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f25284h);
        }
        if (this.f25282f > 1) {
            builderObtain.setHyphenationFrequency(this.f25285i);
        }
        io.sentry.android.replay.capture.e eVar = this.f25287m;
        if (eVar != null) {
            builderObtain.setBreakStrategy(((TextInputLayout) eVar.f11882d).Q.getBreakStrategy());
        }
        return builderObtain.build();
    }
}
