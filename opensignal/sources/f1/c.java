package f1;

import w.g;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f8403e = new c(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f8404a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8405b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8406c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8407d;

    public c(float f10, float f11, float f12, float f13) {
        this.f8404a = f10;
        this.f8405b = f11;
        this.f8406c = f12;
        this.f8407d = f13;
    }

    public final long a() {
        float f10 = this.f8406c;
        float f11 = this.f8404a;
        float f12 = ((f10 - f11) / 2.0f) + f11;
        float f13 = this.f8407d;
        float f14 = this.f8405b;
        return (Float.floatToRawIntBits(((f13 - f14) / 2.0f) + f14) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
    }

    public final c b(float f10, float f11) {
        return new c(this.f8404a + f10, this.f8405b + f11, this.f8406c + f10, this.f8407d + f11);
    }

    public final c c(long j) {
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        return new c(Float.intBitsToFloat(i10) + this.f8404a, Float.intBitsToFloat(i11) + this.f8405b, Float.intBitsToFloat(i10) + this.f8406c, Float.intBitsToFloat(i11) + this.f8407d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f8404a, cVar.f8404a) == 0 && Float.compare(this.f8405b, cVar.f8405b) == 0 && Float.compare(this.f8406c, cVar.f8406c) == 0 && Float.compare(this.f8407d, cVar.f8407d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8407d) + g.a(g.a(Float.hashCode(this.f8404a) * 31, this.f8405b, 31), this.f8406c, 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + ic.a.P(this.f8404a) + ", " + ic.a.P(this.f8405b) + ", " + ic.a.P(this.f8406c) + ", " + ic.a.P(this.f8407d) + ')';
    }
}
