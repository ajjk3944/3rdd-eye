package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qc1 extends cc1 {
    public final k01 b;

    public qc1(k01 k01Var) {
        super(4);
        this.b = k01Var;
    }

    @Override // defpackage.cc1
    public final boolean a(xb1 xb1Var) {
        if (xb1Var.k.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // defpackage.cc1
    public final ju[] b(xb1 xb1Var) {
        if (xb1Var.k.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // defpackage.cc1
    public final void c(Status status) {
        this.b.a(new y4(status));
    }

    @Override // defpackage.cc1
    public final void d(Exception exc) {
        this.b.a(exc);
    }

    @Override // defpackage.cc1
    public final void e(xb1 xb1Var) throws DeadObjectException {
        try {
            h(xb1Var);
        } catch (DeadObjectException e) {
            c(cc1.g(e));
            throw e;
        } catch (RemoteException e2) {
            c(cc1.g(e2));
        } catch (RuntimeException e3) {
            this.b.a(e3);
        }
    }

    public final void h(xb1 xb1Var) {
        if (xb1Var.k.remove(null) != null) {
            throw new ClassCastException();
        }
        k01 k01Var = this.b;
        Boolean bool = Boolean.FALSE;
        gi4 gi4Var = k01Var.a;
        synchronized (gi4Var.a) {
            try {
                if (gi4Var.c) {
                    return;
                }
                gi4Var.c = true;
                gi4Var.e = bool;
                gi4Var.b.g(gi4Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.cc1
    public final /* bridge */ /* synthetic */ void f(tb1 tb1Var, boolean z) {
    }
}
