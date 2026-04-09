package defpackage;

import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class u23 implements fd1, xp2 {
    public b12 f;

    @Override // defpackage.fd1
    public final synchronized void C() {
        b12 b12Var = this.f;
        if (b12Var != null) {
            try {
                b12Var.y();
            } catch (RemoteException unused) {
                gi2.q0(5);
            }
        }
    }

    @Override // defpackage.xp2
    public final synchronized void U0() {
    }

    @Override // defpackage.xp2
    public final synchronized void s0() {
        b12 b12Var = this.f;
        if (b12Var != null) {
            try {
                b12Var.y();
            } catch (RemoteException unused) {
                gi2.q0(5);
            }
        }
    }
}
