package Jh;

import Bh.InterfaceC2492b;
import Bh.f0;
import fi.AbstractC5833e;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Jh.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3112f extends U {

    /* renamed from: o, reason: collision with root package name */
    public static final C3112f f10185o = new C3112f();

    private C3112f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(f0 f0Var, InterfaceC2492b it) {
        AbstractC6492s.i(it, "it");
        return U.f10160a.j().containsKey(Sh.C.d(f0Var));
    }

    public final Zh.f j(f0 functionDescriptor) {
        AbstractC6492s.i(functionDescriptor, "functionDescriptor");
        Map mapJ = U.f10160a.j();
        String strD = Sh.C.d(functionDescriptor);
        if (strD == null) {
            return null;
        }
        return (Zh.f) mapJ.get(strD);
    }

    public final boolean k(f0 functionDescriptor) {
        AbstractC6492s.i(functionDescriptor, "functionDescriptor");
        return kotlin.reflect.jvm.internal.impl.builtins.i.g0(functionDescriptor) && AbstractC5833e.i(functionDescriptor, false, new C3111e(functionDescriptor), 1, null) != null;
    }

    public final boolean m(f0 f0Var) {
        AbstractC6492s.i(f0Var, "<this>");
        return AbstractC6492s.d(f0Var.getName().b(), "removeAt") && AbstractC6492s.d(Sh.C.d(f0Var), U.f10160a.h().d());
    }
}
