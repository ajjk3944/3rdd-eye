package pd;

import cl.u;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h extends ac.i {

    /* renamed from: b, reason: collision with root package name */
    public final u f31728b;

    /* renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f31729c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f31730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f31731e;

    public h(i iVar, TaskCompletionSource taskCompletionSource, String str) {
        this.f31731e = iVar;
        u uVar = new u("OnRequestInstallCallback", 2);
        this.f31730d = iVar;
        super(3);
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.f31728b = uVar;
        this.f31729c = taskCompletionSource;
    }
}
