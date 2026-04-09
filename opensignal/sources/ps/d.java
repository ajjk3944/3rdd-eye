package ps;

import br.l;

/* loaded from: classes.dex */
public final class d extends xu.d {
    public final String j;
    public final String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2) {
        super(18);
        l.e(str, "name");
        l.e(str2, "desc");
        this.j = str;
        this.k = str2;
    }

    @Override // xu.d
    public final String d() {
        return this.j + ':' + this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.j, dVar.j) && l.a(this.k, dVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + (this.j.hashCode() * 31);
    }
}
