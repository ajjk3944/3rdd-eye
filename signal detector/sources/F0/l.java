package f0;

import android.view.View;
import java.util.concurrent.ThreadPoolExecutor;
import k0.C2601e;
import k0.C2605i;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19998a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19999b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20000c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20001d;

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, int i) {
        this.f19998a = i;
        this.f19999b = obj;
        this.f20000c = obj2;
        this.f20001d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19998a) {
            case 0:
                J2.i iVar = (J2.i) this.f19999b;
                T2.g gVar = (T2.g) this.f20000c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f20001d;
                try {
                    r rVarD = R3.b.d(iVar.f2065b);
                    if (rVarD == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    q qVar = (q) rVarD.f20013a;
                    synchronized (qVar.f20007d) {
                        qVar.f20009f = threadPoolExecutor;
                    }
                    rVarD.f20013a.b(new m(gVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    gVar.x(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                C2605i c2605i = (C2605i) this.f19999b;
                View view = (View) this.f20000c;
                C2601e c2601e = (C2601e) this.f20001d;
                q5.i.e(c2605i, "this$0");
                q5.i.e(c2601e, "$animationInfo");
                c2605i.f21636a.endViewTransition(view);
                c2601e.f();
                return;
        }
    }
}
