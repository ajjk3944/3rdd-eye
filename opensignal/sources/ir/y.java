package ir;

import lr.m1;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: c, reason: collision with root package name */
    public static final y f12942c = new y(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final z f12943a;

    /* renamed from: b, reason: collision with root package name */
    public final br.m f12944b;

    public y(z zVar, m1 m1Var) {
        String str;
        this.f12943a = zVar;
        this.f12944b = m1Var;
        if ((zVar == null) == (m1Var == null)) {
            return;
        }
        if (zVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + zVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f12943a == yVar.f12943a && br.l.a(this.f12944b, yVar.f12944b);
    }

    public final int hashCode() {
        z zVar = this.f12943a;
        int iHashCode = (zVar == null ? 0 : zVar.hashCode()) * 31;
        br.m mVar = this.f12944b;
        return iHashCode + (mVar != null ? mVar.hashCode() : 0);
    }

    public final String toString() {
        z zVar = this.f12943a;
        int i10 = zVar == null ? -1 : x.f12941a[zVar.ordinal()];
        if (i10 == -1) {
            return "*";
        }
        br.m mVar = this.f12944b;
        if (i10 == 1) {
            return String.valueOf(mVar);
        }
        if (i10 == 2) {
            return "in " + mVar;
        }
        if (i10 != 3) {
            throw new bf.n();
        }
        return "out " + mVar;
    }
}
