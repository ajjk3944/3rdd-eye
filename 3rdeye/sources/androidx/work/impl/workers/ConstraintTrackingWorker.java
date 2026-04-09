package androidx.work.impl.workers;

import A4.a;
import C.V;
import X1.b;
import X1.d;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.l;
import androidx.work.m;
import b2.C1842w;
import b9.C1992A;
import d2.C4268c;

/* compiled from: ConstraintTrackingWorker.kt */
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends l implements d {

    /* renamed from: b, reason: collision with root package name */
    public final WorkerParameters f16939b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16940c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f16941d;

    /* renamed from: e, reason: collision with root package name */
    public final C4268c<l.a> f16942e;

    /* renamed from: f, reason: collision with root package name */
    public l f16943f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        kotlin.jvm.internal.l.f(appContext, "appContext");
        kotlin.jvm.internal.l.f(workerParameters, "workerParameters");
        this.f16939b = workerParameters;
        this.f16940c = new Object();
        this.f16942e = new C4268c<>();
    }

    @Override // X1.d
    public final void a(C1842w c1842w, b state) {
        kotlin.jvm.internal.l.f(state, "state");
        m.e().a(f2.b.f37814a, "Constraints changed for " + c1842w);
        if (state instanceof b.C0195b) {
            synchronized (this.f16940c) {
                this.f16941d = true;
                C1992A c1992a = C1992A.f18074a;
            }
        }
    }

    @Override // androidx.work.l
    public final void onStopped() {
        super.onStopped();
        l lVar = this.f16943f;
        if (lVar == null || lVar.isStopped()) {
            return;
        }
        lVar.stop(Build.VERSION.SDK_INT >= 31 ? getStopReason() : 0);
    }

    @Override // androidx.work.l
    public final a<l.a> startWork() {
        getBackgroundExecutor().execute(new V(this, 24));
        C4268c<l.a> future = this.f16942e;
        kotlin.jvm.internal.l.e(future, "future");
        return future;
    }
}
