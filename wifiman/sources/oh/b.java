package Oh;

import Bh.l0;
import Zg.d0;
import kotlin.jvm.internal.AbstractC6492s;
import pi.I0;

/* loaded from: classes4.dex */
public abstract class b {
    public static final a a(I0 i02, boolean z10, boolean z11, l0 l0Var) {
        AbstractC6492s.i(i02, "<this>");
        return new a(i02, null, z11, z10, l0Var != null ? d0.c(l0Var) : null, null, 34, null);
    }

    public static /* synthetic */ a b(I0 i02, boolean z10, boolean z11, l0 l0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            l0Var = null;
        }
        return a(i02, z10, z11, l0Var);
    }
}
