package L0;

import Q0.AbstractC3434k;
import Zg.AbstractC3689v;
import java.util.List;

/* renamed from: L0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3189t {
    public static final InterfaceC3188s a(String str, U u10, List list, List list2, Y0.d dVar, AbstractC3434k.b bVar) {
        return T0.e.a(str, u10, list, list2, dVar, bVar);
    }

    public static /* synthetic */ InterfaceC3188s b(String str, U u10, List list, List list2, Y0.d dVar, AbstractC3434k.b bVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = AbstractC3689v.l();
        }
        List list3 = list;
        if ((i10 & 8) != 0) {
            list2 = AbstractC3689v.l();
        }
        return a(str, u10, list3, list2, dVar, bVar);
    }
}
