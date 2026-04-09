package defpackage;

import android.content.Context;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ah2 {
    public final wg2 a;
    public final mv2 b;

    public ah2(wg2 wg2Var, mv2 mv2Var) {
        this.a = wg2Var;
        this.b = mv2Var;
    }

    public final void a(Context context, e51 e51Var) {
        iz1 iz1Var = mz1.we;
        tw1 tw1Var = tw1.e;
        kz1 kz1Var = tw1Var.c;
        kz1 kz1Var2 = tw1Var.c;
        if (((Boolean) kz1Var.a(iz1Var)).booleanValue()) {
            AbstractExecutorService threadPoolExecutor = md2.a;
            if (((Boolean) kz1Var2.a(mz1.ye)).booleanValue()) {
                zg2 zg2Var = new zg2(((Integer) kz1Var2.a(mz1.Ae)).intValue());
                int iIntValue = ((Integer) kz1Var2.a(mz1.ze)).intValue();
                threadPoolExecutor = new ThreadPoolExecutor(iIntValue, iIntValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zg2Var);
            }
            threadPoolExecutor.execute(new gi(this, context, e51Var, 17));
        }
    }
}
