package r;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class K implements I {

    /* renamed from: a, reason: collision with root package name */
    private final float f59484a;

    /* renamed from: b, reason: collision with root package name */
    private final float f59485b;

    /* renamed from: c, reason: collision with root package name */
    private final float f59486c;

    /* renamed from: d, reason: collision with root package name */
    private final C7528f0 f59487d;

    public K(float f10, float f11, float f12) {
        this.f59484a = f10;
        this.f59485b = f11;
        this.f59486c = f12;
        C7528f0 c7528f0 = new C7528f0(1.0f);
        c7528f0.d(f10);
        c7528f0.f(f11);
        this.f59487d = c7528f0;
    }

    @Override // r.I
    public float b(long j10, float f10, float f11, float f12) {
        this.f59487d.e(f11);
        return V.c(this.f59487d.g(f10, f12, j10 / 1000000));
    }

    @Override // r.I
    public long c(float f10, float f11, float f12) {
        float fB = this.f59487d.b();
        float fA = this.f59487d.a();
        float f13 = f10 - f11;
        float f14 = this.f59486c;
        return AbstractC7526e0.b(fB, fA, f12 / f14, f13 / f14, 1.0f) * 1000000;
    }

    @Override // r.I
    public float d(float f10, float f11, float f12) {
        return 0.0f;
    }

    @Override // r.I
    public float e(long j10, float f10, float f11, float f12) {
        this.f59487d.e(f11);
        return V.b(this.f59487d.g(f10, f12, j10 / 1000000));
    }

    public /* synthetic */ K(float f10, float f11, float f12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? 0.01f : f12);
    }
}
