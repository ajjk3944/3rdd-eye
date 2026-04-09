package f0;

import android.os.Trace;
import android.view.View;
import h2.b0;
import h2.j0;
import io.sentry.android.core.ViewHierarchyEventProcessor;
import io.sentry.b5;
import io.sentry.protocol.f0;
import io.sentry.protocol.g0;
import io.sentry.u0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import k2.g;
import mq.w;
import t2.i;
import x0.f;
import x0.l;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8387a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8388d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f8389g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f8390r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f8391x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f8392y;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f8387a = i10;
        this.f8388d = obj;
        this.f8389g = obj2;
        this.f8390r = obj3;
        this.f8391x = obj4;
        this.f8392y = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x0.b bVarC;
        switch (this.f8387a) {
            case 0:
                j0 j0Var = (j0) this.f8388d;
                i iVar = (i) this.f8389g;
                String str = (String) this.f8390r;
                t2.c cVar = (t2.c) this.f8391x;
                g gVar = (g) this.f8392y;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    f fVarK = l.k();
                    x0.b bVar = fVarK instanceof x0.b ? (x0.b) fVarK : null;
                    if (bVar == null || (bVarC = bVar.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        f fVarJ = bVarC.j();
                        try {
                            j0 j0VarE = b0.e(j0Var, iVar);
                            w wVar = w.f16945a;
                            new o2.d(str, j0VarE, wVar, wVar, gVar, cVar).g();
                            bVarC.w().d();
                            return;
                        } finally {
                            f.q(fVarJ);
                        }
                    } finally {
                    }
                } finally {
                    Trace.endSection();
                }
            default:
                AtomicReference atomicReference = (AtomicReference) this.f8388d;
                View view = (View) this.f8389g;
                List list = (List) this.f8390r;
                CountDownLatch countDownLatch = (CountDownLatch) this.f8391x;
                u0 u0Var = (u0) this.f8392y;
                try {
                    ArrayList arrayList = new ArrayList(1);
                    f0 f0Var = new f0("android_view_system", arrayList);
                    g0 g0VarC = ViewHierarchyEventProcessor.c(view);
                    arrayList.add(g0VarC);
                    ViewHierarchyEventProcessor.a(view, g0VarC, list);
                    atomicReference.set(f0Var);
                    countDownLatch.countDown();
                    return;
                } catch (Throwable th2) {
                    u0Var.g(b5.ERROR, "Failed to process view hierarchy.", th2);
                    return;
                }
        }
    }
}
