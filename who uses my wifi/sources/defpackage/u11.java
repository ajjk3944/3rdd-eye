package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class u11 extends ht0 implements Runnable {
    public final long j;

    /* JADX WARN: Illegal instructions before constructor call */
    public u11(long j, v11 v11Var) {
        hk hkVar = v11Var.g;
        i30.j(hkVar);
        super(hkVar, v11Var);
        this.j = j;
    }

    @Override // defpackage.g40
    public final String H() {
        return super.H() + "(timeMillis=" + this.j + ')';
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        fk fkVarH = this.h.h(pz.h);
        if ((fkVarH instanceof zn ? (zn) fkVarH : null) == null) {
            zn znVar = bn.a;
        }
        o(new t11("Timed out waiting for " + this.j + " ms", this));
    }
}
