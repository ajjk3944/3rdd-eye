package m1;

/* loaded from: classes.dex */
public final class k extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f16217c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16218d;

    public k(float f10, float f11) {
        super(3);
        this.f16217c = f10;
        this.f16218d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Float.compare(this.f16217c, kVar.f16217c) == 0 && Float.compare(this.f16218d, kVar.f16218d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16218d) + (Float.hashCode(this.f16217c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineTo(x=");
        sb2.append(this.f16217c);
        sb2.append(", y=");
        return h0.b.q(sb2, this.f16218d, ')');
    }
}
