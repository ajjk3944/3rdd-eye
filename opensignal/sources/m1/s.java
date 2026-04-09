package m1;

/* loaded from: classes.dex */
public final class s extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f16245c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16246d;

    public s(float f10, float f11) {
        super(3);
        this.f16245c = f10;
        this.f16246d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f16245c, sVar.f16245c) == 0 && Float.compare(this.f16246d, sVar.f16246d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16246d) + (Float.hashCode(this.f16245c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeLineTo(dx=");
        sb2.append(this.f16245c);
        sb2.append(", dy=");
        return h0.b.q(sb2, this.f16246d, ')');
    }
}
