package ui;

import Bh.InterfaceC2515z;
import Bh.s0;
import fi.AbstractC5833e;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import ui.f;

/* loaded from: classes4.dex */
final class m implements f {

    /* renamed from: a, reason: collision with root package name */
    public static final m f63099a = new m();

    /* renamed from: b, reason: collision with root package name */
    private static final String f63100b = "should not have varargs or parameters with default values";

    private m() {
    }

    @Override // ui.f
    public String a() {
        return f63100b;
    }

    @Override // ui.f
    public boolean b(InterfaceC2515z functionDescriptor) {
        AbstractC6492s.i(functionDescriptor, "functionDescriptor");
        List listI = functionDescriptor.i();
        AbstractC6492s.h(listI, "getValueParameters(...)");
        List<s0> list = listI;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (s0 s0Var : list) {
            AbstractC6492s.f(s0Var);
            if (AbstractC5833e.f(s0Var) || s0Var.j0() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // ui.f
    public String c(InterfaceC2515z interfaceC2515z) {
        return f.a.a(this, interfaceC2515z);
    }
}
