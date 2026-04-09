package ps;

import br.l;

/* loaded from: classes.dex */
public final class e extends xu.d {
    public final String j;
    public final String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, String str2) {
        super(18);
        l.e(str, "name");
        l.e(str2, "desc");
        this.j = str;
        this.k = str2;
    }

    @Override // xu.d
    public final String d() {
        return this.j + this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.j, eVar.j) && l.a(this.k, eVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + (this.j.hashCode() * 31);
    }
}
