package tg;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final m f22813a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f22814b;

    /* renamed from: c, reason: collision with root package name */
    public final b f22815c;

    public k0(m mVar, s0 s0Var, b bVar) {
        br.l.e(mVar, "eventType");
        this.f22813a = mVar;
        this.f22814b = s0Var;
        this.f22815c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f22813a == k0Var.f22813a && br.l.a(this.f22814b, k0Var.f22814b) && br.l.a(this.f22815c, k0Var.f22815c);
    }

    public final int hashCode() {
        return this.f22815c.hashCode() + ((this.f22814b.hashCode() + (this.f22813a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + this.f22813a + ", sessionData=" + this.f22814b + ", applicationInfo=" + this.f22815c + ')';
    }
}
