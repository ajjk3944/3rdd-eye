package M6;

import N7.G7;

/* compiled from: DivPagerPageOffsetProvider.kt */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f4270a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4271b;

    /* renamed from: c, reason: collision with root package name */
    public final n f4272c;

    /* renamed from: d, reason: collision with root package name */
    public final j f4273d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4274e;

    /* renamed from: f, reason: collision with root package name */
    public final C0795a f4275f;

    /* renamed from: g, reason: collision with root package name */
    public final G7.a f4276g;

    public m(int i, float f10, n nVar, j jVar, boolean z10, C0795a c0795a, G7.a aVar) {
        this.f4270a = i;
        this.f4271b = f10;
        this.f4272c = nVar;
        this.f4273d = jVar;
        this.f4274e = z10;
        this.f4275f = c0795a;
        this.f4276g = aVar;
    }

    public static float a(float f10) {
        float fAbs = Math.abs(f10);
        return fAbs - ((float) Math.floor(fAbs));
    }

    public final float b(float f10, int i, int i10) {
        n nVar = this.f4272c;
        Float f11 = nVar.f(i);
        if (f11 != null) {
            float fFloatValue = f11.floatValue();
            Float f12 = nVar.f(i10);
            if (f12 != null) {
                return ((f12.floatValue() * f10) + ((1 - f10) * fFloatValue)) - this.f4273d.f4257g;
            }
        }
        return 0.0f;
    }

    public final float c(int i, int i10) {
        int i11 = i10 > 0 ? i : i + 1;
        n nVar = this.f4272c;
        Float f10 = nVar.f(i11);
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            if (i10 > 0) {
                i--;
            }
            Float fE = nVar.e(i);
            if (fE != null) {
                return ((fE.floatValue() + fFloatValue) - this.f4271b) * i10;
            }
        }
        return 0.0f;
    }
}
