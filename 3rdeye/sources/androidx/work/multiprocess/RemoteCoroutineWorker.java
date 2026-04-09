package androidx.work.multiprocess;

import A9.C0572d0;
import A9.C0599r0;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.l;
import d2.C4268c;

/* compiled from: RemoteCoroutineWorker.kt */
/* loaded from: classes.dex */
public abstract class RemoteCoroutineWorker extends RemoteListenableWorker {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f16951h = 0;

    /* renamed from: f, reason: collision with root package name */
    public final C0599r0 f16952f;

    /* renamed from: g, reason: collision with root package name */
    public final C4268c<l.a> f16953g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCoroutineWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(parameters, "parameters");
        this.f16952f = C0572d0.a();
        C4268c<l.a> c4268c = new C4268c<>();
        this.f16953g = c4268c;
        c4268c.addListener(new com.vungle.ads.internal.util.a(this, 3), getTaskExecutor().c());
    }

    @Override // androidx.work.multiprocess.RemoteListenableWorker, androidx.work.l
    public final void onStopped() {
        super.onStopped();
        this.f16953g.cancel(true);
    }
}
