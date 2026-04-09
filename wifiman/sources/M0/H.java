package M0;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f12349a;

    /* renamed from: b, reason: collision with root package name */
    private final TextPaint f12350b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12351c;

    /* renamed from: d, reason: collision with root package name */
    private float f12352d = Float.NaN;

    /* renamed from: e, reason: collision with root package name */
    private float f12353e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    private BoringLayout.Metrics f12354f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12355g;

    public H(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f12349a = charSequence;
        this.f12350b = textPaint;
        this.f12351c = i10;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f12355g) {
            this.f12354f = C3255k.f12411a.c(this.f12349a, this.f12350b, h0.k(this.f12351c));
            this.f12355g = true;
        }
        return this.f12354f;
    }

    public final float b() {
        if (!Float.isNaN(this.f12352d)) {
            return this.f12352d;
        }
        BoringLayout.Metrics metricsA = a();
        float fCeil = metricsA != null ? metricsA.width : -1;
        if (fCeil < 0.0f) {
            CharSequence charSequence = this.f12349a;
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.f12350b));
        }
        if (J.e(fCeil, this.f12349a, this.f12350b)) {
            fCeil += 0.5f;
        }
        this.f12352d = fCeil;
        return fCeil;
    }

    public final float c() {
        if (!Float.isNaN(this.f12353e)) {
            return this.f12353e;
        }
        float fC = J.c(this.f12349a, this.f12350b);
        this.f12353e = fC;
        return fC;
    }
}
