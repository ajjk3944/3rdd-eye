package h2;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final u f9881a;

    public v(u uVar) {
        this.f9881a = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return br.l.a(this.f9881a, ((v) obj).f9881a);
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f9881a;
        if (uVar != null) {
            return uVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.f9881a + ')';
    }
}
