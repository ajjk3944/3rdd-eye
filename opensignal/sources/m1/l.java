package m1;

/* loaded from: classes.dex */
public final class l extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f16219c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16220d;

    public l(float f10, float f11) {
        super(3);
        this.f16219c = f10;
        this.f16220d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Float.compare(this.f16219c, lVar.f16219c) == 0 && Float.compare(this.f16220d, lVar.f16220d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16220d) + (Float.hashCode(this.f16219c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MoveTo(x=");
        sb2.append(this.f16219c);
        sb2.append(", y=");
        return h0.b.q(sb2, this.f16220d, ')');
    }
}
