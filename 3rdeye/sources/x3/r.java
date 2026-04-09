package x3;

/* compiled from: AutoValue_ExternalPrivacyContext.java */
/* loaded from: classes.dex */
public final class r extends B {

    /* renamed from: a, reason: collision with root package name */
    public final q f47732a;

    public r(q qVar) {
        this.f47732a = qVar;
    }

    @Override // x3.B
    public final A a() {
        return this.f47732a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        q qVar = this.f47732a;
        A a10 = ((B) obj).a();
        return qVar == null ? a10 == null : qVar.equals(a10);
    }

    public final int hashCode() {
        q qVar = this.f47732a;
        return (qVar == null ? 0 : qVar.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f47732a + "}";
    }
}
