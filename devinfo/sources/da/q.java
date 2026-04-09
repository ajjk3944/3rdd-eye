package da;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q extends c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f22153a;

    public q(Integer num) {
        this.f22153a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        Integer num = this.f22153a;
        q qVar = (q) ((c0) obj);
        return num == null ? qVar.f22153a == null : num.equals(qVar.f22153a);
    }

    public final int hashCode() {
        Integer num = this.f22153a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f22153a + "}";
    }
}
