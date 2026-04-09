package r8;

import Cc.InterfaceC2557a;
import Dc.j;
import h9.C5969a;
import k8.m;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
public final class c extends m {
    public c() {
        super(new InterfaceC6839p() { // from class: r8.b
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(c.i((InterfaceC2557a) obj, (String) obj2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(InterfaceC2557a item, String filter) {
        String strY;
        String name;
        String strD;
        AbstractC6492s.i(item, "item");
        AbstractC6492s.i(filter, "filter");
        String name2 = item.getName();
        if (!(name2 != null ? t.U(name2, filter, true) : false)) {
            C5969a c5969aL = item.l();
            if (!((c5969aL == null || (strD = c5969aL.d(":")) == null) ? false : t.U(strD, filter, true))) {
                com.ui.wifiman.model.vendor.d dVarC = item.c();
                if (!((dVarC == null || (name = dVarC.getName()) == null) ? false : t.U(name, filter, true))) {
                    j jVarJ = item.j();
                    if (!((jVarJ == null || (strY = jVarJ.y()) == null) ? false : t.U(strY, filter, true))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
