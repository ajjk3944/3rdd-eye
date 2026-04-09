package z;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8678a implements f0 {

    /* renamed from: b, reason: collision with root package name */
    private final f0 f66824b;

    /* renamed from: c, reason: collision with root package name */
    private final f0 f66825c;

    public C8678a(f0 f0Var, f0 f0Var2) {
        this.f66824b = f0Var;
        this.f66825c = f0Var2;
    }

    @Override // z.f0
    public int a(Y0.d dVar, Y0.t tVar) {
        return this.f66824b.a(dVar, tVar) + this.f66825c.a(dVar, tVar);
    }

    @Override // z.f0
    public int b(Y0.d dVar) {
        return this.f66824b.b(dVar) + this.f66825c.b(dVar);
    }

    @Override // z.f0
    public int c(Y0.d dVar) {
        return this.f66824b.c(dVar) + this.f66825c.c(dVar);
    }

    @Override // z.f0
    public int d(Y0.d dVar, Y0.t tVar) {
        return this.f66824b.d(dVar, tVar) + this.f66825c.d(dVar, tVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8678a)) {
            return false;
        }
        C8678a c8678a = (C8678a) obj;
        return AbstractC6492s.d(c8678a.f66824b, this.f66824b) && AbstractC6492s.d(c8678a.f66825c, this.f66825c);
    }

    public int hashCode() {
        return this.f66824b.hashCode() + (this.f66825c.hashCode() * 31);
    }

    public String toString() {
        return '(' + this.f66824b + " + " + this.f66825c + ')';
    }
}
