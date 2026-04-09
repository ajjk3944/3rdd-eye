package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pc1 extends cc1 {
    public final rb b;
    public final k01 c;
    public final fr d;

    public pc1(int i, rb rbVar, k01 k01Var, fr frVar) {
        super(i);
        this.c = k01Var;
        this.b = rbVar;
        this.d = frVar;
        if (i == 2 && rbVar.c) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // defpackage.cc1
    public final boolean a(xb1 xb1Var) {
        return this.b.c;
    }

    @Override // defpackage.cc1
    public final ju[] b(xb1 xb1Var) {
        return (ju[]) this.b.d;
    }

    @Override // defpackage.cc1
    public final void c(Status status) {
        this.d.getClass();
        this.c.a(status.h != null ? new tp0(status) : new y4(status));
    }

    @Override // defpackage.cc1
    public final void d(Exception exc) {
        this.c.a(exc);
    }

    @Override // defpackage.cc1
    public final void e(xb1 xb1Var) throws DeadObjectException {
        k01 k01Var = this.c;
        try {
            rb rbVar = this.b;
            ((gp0) ((sq0) rbVar.e).g).accept(xb1Var.g, k01Var);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            c(cc1.g(e2));
        } catch (RuntimeException e3) {
            k01Var.a(e3);
        }
    }

    @Override // defpackage.cc1
    public final void f(tb1 tb1Var, boolean z) {
        Map map = tb1Var.b;
        Boolean boolValueOf = Boolean.valueOf(z);
        k01 k01Var = this.c;
        map.put(k01Var, boolValueOf);
        gi4 gi4Var = k01Var.a;
        gw3 gw3Var = new gw3(tb1Var, k01Var, 16);
        gi4Var.getClass();
        gi4Var.b.c(new mn2(m01.a, gw3Var));
        gi4Var.h();
    }
}
