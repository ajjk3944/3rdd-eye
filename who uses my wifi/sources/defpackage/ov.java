package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ov implements ui {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ov(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ui
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                pv pvVar = (pv) obj;
                if (pvVar == null) {
                    pvVar = new pv(-3);
                }
                ((gw3) this.b).v(pvVar);
                return;
            default:
                pv pvVar2 = (pv) obj;
                synchronized (qv.c) {
                    try {
                        bw0 bw0Var = qv.d;
                        ArrayList arrayList = (ArrayList) bw0Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        bw0Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((ui) arrayList.get(i)).accept(pvVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
