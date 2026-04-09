package g0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public float f24111a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24112b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Float.compare(this.f24111a, e0Var.f24111a) == 0 && this.f24112b == e0Var.f24112b;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f24111a) * 31) + (this.f24112b ? 1231 : 1237)) * 961;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f24111a + ", fill=" + this.f24112b + ", crossAxisAlignment=null, flowLayoutData=null)";
    }
}
