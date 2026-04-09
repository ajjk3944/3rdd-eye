package pi;

import Bh.InterfaceC2503m;

/* loaded from: classes4.dex */
public interface q0 {

    public static final class a {
        public static /* synthetic */ r0 a(q0 q0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, v0 v0Var, InterfaceC2503m interfaceC2503m, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAttributes");
            }
            if ((i10 & 2) != 0) {
                v0Var = null;
            }
            if ((i10 & 4) != 0) {
                interfaceC2503m = null;
            }
            return q0Var.a(hVar, v0Var, interfaceC2503m);
        }
    }

    r0 a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, v0 v0Var, InterfaceC2503m interfaceC2503m);
}
