package Nh;

import Nh.U;
import Zg.AbstractC3689v;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class b0 extends U {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Mh.k c10) {
        super(c10, null, 2, 0 == true ? 1 : 0);
        AbstractC6492s.i(c10, "c");
    }

    @Override // Nh.U
    protected void C(Zh.f name, Collection result) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(result, "result");
    }

    @Override // Nh.U
    protected Bh.b0 O() {
        return null;
    }

    @Override // Nh.U
    protected U.a Y(Qh.r method, List methodTypeParameters, pi.S returnType, List valueParameters) {
        AbstractC6492s.i(method, "method");
        AbstractC6492s.i(methodTypeParameters, "methodTypeParameters");
        AbstractC6492s.i(returnType, "returnType");
        AbstractC6492s.i(valueParameters, "valueParameters");
        return new U.a(returnType, null, valueParameters, methodTypeParameters, false, AbstractC3689v.l());
    }
}
