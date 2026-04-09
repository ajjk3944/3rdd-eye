package pf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final w0 f31877a;

    /* renamed from: b, reason: collision with root package name */
    public final b f31878b;

    public o0(w0 w0Var, b bVar) {
        this.f31877a = w0Var;
        this.f31878b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f31877a.equals(o0Var.f31877a) && this.f31878b.equals(o0Var.f31878b);
    }

    public final int hashCode() {
        return this.f31878b.hashCode() + ((this.f31877a.hashCode() + (m.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + m.SESSION_START + ", sessionData=" + this.f31877a + ", applicationInfo=" + this.f31878b + ')';
    }
}
