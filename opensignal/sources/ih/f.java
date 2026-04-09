package ih;

import bc.e0;
import io.sentry.android.core.o0;
import io.sentry.p;
import io.sentry.transport.o;
import io.sentry.v3;
import io.sentry.y0;
import java.util.Iterator;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class f extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11392a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11393d;

    public /* synthetic */ f(int i10, Object obj) {
        this.f11392a = i10;
        this.f11393d = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ih.c, mi.f] */
    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f11392a) {
            case 0:
                h hVar = (h) this.f11393d;
                hVar.f11371d = true;
                hVar.d();
                hVar.g("STOP", null);
                ?? r02 = hVar.f11385t;
                if (r02 != 0) {
                    r02.e();
                    break;
                }
                break;
            case 1:
                Iterator it = ((p) this.f11393d).f12485d.iterator();
                while (it.hasNext()) {
                    ((y0) it.next()).c();
                }
                break;
            case 2:
                o0 o0Var = (o0) this.f11393d;
                v3 v3Var = o0Var.f11713y;
                if (o0Var.B) {
                    v3Var.o();
                }
                v3Var.k().getReplayController().stop();
                v3Var.k().getContinuousProfiler().a(false);
                break;
            case 3:
                io.sentry.transport.p pVar = (io.sentry.transport.p) this.f11393d;
                Iterator it2 = ((CopyOnWriteArrayList) pVar.f12779x).iterator();
                while (it2.hasNext()) {
                    ((o) it2.next()).q(pVar);
                }
                break;
            default:
                ((kh.g) ((e0) this.f11393d).f2600r).b(d.UPLOAD);
                break;
        }
    }
}
