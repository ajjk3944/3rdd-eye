package p2;

import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import o.C7028t;

/* renamed from: p2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7210d {
    public static final void a(C7028t map, boolean z10, InterfaceC6835l fetchBlock) {
        AbstractC6492s.i(map, "map");
        AbstractC6492s.i(fetchBlock, "fetchBlock");
        C7028t c7028t = new C7028t(999);
        int iO = map.o();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iO) {
            if (z10) {
                c7028t.k(map.i(i10), map.p(i10));
            } else {
                c7028t.k(map.i(i10), null);
            }
            i10++;
            i11++;
            if (i11 == 999) {
                fetchBlock.invoke(c7028t);
                if (!z10) {
                    map.l(c7028t);
                }
                c7028t.b();
                i11 = 0;
            }
        }
        if (i11 > 0) {
            fetchBlock.invoke(c7028t);
            if (z10) {
                return;
            }
            map.l(c7028t);
        }
    }
}
