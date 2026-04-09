package z;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
final class Q implements f0 {

    /* renamed from: b, reason: collision with root package name */
    private final N f66811b;

    public Q(N n10) {
        this.f66811b = n10;
    }

    @Override // z.f0
    public int a(Y0.d dVar, Y0.t tVar) {
        return dVar.x1(this.f66811b.b(tVar));
    }

    @Override // z.f0
    public int b(Y0.d dVar) {
        return dVar.x1(this.f66811b.c());
    }

    @Override // z.f0
    public int c(Y0.d dVar) {
        return dVar.x1(this.f66811b.d());
    }

    @Override // z.f0
    public int d(Y0.d dVar, Y0.t tVar) {
        return dVar.x1(this.f66811b.a(tVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Q) {
            return AbstractC6492s.d(((Q) obj).f66811b, this.f66811b);
        }
        return false;
    }

    public int hashCode() {
        return this.f66811b.hashCode();
    }

    public String toString() {
        Y0.t tVar = Y0.t.Ltr;
        return "PaddingValues(" + ((Object) Y0.h.r(this.f66811b.a(tVar))) + ", " + ((Object) Y0.h.r(this.f66811b.d())) + ", " + ((Object) Y0.h.r(this.f66811b.b(tVar))) + ", " + ((Object) Y0.h.r(this.f66811b.c())) + ')';
    }
}
