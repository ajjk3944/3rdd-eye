package P;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    private final Map f17936a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f17937b = new LinkedHashMap();

    public final k a(n nVar) {
        return (k) this.f17937b.get(nVar);
    }

    public final n b(k kVar) {
        return (n) this.f17936a.get(kVar);
    }

    public final void c(k kVar) {
        n nVar = (n) this.f17936a.get(kVar);
        if (nVar != null) {
        }
        this.f17936a.remove(kVar);
    }

    public final void d(k kVar, n nVar) {
        this.f17936a.put(kVar, nVar);
        this.f17937b.put(nVar, kVar);
    }
}
