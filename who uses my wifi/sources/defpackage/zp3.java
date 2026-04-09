package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zp3 extends tp3 {
    public List u;

    public zp3(xm3 xm3Var, boolean z) {
        List arrayList;
        super(xm3Var, z, true);
        if (xm3Var.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            int size = xm3Var.size();
            ob1.z("initialArraySize", size);
            arrayList = new ArrayList(size);
        }
        for (int i = 0; i < xm3Var.size(); i++) {
            arrayList.add(null);
        }
        this.u = arrayList;
        v();
    }

    @Override // defpackage.tp3
    public final void r(int i) {
        this.q = null;
        this.u = null;
    }

    @Override // defpackage.tp3
    public final void w(int i, Object obj) {
        List list = this.u;
        if (list != null) {
            list.set(i, new aq3(obj));
        }
    }

    @Override // defpackage.tp3
    public final void x() {
        List<aq3> list = this.u;
        if (list != null) {
            int size = list.size();
            ob1.z("initialArraySize", size);
            ArrayList arrayList = new ArrayList(size);
            for (aq3 aq3Var : list) {
                arrayList.add(aq3Var != null ? aq3Var.a : null);
            }
            d(Collections.unmodifiableList(arrayList));
        }
    }
}
