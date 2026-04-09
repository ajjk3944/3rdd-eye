package x4;

import android.content.Context;
import android.graphics.Color;
import androidx.annotation.NonNull;
import d5.b;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f24970f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24971a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24972b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24973c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24974d;

    /* renamed from: e, reason: collision with root package name */
    public final float f24975e;

    public a(@NonNull Context context) {
        this(b.b(context, j4.b.elevationOverlayEnabled, false), u4.a.b(context, j4.b.elevationOverlayColor, 0), u4.a.b(context, j4.b.elevationOverlayAccentColor, 0), u4.a.b(context, j4.b.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    public float a(float f10) {
        if (this.f24975e <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        int i11;
        float fA = a(f10);
        int iAlpha = Color.alpha(i10);
        int iJ = u4.a.j(j0.a.k(i10, 255), this.f24972b, fA);
        if (fA > 0.0f && (i11 = this.f24973c) != 0) {
            iJ = u4.a.i(iJ, j0.a.k(i11, f24970f));
        }
        return j0.a.k(iJ, iAlpha);
    }

    public int c(int i10, float f10) {
        return (this.f24971a && e(i10)) ? b(i10, f10) : i10;
    }

    public boolean d() {
        return this.f24971a;
    }

    public final boolean e(int i10) {
        return j0.a.k(i10, 255) == this.f24974d;
    }

    public a(boolean z10, int i10, int i11, int i12, float f10) {
        this.f24971a = z10;
        this.f24972b = i10;
        this.f24973c = i11;
        this.f24974d = i12;
        this.f24975e = f10;
    }
}
