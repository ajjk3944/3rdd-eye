package lu;

import java.util.Map;
import ku.c1;
import ku.g0;

/* loaded from: classes.dex */
public final class y implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public static final y f15964a = new y();

    /* renamed from: b, reason: collision with root package name */
    public static final x f15965b = x.f15961b;

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        xu.d.c(cVar);
        c1 c1Var = c1.f14534a;
        return new w((Map) new g0(n.f15951a).deserialize(cVar));
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return f15965b;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        w wVar = (w) obj;
        br.l.e(wVar, "value");
        xu.d.a(dVar);
        c1 c1Var = c1.f14534a;
        new g0(n.f15951a).serialize(dVar, wVar);
    }
}
