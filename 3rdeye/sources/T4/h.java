package t4;

import com.google.android.gms.tasks.TaskCompletionSource;
import u4.l;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class h extends u4.i {

    /* renamed from: b, reason: collision with root package name */
    public final l f46412b;

    /* renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f46413c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f46414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f46415e;

    public h(i iVar, TaskCompletionSource taskCompletionSource, String str) {
        this.f46415e = iVar;
        l lVar = new l("OnRequestInstallCallback");
        this.f46414d = iVar;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.f46412b = lVar;
        this.f46413c = taskCompletionSource;
    }
}
