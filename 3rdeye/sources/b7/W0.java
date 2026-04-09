package b7;

import a7.C1665b;
import a7.C1666c;
import a7.g;
import c9.C2097r;
import java.util.ArrayList;

/* compiled from: FunctionValidator.kt */
/* loaded from: classes.dex */
public final class W0 {
    public static C1665b a(String str, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return new C1665b(null, "Function requires non empty argument list.");
        }
        return new C1665b(null, "Function has no matching overload for given argument types: " + C1666c.f(arrayList) + '.');
    }

    public static final C1665b b(String str, ArrayList arrayList) {
        if (arrayList.size() == 1) {
            return new C1665b(null, "Method requires non empty argument list.");
        }
        return new C1665b(null, "Method has no matching overload for given argument types: " + C1666c.f(arrayList.subList(1, arrayList.size())) + '.');
    }

    public static final void c(a7.g gVar, ArrayList arrayList) {
        kotlin.jvm.internal.l.f(gVar, "<this>");
        g.b bVarG = gVar.g(arrayList, a7.h.f14225g);
        if (bVarG instanceof g.b.c) {
            return;
        }
        if (bVarG instanceof g.b.a) {
            StringBuilder sb = new StringBuilder();
            a7.j jVar = (a7.j) C2097r.w0(gVar.b());
            sb.append(jVar != null ? jVar.f14228b : false ? "At least" : "Exactly");
            sb.append(' ');
            throw new C1665b(null, B4.i.j(sb, ((g.b.a) bVarG).f14219a, " argument(s) expected."));
        }
        if (!(bVarG instanceof g.b.C0225b)) {
            throw new b9.j();
        }
        if (kotlin.jvm.internal.l.b(gVar.i(arrayList), g.b.c.f14222a)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Invalid argument type: expected ");
        g.b.C0225b c0225b = (g.b.C0225b) bVarG;
        sb2.append(c0225b.f14220a);
        sb2.append(", got ");
        sb2.append(c0225b.f14221b);
        sb2.append('.');
        throw new C1665b(null, sb2.toString());
    }
}
