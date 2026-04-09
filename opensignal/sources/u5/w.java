package u5;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final y f23354a;

    /* renamed from: b, reason: collision with root package name */
    public final y f23355b;

    public w(y yVar, y yVar2) {
        this.f23354a = yVar;
        this.f23355b = yVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (this.f23354a.equals(wVar.f23354a) && this.f23355b.equals(wVar.f23355b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f23355b.hashCode() + (this.f23354a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        y yVar = this.f23354a;
        sb2.append(yVar);
        y yVar2 = this.f23355b;
        if (yVar.equals(yVar2)) {
            str = "";
        } else {
            str = ", " + yVar2;
        }
        return w.g.j(sb2, str, "]");
    }
}
