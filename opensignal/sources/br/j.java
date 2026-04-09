package br;

/* loaded from: classes.dex */
public abstract class j extends d implements i, ir.g {
    public final int B;
    public final int D;

    public j(int i10) {
        this(i10, c.f2901a, null, null, null, 0);
    }

    @Override // br.d
    public final ir.c A() {
        ir.c cVarG = g();
        if (cVarG != this) {
            return (ir.g) cVarG;
        }
        throw new zq.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return getName().equals(jVar.getName()) && B().equals(jVar.B()) && this.D == jVar.D && this.B == jVar.B && l.a(this.f2904d, jVar.f2904d) && l.a(z(), jVar.z());
        }
        if (obj instanceof ir.g) {
            return obj.equals(g());
        }
        return false;
    }

    @Override // br.i
    public final int f() {
        return this.B;
    }

    public final int hashCode() {
        return B().hashCode() + ((getName().hashCode() + (z() == null ? 0 : z().hashCode() * 31)) * 31);
    }

    @Override // br.d
    public final ir.c j() {
        return x.f2918a.a(this);
    }

    public final String toString() {
        ir.c cVarG = g();
        if (cVarG != this) {
            return cVarG.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public j(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    public j(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.B = i10;
        this.D = 0;
    }
}
