package m1;

/* loaded from: classes.dex */
public final class t extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f16247c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16248d;

    public t(float f10, float f11) {
        super(3);
        this.f16247c = f10;
        this.f16248d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Float.compare(this.f16247c, tVar.f16247c) == 0 && Float.compare(this.f16248d, tVar.f16248d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16248d) + (Float.hashCode(this.f16247c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeMoveTo(dx=");
        sb2.append(this.f16247c);
        sb2.append(", dy=");
        return h0.b.q(sb2, this.f16248d, ')');
    }
}
