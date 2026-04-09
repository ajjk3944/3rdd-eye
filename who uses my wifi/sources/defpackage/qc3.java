package defpackage;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qc3 {
    public static final qc3 d;
    public WeakReference a;
    public boolean b;
    public boolean c;

    static {
        qc3 qc3Var = new qc3();
        qc3Var.b = false;
        qc3Var.c = false;
        d = qc3Var;
    }

    public final void a(boolean z, boolean z2) {
        if ((z2 || z) == (this.c || this.b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(ic3.c.a).iterator();
        while (it.hasNext()) {
            sc3 sc3Var = ((xb3) it.next()).d;
            boolean z3 = z2 || z;
            if (sc3Var.b.get() != 0) {
                fr.q.s(sc3Var.c(), "setDeviceLockState", true != z3 ? "unlocked" : "locked");
            }
        }
    }
}
