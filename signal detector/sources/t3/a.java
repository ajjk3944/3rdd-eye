package t3;

import android.content.Context;
import android.graphics.Color;
import com.apm.insight.R;
import com.bumptech.glide.e;
import d5.y;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f23665f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23666a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23667b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23668c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23669d;

    /* renamed from: e, reason: collision with root package name */
    public final float f23670e;

    public a(Context context) {
        boolean zO = y.o(context, R.attr.elevationOverlayEnabled, false);
        int iN = e.n(context, R.attr.elevationOverlayColor, 0);
        int iN2 = e.n(context, R.attr.elevationOverlayAccentColor, 0);
        int iN3 = e.n(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f23666a = zO;
        this.f23667b = iN;
        this.f23668c = iN2;
        this.f23669d = iN3;
        this.f23670e = f2;
    }

    public final int a(int i, float f2) {
        int i3;
        if (!this.f23666a || J.a.e(i, 255) != this.f23669d) {
            return i;
        }
        float fMin = (this.f23670e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iT = e.t(fMin, J.a.e(i, 255), this.f23667b);
        if (fMin > 0.0f && (i3 = this.f23668c) != 0) {
            iT = J.a.c(J.a.e(i3, f23665f), iT);
        }
        return J.a.e(iT, iAlpha);
    }
}
