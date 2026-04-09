package X3;

import android.content.Context;
import android.graphics.Color;
import c4.AbstractC4224b;
import w1.AbstractC8253a;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    private static final int f24020f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f24021a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24022b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24023c;

    /* renamed from: d, reason: collision with root package name */
    private final int f24024d;

    /* renamed from: e, reason: collision with root package name */
    private final float f24025e;

    public a(Context context) {
        this(AbstractC4224b.b(context, O3.a.f16976o, false), V3.a.b(context, O3.a.f16975n, 0), V3.a.b(context, O3.a.f16974m, 0), V3.a.b(context, O3.a.f16972k, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean e(int i10) {
        return AbstractC8253a.k(i10, 255) == this.f24024d;
    }

    public float a(float f10) {
        if (this.f24025e <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        int i11;
        float fA = a(f10);
        int iAlpha = Color.alpha(i10);
        int iJ = V3.a.j(AbstractC8253a.k(i10, 255), this.f24022b, fA);
        if (fA > 0.0f && (i11 = this.f24023c) != 0) {
            iJ = V3.a.i(iJ, AbstractC8253a.k(i11, f24020f));
        }
        return AbstractC8253a.k(iJ, iAlpha);
    }

    public int c(int i10, float f10) {
        return (this.f24021a && e(i10)) ? b(i10, f10) : i10;
    }

    public boolean d() {
        return this.f24021a;
    }

    public a(boolean z10, int i10, int i11, int i12, float f10) {
        this.f24021a = z10;
        this.f24022b = i10;
        this.f24023c = i11;
        this.f24024d = i12;
        this.f24025e = f10;
    }
}
