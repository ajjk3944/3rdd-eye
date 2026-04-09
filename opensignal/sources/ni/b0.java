package ni;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f17669a;

    /* renamed from: b, reason: collision with root package name */
    public final Float f17670b;

    public b0(Integer num, Float f10) {
        this.f17669a = num;
        this.f17670b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return br.l.a(this.f17669a, b0Var.f17669a) && br.l.a(this.f17670b, b0Var.f17670b);
    }

    public final int hashCode() {
        Integer num = this.f17669a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Float f10 = this.f17670b;
        return iHashCode + (f10 != null ? f10.hashCode() : 0);
    }

    public final String toString() {
        return "LightSensorCoreResult(lightAccuracy=" + this.f17669a + ", lightValue=" + this.f17670b + ')';
    }
}
