package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ia1 implements Executor {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ ia1(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f) {
            case 0:
                ((Handler) ((xb4) this.g).h).post(runnable);
                return;
            case 1:
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    ((i63) this.g).post(runnable);
                    return;
                }
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    lf4 lf4Var = hg4.C.c;
                    Context context = hg4.C.h.e;
                    if (context != null) {
                        try {
                            if (((Boolean) f12.b.w()).booleanValue()) {
                                m54.a(context, th);
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    throw th;
                }
            case 2:
                ((wc1) this.g).post(runnable);
                return;
            default:
                ((Executor) this.g).execute(runnable);
                return;
        }
    }

    public ia1(int i) {
        this.f = i;
        switch (i) {
            case 2:
                wc1 wc1Var = new wc1(Looper.getMainLooper(), 1, false);
                Looper.getMainLooper();
                this.g = wc1Var;
                break;
            default:
                this.g = new i63(Looper.getMainLooper(), 2);
                break;
        }
    }
}
