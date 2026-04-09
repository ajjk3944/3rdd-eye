package j4;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class j extends kc.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kc.f f13218e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f13219f;

    public j(kc.f fVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f13218e = fVar;
        this.f13219f = threadPoolExecutor;
    }

    @Override // kc.f
    public final void J(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.f13219f;
        try {
            this.f13218e.J(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // kc.f
    public final void K(kg.r rVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f13219f;
        try {
            this.f13218e.K(rVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
