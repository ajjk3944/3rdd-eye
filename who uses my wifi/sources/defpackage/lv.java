package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lv implements qr {
    public final Context f;
    public final g4 g;
    public final pz h;
    public final Object i = new Object();
    public Handler j;
    public ThreadPoolExecutor k;
    public ThreadPoolExecutor l;
    public ou1 m;

    public lv(Context context, g4 g4Var) {
        pu1.i(context, "Context cannot be null");
        this.f = context.getApplicationContext();
        this.g = g4Var;
        this.h = mv.d;
    }

    @Override // defpackage.qr
    public final void a(ou1 ou1Var) {
        synchronized (this.i) {
            this.m = ou1Var;
        }
        synchronized (this.i) {
            try {
                if (this.m == null) {
                    return;
                }
                if (this.k == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new kh("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.l = threadPoolExecutor;
                    this.k = threadPoolExecutor;
                }
                this.k.execute(new e2(7, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.i) {
            try {
                this.m = null;
                Handler handler = this.j;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.j = null;
                ThreadPoolExecutor threadPoolExecutor = this.l;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.k = null;
                this.l = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final wv c() {
        try {
            pz pzVar = this.h;
            Context context = this.f;
            g4 g4Var = this.g;
            pzVar.getClass();
            t3 t3VarM = gi2.m(context, g4Var);
            int i = t3VarM.g;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            wv[] wvVarArr = (wv[]) t3VarM.h;
            if (wvVarArr == null || wvVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return wvVarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
