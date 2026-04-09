package z;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
final class O extends D {

    /* renamed from: b, reason: collision with root package name */
    private final N f66806b;

    public O(N n10) {
        super(null);
        this.f66806b = n10;
    }

    @Override // z.D
    public f0 a(f0 f0Var) {
        return h0.d(h0.e(this.f66806b), f0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof O) {
            return AbstractC6492s.d(((O) obj).f66806b, this.f66806b);
        }
        return false;
    }

    public int hashCode() {
        return this.f66806b.hashCode();
    }
}
