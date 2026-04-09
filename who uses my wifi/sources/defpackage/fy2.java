package defpackage;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class fy2 implements t9, u9 {
    public final pd2 f = new pd2();
    public final Object g = new Object();
    public boolean h = false;
    public boolean i = false;
    public fa2 j;
    public vw1 k;

    public static void b(Context context, pd2 pd2Var, Executor executor) {
        if (((Boolean) m02.j.w()).booleanValue() || ((Boolean) m02.h.w()).booleanValue()) {
            pd2Var.c(new jq3(pd2Var, new cy2(context), 0), executor);
        }
    }

    @Override // defpackage.t9
    public void T(int i) {
        gi2.U("Cannot connect to remote service, fallback to local instance.");
    }

    public void U(rh rhVar) {
        gi2.U("Disconnected from remote ad request service.");
        this.f.b(new my2(1));
    }

    public final void a() {
        synchronized (this.g) {
            try {
                this.i = true;
                if (this.k.a() || this.k.f()) {
                    this.k.k();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
