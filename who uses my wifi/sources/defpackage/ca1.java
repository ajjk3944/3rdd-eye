package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ca1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ ou0 g;
    public final /* synthetic */ da1 h;

    public /* synthetic */ ca1(da1 da1Var, ou0 ou0Var, int i) {
        this.f = i;
        this.h = da1Var;
        this.g = ou0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        ou0 ou0Var = this.g;
        da1 da1Var = this.h;
        switch (i) {
            case 0:
                ou0Var.k(da1Var.i.getForegroundInfoAsync());
                return;
            default:
                ou0 ou0Var2 = da1Var.f;
                ListenableWorker listenableWorker = da1Var.i;
                oa1 oa1Var = da1Var.h;
                try {
                    yv yvVar = (yv) ou0Var.get();
                    if (yvVar == null) {
                        throw new IllegalStateException("Worker was marked important (" + oa1Var.c + ") but did not provide ForegroundInfo");
                    }
                    h80 h80VarD = h80.d();
                    int i2 = da1.l;
                    String str = oa1Var.c;
                    h80VarD.a(new Throwable[0]);
                    listenableWorker.setRunInForeground(true);
                    fa1 fa1Var = da1Var.j;
                    Context context = da1Var.g;
                    UUID id = listenableWorker.getId();
                    fa1Var.getClass();
                    ou0 ou0Var3 = new ou0();
                    ((xb4) fa1Var.a).j(new ea1(fa1Var, ou0Var3, id, yvVar, context, 0));
                    ou0Var2.k(ou0Var3);
                    return;
                } catch (Throwable th) {
                    ou0Var2.j(th);
                    return;
                }
        }
    }
}
