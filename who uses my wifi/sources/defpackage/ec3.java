package defpackage;

import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ec3 implements Runnable {
    public final /* synthetic */ float f;
    public final /* synthetic */ bs2 g;

    public ec3(bs2 bs2Var, float f) {
        this.f = f;
        this.g = bs2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pc3 pc3Var = ((fc3) this.g.g).g;
        float f = this.f;
        pc3Var.a = f;
        if (pc3Var.c == null) {
            pc3Var.c = ic3.c;
        }
        Iterator it = Collections.unmodifiableCollection(pc3Var.c.b).iterator();
        while (it.hasNext()) {
            sc3 sc3Var = ((xb3) it.next()).d;
            fr.q.s(sc3Var.c(), "setDeviceVolume", Float.valueOf(f), sc3Var.a);
        }
    }
}
