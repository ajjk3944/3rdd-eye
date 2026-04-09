package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class u2 {
    public final Context a;
    public final x72 b;

    public u2(Context context, String str) {
        ou1.k(context, "context cannot be null");
        bu1 bu1Var = sv1.f.b;
        s62 s62Var = new s62();
        bu1Var.getClass();
        x72 x72Var = (x72) new no1(bu1Var, context, str, s62Var).d(context, false);
        this.a = context;
        this.b = x72Var;
    }

    public final v2 a() {
        Context context = this.a;
        try {
            return new v2(context, this.b.b());
        } catch (RemoteException e) {
            gi2.c0("Failed to build AdLoader.", e);
            return new v2(context, new p83(new y83()));
        }
    }

    public final void b(t2 t2Var) {
        try {
            this.b.v0(new dh3(t2Var));
        } catch (RemoteException unused) {
            gi2.q0(5);
        }
    }

    public final void c(jg0 jg0Var) {
        try {
            x72 x72Var = this.b;
            boolean z = jg0Var.a;
            boolean z2 = jg0Var.c;
            int i = jg0Var.d;
            l51 l51Var = jg0Var.e;
            x72Var.w1(new r12(4, z, -1, z2, i, l51Var != null ? new ih3(l51Var) : null, jg0Var.f, jg0Var.b, jg0Var.h, jg0Var.g, jg0Var.i - 1));
        } catch (RemoteException unused) {
            gi2.q0(5);
        }
    }
}
