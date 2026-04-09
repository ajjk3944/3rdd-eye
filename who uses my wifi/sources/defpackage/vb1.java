package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class vb1 implements Executor {
    public final /* synthetic */ int f;
    public final /* synthetic */ Handler g;

    public /* synthetic */ vb1(Handler handler, int i) {
        this.f = i;
        this.g = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f) {
            case 0:
                this.g.post(runnable);
                break;
            case 1:
                this.g.post(runnable);
                break;
            case 2:
                this.g.post(runnable);
                break;
            case 3:
                this.g.post(runnable);
                break;
            default:
                this.g.post(runnable);
                break;
        }
    }

    public vb1(f20 f20Var, Handler handler) {
        this.f = 1;
        this.g = handler;
    }
}
