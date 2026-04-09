package S9;

import O9.k;
import O9.l;
import R9.AbstractC1564a;
import c9.C2099t;
import w9.InterfaceC5748c;

/* compiled from: WriteMode.kt */
/* loaded from: classes3.dex */
public final class U {
    public static final O9.e a(O9.e eVar, T9.a module) {
        kotlin.jvm.internal.l.f(eVar, "<this>");
        kotlin.jvm.internal.l.f(module, "module");
        if (!kotlin.jvm.internal.l.b(eVar.e(), k.a.f10521a)) {
            return eVar.isInline() ? a(eVar.i(0), module) : eVar;
        }
        InterfaceC5748c interfaceC5748cA = E.u.A(eVar);
        if (interfaceC5748cA == null) {
            return eVar;
        }
        module.Q(interfaceC5748cA, C2099t.f18581b);
        return eVar;
    }

    public static final T b(O9.e desc, AbstractC1564a abstractC1564a) {
        kotlin.jvm.internal.l.f(abstractC1564a, "<this>");
        kotlin.jvm.internal.l.f(desc, "desc");
        O9.k kVarE = desc.e();
        if (kVarE instanceof O9.c) {
            return T.POLY_OBJ;
        }
        if (kotlin.jvm.internal.l.b(kVarE, l.b.f10524a)) {
            return T.LIST;
        }
        if (!kotlin.jvm.internal.l.b(kVarE, l.c.f10525a)) {
            return T.OBJ;
        }
        O9.e eVarA = a(desc.i(0), abstractC1564a.f11782b);
        O9.k kVarE2 = eVarA.e();
        if ((kVarE2 instanceof O9.d) || kotlin.jvm.internal.l.b(kVarE2, k.b.f10522a)) {
            return T.MAP;
        }
        if (abstractC1564a.f11781a.f11801c) {
            return T.LIST;
        }
        throw E.u.g(eVarA);
    }
}
