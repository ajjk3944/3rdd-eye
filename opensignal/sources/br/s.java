package br;

/* loaded from: classes.dex */
public abstract class s extends d implements ir.v {
    public final boolean B;

    public s(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.B = (i10 & 2) == 2;
    }

    @Override // br.d
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final ir.v A() {
        if (this.B) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        ir.c cVarG = g();
        if (cVarG != this) {
            return (ir.v) cVarG;
        }
        throw new zq.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return z().equals(sVar.z()) && this.f2906r.equals(sVar.f2906r) && this.f2907x.equals(sVar.f2907x) && l.a(this.f2904d, sVar.f2904d);
        }
        if (obj instanceof ir.v) {
            return obj.equals(g());
        }
        return false;
    }

    @Override // br.d
    public final ir.c g() {
        return this.B ? this : super.g();
    }

    public final int hashCode() {
        return this.f2907x.hashCode() + c7.a.g(this.f2906r, z().hashCode() * 31, 31);
    }

    public final String toString() {
        ir.c cVarG = g();
        return cVarG != this ? cVarG.toString() : w.g.j(new StringBuilder("property "), this.f2906r, " (Kotlin reflection is not available)");
    }
}
