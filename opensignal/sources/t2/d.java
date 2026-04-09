package t2;

/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    public final float f22382b;

    /* renamed from: c, reason: collision with root package name */
    public final float f22383c;

    public d(float f10, float f11) {
        this.f22382b = f10;
        this.f22383c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f22382b, dVar.f22382b) == 0 && Float.compare(this.f22383c, dVar.f22383c) == 0;
    }

    @Override // t2.c
    public final float getDensity() {
        return this.f22382b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f22383c) + (Float.hashCode(this.f22382b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.f22382b);
        sb2.append(", fontScale=");
        return h0.b.q(sb2, this.f22383c, ')');
    }

    @Override // t2.c
    public final float y() {
        return this.f22383c;
    }
}
