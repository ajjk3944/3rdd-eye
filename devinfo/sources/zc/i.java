package zc;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f38217a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f38218b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38219c;

    /* renamed from: d, reason: collision with root package name */
    public int f38220d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f38225k;

    /* renamed from: m, reason: collision with root package name */
    public ca.b f38227m;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f38221e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f38222f = Integer.MAX_VALUE;
    public float g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f38223h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f38224i = 1;
    public boolean j = true;

    /* renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f38226l = null;

    public i(CharSequence charSequence, TextPaint textPaint, int i4) {
        this.f38217a = charSequence;
        this.f38218b = textPaint;
        this.f38219c = i4;
        this.f38220d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f38217a == null) {
            this.f38217a = "";
        }
        int iMax = Math.max(0, this.f38219c);
        CharSequence charSequenceEllipsize = this.f38217a;
        int i4 = this.f38222f;
        TextPaint textPaint = this.f38218b;
        if (i4 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f38226l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f38220d);
        this.f38220d = iMin;
        if (this.f38225k && this.f38222f == 1) {
            this.f38221e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f38221e);
        builderObtain.setIncludePad(this.j);
        builderObtain.setTextDirection(this.f38225k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f38226l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f38222f);
        float f10 = this.g;
        if (f10 != 0.0f || this.f38223h != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f38223h);
        }
        if (this.f38222f > 1) {
            builderObtain.setHyphenationFrequency(this.f38224i);
        }
        ca.b bVar = this.f38227m;
        if (bVar != null) {
            builderObtain.setBreakStrategy(((TextInputLayout) bVar.f2827b).f20633u.getBreakStrategy());
        }
        return builderObtain.build();
    }
}
