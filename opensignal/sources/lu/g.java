package lu;

import java.util.List;

/* loaded from: classes.dex */
public final class g implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f15941a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final f f15942b = f.f15938b;

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        xu.d.c(cVar);
        return new e((List) new ku.c(n.f15951a).deserialize(cVar));
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return f15942b;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        e eVar = (e) obj;
        br.l.e(eVar, "value");
        xu.d.a(dVar);
        new ku.c(n.f15951a).serialize(dVar, eVar);
    }
}
