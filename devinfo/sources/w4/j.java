package w4;

import com.google.android.gms.internal.play_billing.m1;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m1 f36440a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f36441b;

    public j(m1 m1Var, ThreadPoolExecutor threadPoolExecutor) {
        this.f36440a = m1Var;
        this.f36441b = threadPoolExecutor;
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void y(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.f36441b;
        try {
            this.f36440a.y(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void z(se.b bVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f36441b;
        try {
            this.f36440a.z(bVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
