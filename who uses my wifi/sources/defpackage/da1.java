package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class da1 implements Runnable {
    public static final /* synthetic */ int l = 0;
    public final ou0 f = new ou0();
    public final Context g;
    public final oa1 h;
    public final ListenableWorker i;
    public final fa1 j;
    public final l01 k;

    static {
        h80.f("WorkForegroundRunnable");
    }

    public da1(Context context, oa1 oa1Var, ListenableWorker listenableWorker, fa1 fa1Var, xb4 xb4Var) {
        this.g = context;
        this.h = oa1Var;
        this.i = listenableWorker;
        this.j = fa1Var;
        this.k = xb4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.h.q || gc.a()) {
            this.f.i(null);
            return;
        }
        ou0 ou0Var = new ou0();
        xb4 xb4Var = (xb4) this.k;
        ((ia1) xb4Var.i).execute(new ca1(this, ou0Var, 0));
        ou0Var.c(new ca1(this, ou0Var, 1), (ia1) xb4Var.i);
    }
}
