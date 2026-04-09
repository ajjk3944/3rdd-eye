package Ci;

import Ci.f;
import Ci.g;
import Di.l;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import zi.InterfaceC8780j;

/* loaded from: classes4.dex */
public abstract class a {
    public static final f a() {
        return l.b();
    }

    public static final f b(Object... elements) {
        AbstractC6492s.i(elements, "elements");
        return l.b().addAll((Collection) AbstractC3682n.e(elements));
    }

    public static final g c() {
        return Fi.c.f6690e.a();
    }

    public static final h d() {
        return Gi.b.f7505e.a();
    }

    public static final h e(Object... elements) {
        AbstractC6492s.i(elements, "elements");
        return Gi.b.f7505e.a().addAll((Collection) AbstractC3682n.e(elements));
    }

    public static final f f(f fVar, Iterable elements) {
        AbstractC6492s.i(fVar, "<this>");
        AbstractC6492s.i(elements, "elements");
        if (elements instanceof Collection) {
            return fVar.addAll((Collection) elements);
        }
        f.a aVarC = fVar.c();
        AbstractC3689v.C(aVarC, elements);
        return aVarC.a();
    }

    public static final f g(f fVar, InterfaceC8780j elements) {
        AbstractC6492s.i(fVar, "<this>");
        AbstractC6492s.i(elements, "elements");
        f.a aVarC = fVar.c();
        AbstractC3689v.D(aVarC, elements);
        return aVarC.a();
    }

    public static final c h(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        c cVar = iterable instanceof c ? (c) iterable : null;
        return cVar == null ? k(iterable) : cVar;
    }

    public static final c i(InterfaceC8780j interfaceC8780j) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        return l(interfaceC8780j);
    }

    public static final d j(Map map) {
        AbstractC6492s.i(map, "<this>");
        d dVar = map instanceof d ? (d) map : null;
        if (dVar != null) {
            return dVar;
        }
        g.a aVar = map instanceof g.a ? (g.a) map : null;
        g gVarA = aVar != null ? aVar.a() : null;
        return gVarA != null ? gVarA : c().putAll(map);
    }

    public static final f k(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        f fVar = iterable instanceof f ? (f) iterable : null;
        if (fVar != null) {
            return fVar;
        }
        f.a aVar = iterable instanceof f.a ? (f.a) iterable : null;
        f fVarA = aVar != null ? aVar.a() : null;
        return fVarA == null ? f(a(), iterable) : fVarA;
    }

    public static final f l(InterfaceC8780j interfaceC8780j) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        return g(a(), interfaceC8780j);
    }
}
