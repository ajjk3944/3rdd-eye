package y0;

import br.l;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f25618a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f25619b;

    public g(int i10, Integer num) {
        this.f25618a = i10;
        this.f25619b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f25618a == gVar.f25618a && l.a(this.f25619b, gVar.f25619b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f25618a) * 31;
        Integer num = this.f25619b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ObjectLocation(group=");
        sb2.append(this.f25618a);
        sb2.append(", dataOffset=");
        return w.g.i(sb2, this.f25619b, ')');
    }
}
