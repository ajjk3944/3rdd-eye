package O4;

import java.util.concurrent.Callable;

/* compiled from: CrashlyticsBackgroundWorker.java */
/* renamed from: O4.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC1466l implements Callable<Void> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f10318a;

    public CallableC1466l(x xVar) {
        this.f10318a = xVar;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        this.f10318a.run();
        return null;
    }
}
