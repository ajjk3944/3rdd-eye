package kotlinx.coroutines;

/* loaded from: classes4.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f22302a;

    /* renamed from: b, reason: collision with root package name */
    public final l9.l f22303b;

    public d0(Object obj, l9.l lVar) {
        this.f22302a = obj;
        this.f22303b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return kotlin.jvm.internal.p.a(this.f22302a, d0Var.f22302a) && kotlin.jvm.internal.p.a(this.f22303b, d0Var.f22303b);
    }

    public int hashCode() {
        Object obj = this.f22302a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f22303b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f22302a + ", onCancellation=" + this.f22303b + ')';
    }
}
