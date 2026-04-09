package defpackage;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hb2 {
    public final ya2 a;
    public final Context b;
    public final ob2 c;
    public final long d;

    public hb2(Context context, String str) {
        bu1 bu1Var = sv1.f.b;
        s62 s62Var = new s62();
        bu1Var.getClass();
        ya2 ya2Var = (ya2) new ld1(bu1Var, context, str, s62Var).d(context, false);
        this.d = System.currentTimeMillis();
        new AtomicLong();
        this.b = context.getApplicationContext();
        new AtomicReference(str);
        this.a = ya2Var;
        this.c = new ob2();
    }

    public static void a(Context context, String str, b3 b3Var, bx2 bx2Var) {
        ou1.k(context, "Context cannot be null.");
        ou1.k(str, "AdUnitId cannot be null.");
        ou1.h("#008 Must be called on the main UI thread.");
        mz1.a(context);
        if (((Boolean) q02.k.w()).booleanValue()) {
            if (((Boolean) tw1.e.c.a(mz1.Wb)).booleanValue()) {
                uu1.b.execute(new vd(context, str, b3Var, bx2Var, 7, false));
                return;
            }
        }
        gi2.U("Loading on UI thread");
        new hb2(context, str).b(b3Var.a, bx2Var);
    }

    public final void b(e13 e13Var, bx2 bx2Var) {
        try {
            ya2 ya2Var = this.a;
            if (ya2Var != null) {
                e13Var.m = this.d;
                ya2Var.q2(fr.o(this.b, e13Var), new lb2(bx2Var, this, 0));
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }
}
