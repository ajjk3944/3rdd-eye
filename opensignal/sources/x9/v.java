package x9;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final q f25207a;

    /* renamed from: b, reason: collision with root package name */
    public final Exception f25208b;

    public v(q qVar, Exception exc) {
        this.f25207a = qVar;
        this.f25208b = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f25207a.equals(vVar.f25207a)) {
            return this.f25208b.equals(vVar.f25208b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25208b.hashCode() + (this.f25207a.hashCode() * 31);
    }
}
