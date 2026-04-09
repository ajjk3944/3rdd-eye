package ch;

import android.content.Context;
import android.os.Bundle;
import cj.t;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import p.l2;

/* loaded from: classes.dex */
public final class j implements Thread.UncaughtExceptionHandler {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f3955g = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final Context f3956a;

    /* renamed from: d, reason: collision with root package name */
    public final l2 f3957d;

    public j(Context context, cj.a aVar, l2 l2Var) {
        this.f3956a = context;
        this.f3957d = l2Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        br.l.e(thread, "thread");
        br.l.e(th2, "exception");
        n.c("SdkExceptionHandler", "Uncaught Exception occurred on thread: " + thread.getName());
        n.c("SdkExceptionHandler", "Exception message: " + th2.getMessage());
        cj.a.G(th2);
        Context context = this.f3956a;
        n.b("SdkExceptionHandler", "restartSdk() called");
        if (f3955g.getAndSet(true)) {
            n.b("SdkExceptionHandler", "Sdk already restarted");
        } else {
            n.b("SdkExceptionHandler", "Restarting sdk monitoring.");
            try {
                l lVar = l.f3962t5;
                lVar.k();
                Bundle bundle = new Bundle();
                ic.a.F(bundle, "EXECUTION_TYPE", cj.e.STOP_MONITORING);
                t.a(context, bundle);
                if (this.f3957d.D()) {
                    lVar.k();
                    Bundle bundle2 = new Bundle();
                    ic.a.F(bundle2, "EXECUTION_TYPE", cj.e.START_MONITORING);
                    t.a(context, bundle2);
                }
                n.b("SdkExceptionHandler", "Sdk restarted successfully.");
            } catch (Exception e4) {
                n.b("SdkExceptionHandler", "Sdk restart error.");
                n.d("SdkExceptionHandler", "Exception occurred when restarting the SDK.", e4);
                cj.a.E(e4, "SdkExceptionHandler:Exception occurred when restarting the SDK");
            }
        }
        thread.interrupt();
    }
}
