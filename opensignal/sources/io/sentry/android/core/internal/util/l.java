package io.sentry.android.core.internal.util;

import android.view.PixelCopy;
import android.view.View;
import io.sentry.b5;
import io.sentry.x5;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11674a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11675b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11676c;

    public /* synthetic */ l(Object obj, int i10, Object obj2) {
        this.f11674a = i10;
        this.f11675b = obj;
        this.f11676c = obj2;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i10) {
        switch (this.f11674a) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f11675b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f11676c;
                atomicBoolean.set(i10 == 0);
                countDownLatch.countDown();
                break;
            default:
                fj.o oVar = (fj.o) this.f11675b;
                View view = (View) this.f11676c;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) oVar.f8952m;
                AtomicBoolean atomicBoolean3 = (AtomicBoolean) oVar.j;
                x5 x5Var = (x5) oVar.f8943b;
                if (!atomicBoolean2.get()) {
                    if (i10 == 0) {
                        if (!((AtomicBoolean) oVar.f8951l).get()) {
                            io.sentry.android.replay.viewhierarchy.f fVarU = vc.e.u(view, null, x5Var);
                            se.b.c0(view, fVarU, x5Var);
                            ((ScheduledExecutorService) oVar.f8945d).submit(new io.sentry.android.replay.util.c(new ch.a(oVar, fVarU, view, 8), "screenshot_recorder.mask"));
                            break;
                        } else {
                            x5Var.getLogger().m(b5.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
                            atomicBoolean3.set(false);
                            break;
                        }
                    } else {
                        x5Var.getLogger().m(b5.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i10));
                        atomicBoolean3.set(false);
                        break;
                    }
                } else {
                    x5Var.getLogger().m(b5.DEBUG, "PixelCopyStrategy is closed, ignoring capture result", new Object[0]);
                    break;
                }
        }
    }
}
