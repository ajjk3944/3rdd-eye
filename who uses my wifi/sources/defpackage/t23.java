package defpackage;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t23 implements bo2 {
    public final AtomicReference f = new AtomicReference();

    @Override // defpackage.bo2
    public final void h(dg4 dg4Var) {
        Object obj = this.f.get();
        if (obj == null) {
            return;
        }
        try {
            ((zu2) obj).R1(dg4Var);
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        } catch (NullPointerException unused) {
            gi2.q0(5);
        }
    }
}
