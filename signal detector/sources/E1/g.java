package e1;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public String f19906a;

    /* renamed from: b, reason: collision with root package name */
    public int f19907b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f19907b != gVar.f19907b) {
            return false;
        }
        return this.f19906a.equals(gVar.f19906a);
    }

    public final int hashCode() {
        return AbstractC2984e.c(this.f19907b) + (this.f19906a.hashCode() * 31);
    }
}
