package Hh;

import Bh.InterfaceC2495e;
import Bh.M;
import Ih.b;
import Ih.c;
import Zh.f;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class a {
    public static final void a(c cVar, b from, InterfaceC2495e scopeOwner, f name) {
        AbstractC6492s.i(cVar, "<this>");
        AbstractC6492s.i(from, "from");
        AbstractC6492s.i(scopeOwner, "scopeOwner");
        AbstractC6492s.i(name, "name");
        if (cVar == c.a.f9229a) {
            return;
        }
        from.getLocation();
    }

    public static final void b(c cVar, b from, M scopeOwner, f name) {
        AbstractC6492s.i(cVar, "<this>");
        AbstractC6492s.i(from, "from");
        AbstractC6492s.i(scopeOwner, "scopeOwner");
        AbstractC6492s.i(name, "name");
        String strB = scopeOwner.e().b();
        AbstractC6492s.h(strB, "asString(...)");
        String strB2 = name.b();
        AbstractC6492s.h(strB2, "asString(...)");
        c(cVar, from, strB, strB2);
    }

    public static final void c(c cVar, b from, String packageFqName, String name) {
        AbstractC6492s.i(cVar, "<this>");
        AbstractC6492s.i(from, "from");
        AbstractC6492s.i(packageFqName, "packageFqName");
        AbstractC6492s.i(name, "name");
        if (cVar == c.a.f9229a) {
            return;
        }
        from.getLocation();
    }
}
