package z;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
final class G implements N {

    /* renamed from: a, reason: collision with root package name */
    private final f0 f66797a;

    /* renamed from: b, reason: collision with root package name */
    private final Y0.d f66798b;

    public G(f0 f0Var, Y0.d dVar) {
        this.f66797a = f0Var;
        this.f66798b = dVar;
    }

    @Override // z.N
    public float a(Y0.t tVar) {
        Y0.d dVar = this.f66798b;
        return dVar.x(this.f66797a.d(dVar, tVar));
    }

    @Override // z.N
    public float b(Y0.t tVar) {
        Y0.d dVar = this.f66798b;
        return dVar.x(this.f66797a.a(dVar, tVar));
    }

    @Override // z.N
    public float c() {
        Y0.d dVar = this.f66798b;
        return dVar.x(this.f66797a.b(dVar));
    }

    @Override // z.N
    public float d() {
        Y0.d dVar = this.f66798b;
        return dVar.x(this.f66797a.c(dVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return AbstractC6492s.d(this.f66797a, g10.f66797a) && AbstractC6492s.d(this.f66798b, g10.f66798b);
    }

    public int hashCode() {
        return (this.f66797a.hashCode() * 31) + this.f66798b.hashCode();
    }

    public String toString() {
        return "InsetsPaddingValues(insets=" + this.f66797a + ", density=" + this.f66798b + ')';
    }
}
