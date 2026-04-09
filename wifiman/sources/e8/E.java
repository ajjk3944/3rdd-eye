package E8;

import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
public final class E extends k8.m {
    public E() {
        super(new InterfaceC6839p() { // from class: E8.D
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(E.i((com.ui.wifiman.model.speedtest.result.b) obj, (String) obj2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(com.ui.wifiman.model.speedtest.result.b result, String filter) {
        AbstractC6492s.i(result, "result");
        AbstractC6492s.i(filter, "filter");
        String strH = result.j().h();
        if (strH != null) {
            return kotlin.text.t.U(strH, filter, true);
        }
        return true;
    }
}
