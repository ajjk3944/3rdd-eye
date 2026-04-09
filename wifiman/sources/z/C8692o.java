package z;

import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* renamed from: z.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8692o implements f0 {

    /* renamed from: b, reason: collision with root package name */
    private final f0 f66935b;

    /* renamed from: c, reason: collision with root package name */
    private final f0 f66936c;

    public C8692o(f0 f0Var, f0 f0Var2) {
        this.f66935b = f0Var;
        this.f66936c = f0Var2;
    }

    @Override // z.f0
    public int a(Y0.d dVar, Y0.t tVar) {
        return AbstractC7978m.d(this.f66935b.a(dVar, tVar) - this.f66936c.a(dVar, tVar), 0);
    }

    @Override // z.f0
    public int b(Y0.d dVar) {
        return AbstractC7978m.d(this.f66935b.b(dVar) - this.f66936c.b(dVar), 0);
    }

    @Override // z.f0
    public int c(Y0.d dVar) {
        return AbstractC7978m.d(this.f66935b.c(dVar) - this.f66936c.c(dVar), 0);
    }

    @Override // z.f0
    public int d(Y0.d dVar, Y0.t tVar) {
        return AbstractC7978m.d(this.f66935b.d(dVar, tVar) - this.f66936c.d(dVar, tVar), 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8692o)) {
            return false;
        }
        C8692o c8692o = (C8692o) obj;
        return AbstractC6492s.d(c8692o.f66935b, this.f66935b) && AbstractC6492s.d(c8692o.f66936c, this.f66936c);
    }

    public int hashCode() {
        return (this.f66935b.hashCode() * 31) + this.f66936c.hashCode();
    }

    public String toString() {
        return '(' + this.f66935b + " - " + this.f66936c + ')';
    }
}
