package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class k52 extends g30 {
    public final Context a;
    public final fr b;
    public final ba2 c;
    public final long d;

    public k52(Context context, String str) {
        s62 s62Var = new s62();
        this.d = System.currentTimeMillis();
        new AtomicLong();
        this.a = context;
        new AtomicReference(str);
        this.b = fr.s;
        bu1 bu1Var = sv1.f.b;
        xe4 xe4Var = new xe4();
        bu1Var.getClass();
        this.c = (ba2) new fn1(bu1Var, context, xe4Var, str, s62Var).d(context, false);
    }

    @Override // defpackage.g30
    public final void b(yc0 yc0Var) {
        try {
            ba2 ba2Var = this.c;
            if (ba2Var != null) {
                ba2Var.o2(new fz1(yc0Var));
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.g30
    public final void c(Activity activity) {
        if (activity == null) {
            gi2.i0("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            ba2 ba2Var = this.c;
            if (ba2Var != null) {
                ba2Var.k3(new oi0(activity));
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    public final void d(e13 e13Var, um umVar) {
        try {
            ba2 ba2Var = this.c;
            if (ba2Var != null) {
                e13Var.m = this.d;
                fr frVar = this.b;
                Context context = this.a;
                frVar.getClass();
                ba2Var.a1(fr.o(context, e13Var), new gt3(umVar, this));
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
            umVar.q(new u70(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}
