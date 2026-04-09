package j2;

import android.os.Trace;
import android.view.MotionEvent;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f27183b;

    public /* synthetic */ i(r rVar, int i4) {
        this.f27182a = i4;
        this.f27183b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27182a) {
            case 0:
                r rVar = this.f27183b;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!rVar.f27265h.isEmpty()) {
                    try {
                        ((mk.a) rVar.f27265h.removeLast()).invoke();
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            default:
                r rVar2 = this.f27183b;
                rVar2.B0 = false;
                MotionEvent motionEvent = rVar2.f27289t0;
                nk.k.b(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                rVar2.K(motionEvent);
                return;
        }
    }
}
