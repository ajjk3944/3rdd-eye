package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ur extends ou1 {
    public final /* synthetic */ ou1 w;
    public final /* synthetic */ ThreadPoolExecutor x;

    public ur(ou1 ou1Var, ThreadPoolExecutor threadPoolExecutor) {
        this.w = ou1Var;
        this.x = threadPoolExecutor;
    }

    @Override // defpackage.ou1
    public final void r(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.x;
        try {
            this.w.r(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.ou1
    public final void s(mc2 mc2Var) {
        ThreadPoolExecutor threadPoolExecutor = this.x;
        try {
            this.w.s(mc2Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
