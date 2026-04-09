package je;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f27564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f27565b;

    public l(m mVar, long j) {
        this.f27565b = mVar;
        this.f27564a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f27564a);
        this.f27565b.f27576k.j(bundle);
        return null;
    }
}
