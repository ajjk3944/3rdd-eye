package gt;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9647a;

    /* renamed from: b, reason: collision with root package name */
    public final br.n f9648b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(Object obj, ar.a aVar) {
        this.f9647a = obj;
        this.f9648b = (br.n) aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && g.class == obj.getClass() && this.f9647a.equals(((g) obj).f9647a);
    }

    public final int hashCode() {
        return this.f9647a.hashCode();
    }
}
