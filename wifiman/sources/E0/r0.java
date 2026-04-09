package E0;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
final class r0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    private final C0.D f3978a;

    /* renamed from: b, reason: collision with root package name */
    private final P f3979b;

    public r0(C0.D d10, P p10) {
        this.f3978a = d10;
        this.f3979b = p10;
    }

    public final P a() {
        return this.f3979b;
    }

    public final C0.D b() {
        return this.f3978a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return AbstractC6492s.d(this.f3978a, r0Var.f3978a) && AbstractC6492s.d(this.f3979b, r0Var.f3979b);
    }

    @Override // E0.n0
    public boolean h0() {
        return this.f3979b.c1().M();
    }

    public int hashCode() {
        return (this.f3978a.hashCode() * 31) + this.f3979b.hashCode();
    }

    public String toString() {
        return "PlaceableResult(result=" + this.f3978a + ", placeable=" + this.f3979b + ')';
    }
}
