package q8;

import Cc.InterfaceC2557a;
import h9.C5969a;
import k8.m;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import mh.InterfaceC6839p;
import wc.C8321a;

/* loaded from: classes3.dex */
public final class c extends m {
    public c() {
        super(new InterfaceC6839p() { // from class: q8.b
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(c.i((InterfaceC2557a) obj, (String) obj2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(InterfaceC2557a item, String filter) {
        String name;
        C5969a c5969aD;
        String strD;
        String strD2;
        AbstractC6492s.i(item, "item");
        AbstractC6492s.i(filter, "filter");
        String name2 = item.getName();
        if (!(name2 != null ? t.U(name2, filter, true) : false)) {
            C5969a c5969aL = item.l();
            if (!((c5969aL == null || (strD2 = c5969aL.d(":")) == null) ? false : t.U(strD2, filter, true))) {
                C8321a c8321aP = item.p();
                if (!((c8321aP == null || (c5969aD = c8321aP.d()) == null || (strD = c5969aD.d(":")) == null) ? false : t.U(strD, filter, true))) {
                    com.ui.wifiman.model.vendor.d dVarC = item.c();
                    if (!((dVarC == null || (name = dVarC.getName()) == null) ? false : t.U(name, filter, true))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
