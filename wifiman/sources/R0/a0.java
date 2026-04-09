package R0;

import L0.C3174d;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3174d f19452a;

    /* renamed from: b, reason: collision with root package name */
    private final H f19453b;

    public a0(C3174d c3174d, H h10) {
        this.f19452a = c3174d;
        this.f19453b = h10;
    }

    public final H a() {
        return this.f19453b;
    }

    public final C3174d b() {
        return this.f19452a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return AbstractC6492s.d(this.f19452a, a0Var.f19452a) && AbstractC6492s.d(this.f19453b, a0Var.f19453b);
    }

    public int hashCode() {
        return (this.f19452a.hashCode() * 31) + this.f19453b.hashCode();
    }

    public String toString() {
        return "TransformedText(text=" + ((Object) this.f19452a) + ", offsetMapping=" + this.f19453b + ')';
    }
}
