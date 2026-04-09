package f0;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class m extends T2.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ T2.g f20002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f20003e;

    public m(T2.g gVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f20002d = gVar;
        this.f20003e = threadPoolExecutor;
    }

    @Override // T2.g
    public final void x(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f20003e;
        try {
            this.f20002d.x(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // T2.g
    public final void y(c1.g gVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f20003e;
        try {
            this.f20002d.y(gVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
