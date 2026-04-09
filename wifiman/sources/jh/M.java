package Jh;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class M implements K {

    /* renamed from: b, reason: collision with root package name */
    private final Map f10154b;

    /* renamed from: c, reason: collision with root package name */
    private final oi.f f10155c;

    /* renamed from: d, reason: collision with root package name */
    private final oi.h f10156d;

    public M(Map states) {
        AbstractC6492s.i(states, "states");
        this.f10154b = states;
        oi.f fVar = new oi.f("Java nullability annotation states");
        this.f10155c = fVar;
        oi.h hVarI = fVar.i(new L(this));
        AbstractC6492s.h(hVarI, "createMemoizedFunctionWithNullableValues(...)");
        this.f10156d = hVarI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(M m10, Zh.c cVar) {
        AbstractC6492s.f(cVar);
        return Zh.e.a(cVar, m10.f10154b);
    }

    @Override // Jh.K
    public Object a(Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        return this.f10156d.invoke(fqName);
    }
}
