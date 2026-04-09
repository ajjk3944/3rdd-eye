package Y0;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
final class g implements d {

    /* renamed from: a, reason: collision with root package name */
    private final float f24520a;

    /* renamed from: b, reason: collision with root package name */
    private final float f24521b;

    /* renamed from: c, reason: collision with root package name */
    private final Z0.a f24522c;

    public g(float f10, float f11, Z0.a aVar) {
        this.f24520a = f10;
        this.f24521b = f11;
        this.f24522c = aVar;
    }

    @Override // Y0.l
    public long e0(float f10) {
        return w.f(this.f24522c.a(f10));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f24520a, gVar.f24520a) == 0 && Float.compare(this.f24521b, gVar.f24521b) == 0 && AbstractC6492s.d(this.f24522c, gVar.f24522c);
    }

    @Override // Y0.d
    public float getDensity() {
        return this.f24520a;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f24520a) * 31) + Float.hashCode(this.f24521b)) * 31) + this.f24522c.hashCode();
    }

    @Override // Y0.l
    public float n0(long j10) {
        if (x.g(v.g(j10), x.f24553b.b())) {
            return h.j(this.f24522c.b(v.h(j10)));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public String toString() {
        return "DensityWithConverter(density=" + this.f24520a + ", fontScale=" + this.f24521b + ", converter=" + this.f24522c + ')';
    }

    @Override // Y0.l
    public float y() {
        return this.f24521b;
    }
}
