package zh;

import Bh.InterfaceC2495e;
import Zg.AbstractC3689v;
import ii.AbstractC6159f;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import oi.n;
import zh.AbstractC8767f;

/* renamed from: zh.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8765d extends AbstractC6159f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8765d(n storageManager, C8763b containingClass) {
        super(storageManager, containingClass);
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(containingClass, "containingClass");
    }

    @Override // ii.AbstractC6159f
    protected List j() {
        InterfaceC2495e interfaceC2495eM = m();
        AbstractC6492s.g(interfaceC2495eM, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        AbstractC8767f abstractC8767fU0 = ((C8763b) interfaceC2495eM).U0();
        return AbstractC6492s.d(abstractC8767fU0, AbstractC8767f.a.f67310e) ? AbstractC3689v.e(C8766e.f67305E.a((C8763b) m(), false)) : AbstractC6492s.d(abstractC8767fU0, AbstractC8767f.d.f67313e) ? AbstractC3689v.e(C8766e.f67305E.a((C8763b) m(), true)) : AbstractC3689v.l();
    }
}
