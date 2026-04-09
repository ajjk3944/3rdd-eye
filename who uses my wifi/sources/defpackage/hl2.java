package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hl2 implements p13 {
    public final List a;

    public hl2(List list) {
        this.a = list;
    }

    @Override // defpackage.p13
    public final void n() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            pu1.Q((n70) it.next(), new qd2(5), dq3.f);
        }
    }

    public hl2(el2 el2Var) {
        this.a = Collections.singletonList(pu1.r(el2Var));
    }
}
