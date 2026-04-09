package z8;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f25393a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25394b;

    public b0(int i10, Object obj) {
        this.f25393a = i10;
        this.f25394b = obj;
    }

    public final int a() {
        return this.f25393a;
    }

    public final Object b() {
        return this.f25394b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f25393a == b0Var.f25393a && kotlin.jvm.internal.p.a(this.f25394b, b0Var.f25394b);
    }

    public int hashCode() {
        int i10 = this.f25393a * 31;
        Object obj = this.f25394b;
        return i10 + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f25393a + ", value=" + this.f25394b + ')';
    }
}
