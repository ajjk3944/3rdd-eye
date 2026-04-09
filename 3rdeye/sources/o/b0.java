package o;

import Q9.C1553s;
import android.content.Context;
import android.hardware.camera2.CameraDevice;
import f2.RunnableC4331a;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import v.C5664t;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f44624b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f44625c;

    public /* synthetic */ b0(Object obj, int i) {
        this.f44624b = i;
        this.f44625c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f44624b) {
            case 0:
                ((c0) this.f44625c).a();
                return;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC4331a((Context) this.f44625c, 5));
                return;
            case 2:
                ((CameraDevice) this.f44625c).close();
                return;
            case 3:
                C5664t.g.b bVar = (C5664t.g.b) this.f44625c;
                if (bVar.f46918c) {
                    return;
                }
                A2.l.q(null, C5664t.this.f46876f == C5664t.f.REOPENING || C5664t.this.f46876f == C5664t.f.REOPENING_QUIRK);
                if (C5664t.g.this.c()) {
                    C5664t.this.J(true);
                    return;
                } else {
                    C5664t.this.K(true);
                    return;
                }
            case 4:
                v.Y y10 = (v.Y) this.f44625c;
                synchronized (y10.f46642a) {
                    if (y10.f46643b.isEmpty()) {
                        return;
                    }
                    try {
                        y10.p(y10.f46643b);
                        return;
                    } finally {
                        y10.f46643b.clear();
                    }
                }
            default:
                C1553s this$0 = (C1553s) this.f44625c;
                kotlin.jvm.internal.l.f(this$0, "this$0");
                C.S.a("VideoUsageControl", "incrementUsage: mVideoUsage = " + ((AtomicInteger) this$0.f11528c).incrementAndGet());
                return;
        }
    }
}
