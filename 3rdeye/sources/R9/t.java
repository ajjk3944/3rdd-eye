package R9;

import R9.AbstractC1564a;

/* compiled from: Json.kt */
/* loaded from: classes3.dex */
public final class t {
    public static s a(p9.l builderAction) {
        AbstractC1564a.C0160a from = AbstractC1564a.f11780d;
        kotlin.jvm.internal.l.f(from, "from");
        kotlin.jvm.internal.l.f(builderAction, "builderAction");
        C1568e c1568e = new C1568e();
        g gVar = from.f11781a;
        c1568e.f11791a = gVar.f11799a;
        c1568e.f11792b = gVar.f11802d;
        c1568e.f11793c = gVar.f11800b;
        c1568e.f11794d = gVar.f11801c;
        String str = gVar.f11803e;
        c1568e.f11795e = str;
        c1568e.f11796f = gVar.f11804f;
        c1568e.f11797g = gVar.f11805g;
        c1568e.f11798h = from.f11782b;
        builderAction.invoke(c1568e);
        if (!kotlin.jvm.internal.l.b(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        g gVar2 = new g(c1568e.f11791a, c1568e.f11793c, c1568e.f11794d, c1568e.f11792b, c1568e.f11795e, c1568e.f11796f, c1568e.f11797g);
        T9.a module = c1568e.f11798h;
        kotlin.jvm.internal.l.f(module, "module");
        s sVar = new s(gVar2, module);
        if (module.equals(T9.b.f12338a)) {
            return sVar;
        }
        module.f12333b.getClass();
        module.f12334c.getClass();
        module.f12335d.getClass();
        module.f12337f.getClass();
        return sVar;
    }
}
