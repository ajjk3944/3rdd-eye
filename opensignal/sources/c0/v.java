package c0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public float f3109a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3110b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f3109a, vVar.f3109a) == 0 && this.f3110b == vVar.f3110b && br.l.a(null, null);
    }

    public final int hashCode() {
        return (w.g.b(Float.hashCode(this.f3109a) * 31, this.f3110b, 31) + 0) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f3109a + ", fill=" + this.f3110b + ", crossAxisAlignment=" + ((Object) null) + ", flowLayoutData=null)";
    }
}
