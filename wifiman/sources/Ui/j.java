package ui;

import Bh.InterfaceC2515z;
import Bh.s0;
import fi.AbstractC5833e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import pi.S;
import si.AbstractC7984d;
import ui.f;

/* loaded from: classes4.dex */
final class j implements f {

    /* renamed from: a, reason: collision with root package name */
    public static final j f63093a = new j();

    /* renamed from: b, reason: collision with root package name */
    private static final String f63094b = "second parameter must be of type KProperty<*> or its supertype";

    private j() {
    }

    @Override // ui.f
    public String a() {
        return f63094b;
    }

    @Override // ui.f
    public boolean b(InterfaceC2515z functionDescriptor) {
        AbstractC6492s.i(functionDescriptor, "functionDescriptor");
        s0 s0Var = (s0) functionDescriptor.i().get(1);
        n.b bVar = kotlin.reflect.jvm.internal.impl.builtins.n.f51756k;
        AbstractC6492s.f(s0Var);
        S sA = bVar.a(AbstractC5833e.s(s0Var));
        if (sA == null) {
            return false;
        }
        S type = s0Var.getType();
        AbstractC6492s.h(type, "getType(...)");
        return AbstractC7984d.w(sA, AbstractC7984d.A(type));
    }

    @Override // ui.f
    public String c(InterfaceC2515z interfaceC2515z) {
        return f.a.a(this, interfaceC2515z);
    }
}
