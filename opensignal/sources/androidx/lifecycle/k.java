package androidx.lifecycle;

/* loaded from: classes.dex */
public final class k {
    public static m a(n nVar) {
        br.l.e(nVar, "state");
        int i10 = j.f1499a[nVar.ordinal()];
        if (i10 == 1) {
            return m.ON_DESTROY;
        }
        if (i10 == 2) {
            return m.ON_STOP;
        }
        if (i10 != 3) {
            return null;
        }
        return m.ON_PAUSE;
    }

    public static m b(n nVar) {
        br.l.e(nVar, "state");
        int i10 = j.f1499a[nVar.ordinal()];
        if (i10 == 1) {
            return m.ON_START;
        }
        if (i10 == 2) {
            return m.ON_RESUME;
        }
        if (i10 != 5) {
            return null;
        }
        return m.ON_CREATE;
    }
}
