package p2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f31036a;

    /* renamed from: b, reason: collision with root package name */
    public final yj.c f31037b;

    public a(String str, yj.c cVar) {
        this.f31036a = str;
        this.f31037b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return nk.k.a(this.f31036a, aVar.f31036a) && nk.k.a(this.f31037b, aVar.f31037b);
    }

    public final int hashCode() {
        String str = this.f31036a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        yj.c cVar = this.f31037b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f31036a + ", action=" + this.f31037b + ')';
    }
}
