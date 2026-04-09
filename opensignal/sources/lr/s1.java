package lr;

/* loaded from: classes.dex */
public final class s1 extends t1 {

    /* renamed from: d, reason: collision with root package name */
    public final br.n f15684d;

    /* renamed from: g, reason: collision with root package name */
    public volatile Object f15685g = null;

    /* JADX WARN: Multi-variable type inference failed */
    public s1(ar.a aVar) {
        this.f15684d = (br.n) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ar.a, br.n] */
    public final Object c() {
        Object obj = t1.f15694a;
        Object obj2 = this.f15685g;
        if (obj2 != null) {
            if (obj2 == obj) {
                return null;
            }
            return obj2;
        }
        Object objC = this.f15684d.c();
        if (objC != null) {
            obj = objC;
        }
        this.f15685g = obj;
        return objC;
    }
}
