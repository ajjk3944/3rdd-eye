package m1;

/* loaded from: classes.dex */
public final class w extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f16257c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16258d;

    public w(float f10, float f11) {
        super(1);
        this.f16257c = f10;
        this.f16258d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f16257c, wVar.f16257c) == 0 && Float.compare(this.f16258d, wVar.f16258d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16258d) + (Float.hashCode(this.f16257c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb2.append(this.f16257c);
        sb2.append(", dy=");
        return h0.b.q(sb2, this.f16258d, ')');
    }
}
