package pr;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final g f20628a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20629b;

    public e(g gVar, int i10) {
        this.f20628a = gVar;
        this.f20629b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f20628a == eVar.f20628a && this.f20629b == eVar.f20629b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20629b) + (this.f20628a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("KindWithArity(kind=");
        sb2.append(this.f20628a);
        sb2.append(", arity=");
        return c7.a.q(sb2, this.f20629b, ')');
    }
}
