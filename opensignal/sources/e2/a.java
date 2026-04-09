package e2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f7677a;

    /* renamed from: b, reason: collision with root package name */
    public final lq.e f7678b;

    public a(String str, lq.e eVar) {
        this.f7677a = str;
        this.f7678b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return br.l.a(this.f7677a, aVar.f7677a) && br.l.a(this.f7678b, aVar.f7678b);
    }

    public final int hashCode() {
        String str = this.f7677a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        lq.e eVar = this.f7678b;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f7677a + ", action=" + this.f7678b + ')';
    }
}
