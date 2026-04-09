package defpackage;

import android.content.Context;
import android.os.Looper;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class md3 {
    public final Context a;
    public final Looper b;

    public md3(Context context, Looper looper) {
        this.a = context;
        this.b = looper;
    }

    public final void a(String str) {
        qd3 qd3VarA = rd3.A();
        Context context = this.a;
        String packageName = context.getPackageName();
        qd3VarA.b();
        ((rd3) qd3VarA.g).B(packageName);
        qd3VarA.b();
        ((rd3) qd3VarA.g).D(2);
        od3 od3VarA = pd3.A();
        od3VarA.b();
        ((pd3) od3VarA.g).B(str);
        od3VarA.b();
        ((pd3) od3VarA.g).C(2);
        qd3VarA.b();
        ((rd3) qd3VarA.g).C((pd3) od3VarA.d());
        m30 m30Var = new m30(context, this.b, (rd3) qd3VarA.d());
        synchronized (m30Var.j) {
            try {
                if (!m30Var.f) {
                    m30Var.f = true;
                    ((vd3) m30Var.h).n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
