package z;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class P implements N {

    /* renamed from: a, reason: collision with root package name */
    private final float f66807a;

    /* renamed from: b, reason: collision with root package name */
    private final float f66808b;

    /* renamed from: c, reason: collision with root package name */
    private final float f66809c;

    /* renamed from: d, reason: collision with root package name */
    private final float f66810d;

    public /* synthetic */ P(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13);
    }

    @Override // z.N
    public float a(Y0.t tVar) {
        return tVar == Y0.t.Ltr ? this.f66807a : this.f66809c;
    }

    @Override // z.N
    public float b(Y0.t tVar) {
        return tVar == Y0.t.Ltr ? this.f66809c : this.f66807a;
    }

    @Override // z.N
    public float c() {
        return this.f66810d;
    }

    @Override // z.N
    public float d() {
        return this.f66808b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        return Y0.h.n(this.f66807a, p10.f66807a) && Y0.h.n(this.f66808b, p10.f66808b) && Y0.h.n(this.f66809c, p10.f66809c) && Y0.h.n(this.f66810d, p10.f66810d);
    }

    public int hashCode() {
        return (((((Y0.h.p(this.f66807a) * 31) + Y0.h.p(this.f66808b)) * 31) + Y0.h.p(this.f66809c)) * 31) + Y0.h.p(this.f66810d);
    }

    public String toString() {
        return "PaddingValues(start=" + ((Object) Y0.h.r(this.f66807a)) + ", top=" + ((Object) Y0.h.r(this.f66808b)) + ", end=" + ((Object) Y0.h.r(this.f66809c)) + ", bottom=" + ((Object) Y0.h.r(this.f66810d)) + ')';
    }

    private P(float f10, float f11, float f12, float f13) {
        this.f66807a = f10;
        this.f66808b = f11;
        this.f66809c = f12;
        this.f66810d = f13;
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        }
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        if (f12 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        }
        if (f13 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
    }
}
