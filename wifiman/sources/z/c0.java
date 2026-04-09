package z;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
final class c0 implements f0 {

    /* renamed from: b, reason: collision with root package name */
    private final f0 f66857b;

    /* renamed from: c, reason: collision with root package name */
    private final f0 f66858c;

    public c0(f0 f0Var, f0 f0Var2) {
        this.f66857b = f0Var;
        this.f66858c = f0Var2;
    }

    @Override // z.f0
    public int a(Y0.d dVar, Y0.t tVar) {
        return Math.max(this.f66857b.a(dVar, tVar), this.f66858c.a(dVar, tVar));
    }

    @Override // z.f0
    public int b(Y0.d dVar) {
        return Math.max(this.f66857b.b(dVar), this.f66858c.b(dVar));
    }

    @Override // z.f0
    public int c(Y0.d dVar) {
        return Math.max(this.f66857b.c(dVar), this.f66858c.c(dVar));
    }

    @Override // z.f0
    public int d(Y0.d dVar, Y0.t tVar) {
        return Math.max(this.f66857b.d(dVar, tVar), this.f66858c.d(dVar, tVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return AbstractC6492s.d(c0Var.f66857b, this.f66857b) && AbstractC6492s.d(c0Var.f66858c, this.f66858c);
    }

    public int hashCode() {
        return this.f66857b.hashCode() + (this.f66858c.hashCode() * 31);
    }

    public String toString() {
        return '(' + this.f66857b + " ∪ " + this.f66858c + ')';
    }
}
