package l9;

import gg.i;
import gg.z;
import kg.n;
import kg.p;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: l9.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6561f {
    public static final i e(i iVar) {
        AbstractC6492s.i(iVar, "<this>");
        i iVarN0 = iVar.m0(new p() { // from class: l9.b
            @Override // kg.p
            public final boolean test(Object obj) {
                return AbstractC6561f.g((C6556a) obj);
            }
        }).N0(new n() { // from class: l9.c
            @Override // kg.n
            public final Object apply(Object obj) {
                return AbstractC6561f.h((C6556a) obj);
            }
        });
        AbstractC6492s.h(iVarN0, "filter { it.isNotNull }\n…      .map { it.value!! }");
        return iVarN0;
    }

    public static final gg.n f(z zVar) {
        AbstractC6492s.i(zVar, "<this>");
        gg.n filterNotNull = zVar.r(new p() { // from class: l9.d
            @Override // kg.p
            public final boolean test(Object obj) {
                return AbstractC6561f.i((C6556a) obj);
            }
        }).p(new n() { // from class: l9.e
            @Override // kg.n
            public final Object apply(Object obj) {
                return AbstractC6561f.j((C6556a) obj);
            }
        });
        AbstractC6492s.h(filterNotNull, "filterNotNull");
        return filterNotNull;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(C6556a c6556a) {
        return !(c6556a.b() == null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object h(C6556a c6556a) {
        Object objB = c6556a.b();
        AbstractC6492s.f(objB);
        return objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(C6556a c6556a) {
        return !(c6556a.b() == null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object j(C6556a c6556a) {
        Object objB = c6556a.b();
        AbstractC6492s.f(objB);
        return objB;
    }
}
