package androidx.compose.ui.layout;

import C0.D;
import C0.InterfaceC2535o;
import Zg.U;
import java.util.Map;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public interface m extends InterfaceC2535o {
    static /* synthetic */ D x0(m mVar, int i10, int i11, Map map, InterfaceC6835l interfaceC6835l, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i12 & 4) != 0) {
            map = U.h();
        }
        return mVar.v1(i10, i11, map, interfaceC6835l);
    }

    D i1(int i10, int i11, Map map, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2);

    default D v1(int i10, int i11, Map map, InterfaceC6835l interfaceC6835l) {
        return i1(i10, i11, map, null, interfaceC6835l);
    }
}
